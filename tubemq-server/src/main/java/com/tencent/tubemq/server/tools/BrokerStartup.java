/*
 * Tencent is pleased to support the open source community by making TubeMQ available.
 *
 * Copyright (C) 2012-2019 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * https://opensource.org/licenses/Apache-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.tencent.tubemq.server.tools;

import com.tencent.tubemq.server.broker.BrokerConfig;
import com.tencent.tubemq.server.broker.TubeBroker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BrokerStartup {
    static final Logger logger = LoggerFactory.getLogger(BrokerStartup.class);

    public static void main(final String[] args) throws Exception {
        final String configFilePath = ToolUtils.getConfigFilePath(args);
        final BrokerConfig tubeConfig = ToolUtils.getBrokerConfig(configFilePath);
        final TubeBroker server = new TubeBroker(tubeConfig);
        server.start();
    }

}
