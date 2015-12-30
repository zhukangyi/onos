/*
 * Copyright 2015 Open Networking Laboratory
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
package org.onosproject.igmp;

import org.onlab.packet.IGMP;
import org.onosproject.net.ConnectPoint;

/**
 * Process an IGMP Membership Report.
 */
public final class IGMPProcessMembership {

    // Hide the default constructor.
    private IGMPProcessMembership() {
    }

    /**
     * Process the IGMP Membership report.
     *
     * @param igmp the deserialized IGMP message.
     * @param receivedFrom the ConnectPoint this message came from.
     */
    public static void processMembership(IGMP igmp, ConnectPoint receivedFrom) {
    }

}