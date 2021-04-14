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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import io.fabric8.kubernetes.api.model.Namespace;
import io.fabric8.kubernetes.api.model.NamespaceList;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.ConfigBuilder;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;

/**
 * Attempts to connect to Kubernetes and perform a simple query.
 */
@Component
public class KubernetesQuery implements InitializingBean {

    /** Static logger */
    private static Log LOGGER = LogFactory.getLog(KubernetesQuery.class);

    /*
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
	Config config = new ConfigBuilder().withNamespace("default").build();
	try (DefaultKubernetesClient client = new DefaultKubernetesClient(config)) {
	    NamespaceList namespaces = client.namespaces().list();
	    LOGGER.info(String.format("Found %s namespaces..", String.valueOf(namespaces.getItems().size())));
	    for (Namespace namespace : namespaces.getItems()) {
		LOGGER.info(String.format("Found namespace: %s", namespace.getMetadata().getName()));
	    }
	}
    }
}
