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
import org.springframework.boot.SpringApplication;

import com.sitewhere.microservice.MicroserviceApplication;

/**
 * Spring boot application that executes microservice.
 */
public class SimpleMicroserviceApplication extends MicroserviceApplication<ISimpleMicroservice> {

    @Autowired
    private ISimpleMicroservice microservice;

    public static void main(String[] args) {
	SpringApplication.run(SimpleMicroserviceApplication.class, args);
    }

    /*
     * @see
     * com.sitewhere.spi.microservice.IMicroserviceApplication#getMicroservice()
     */
    @Override
    public ISimpleMicroservice getMicroservice() {
	return microservice;
    }
}