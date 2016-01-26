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

import com.microsoft.windowsazure.core.LazyArrayList;
import com.microsoft.windowsazure.core.OperationResponse;

import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/**
* The List VM Images operation response.
*/
public class VirtualMachineVMImageListResponse extends OperationResponse implements Iterable<VirtualMachineVMImageListResponse.VirtualMachineVMImage> {
    private ArrayList<VirtualMachineVMImageListResponse.VirtualMachineVMImage> vMImages;
    
    /**
    * Optional. The virtual machine images associated with your subscription.
    * @return The VMImages value.
    */
    public ArrayList<VirtualMachineVMImageListResponse.VirtualMachineVMImage> getVMImages() {
        return this.vMImages;
    }
    
    /**
    * Optional. The virtual machine images associated with your subscription.
    * @param vMImagesValue The VMImages value.
    */
    public void setVMImages(final ArrayList<VirtualMachineVMImageListResponse.VirtualMachineVMImage> vMImagesValue) {
        this.vMImages = vMImagesValue;
    }
    
    /**
    * Initializes a new instance of the VirtualMachineVMImageListResponse class.
    *
    */
    public VirtualMachineVMImageListResponse() {
        super();
        this.setVMImages(new LazyArrayList<VirtualMachineVMImageListResponse.VirtualMachineVMImage>());
    }
    
    /**
    * Gets the sequence of VMImages.
    *
    */
    public Iterator<VirtualMachineVMImageListResponse.VirtualMachineVMImage> iterator() {
        return this.getVMImages().iterator();
    }
    
    /**
    * The data disk configuration.
    */
    public static class DataDiskConfiguration {
        private String hostCaching;
        
        /**
        * Optional. Specifies the platform caching behavior of the data disk
        * blob for read/write efficiency. The default vault is ReadOnly.
        * @return The HostCaching value.
        */
        public String getHostCaching() {
            return this.hostCaching;
        }
        
        /**
        * Optional. Specifies the platform caching behavior of the data disk
        * blob for read/write efficiency. The default vault is ReadOnly.
        * @param hostCachingValue The HostCaching value.
        */
        public void setHostCaching(final String hostCachingValue) {
            this.hostCaching = hostCachingValue;
        }
        
        private String iOType;
        
        /**
        * Optional. Gets or sets the IO type.
        * @return The IOType value.
        */
        public String getIOType() {
            return this.iOType;
        }
        
        /**
        * Optional. Gets or sets the IO type.
        * @param iOTypeValue The IOType value.
        */
        public void setIOType(final String iOTypeValue) {
            this.iOType = iOTypeValue;
        }
        
        private int logicalDiskSizeInGB;
        
        /**
        * Optional. Specifies the size, in GB, of an empty VHD to be attached
        * to the virtual machine. The VHD can be created as part of disk
        * attach or create virtual machine calls by specifying the value for
        * this property. Azure creates the empty VHD based on size preference
        * and attaches the newly created VHD to the virtual machine.
        * @return The LogicalDiskSizeInGB value.
        */
        public int getLogicalDiskSizeInGB() {
            return this.logicalDiskSizeInGB;
        }
        
        /**
        * Optional. Specifies the size, in GB, of an empty VHD to be attached
        * to the virtual machine. The VHD can be created as part of disk
        * attach or create virtual machine calls by specifying the value for
        * this property. Azure creates the empty VHD based on size preference
        * and attaches the newly created VHD to the virtual machine.
        * @param logicalDiskSizeInGBValue The LogicalDiskSizeInGB value.
        */
        public void setLogicalDiskSizeInGB(final int logicalDiskSizeInGBValue) {
            this.logicalDiskSizeInGB = logicalDiskSizeInGBValue;
        }
        
        private Integer logicalUnitNumber;
        
        /**
        * Optional. Specifies the Logical Unit Number (LUN) for the data disk.
        * The LUN specifies the slot in which the data drive appears when
        * mounted for usage by the virtual machine. This element is only
        * listed when more than one data disk is attached to a virtual machine.
        * @return The LogicalUnitNumber value.
        */
        public Integer getLogicalUnitNumber() {
            return this.logicalUnitNumber;
        }
        
