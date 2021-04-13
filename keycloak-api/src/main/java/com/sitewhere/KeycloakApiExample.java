/**
 * Copyright © 2014-2021 The SiteWhere Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sitewhere;

import java.net.ConnectException;
import java.net.UnknownHostException;

import javax.ws.rs.ProcessingException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.plugins.providers.ByteArrayProvider;
import org.jboss.resteasy.plugins.providers.DefaultBooleanWriter;
import org.jboss.resteasy.plugins.providers.DefaultNumberWriter;
import org.jboss.resteasy.plugins.providers.DefaultTextPlain;
import org.jboss.resteasy.plugins.providers.FormUrlEncodedProvider;
import org.jboss.resteasy.plugins.providers.InputStreamProvider;
import org.jboss.resteasy.plugins.providers.JaxrsFormProvider;
import org.jboss.resteasy.plugins.providers.ReaderProvider;
import org.jboss.resteasy.plugins.providers.StringTextStar;
import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.admin.client.resource.ServerInfoResource;
import org.keycloak.representations.info.SystemInfoRepresentation;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

/**
 * Exercises Keycloak API on bean initialization.
 */
@Component
public class KeycloakApiExample implements InitializingBean {

    /** Static logger */
    private static Log LOGGER = LogFactory.getLog(KeycloakApiExample.class);

    /**
     * Build Keycloak client.
     * 
     * @param serverUrl
     * @return
     */
    protected Keycloak buildKeycloakClient(String serverUrl) {
	ResteasyClientBuilder builder = (ResteasyClientBuilder) ResteasyClientBuilder.newBuilder();
	ResteasyProviderFactory factory = ResteasyProviderFactory.newInstance();
	factory.setBuiltinsRegistered(false);
	builder.providerFactory(factory);
	ResteasyClient client = builder.build();
	client.register(DefaultTextPlain.class);
	client.register(DefaultNumberWriter.class);
	client.register(DefaultBooleanWriter.class);
	client.register(StringTextStar.class);
	client.register(InputStreamProvider.class);
	client.register(ReaderProvider.class);
	client.register(ByteArrayProvider.class);
	client.register(FormUrlEncodedProvider.class);
	client.register(JaxrsFormProvider.class);
	client.register(JacksonJsonProvider.class);

	return KeycloakBuilder.builder().serverUrl(serverUrl).realm("master").username("admin").password("Pa55w0rd")
		.clientId("admin-cli").resteasyClient(client).build();
    }

    /*
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
	String serverUrl = String.format("http://%s:%s/auth", "keycloak", String.valueOf(8080));
	LOGGER.info(String.format("Connecting to Keycloak on URL: %s", serverUrl));
	Keycloak keycloak = buildKeycloakClient(serverUrl);

	// Wait for Keycloak connection to become available.
	boolean connected = false;
	while (!connected) {
	    ServerInfoResource server = null;
	    try {
		server = keycloak.serverInfo();

		if (server != null) {
		    SystemInfoRepresentation system = server.getInfo().getSystemInfo();
		    LOGGER.info(String.format("Keycloak API validated as version '%s'.", system.getVersion()));
		    connected = true;
		} else {
		    LOGGER.info("Received null response to Keycloak server info request.");
		}
	    } catch (ProcessingException e) {
		// Wait for Docker Compose networking to add host.
		if (!(e.getCause() instanceof UnknownHostException)) {
		    if (!(e.getCause() instanceof ConnectException)) {
			LOGGER.error("Exception while attempting to connect.", e);
		    }
		}
		connected = false;
	    }

	    if (!connected) {
		try {
		    LOGGER.info("Unable to connect to Keycloak. Waiting to retry...");
		    Thread.sleep(2000);
		} catch (InterruptedException e1) {
		    LOGGER.warn("Interrupted while waiting for Keycloak connection.");
		    return;
		}
	    }
	}
	LOGGER.info("Keycloak API test finished.");
    }
}
