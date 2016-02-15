/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.resources;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.resources.models.ManagementLockObject;
import com.microsoft.azure.management.resources.models.PageImpl;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in ManagementLocksOperations.
 */
public interface ManagementLocksOperations {
    /**
     * The interface defining all the services for ManagementLocksOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ManagementLocksService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Authorization/locks/{lockName}")
        Call<ResponseBody> createOrUpdateAtResourceGroupLevel(@Path("resourceGroupName") String resourceGroupName, @Path("lockName") String lockName, @Path("subscriptionId") String subscriptionId, @Body ManagementLockObject parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{parentResourcePath}/{resourceType}/{resourceName}/providers/Microsoft.Authorization/locks/{lockName}")
        Call<ResponseBody> createOrUpdateAtResourceLevel(@Path("resourceGroupName") String resourceGroupName, @Path("resourceProviderNamespace") String resourceProviderNamespace, @Path("parentResourcePath") String parentResourcePath, @Path("resourceType") String resourceType, @Path("resourceName") String resourceName, @Path("lockName") String lockName, @Path("subscriptionId") String subscriptionId, @Body ManagementLockObject parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{parentResourcePath}/{resourceType}/{resourceName}/providers/Microsoft.Authorization/locks/{lockName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteAtResourceLevel(@Path("resourceGroupName") String resourceGroupName, @Path("resourceProviderNamespace") String resourceProviderNamespace, @Path("parentResourcePath") String parentResourcePath, @Path("resourceType") String resourceType, @Path("resourceName") String resourceName, @Path("lockName") String lockName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/providers/Microsoft.Authorization/locks/{lockName}")
        Call<ResponseBody> createOrUpdateAtSubscriptionLevel(@Path("lockName") String lockName, @Path("subscriptionId") String subscriptionId, @Body ManagementLockObject parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/providers/Microsoft.Authorization/locks/{lockName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteAtSubscriptionLevel(@Path("lockName") String lockName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Authorization/locks/{lockName}")
        Call<ResponseBody> get(@Path("lockName") String lockName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Authorization/locks/{lockName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteAtResourceGroupLevel(@Path("resourceGroup") String resourceGroup, @Path("lockName") String lockName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Authorization/locks")
        Call<ResponseBody> listAtResourceGroupLevel(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{parentResourcePath}/{resourceType}/{resourceName}/providers/Microsoft.Authorization/locks")
        Call<ResponseBody> listAtResourceLevel(@Path("resourceGroupName") String resourceGroupName, @Path("resourceProviderNamespace") String resourceProviderNamespace, @Path("parentResourcePath") String parentResourcePath, @Path("resourceType") String resourceType, @Path("resourceName") String resourceName, @Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("{nextLink}")
        Call<ResponseBody> listNext(@Path("nextLink") String nextLink, @Path("subscriptionId") String subscriptionId, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Authorization/locks")
        Call<ResponseBody> listAtSubscriptionLevel(@Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listAtResourceGroupLevelNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listAtResourceLevelNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listNextNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listAtSubscriptionLevelNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Create or update a management lock at the resource group level.
     *
     * @param resourceGroupName The resource group name.
     * @param lockName The lock name.
     * @param parameters The management lock parameters.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ManagementLockObject object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ManagementLockObject> createOrUpdateAtResourceGroupLevel(String resourceGroupName, String lockName, ManagementLockObject parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Create or update a management lock at the resource group level.
     *
     * @param resourceGroupName The resource group name.
     * @param lockName The lock name.
     * @param parameters The management lock parameters.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createOrUpdateAtResourceGroupLevelAsync(String resourceGroupName, String lockName, ManagementLockObject parameters, final ServiceCallback<ManagementLockObject> serviceCallback);

    /**
     * Create or update a management lock at the resource level or any level below resource.
     *
     * @param resourceGroupName The name of the resource group. 
     * @param resourceProviderNamespace Resource identity.
     * @param parentResourcePath Resource identity.
     * @param resourceType Resource identity.
     * @param resourceName Resource identity.
     * @param lockName The name of lock.
     * @param parameters Create or update management lock parameters.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ManagementLockObject object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ManagementLockObject> createOrUpdateAtResourceLevel(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String lockName, ManagementLockObject parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Create or update a management lock at the resource level or any level below resource.
     *
     * @param resourceGroupName The name of the resource group. 
     * @param resourceProviderNamespace Resource identity.
     * @param parentResourcePath Resource identity.
     * @param resourceType Resource identity.
     * @param resourceName Resource identity.
     * @param lockName The name of lock.
     * @param parameters Create or update management lock parameters.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createOrUpdateAtResourceLevelAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String lockName, ManagementLockObject parameters, final ServiceCallback<ManagementLockObject> serviceCallback);

    /**
     * Deletes the management lock of a resource or any level below resource.
     *
     * @param resourceGroupName The name of the resource group. 
     * @param resourceProviderNamespace Resource identity.
     * @param parentResourcePath Resource identity.
     * @param resourceType Resource identity.
     * @param resourceName Resource identity.
     * @param lockName The name of lock.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> deleteAtResourceLevel(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String lockName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Deletes the management lock of a resource or any level below resource.
     *
     * @param resourceGroupName The name of the resource group. 
     * @param resourceProviderNamespace Resource identity.
     * @param parentResourcePath Resource identity.
     * @param resourceType Resource identity.
     * @param resourceName Resource identity.
     * @param lockName The name of lock.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAtResourceLevelAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String lockName, final ServiceCallback<Void> serviceCallback);

    /**
     * Create or update a management lock at the subscription level.
     *
     * @param lockName The name of lock.
     * @param parameters The management lock parameters.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ManagementLockObject object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ManagementLockObject> createOrUpdateAtSubscriptionLevel(String lockName, ManagementLockObject parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Create or update a management lock at the subscription level.
     *
     * @param lockName The name of lock.
     * @param parameters The management lock parameters.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createOrUpdateAtSubscriptionLevelAsync(String lockName, ManagementLockObject parameters, final ServiceCallback<ManagementLockObject> serviceCallback);

    /**
     * Deletes the management lock of a subscription.
     *
     * @param lockName The name of lock.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> deleteAtSubscriptionLevel(String lockName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Deletes the management lock of a subscription.
     *
     * @param lockName The name of lock.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAtSubscriptionLevelAsync(String lockName, final ServiceCallback<Void> serviceCallback);

    /**
     * Gets the management lock of a scope.
     *
     * @param lockName Name of the management lock.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ManagementLockObject object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ManagementLockObject> get(String lockName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the management lock of a scope.
     *
     * @param lockName Name of the management lock.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAsync(String lockName, final ServiceCallback<ManagementLockObject> serviceCallback);

    /**
     * Deletes the management lock of a resource group.
     *
     * @param resourceGroup The resource group names.
     * @param lockName The name of lock.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> deleteAtResourceGroupLevel(String resourceGroup, String lockName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Deletes the management lock of a resource group.
     *
     * @param resourceGroup The resource group names.
     * @param lockName The name of lock.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAtResourceGroupLevelAsync(String resourceGroup, String lockName, final ServiceCallback<Void> serviceCallback);

    /**
     * Gets all the management locks of a resource group.
     *
     * @param resourceGroupName Resource group name.
     * @param filter The filter to apply on the operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ManagementLockObject&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<ManagementLockObject>> listAtResourceGroupLevel(final String resourceGroupName, final ManagementLockObject filter) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets all the management locks of a resource group.
     *
     * @param resourceGroupName Resource group name.
     * @param filter The filter to apply on the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAtResourceGroupLevelAsync(final String resourceGroupName, final ManagementLockObject filter, final ListOperationCallback<ManagementLockObject> serviceCallback);

    /**
     * Gets all the management locks of a resource or any level below resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceProviderNamespace Resource identity.
     * @param parentResourcePath Resource identity.
     * @param resourceType Resource identity.
     * @param resourceName Resource identity.
     * @param filter The filter to apply on the operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ManagementLockObject&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<ManagementLockObject>> listAtResourceLevel(final String resourceGroupName, final String resourceProviderNamespace, final String parentResourcePath, final String resourceType, final String resourceName, final ManagementLockObject filter) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets all the management locks of a resource or any level below resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceProviderNamespace Resource identity.
     * @param parentResourcePath Resource identity.
     * @param resourceType Resource identity.
     * @param resourceName Resource identity.
     * @param filter The filter to apply on the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAtResourceLevelAsync(final String resourceGroupName, final String resourceProviderNamespace, final String parentResourcePath, final String resourceType, final String resourceName, final ManagementLockObject filter, final ListOperationCallback<ManagementLockObject> serviceCallback);

    /**
     * Get a list of management locks at resource level or below.
     *
     * @param nextLink NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ManagementLockObject&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<ManagementLockObject>> listNext(final String nextLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get a list of management locks at resource level or below.
     *
     * @param nextLink NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(final String nextLink, final ListOperationCallback<ManagementLockObject> serviceCallback);

    /**
     * Gets all the management locks of a subscription.
     *
     * @param filter The filter to apply on the operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ManagementLockObject&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<ManagementLockObject>> listAtSubscriptionLevel(final ManagementLockObject filter) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets all the management locks of a subscription.
     *
     * @param filter The filter to apply on the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAtSubscriptionLevelAsync(final ManagementLockObject filter, final ListOperationCallback<ManagementLockObject> serviceCallback);

    /**
     * Gets all the management locks of a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ManagementLockObject&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ManagementLockObject>> listAtResourceGroupLevelNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets all the management locks of a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAtResourceGroupLevelNextAsync(final String nextPageLink, final ListOperationCallback<ManagementLockObject> serviceCallback);

    /**
     * Gets all the management locks of a resource or any level below resource.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ManagementLockObject&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ManagementLockObject>> listAtResourceLevelNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets all the management locks of a resource or any level below resource.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAtResourceLevelNextAsync(final String nextPageLink, final ListOperationCallback<ManagementLockObject> serviceCallback);

    /**
     * Get a list of management locks at resource level or below.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ManagementLockObject&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ManagementLockObject>> listNextNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get a list of management locks at resource level or below.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextNextAsync(final String nextPageLink, final ListOperationCallback<ManagementLockObject> serviceCallback);

    /**
     * Gets all the management locks of a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ManagementLockObject&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ManagementLockObject>> listAtSubscriptionLevelNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets all the management locks of a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAtSubscriptionLevelNextAsync(final String nextPageLink, final ListOperationCallback<ManagementLockObject> serviceCallback);

}