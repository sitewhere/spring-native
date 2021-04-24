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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sitewhere.microservice.multitenant.MultitenantMicroservice;
import com.sitewhere.spi.SiteWhereException;
import com.sitewhere.spi.microservice.configuration.IMicroserviceModule;

import io.sitewhere.k8s.crd.tenant.engine.SiteWhereTenantEngine;

/**
 * Microservice implementation.
 */
@Component
public class SimpleMicroservice
	extends MultitenantMicroservice<Identifier, Configuration, SimpleMicroserviceTenantEngine>
	implements ISimpleMicroservice {

    /** Identifier */
    private static Identifier IDENTIFIER = new Identifier();

    public SimpleMicroservice(@Autowired ApplicationSettings instanceSettings) {
	super(instanceSettings);
    }

    /*
     * @see com.sitewhere.spi.microservice.IMicroservice#getName()
     */
    @Override
    public String getName() {
	return "Simple Microservice";
    }

    /*
     * @see com.sitewhere.spi.microservice.IMicroservice#getIdentifier()
     */
    @Override
    public Identifier getIdentifier() {
	return IDENTIFIER;
    }

    /*
     * @see com.sitewhere.spi.microservice.multitenant.IMultitenantMicroservice#
     * createTenantEngine(io.sitewhere.k8s.crd.tenant.engine.SiteWhereTenantEngine)
     */
    @Override
    public SimpleMicroserviceTenantEngine createTenantEngine(SiteWhereTenantEngine engine) throws SiteWhereException {
	return new SimpleMicroserviceTenantEngine(engine);
    }

    /*
     * @see com.sitewhere.spi.microservice.configuration.IConfigurableMicroservice#
     * getConfigurationClass()
     */
    @Override
    public Class<Configuration> getConfigurationClass() {
	return Configuration.class;
    }

    /*
     * @see com.sitewhere.spi.microservice.configuration.IConfigurableMicroservice#
     * createConfigurationModule()
     */
    @Override
    public IMicroserviceModule<Configuration> createConfigurationModule() {
	return null;
    }
}
