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

import io.prometheus.client.Histogram;
import io.prometheus.client.exporter.HTTPServer;

/**
 * Starts a prometheus server on bean initialization.
 */
@Component
public class PrometheusServer implements InitializingBean {

    /** Static logger */
    private static Log LOGGER = LogFactory.getLog(PrometheusServer.class);

    /*
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
	LOGGER.info("Starting metrics server...");
	HTTPServer prometheus = new HTTPServer(9090);
	Histogram histogram = Histogram.build().name("execution_time").help("Histogram of execution time").register();
	Histogram.Timer timer = histogram.startTimer();
	Thread.sleep(1000);
	LOGGER.info(String.format("Timer observed wait of %sms", String.valueOf(timer.observeDuration())));
	timer.close();
	prometheus.stop();
	LOGGER.info("Stopped metrics server.");
    }
}
