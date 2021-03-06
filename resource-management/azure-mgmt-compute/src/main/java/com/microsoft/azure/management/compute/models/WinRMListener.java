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

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.compute.models;

import java.net.URI;

/**
* Describes Protocol and thumbprint of Windows Remote Management listener
*/
public class WinRMListener {
    private URI certificateUrl;
    
    /**
    * Optional. Gets or sets the Certificate URL in KMS for Https listeners.
    * Should be null for Http listeners.
    * @return The CertificateUrl value.
    */
    public URI getCertificateUrl() {
        return this.certificateUrl;
    }
    
    /**
    * Optional. Gets or sets the Certificate URL in KMS for Https listeners.
    * Should be null for Http listeners.
    * @param certificateUrlValue The CertificateUrl value.
    */
    public void setCertificateUrl(final URI certificateUrlValue) {
        this.certificateUrl = certificateUrlValue;
    }
    
    private String protocol;
    
    /**
    * Optional. Gets or sets the Protocol used by WinRM listener. Currently
    * only Http and Https are supported.
    * @return The Protocol value.
    */
    public String getProtocol() {
        return this.protocol;
    }
    
    /**
    * Optional. Gets or sets the Protocol used by WinRM listener. Currently
    * only Http and Https are supported.
    * @param protocolValue The Protocol value.
    */
    public void setProtocol(final String protocolValue) {
        this.protocol = protocolValue;
    }
}
