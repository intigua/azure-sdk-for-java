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

package com.microsoft.windowsazure.management.compute.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.net.URI;

/**
* A virtual machine disk associated with your subscription.
*/
public class VirtualMachineDiskCreateDiskResponse extends OperationResponse
{
    private String affinityGroup;
    
    /**
    * The affinity group in which the disk is located. The AffinityGroup value
    * is derived from storage account that contains the blob in which the
    * media is located. If the storage account does not belong to an affinity
    * group the value is NULL.
    */
    public String getAffinityGroup() { return this.affinityGroup; }
    
    /**
    * The affinity group in which the disk is located. The AffinityGroup value
    * is derived from storage account that contains the blob in which the
    * media is located. If the storage account does not belong to an affinity
    * group the value is NULL.
    */
    public void setAffinityGroup(String affinityGroup) { this.affinityGroup = affinityGroup; }
    
    private Boolean isPremium;
    
    /**
    * Specifies whether the comtained image is a premium image
    */
    public Boolean getIsPremium() { return this.isPremium; }
    
    /**
    * Specifies whether the comtained image is a premium image
    */
    public void setIsPremium(Boolean isPremium) { this.isPremium = isPremium; }
    
    private String label;
    
    /**
    * The friendly name of the disk
    */
    public String getLabel() { return this.label; }
    
    /**
    * The friendly name of the disk
    */
    public void setLabel(String label) { this.label = label; }
    
    private String location;
    
    /**
    * The geo-location in which the disk is located. The Location value is
    * derived from storage account that contains the blob in which the disk is
    * located. If the storage account belongs to an affinity group the value
    * is NULL.
    */
    public String getLocation() { return this.location; }
    
    /**
    * The geo-location in which the disk is located. The Location value is
    * derived from storage account that contains the blob in which the disk is
    * located. If the storage account belongs to an affinity group the value
    * is NULL.
    */
    public void setLocation(String location) { this.location = location; }
    
    private double logicalSizeInGB;
    
    /**
    * The size, in GB, of the disk.
    */
    public double getLogicalSizeInGB() { return this.logicalSizeInGB; }
    
    /**
    * The size, in GB, of the disk.
    */
    public void setLogicalSizeInGB(double logicalSizeInGB) { this.logicalSizeInGB = logicalSizeInGB; }
    
    private URI mediaLinkUri;
    
    /**
    * The location of the blob in the blob store in which the media for the
    * disk is located. The blob location belongs to a storage account in the
    * subscription specified by the SubscriptionId value in the operation
    * call. Example: http://example.blob.core.windows.net/disks/mydisk.vhd
    */
    public URI getMediaLinkUri() { return this.mediaLinkUri; }
    
    /**
    * The location of the blob in the blob store in which the media for the
    * disk is located. The blob location belongs to a storage account in the
    * subscription specified by the SubscriptionId value in the operation
    * call. Example: http://example.blob.core.windows.net/disks/mydisk.vhd
    */
    public void setMediaLinkUri(URI mediaLinkUri) { this.mediaLinkUri = mediaLinkUri; }
    
    private String name;
    
    /**
    * The name of the disk. This is the name that is used when creating one or
    * more virtual machines using the disk.
    */
    public String getName() { return this.name; }
    
    /**
    * The name of the disk. This is the name that is used when creating one or
    * more virtual machines using the disk.
    */
    public void setName(String name) { this.name = name; }
    
    private String operatingSystem;
    
    /**
    * The Operating System type for the disk.
    */
    public String getOperatingSystem() { return this.operatingSystem; }
    
    /**
    * The Operating System type for the disk.
    */
    public void setOperatingSystem(String operatingSystem) { this.operatingSystem = operatingSystem; }
    
    private String sourceImageName;
    
    /**
    * The name of the OS Image from which the disk was created. This property
    * is populated automatically when a disk is created from an OS image by
    * calling the Add Role, Create Deployment, or Provision Disk operations.
    */
    public String getSourceImageName() { return this.sourceImageName; }
    
    /**
    * The name of the OS Image from which the disk was created. This property
    * is populated automatically when a disk is created from an OS image by
    * calling the Add Role, Create Deployment, or Provision Disk operations.
    */
    public void setSourceImageName(String sourceImageName) { this.sourceImageName = sourceImageName; }
    
    private VirtualMachineDiskCreateDiskResponse.VirtualMachineDiskUsageDetails usageDetails;
    
    /**
    * Contains properties that specify a virtual machine that currently using
    * the disk. A disk cannot be deleted as long as it is attached to a
    * virtual machine.
    */
    public VirtualMachineDiskCreateDiskResponse.VirtualMachineDiskUsageDetails getUsageDetails() { return this.usageDetails; }
    
    /**
    * Contains properties that specify a virtual machine that currently using
    * the disk. A disk cannot be deleted as long as it is attached to a
    * virtual machine.
    */
    public void setUsageDetails(VirtualMachineDiskCreateDiskResponse.VirtualMachineDiskUsageDetails usageDetails) { this.usageDetails = usageDetails; }
    
    /**
    * Initializes a new instance of the VirtualMachineDiskCreateDiskResponse
    * class.
    *
    */
    public VirtualMachineDiskCreateDiskResponse()
    {
    }
    
    /**
    * Contains properties that specify a virtual machine that currently using
    * the disk. A disk cannot be deleted as long as it is attached to a
    * virtual machine.
    */
    public static class VirtualMachineDiskUsageDetails
    {
        private String deploymentName;
        
        /**
        * The deployment in which the disk is being used.
        */
        public String getDeploymentName() { return this.deploymentName; }
        
        /**
        * The deployment in which the disk is being used.
        */
        public void setDeploymentName(String deploymentName) { this.deploymentName = deploymentName; }
        
        private String hostedServiceName;
        
        /**
        * The hosted service in which the disk is being used.
        */
        public String getHostedServiceName() { return this.hostedServiceName; }
        
        /**
        * The hosted service in which the disk is being used.
        */
        public void setHostedServiceName(String hostedServiceName) { this.hostedServiceName = hostedServiceName; }
        
        private String roleName;
        
        /**
        * The virtual machine that the disk is attached to.
        */
        public String getRoleName() { return this.roleName; }
        
        /**
        * The virtual machine that the disk is attached to.
        */
        public void setRoleName(String roleName) { this.roleName = roleName; }
        
        /**
        * Initializes a new instance of the VirtualMachineDiskUsageDetails
        * class.
        *
        */
        public VirtualMachineDiskUsageDetails()
        {
        }
    }
}