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

import org.jboss.resteasy.client.jaxrs.internal.proxy.ResteasyClientProxy;
import org.keycloak.admin.client.resource.ServerInfoResource;
import org.keycloak.admin.client.token.TokenService;
import org.keycloak.representations.AccessTokenResponse;
import org.keycloak.representations.idm.ComponentTypeRepresentation;
import org.keycloak.representations.idm.ConfigPropertyRepresentation;
import org.keycloak.representations.idm.PasswordPolicyTypeRepresentation;
import org.keycloak.representations.idm.ProtocolMapperRepresentation;
import org.keycloak.representations.idm.ProtocolMapperTypeRepresentation;
import org.keycloak.representations.info.ClientInstallationRepresentation;
import org.keycloak.representations.info.MemoryInfoRepresentation;
import org.keycloak.representations.info.ProfileInfoRepresentation;
import org.keycloak.representations.info.ProviderRepresentation;
import org.keycloak.representations.info.ServerInfoRepresentation;
import org.keycloak.representations.info.SpiInfoRepresentation;
import org.keycloak.representations.info.SystemInfoRepresentation;
import org.keycloak.representations.info.ThemeInfoRepresentation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.nativex.hint.NativeHint;
import org.springframework.nativex.hint.ProxyHint;
import org.springframework.nativex.hint.TypeHint;

@SpringBootApplication
@NativeHint(types = @TypeHint(types = { org.jboss.resteasy.resteasy_jaxrs.i18n.Messages_$bundle.class,
	org.jboss.resteasy.resteasy_jaxrs.i18n.LogMessages_$logger.class,
	org.jboss.resteasy.client.jaxrs.i18n.Messages_$bundle.class,
	org.jboss.resteasy.client.jaxrs.i18n.LogMessages_$logger.class,
	org.jboss.resteasy.plugins.providers.jaxb.i18n.LogMessages_$logger.class, TokenService.class,
	ServerInfoResource.class, AccessTokenResponse.class, ServerInfoRepresentation.class,
	SystemInfoRepresentation.class, MemoryInfoRepresentation.class, ProfileInfoRepresentation.class,
	ThemeInfoRepresentation.class, ProtocolMapperTypeRepresentation.class, ProtocolMapperRepresentation.class,
	ClientInstallationRepresentation.class, ComponentTypeRepresentation.class,
	PasswordPolicyTypeRepresentation.class, SpiInfoRepresentation.class, ProviderRepresentation.class,
	ConfigPropertyRepresentation.class }), proxies = {
		@ProxyHint(types = { TokenService.class, ResteasyClientProxy.class }),
		@ProxyHint(types = { ServerInfoResource.class, ResteasyClientProxy.class }) })
public class KeycloakApiApplication {

    public static void main(String[] args) {
	SpringApplication.run(KeycloakApiApplication.class, args);
    }
}