        /**
        * Optional. Specifies the Logical Unit Number (LUN) for the data disk.
        * The LUN specifies the slot in which the data drive appears when
        * mounted for usage by the virtual machine. This element is only
        * listed when more than one data disk is attached to a virtual machine.
        * @param logicalUnitNumberValue The LogicalUnitNumber value.
        */
        public void setLogicalUnitNumber(final Integer logicalUnitNumberValue) {
            this.logicalUnitNumber = logicalUnitNumberValue;
        }
        
        private URI mediaLink;
        
        /**
        * Optional. Specifies the location of the disk in Windows Azure storage.
        * @return The MediaLink value.
        */
        public URI getMediaLink() {
            return this.mediaLink;
        }
        
        /**
        * Optional. Specifies the location of the disk in Windows Azure storage.
        * @param mediaLinkValue The MediaLink value.
        */
        public void setMediaLink(final URI mediaLinkValue) {
            this.mediaLink = mediaLinkValue;
        }
        
        private String name;
        
        /**
        * Optional. Specifies the name of the VHD to use to create the data
        * disk for the virtual machine.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Optional. Specifies the name of the VHD to use to create the data
        * disk for the virtual machine.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
    }
    
    /**
    * The OS disk configuration.
    */
    public static class OSDiskConfiguration {
        private String hostCaching;
        
        /**
        * Optional. Specifies the platform caching behavior of the operating
        * system disk blob for read/write efficiency.
        * @return The HostCaching value.
        */
        public String getHostCaching() {
            return this.hostCaching;
        }
        
        /**
        * Optional. Specifies the platform caching behavior of the operating
        * system disk blob for read/write efficiency.
        * @param hostCachingValue The HostCaching value.
        */
        public void setHostCaching(final String hostCachingValue) {
            this.hostCaching = hostCachingValue;
        }
        
        private String iOType;
        
        /**
        * Optional. Gets or sets the IO type.
        * @return The IOType value.
        */
        public String getIOType() {
            return this.iOType;
        }
        
        /**
        * Optional. Gets or sets the IO type.
        * @param iOTypeValue The IOType value.
        */
        public void setIOType(final String iOTypeValue) {
            this.iOType = iOTypeValue;
        }
        
        private int logicalDiskSizeInGB;
        
        /**
        * Optional. Specifies the size, in GB, of an empty VHD to be attached
        * to the virtual machine. The VHD can be created as part of disk
        * attach or create virtual machine calls by specifying the value for
        * this property. Azure creates the empty VHD based on size preference
        * and attaches the newly created VHD to the virtual machine.
        * @return The LogicalDiskSizeInGB value.
        */
        public int getLogicalDiskSizeInGB() {
            return this.logicalDiskSizeInGB;
        }
        
        /**
        * Optional. Specifies the size, in GB, of an empty VHD to be attached
        * to the virtual machine. The VHD can be created as part of disk
        * attach or create virtual machine calls by specifying the value for
        * this property. Azure creates the empty VHD based on size preference
        * and attaches the newly created VHD to the virtual machine.
        * @param logicalDiskSizeInGBValue The LogicalDiskSizeInGB value.
        */
        public void setLogicalDiskSizeInGB(final int logicalDiskSizeInGBValue) {
            this.logicalDiskSizeInGB = logicalDiskSizeInGBValue;
        }
        
        private URI mediaLink;
        
        /**
        * Optional. Specifies the location of the disk in Windows Azure storage.
        * @return The MediaLink value.
        */
        public URI getMediaLink() {
            return this.mediaLink;
        }
        
        /**
        * Optional. Specifies the location of the disk in Windows Azure storage.
        * @param mediaLinkValue The MediaLink value.
        */
        public void setMediaLink(final URI mediaLinkValue) {
            this.mediaLink = mediaLinkValue;
        }
        
        private String name;
        
        /**
        * Optional. Specifies the name of an operating system image in the
        * image repository.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Optional. Specifies the name of an operating system image in the
        * image repository.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
        private String operatingSystem;
        
        /**
        * Optional. The operating system running in the virtual machine.
        * @return The OperatingSystem value.
        */
        public String getOperatingSystem() {
            return this.operatingSystem;
        }
        
