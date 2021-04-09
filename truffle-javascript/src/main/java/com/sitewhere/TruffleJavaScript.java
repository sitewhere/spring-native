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
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;
import org.springframework.beans.factory.InitializingBean;

/**
 * Logs the result of JavaScript execution on bean initialization.
 */
public class TruffleJavaScript implements InitializingBean {

    /** Static logger */
    private static Log LOGGER = LogFactory.getLog(TruffleJavaScript.class);

    /** JavaScript language indicator for polyglot impl */
    private static final String LANGUAGE_JAVASCRIPT = "js";

    /*
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
	Context context = Context.create();
	Value result = context.eval(LANGUAGE_JAVASCRIPT, "({ id: 42, text: '42', arr: [1,42,3] " + "})");
	String text = result.getMember("text").asString();
	LOGGER.info(String.format("Found JavaScript value: %s", text));
    }
}
