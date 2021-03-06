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

package com.microsoft.windowsazure.management.sql;

import com.microsoft.windowsazure.core.ServiceOperations;
import com.microsoft.windowsazure.core.utils.BOMInputStream;
import com.microsoft.windowsazure.core.utils.CollectionStringBuilder;
import com.microsoft.windowsazure.core.utils.XmlUtility;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.sql.models.RecoverableDatabase;
import com.microsoft.windowsazure.management.sql.models.RecoverableDatabaseGetResponse;
import com.microsoft.windowsazure.management.sql.models.RecoverableDatabaseListResponse;
import com.microsoft.windowsazure.tracing.CloudTracing;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.bind.DatatypeConverter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/**
* Contains operations for getting Azure SQL Databases that can be recovered.
*/
public class RecoverableDatabaseOperationsImpl implements ServiceOperations<SqlManagementClientImpl>, RecoverableDatabaseOperations {
    /**
    * Initializes a new instance of the RecoverableDatabaseOperationsImpl class.
    *
    * @param client Reference to the service client.
    */
    RecoverableDatabaseOperationsImpl(SqlManagementClientImpl client) {
        this.client = client;
    }
    
    private SqlManagementClientImpl client;
    
    /**
    * Gets a reference to the
    * microsoft.windowsazure.management.sql.SqlManagementClientImpl.
    * @return The Client value.
    */
    public SqlManagementClientImpl getClient() {
        return this.client;
    }
    
    /**
    * Returns information about a recoverable Azure SQL Database.
    *
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the database was hosted.
    * @param databaseName Required. The name of the recoverable Azure SQL
    * Database to be obtained.
    * @return Contains the response to the Get Recoverable Database request.
    */
    @Override
    public Future<RecoverableDatabaseGetResponse> getAsync(final String serverName, final String databaseName) {
        return this.getClient().getExecutorService().submit(new Callable<RecoverableDatabaseGetResponse>() { 
            @Override
            public RecoverableDatabaseGetResponse call() throws Exception {
                return get(serverName, databaseName);
            }
         });
    }
    
    /**
    * Returns information about a recoverable Azure SQL Database.
    *
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the database was hosted.
    * @param databaseName Required. The name of the recoverable Azure SQL
    * Database to be obtained.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return Contains the response to the Get Recoverable Database request.
    */
    @Override
    public RecoverableDatabaseGetResponse get(String serverName, String databaseName) throws IOException, ServiceException, ParserConfigurationException, SAXException {
        // Validate
        if (serverName == null) {
            throw new NullPointerException("serverName");
        }
        if (databaseName == null) {
            throw new NullPointerException("databaseName");
        }
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace) {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            tracingParameters.put("serverName", serverName);
            tracingParameters.put("databaseName", databaseName);
            CloudTracing.enter(invocationId, this, "getAsync", tracingParameters);
        }
        
        // Construct URL
        String url = "";
        url = url + "/";
        if (this.getClient().getCredentials().getSubscriptionId() != null) {
            url = url + URLEncoder.encode(this.getClient().getCredentials().getSubscriptionId(), "UTF-8");
        }
        url = url + "/services/sqlservers/servers/";
        url = url + URLEncoder.encode(serverName, "UTF-8");
        url = url + "/recoverabledatabases/";
        url = url + URLEncoder.encode(databaseName, "UTF-8");
        String baseUrl = this.getClient().getBaseUri().toString();
        // Trim '/' character from the end of baseUrl and beginning of url.
        if (baseUrl.charAt(baseUrl.length() - 1) == '/') {
            baseUrl = baseUrl.substring(0, (baseUrl.length() - 1) + 0);
        }
        if (url.charAt(0) == '/') {
            url = url.substring(1);
        }
        url = baseUrl + "/" + url;
        url = url.replace(" ", "%20");
        
        // Create HTTP transport objects
        HttpGet httpRequest = new HttpGet(url);
        
        // Set Headers
        httpRequest.setHeader("x-ms-version", "2012-03-01");
        