        /**
        * Optional. The operating system running in the virtual machine.
        * @param operatingSystemValue The OperatingSystem value.
        */
        public void setOperatingSystem(final String operatingSystemValue) {
            this.operatingSystem = operatingSystemValue;
        }
        
        private String oSState;
        
        /**
        * Optional. The operating system state in the virtual machine.
        * @return The OSState value.
        */
        public String getOSState() {
            return this.oSState;
        }
        
        /**
        * Optional. The operating system state in the virtual machine.
        * @param oSStateValue The OSState value.
        */
        public void setOSState(final String oSStateValue) {
            this.oSState = oSStateValue;
        }
    }
    
    /**
    * A virtual machine image associated with your subscription.
    */
    public static class VirtualMachineVMImage {
        private String affinityGroup;
        
        /**
        * Optional. The affinity group name of the virtual machine image.
        * @return The AffinityGroup value.
        */
        public String getAffinityGroup() {
            return this.affinityGroup;
        }
        
        /**
        * Optional. The affinity group name of the virtual machine image.
        * @param affinityGroupValue The AffinityGroup value.
        */
        public void setAffinityGroup(final String affinityGroupValue) {
            this.affinityGroup = affinityGroupValue;
        }
        
        private String category;
        
        /**
        * Optional. The classification of the virtual machine image.
        * @return The Category value.
        */
        public String getCategory() {
            return this.category;
        }
        
        /**
        * Optional. The classification of the virtual machine image.
        * @param categoryValue The Category value.
        */
        public void setCategory(final String categoryValue) {
            this.category = categoryValue;
        }
        
        private Calendar createdTime;
        
        /**
        * Optional. The date when the virtual machine image was created.
        * @return The CreatedTime value.
        */
        public Calendar getCreatedTime() {
            return this.createdTime;
        }
        
        /**
        * Optional. The date when the virtual machine image was created.
        * @param createdTimeValue The CreatedTime value.
        */
        public void setCreatedTime(final Calendar createdTimeValue) {
            this.createdTime = createdTimeValue;
        }
        
        private ArrayList<VirtualMachineVMImageListResponse.DataDiskConfiguration> dataDiskConfigurations;
        
        /**
        * Optional. The data disk configurations.
        * @return The DataDiskConfigurations value.
        */
        public ArrayList<VirtualMachineVMImageListResponse.DataDiskConfiguration> getDataDiskConfigurations() {
            return this.dataDiskConfigurations;
        }
        
        /**
        * Optional. The data disk configurations.
        * @param dataDiskConfigurationsValue The DataDiskConfigurations value.
        */
        public void setDataDiskConfigurations(final ArrayList<VirtualMachineVMImageListResponse.DataDiskConfiguration> dataDiskConfigurationsValue) {
            this.dataDiskConfigurations = dataDiskConfigurationsValue;
        }
        
        private String deploymentName;
        
        /**
        * Optional. The deployment name of the virtual machine image.
        * @return The DeploymentName value.
        */
        public String getDeploymentName() {
            return this.deploymentName;
        }
        
        /**
        * Optional. The deployment name of the virtual machine image.
        * @param deploymentNameValue The DeploymentName value.
        */
        public void setDeploymentName(final String deploymentNameValue) {
            this.deploymentName = deploymentNameValue;
        }
        
        private String description;
        
        /**
        * Optional. The description of the virtual machine image.
        * @return The Description value.
        */
        public String getDescription() {
            return this.description;
        }
        
        /**
        * Optional. The description of the virtual machine image.
        * @param descriptionValue The Description value.
        */
        public void setDescription(final String descriptionValue) {
            this.description = descriptionValue;
        }
        
        private String eula;
        
        /**
        * Optional. Specifies the End User License Agreement that is associated
        * with the image. The value for this element is a string, but it is
        * recommended that the value be a URL that points to a EULA.
        * @return The Eula value.
        */
        public String getEula() {
            return this.eula;
        }
        
        /**
        * Optional. Specifies the End User License Agreement that is associated
        * with the image. The value for this element is a string, but it is
        * recommended that the value be a URL that points to a EULA.
        * @param eulaValue The Eula value.
        */
        public void setEula(final String eulaValue) {
            this.eula = eulaValue;
        }
        
        private String iconUri;
        
