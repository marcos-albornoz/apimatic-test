/*
 * VenafiAsAServiceAPIForEdgeManagementServiceOperationsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.www.controllers;

import com.example.www.ApiHelper;
import com.example.www.AuthManager;
import com.example.www.Configuration;
import com.example.www.exceptions.ApiException;
import com.example.www.exceptions.ErrorResponseException;
import com.example.www.http.Headers;
import com.example.www.http.client.HttpCallback;
import com.example.www.http.client.HttpClient;
import com.example.www.http.client.HttpContext;
import com.example.www.http.request.HttpRequest;
import com.example.www.http.response.HttpResponse;
import com.example.www.http.response.HttpStringResponse;
import com.example.www.models.BillOfMaterialResponse;
import com.example.www.models.EdgeInstanceDeleteResponse;
import com.example.www.models.EdgeInstanceInformation;
import com.example.www.models.EdgeInstanceRequest;
import com.example.www.models.EdgeInstanceResponse;
import com.example.www.models.EncryptionKeyInformation;
import com.example.www.models.EncryptionKeysResponse;
import com.example.www.models.PairingCodeInformation;
import com.example.www.models.PairingCodeRequest;
import com.example.www.models.PairingCodeResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * This class lists all the endpoints of the groups.
 */
public final class EdgeHubController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public EdgeHubController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }

    /**
     * Initializes the controller with HTTPCallback.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     * @param httpCallback    Callback to be called before and after the HTTP call.
     */
    public EdgeHubController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * Retrieve list of all pairing codes used by edge instances for company.
     * @return    Returns the PairingCodeResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PairingCodeResponse pairingcodesGetAll() throws ApiException, IOException {
        HttpRequest request = buildPairingcodesGetAllRequest();
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handlePairingcodesGetAllResponse(context);
    }

    /**
     * Retrieve list of all pairing codes used by edge instances for company.
     * @return    Returns the PairingCodeResponse response from the API call
     */
    public CompletableFuture<PairingCodeResponse> pairingcodesGetAllAsync() {
        return makeHttpCallAsync(() -> buildPairingcodesGetAllRequest(),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handlePairingcodesGetAllResponse(context));
    }

    /**
     * Builds the HttpRequest object for pairingcodesGetAll.
     */
    private HttpRequest buildPairingcodesGetAllRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/pairingcodes");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for pairingcodesGetAll.
     * @return An object of type PairingCodeResponse
     */
    private PairingCodeResponse handlePairingcodesGetAllResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        PairingCodeResponse result = ApiHelper.deserialize(responseBody,
                PairingCodeResponse.class);

        return result;
    }

    /**
     * Generate new pairing code for edge instance registration.
     * @param  body  Optional parameter: Example:
     * @return    Returns the PairingCodeInformation response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PairingCodeInformation pairingcodesCreate(
            final PairingCodeRequest body) throws ApiException, IOException {
        HttpRequest request = buildPairingcodesCreateRequest(body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handlePairingcodesCreateResponse(context);
    }

    /**
     * Generate new pairing code for edge instance registration.
     * @param  body  Optional parameter: Example:
     * @return    Returns the PairingCodeInformation response from the API call
     */
    public CompletableFuture<PairingCodeInformation> pairingcodesCreateAsync(
            final PairingCodeRequest body) {
        return makeHttpCallAsync(() -> buildPairingcodesCreateRequest(body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handlePairingcodesCreateResponse(context));
    }

    /**
     * Builds the HttpRequest object for pairingcodesCreate.
     */
    private HttpRequest buildPairingcodesCreateRequest(
            final PairingCodeRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/pairingcodes");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for pairingcodesCreate.
     * @return An object of type PairingCodeInformation
     */
    private PairingCodeInformation handlePairingcodesCreateResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new ErrorResponseException("Request Conditions Failed", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        PairingCodeInformation result = ApiHelper.deserialize(responseBody,
                PairingCodeInformation.class);

        return result;
    }

    /**
     * Retrieve edge instance with 'id' attribute matching specified value; specified value should
     * be uuid not numeric.
     * @param  id  Required parameter: EdgeInstance ID
     * @param  statusDetails  Optional parameter: Example: false
     * @return    Returns the EdgeInstanceInformation response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EdgeInstanceInformation edgeinstancesGetById(
            final UUID id,
            final Boolean statusDetails) throws ApiException, IOException {
        HttpRequest request = buildEdgeinstancesGetByIdRequest(id, statusDetails);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleEdgeinstancesGetByIdResponse(context);
    }

    /**
     * Retrieve edge instance with 'id' attribute matching specified value; specified value should
     * be uuid not numeric.
     * @param  id  Required parameter: EdgeInstance ID
     * @param  statusDetails  Optional parameter: Example: false
     * @return    Returns the EdgeInstanceInformation response from the API call
     */
    public CompletableFuture<EdgeInstanceInformation> edgeinstancesGetByIdAsync(
            final UUID id,
            final Boolean statusDetails) {
        return makeHttpCallAsync(() -> buildEdgeinstancesGetByIdRequest(id, statusDetails),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleEdgeinstancesGetByIdResponse(context));
    }

    /**
     * Builds the HttpRequest object for edgeinstancesGetById.
     */
    private HttpRequest buildEdgeinstancesGetByIdRequest(
            final UUID id,
            final Boolean statusDetails) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/edgeinstances/{id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("id",
                new SimpleEntry<Object, Boolean>(id, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("statusDetails",
                (statusDetails != null) ? statusDetails : false);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, queryParameters,
                null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for edgeinstancesGetById.
     * @return An object of type EdgeInstanceInformation
     */
    private EdgeInstanceInformation handleEdgeinstancesGetByIdResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new ErrorResponseException("Request Conditions Failed", context);
        }
        if (responseCode == 404) {
            throw new ErrorResponseException("Edge instance not found", context);
        }
        if (responseCode == 412) {
            throw new ErrorResponseException("Request Conditions Failed", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        EdgeInstanceInformation result = ApiHelper.deserialize(responseBody,
                EdgeInstanceInformation.class);

        return result;
    }

    /**
     * Update edge instance with specified new value.
     * @param  id  Required parameter: EdgeInstance ID
     * @param  body  Optional parameter: Example:
     * @return    Returns the EdgeInstanceInformation response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EdgeInstanceInformation edgeinstancesUpdate(
            final UUID id,
            final EdgeInstanceRequest body) throws ApiException, IOException {
        HttpRequest request = buildEdgeinstancesUpdateRequest(id, body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleEdgeinstancesUpdateResponse(context);
    }

    /**
     * Update edge instance with specified new value.
     * @param  id  Required parameter: EdgeInstance ID
     * @param  body  Optional parameter: Example:
     * @return    Returns the EdgeInstanceInformation response from the API call
     */
    public CompletableFuture<EdgeInstanceInformation> edgeinstancesUpdateAsync(
            final UUID id,
            final EdgeInstanceRequest body) {
        return makeHttpCallAsync(() -> buildEdgeinstancesUpdateRequest(id, body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleEdgeinstancesUpdateResponse(context));
    }

    /**
     * Builds the HttpRequest object for edgeinstancesUpdate.
     */
    private HttpRequest buildEdgeinstancesUpdateRequest(
            final UUID id,
            final EdgeInstanceRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/edgeinstances/{id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("id",
                new SimpleEntry<Object, Boolean>(id, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().putBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for edgeinstancesUpdate.
     * @return An object of type EdgeInstanceInformation
     */
    private EdgeInstanceInformation handleEdgeinstancesUpdateResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new ErrorResponseException("Request Conditions Failed", context);
        }
        if (responseCode == 404) {
            throw new ErrorResponseException("Edge Instance Not Found", context);
        }
        if (responseCode == 412) {
            throw new ErrorResponseException("Request Conditions Failed", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        EdgeInstanceInformation result = ApiHelper.deserialize(responseBody,
                EdgeInstanceInformation.class);

        return result;
    }

    /**
     * Delete edge instance.
     * @param  id  Required parameter: EdgeInstance ID
     * @return    Returns the EdgeInstanceDeleteResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EdgeInstanceDeleteResponse edgeinstancesDelete(
            final UUID id) throws ApiException, IOException {
        HttpRequest request = buildEdgeinstancesDeleteRequest(id);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleEdgeinstancesDeleteResponse(context);
    }

    /**
     * Delete edge instance.
     * @param  id  Required parameter: EdgeInstance ID
     * @return    Returns the EdgeInstanceDeleteResponse response from the API call
     */
    public CompletableFuture<EdgeInstanceDeleteResponse> edgeinstancesDeleteAsync(
            final UUID id) {
        return makeHttpCallAsync(() -> buildEdgeinstancesDeleteRequest(id),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleEdgeinstancesDeleteResponse(context));
    }

    /**
     * Builds the HttpRequest object for edgeinstancesDelete.
     */
    private HttpRequest buildEdgeinstancesDeleteRequest(
            final UUID id) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/edgeinstances/{id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("id",
                new SimpleEntry<Object, Boolean>(id, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().delete(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for edgeinstancesDelete.
     * @return An object of type EdgeInstanceDeleteResponse
     */
    private EdgeInstanceDeleteResponse handleEdgeinstancesDeleteResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new ErrorResponseException("Request Conditions Failed", context);
        }
        if (responseCode == 404) {
            throw new ErrorResponseException("Edge Instance Not Found", context);
        }
        if (responseCode == 412) {
            throw new ErrorResponseException("Request Conditions Failed", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        EdgeInstanceDeleteResponse result = ApiHelper.deserialize(responseBody,
                EdgeInstanceDeleteResponse.class);

        return result;
    }

    /**
     * Retrieve list of all edge instances for company.
     * @param  environmentId  Optional parameter: Example:
     * @return    Returns the EdgeInstanceResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EdgeInstanceResponse edgeinstancesGetAll(
            final UUID environmentId) throws ApiException, IOException {
        HttpRequest request = buildEdgeinstancesGetAllRequest(environmentId);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleEdgeinstancesGetAllResponse(context);
    }

    /**
     * Retrieve list of all edge instances for company.
     * @param  environmentId  Optional parameter: Example:
     * @return    Returns the EdgeInstanceResponse response from the API call
     */
    public CompletableFuture<EdgeInstanceResponse> edgeinstancesGetAllAsync(
            final UUID environmentId) {
        return makeHttpCallAsync(() -> buildEdgeinstancesGetAllRequest(environmentId),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleEdgeinstancesGetAllResponse(context));
    }

    /**
     * Builds the HttpRequest object for edgeinstancesGetAll.
     */
    private HttpRequest buildEdgeinstancesGetAllRequest(
            final UUID environmentId) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/edgeinstances");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("environmentId", environmentId);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, queryParameters,
                null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for edgeinstancesGetAll.
     * @return An object of type EdgeInstanceResponse
     */
    private EdgeInstanceResponse handleEdgeinstancesGetAllResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        EdgeInstanceResponse result = ApiHelper.deserialize(responseBody,
                EdgeInstanceResponse.class);

        return result;
    }

    /**
     * Retrieve the list of edge encryption keys based on query parameters.
     * @param  edgeInstanceId  Optional parameter: Example:
     * @return    Returns the EncryptionKeysResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EncryptionKeysResponse edgeencryptionkeysGetAll(
            final UUID edgeInstanceId) throws ApiException, IOException {
        HttpRequest request = buildEdgeencryptionkeysGetAllRequest(edgeInstanceId);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleEdgeencryptionkeysGetAllResponse(context);
    }

    /**
     * Retrieve the list of edge encryption keys based on query parameters.
     * @param  edgeInstanceId  Optional parameter: Example:
     * @return    Returns the EncryptionKeysResponse response from the API call
     */
    public CompletableFuture<EncryptionKeysResponse> edgeencryptionkeysGetAllAsync(
            final UUID edgeInstanceId) {
        return makeHttpCallAsync(() -> buildEdgeencryptionkeysGetAllRequest(edgeInstanceId),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleEdgeencryptionkeysGetAllResponse(context));
    }

    /**
     * Builds the HttpRequest object for edgeencryptionkeysGetAll.
     */
    private HttpRequest buildEdgeencryptionkeysGetAllRequest(
            final UUID edgeInstanceId) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/edgeencryptionkeys");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("edgeInstanceId", edgeInstanceId);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, queryParameters,
                null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for edgeencryptionkeysGetAll.
     * @return An object of type EncryptionKeysResponse
     */
    private EncryptionKeysResponse handleEdgeencryptionkeysGetAllResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        EncryptionKeysResponse result = ApiHelper.deserialize(responseBody,
                EncryptionKeysResponse.class);

        return result;
    }

    /**
     * Retrieve edge encryption key with 'id' attribute matching specified value; specified value
     * should be string not numeric.
     * @param  id  Required parameter: Example:
     * @return    Returns the EncryptionKeyInformation response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EncryptionKeyInformation edgeencryptionkeysGetById(
            final String id) throws ApiException, IOException {
        HttpRequest request = buildEdgeencryptionkeysGetByIdRequest(id);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleEdgeencryptionkeysGetByIdResponse(context);
    }

    /**
     * Retrieve edge encryption key with 'id' attribute matching specified value; specified value
     * should be string not numeric.
     * @param  id  Required parameter: Example:
     * @return    Returns the EncryptionKeyInformation response from the API call
     */
    public CompletableFuture<EncryptionKeyInformation> edgeencryptionkeysGetByIdAsync(
            final String id) {
        return makeHttpCallAsync(() -> buildEdgeencryptionkeysGetByIdRequest(id),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleEdgeencryptionkeysGetByIdResponse(context));
    }

    /**
     * Builds the HttpRequest object for edgeencryptionkeysGetById.
     */
    private HttpRequest buildEdgeencryptionkeysGetByIdRequest(
            final String id) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/edgeencryptionkeys/{id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("id",
                new SimpleEntry<Object, Boolean>(id, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for edgeencryptionkeysGetById.
     * @return An object of type EncryptionKeyInformation
     */
    private EncryptionKeyInformation handleEdgeencryptionkeysGetByIdResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new ErrorResponseException("Request Conditions Failed", context);
        }
        if (responseCode == 404) {
            throw new ErrorResponseException("Encryption key not found", context);
        }
        if (responseCode == 412) {
            throw new ErrorResponseException("Request Conditions Failed", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        EncryptionKeyInformation result = ApiHelper.deserialize(responseBody,
                EncryptionKeyInformation.class);

        return result;
    }

    /**
     * Retrieve list of latest bills of materials.
     * @return    Returns the BillOfMaterialResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BillOfMaterialResponse billofmaterialsGetLatest() throws ApiException, IOException {
        HttpRequest request = buildBillofmaterialsGetLatestRequest();
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleBillofmaterialsGetLatestResponse(context);
    }

    /**
     * Retrieve list of latest bills of materials.
     * @return    Returns the BillOfMaterialResponse response from the API call
     */
    public CompletableFuture<BillOfMaterialResponse> billofmaterialsGetLatestAsync() {
        return makeHttpCallAsync(() -> buildBillofmaterialsGetLatestRequest(),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleBillofmaterialsGetLatestResponse(context));
    }

    /**
     * Builds the HttpRequest object for billofmaterialsGetLatest.
     */
    private HttpRequest buildBillofmaterialsGetLatestRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/billofmaterials");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for billofmaterialsGetLatest.
     * @return An object of type BillOfMaterialResponse
     */
    private BillOfMaterialResponse handleBillofmaterialsGetLatestResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        BillOfMaterialResponse result = ApiHelper.deserialize(responseBody,
                BillOfMaterialResponse.class);

        return result;
    }

}