        // Send Request
        HttpResponse httpResponse = null;
        try {
            if (shouldTrace) {
                CloudTracing.sendRequest(invocationId, httpRequest);
            }
            httpResponse = this.getClient().getHttpClient().execute(httpRequest);
            if (shouldTrace) {
                CloudTracing.receiveResponse(invocationId, httpResponse);
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK) {
                ServiceException ex = ServiceException.createFromXml(httpRequest, null, httpResponse, httpResponse.getEntity());
                if (shouldTrace) {
                    CloudTracing.error(invocationId, ex);
                }
                throw ex;
            }
            
            // Create Result
            RecoverableDatabaseGetResponse result = null;
            // Deserialize Response
            if (statusCode == HttpStatus.SC_OK) {
                InputStream responseContent = httpResponse.getEntity().getContent();
                result = new RecoverableDatabaseGetResponse();
                DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
                documentBuilderFactory.setNamespaceAware(true);
                DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
                Document responseDoc = documentBuilder.parse(new BOMInputStream(responseContent));
                
                Element serviceResourceElement = XmlUtility.getElementByTagNameNS(responseDoc, "http://schemas.microsoft.com/windowsazure", "ServiceResource");
                if (serviceResourceElement != null) {
                    RecoverableDatabase serviceResourceInstance = new RecoverableDatabase();
                    result.setDatabase(serviceResourceInstance);
                    
                    Element entityIdElement = XmlUtility.getElementByTagNameNS(serviceResourceElement, "http://schemas.microsoft.com/windowsazure", "EntityId");
                    if (entityIdElement != null) {
                        String entityIdInstance;
                        entityIdInstance = entityIdElement.getTextContent();
                        serviceResourceInstance.setEntityId(entityIdInstance);
                    }
                    
                    Element serverNameElement = XmlUtility.getElementByTagNameNS(serviceResourceElement, "http://schemas.microsoft.com/windowsazure", "ServerName");
                    if (serverNameElement != null) {
                        String serverNameInstance;
                        serverNameInstance = serverNameElement.getTextContent();
                        serviceResourceInstance.setServerName(serverNameInstance);
                    }
                    
                    Element editionElement = XmlUtility.getElementByTagNameNS(serviceResourceElement, "http://schemas.microsoft.com/windowsazure", "Edition");
                    if (editionElement != null) {
                        String editionInstance;
                        editionInstance = editionElement.getTextContent();
                        serviceResourceInstance.setEdition(editionInstance);
                    }
                    
                    Element lastAvailableBackupDateElement = XmlUtility.getElementByTagNameNS(serviceResourceElement, "http://schemas.microsoft.com/windowsazure", "LastAvailableBackupDate");
                    if (lastAvailableBackupDateElement != null) {
                        Calendar lastAvailableBackupDateInstance;
                        lastAvailableBackupDateInstance = DatatypeConverter.parseDateTime(lastAvailableBackupDateElement.getTextContent());
                        serviceResourceInstance.setLastAvailableBackupDate(lastAvailableBackupDateInstance);
                    }
                    
                    Element nameElement = XmlUtility.getElementByTagNameNS(serviceResourceElement, "http://schemas.microsoft.com/windowsazure", "Name");
                    if (nameElement != null) {
                        String nameInstance;
                        nameInstance = nameElement.getTextContent();
                        serviceResourceInstance.setName(nameInstance);
                    }
                    
                    Element typeElement = XmlUtility.getElementByTagNameNS(serviceResourceElement, "http://schemas.microsoft.com/windowsazure", "Type");
                    if (typeElement != null) {
                        String typeInstance;
                        typeInstance = typeElement.getTextContent();
                        serviceResourceInstance.setType(typeInstance);
                    }
                    
                    Element stateElement = XmlUtility.getElementByTagNameNS(serviceResourceElement, "http://schemas.microsoft.com/windowsazure", "State");
                    if (stateElement != null) {
                        String stateInstance;
                        stateInstance = stateElement.getTextContent();
                        serviceResourceInstance.setState(stateInstance);
                    }
                }
                
            }
            result.setStatusCode(statusCode);
            if (httpResponse.getHeaders("x-ms-request-id").length > 0) {
                result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
            }
            
            if (shouldTrace) {
                CloudTracing.exit(invocationId, result);
            }
            return result;
        } finally {
            if (httpResponse != null && httpResponse.getEntity() != null) {
                httpResponse.getEntity().getContent().close();
            }
        }
    }
    
    /**
    * Returns a collection of databases that can be recovered from a specified
    * server.
    *
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the databases were hosted.
    * @return Contains the response to the List Recoverable Databases request.
    */
    @Override
    public Future<RecoverableDatabaseListResponse> listAsync(final String serverName) {
        return this.getClient().getExecutorService().submit(new Callable<RecoverableDatabaseListResponse>() { 
            @Override
            public RecoverableDatabaseListResponse call() throws Exception {
                return list(serverName);
            }
         });
    }
    
    /**
    * Returns a collection of databases that can be recovered from a specified
    * server.
    *
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the databases were hosted.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return Contains the response to the List Recoverable Databases request.
    */
    @Override
    public RecoverableDatabaseListResponse list(String serverName) throws IOException, ServiceException, ParserConfigurationException, SAXException {
        // Validate
        if (serverName == null) {
            throw new NullPointerException("serverName");
        }
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace) {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            tracingParameters.put("serverName", serverName);
            CloudTracing.enter(invocationId, this, "listAsync", tracingParameters);
        }
        
        // Construct URL
        String url = "";
        url = url + "/";
        if (this.getClient().getCredentials().getSubscriptionId() != null) {
            url = url + URLEncoder.encode(this.getClient().getCredentials().getSubscriptionId(), "UTF-8");
        }
        url = url + "/services/sqlservers/servers/";
        url = url + URLEncoder.encode(serverName, "UTF-8");
        url = url + "/recoverabledatabases";
        ArrayList<String> queryParameters = new ArrayList<String>();
        queryParameters.add("contentview=generic");
        if (queryParameters.size() > 0) {
            url = url + "?" + CollectionStringBuilder.join(queryParameters, "&");
        }
        String baseUrl = this.getClient().getBaseUri().toString();
        // Trim '/' character from the end of baseUrl and beginning of url.
        if (baseUrl.charAt(baseUrl.length() - 1) == '/') {
            baseUrl = baseUrl.substring(0, (baseUrl.length() - 1) + 0);
        }
        if (url.charAt(0) == '/') {
            url = url.substring(1);
        }
        url = baseUrl + "/" + url;
        url = url.replace(" ", "%20");
        
        // Create HTTP transport objects
        HttpGet httpRequest = new HttpGet(url);
        
        // Set Headers
        httpRequest.setHeader("x-ms-version", "2012-03-01");
        
        // Send Request
        HttpResponse httpResponse = null;
        try {
            if (shouldTrace) {
                CloudTracing.sendRequest(invocationId, httpRequest);
            }
            httpResponse = this.getClient().getHttpClient().execute(httpRequest);
            if (shouldTrace) {
                CloudTracing.receiveResponse(invocationId, httpResponse);
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK) {
                ServiceException ex = ServiceException.createFromXml(httpRequest, null, httpResponse, httpResponse.getEntity());
                if (shouldTrace) {
                    CloudTracing.error(invocationId, ex);
                }
                throw ex;
            }
            
            // Create Result
            RecoverableDatabaseListResponse result = null;
            // Deserialize Response
            if (statusCode == HttpStatus.SC_OK) {
                InputStream responseContent = httpResponse.getEntity().getContent();
                result = new RecoverableDatabaseListResponse();
                DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
                documentBuilderFactory.setNamespaceAware(true);
                DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
                Document responseDoc = documentBuilder.parse(new BOMInputStream(responseContent));
                
                Element serviceResourcesSequenceElement = XmlUtility.getElementByTagNameNS(responseDoc, "http://schemas.microsoft.com/windowsazure", "ServiceResources");
                if (serviceResourcesSequenceElement != null) {
                    for (int i1 = 0; i1 < com.microsoft.windowsazure.core.utils.XmlUtility.getElementsByTagNameNS(serviceResourcesSequenceElement, "http://schemas.microsoft.com/windowsazure", "ServiceResource").size(); i1 = i1 + 1) {
                        org.w3c.dom.Element serviceResourcesElement = ((org.w3c.dom.Element) com.microsoft.windowsazure.core.utils.XmlUtility.getElementsByTagNameNS(serviceResourcesSequenceElement, "http://schemas.microsoft.com/windowsazure", "ServiceResource").get(i1));
                        RecoverableDatabase serviceResourceInstance = new RecoverableDatabase();
                        result.getDatabases().add(serviceResourceInstance);
                        
                        Element entityIdElement = XmlUtility.getElementByTagNameNS(serviceResourcesElement, "http://schemas.microsoft.com/windowsazure", "EntityId");
                        if (entityIdElement != null) {
                            String entityIdInstance;
                            entityIdInstance = entityIdElement.getTextContent();
                            serviceResourceInstance.setEntityId(entityIdInstance);
                        }
                        
                        Element serverNameElement = XmlUtility.getElementByTagNameNS(serviceResourcesElement, "http://schemas.microsoft.com/windowsazure", "ServerName");
                        if (serverNameElement != null) {
                            String serverNameInstance;
                            serverNameInstance = serverNameElement.getTextContent();
                            serviceResourceInstance.setServerName(serverNameInstance);
                        }
                        
                        Element editionElement = XmlUtility.getElementByTagNameNS(serviceResourcesElement, "http://schemas.microsoft.com/windowsazure", "Edition");
                        if (editionElement != null) {
                            String editionInstance;
                            editionInstance = editionElement.getTextContent();
                            serviceResourceInstance.setEdition(editionInstance);
                        }
                        
                        Element lastAvailableBackupDateElement = XmlUtility.getElementByTagNameNS(serviceResourcesElement, "http://schemas.microsoft.com/windowsazure", "LastAvailableBackupDate");
                        if (lastAvailableBackupDateElement != null) {
                            Calendar lastAvailableBackupDateInstance;
                            lastAvailableBackupDateInstance = DatatypeConverter.parseDateTime(lastAvailableBackupDateElement.getTextContent());
                            serviceResourceInstance.setLastAvailableBackupDate(lastAvailableBackupDateInstance);
                        }
                        
                        Element nameElement = XmlUtility.getElementByTagNameNS(serviceResourcesElement, "http://schemas.microsoft.com/windowsazure", "Name");
                        if (nameElement != null) {
                            String nameInstance;
                            nameInstance = nameElement.getTextContent();
                            serviceResourceInstance.setName(nameInstance);
                        }
                        
                        Element typeElement = XmlUtility.getElementByTagNameNS(serviceResourcesElement, "http://schemas.microsoft.com/windowsazure", "Type");
                        if (typeElement != null) {
                            String typeInstance;
                            typeInstance = typeElement.getTextContent();
                            serviceResourceInstance.setType(typeInstance);
                        }
                        
                        Element stateElement = XmlUtility.getElementByTagNameNS(serviceResourcesElement, "http://schemas.microsoft.com/windowsazure", "State");
                        if (stateElement != null) {
                            String stateInstance;
                            stateInstance = stateElement.getTextContent();
                            serviceResourceInstance.setState(stateInstance);
                        }
                    }
                }
                
            }
            result.setStatusCode(statusCode);
            if (httpResponse.getHeaders("x-ms-request-id").length > 0) {
                result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
            }
            
            if (shouldTrace) {
                CloudTracing.exit(invocationId, result);
            }
            return result;
        } finally {
            if (httpResponse != null && httpResponse.getEntity() != null) {
                httpResponse.getEntity().getContent().close();
            }
        }
    }
}