        /**
        * Optional. Provides the URI to the icon for this Operating System
        * Image.
        * @return The IconUri value.
        */
        public String getIconUri() {
            return this.iconUri;
        }
        
        /**
        * Optional. Provides the URI to the icon for this Operating System
        * Image.
        * @param iconUriValue The IconUri value.
        */
        public void setIconUri(final String iconUriValue) {
            this.iconUri = iconUriValue;
        }
        
        private String imageFamily;
        
        /**
        * Optional. The image family of the virtual machine image.
        * @return The ImageFamily value.
        */
        public String getImageFamily() {
            return this.imageFamily;
        }
        
        /**
        * Optional. The image family of the virtual machine image.
        * @param imageFamilyValue The ImageFamily value.
        */
        public void setImageFamily(final String imageFamilyValue) {
            this.imageFamily = imageFamilyValue;
        }
        
        private Boolean isPremium;
        
        /**
        * Optional. The indicator of whether the virtual machine image is
        * premium.
        * @return The IsPremium value.
        */
        public Boolean isPremium() {
            return this.isPremium;
        }
        
        /**
        * Optional. The indicator of whether the virtual machine image is
        * premium.
        * @param isPremiumValue The IsPremium value.
        */
        public void setIsPremium(final Boolean isPremiumValue) {
            this.isPremium = isPremiumValue;
        }
        
        private String label;
        
        /**
        * Optional. An identifier for the virtual machine image.
        * @return The Label value.
        */
        public String getLabel() {
            return this.label;
        }
        
        /**
        * Optional. An identifier for the virtual machine image.
        * @param labelValue The Label value.
        */
        public void setLabel(final String labelValue) {
            this.label = labelValue;
        }
        
        private String language;
        
        /**
        * Optional. The language of the virtual machine image.
        * @return The Language value.
        */
        public String getLanguage() {
            return this.language;
        }
        
        /**
        * Optional. The language of the virtual machine image.
        * @param languageValue The Language value.
        */
        public void setLanguage(final String languageValue) {
            this.language = languageValue;
        }
        
        private String location;
        
        /**
        * Optional. The location name of the virtual machine image.
        * @return The Location value.
        */
        public String getLocation() {
            return this.location;
        }
        
        /**
        * Optional. The location name of the virtual machine image.
        * @param locationValue The Location value.
        */
        public void setLocation(final String locationValue) {
            this.location = locationValue;
        }
        
        private Calendar modifiedTime;
        
        /**
        * Optional. The date when the virtual machine image was created.
        * @return The ModifiedTime value.
        */
        public Calendar getModifiedTime() {
            return this.modifiedTime;
        }
        
        /**
        * Optional. The date when the virtual machine image was created.
        * @param modifiedTimeValue The ModifiedTime value.
        */
        public void setModifiedTime(final Calendar modifiedTimeValue) {
            this.modifiedTime = modifiedTimeValue;
        }
        
        private String name;
        
        /**
        * Optional. The name of the virtual machine image.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Optional. The name of the virtual machine image.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
        private VirtualMachineVMImageListResponse.OSDiskConfiguration oSDiskConfiguration;
        
        /**
        * Optional. The OS disk configuration.
        * @return The OSDiskConfiguration value.
        */
        public VirtualMachineVMImageListResponse.OSDiskConfiguration getOSDiskConfiguration() {
            return this.oSDiskConfiguration;
        }
        
        /**
        * Optional. The OS disk configuration.
        * @param oSDiskConfigurationValue The OSDiskConfiguration value.
        */
        public void setOSDiskConfiguration(final VirtualMachineVMImageListResponse.OSDiskConfiguration oSDiskConfigurationValue) {
            this.oSDiskConfiguration = oSDiskConfigurationValue;
        }
        
        private URI pricingDetailLink;
        
        /**
        * Optional. Specifies the URI that points to the pricing detail.
        * @return The PricingDetailLink value.
        */
        public URI getPricingDetailLink() {
            return this.pricingDetailLink;
        }
        
        /**
        * Optional. Specifies the URI that points to the pricing detail.
        * @param pricingDetailLinkValue The PricingDetailLink value.
        */
        public void setPricingDetailLink(final URI pricingDetailLinkValue) {
            this.pricingDetailLink = pricingDetailLinkValue;
        }
        
