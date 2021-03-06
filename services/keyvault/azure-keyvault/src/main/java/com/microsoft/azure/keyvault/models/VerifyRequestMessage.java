/**
 *
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.microsoft.azure.keyvault.models;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.microsoft.azure.keyvault.webkey.Base64UrlSerializer;

public class VerifyRequestMessage extends KeyOpRequestMessage {
    @JsonProperty(MessagePropertyNames.DIGEST)
    @JsonSerialize(using = Base64UrlSerializer.class)
    private byte[] digest;

    /**
     * @return The Digest value
     */
    public byte[] getDigest() {
        return digest;
    }

    /**
     * @param digestValue
     *            The Digest value
     */
    public void setDigest(byte[] digestValue) {
        digest = digestValue;
    }
}