        private URI privacyUri;
        
        /**
        * Optional. Specifies the URI that points to a document that contains
        * the privacy policy related to the image.
        * @return The PrivacyUri value.
        */
        public URI getPrivacyUri() {
            return this.privacyUri;
        }
        
        /**
        * Optional. Specifies the URI that points to a document that contains
        * the privacy policy related to the image.
        * @param privacyUriValue The PrivacyUri value.
        */
        public void setPrivacyUri(final URI privacyUriValue) {
            this.privacyUri = privacyUriValue;
        }
        
        private Calendar publishedDate;
        
        /**
        * Optional. Specifies the date when the image was added to the image
        * repository.
        * @return The PublishedDate value.
        */
        public Calendar getPublishedDate() {
            return this.publishedDate;
        }
        
        /**
        * Optional. Specifies the date when the image was added to the image
        * repository.
        * @param publishedDateValue The PublishedDate value.
        */
        public void setPublishedDate(final Calendar publishedDateValue) {
            this.publishedDate = publishedDateValue;
        }
        
        private String publisherName;
        
        /**
        * Optional. The name of the publisher of this VM Image in Azure.
        * @return The PublisherName value.
        */
        public String getPublisherName() {
            return this.publisherName;
        }
        
        /**
        * Optional. The name of the publisher of this VM Image in Azure.
        * @param publisherNameValue The PublisherName value.
        */
        public void setPublisherName(final String publisherNameValue) {
            this.publisherName = publisherNameValue;
        }
        
        private String recommendedVMSize;
        
        /**
        * Optional. The recommended size of the virtual machine image.
        * @return The RecommendedVMSize value.
        */
        public String getRecommendedVMSize() {
            return this.recommendedVMSize;
        }
        
        /**
        * Optional. The recommended size of the virtual machine image.
        * @param recommendedVMSizeValue The RecommendedVMSize value.
        */
        public void setRecommendedVMSize(final String recommendedVMSizeValue) {
            this.recommendedVMSize = recommendedVMSizeValue;
        }
        
        private String roleName;
        
        /**
        * Optional. The role name of the virtual machine image.
        * @return The RoleName value.
        */
        public String getRoleName() {
            return this.roleName;
        }
        
        /**
        * Optional. The role name of the virtual machine image.
        * @param roleNameValue The RoleName value.
        */
        public void setRoleName(final String roleNameValue) {
            this.roleName = roleNameValue;
        }
        
        private String serviceName;
        
        /**
        * Optional. The service name of the virtual machine image.
        * @return The ServiceName value.
        */
        public String getServiceName() {
            return this.serviceName;
        }
        
        /**
        * Optional. The service name of the virtual machine image.
        * @param serviceNameValue The ServiceName value.
        */
        public void setServiceName(final String serviceNameValue) {
            this.serviceName = serviceNameValue;
        }
        
        private Boolean showInGui;
        
        /**
        * Optional. Specifies whether to show in Gui.
        * @return The ShowInGui value.
        */
        public Boolean isShowInGui() {
            return this.showInGui;
        }
        
        /**
        * Optional. Specifies whether to show in Gui.
        * @param showInGuiValue The ShowInGui value.
        */
        public void setShowInGui(final Boolean showInGuiValue) {
            this.showInGui = showInGuiValue;
        }
        
        private String smallIconUri;
        
        /**
        * Optional. Specifies the URI to the small icon that is displayed when
        * the image is presented in the Azure Management Portal.
        * @return The SmallIconUri value.
        */
        public String getSmallIconUri() {
            return this.smallIconUri;
        }
        
        /**
        * Optional. Specifies the URI to the small icon that is displayed when
        * the image is presented in the Azure Management Portal.
        * @param smallIconUriValue The SmallIconUri value.
        */
        public void setSmallIconUri(final String smallIconUriValue) {
            this.smallIconUri = smallIconUriValue;
        }
        
        /**
        * Initializes a new instance of the VirtualMachineVMImage class.
        *
        */
        public VirtualMachineVMImage() {
            this.setDataDiskConfigurations(new LazyArrayList<VirtualMachineVMImageListResponse.DataDiskConfiguration>());
        }
    }
}