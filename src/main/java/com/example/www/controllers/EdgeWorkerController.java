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
import com.example.www.models.EdgeWorkerInformation;
import com.example.www.models.EdgeWorkerRequest;
import com.example.www.models.EdgeWorkersResponse;
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
public final class EdgeWorkerController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public EdgeWorkerController(Configuration config, HttpClient httpClient,
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
    public EdgeWorkerController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * Retrieve Edge Worker By Id.
     * @param  id  Required parameter: EdgeWorker ID
     * @return    Returns the EdgeWorkerInformation response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EdgeWorkerInformation edgeinstancesGetById1(
            final UUID id) throws ApiException, IOException {
        HttpRequest request = buildEdgeinstancesGetById1Request(id);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleEdgeinstancesGetById1Response(context);
    }

    /**
     * Retrieve Edge Worker By Id.
     * @param  id  Required parameter: EdgeWorker ID
     * @return    Returns the EdgeWorkerInformation response from the API call
     */
    public CompletableFuture<EdgeWorkerInformation> edgeinstancesGetById1Async(
            final UUID id) {
        return makeHttpCallAsync(() -> buildEdgeinstancesGetById1Request(id),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleEdgeinstancesGetById1Response(context));
    }

    /**
     * Builds the HttpRequest object for edgeinstancesGetById1.
     */
    private HttpRequest buildEdgeinstancesGetById1Request(
            final UUID id) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/edgeworkers/{id}");

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
     * Processes the response for edgeinstancesGetById1.
     * @return An object of type EdgeWorkerInformation
     */
    private EdgeWorkerInformation handleEdgeinstancesGetById1Response(
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
            throw new ErrorResponseException("Edge worker not found", context);
        }
        if (responseCode == 412) {
            throw new ErrorResponseException("Request Conditions Failed", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        EdgeWorkerInformation result = ApiHelper.deserialize(responseBody,
                EdgeWorkerInformation.class);

        return result;
    }

    /**
     * Delete edge worker.
     * @param  id  Required parameter: EdgeWorker ID
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void edgeworkerDelete(
            final UUID id) throws ApiException, IOException {
        HttpRequest request = buildEdgeworkerDeleteRequest(id);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        handleEdgeworkerDeleteResponse(context);
    }

    /**
     * Delete edge worker.
     * @param  id  Required parameter: EdgeWorker ID
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> edgeworkerDeleteAsync(
            final UUID id) {
        return makeHttpCallAsync(() -> buildEdgeworkerDeleteRequest(id),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleEdgeworkerDeleteResponse(context));
    }

    /**
     * Builds the HttpRequest object for edgeworkerDelete.
     */
    private HttpRequest buildEdgeworkerDeleteRequest(
            final UUID id) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/edgeworkers/{id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("id",
                new SimpleEntry<Object, Boolean>(id, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().delete(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for edgeworkerDelete.
     * @return An object of type void
     */
    private Void handleEdgeworkerDeleteResponse(
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
            throw new ErrorResponseException("Edge worker not found", context);
        }
        if (responseCode == 412) {
            throw new ErrorResponseException("Request Conditions Failed", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        return null;
    }

    /**
     * Retrieve list of all edge workers for company.
     * @param  edgeInstanceId  Optional parameter: Example:
     * @return    Returns the EdgeWorkersResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EdgeWorkersResponse edgeworkersGetAll(
            final UUID edgeInstanceId) throws ApiException, IOException {
        HttpRequest request = buildEdgeworkersGetAllRequest(edgeInstanceId);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleEdgeworkersGetAllResponse(context);
    }

    /**
     * Retrieve list of all edge workers for company.
     * @param  edgeInstanceId  Optional parameter: Example:
     * @return    Returns the EdgeWorkersResponse response from the API call
     */
    public CompletableFuture<EdgeWorkersResponse> edgeworkersGetAllAsync(
            final UUID edgeInstanceId) {
        return makeHttpCallAsync(() -> buildEdgeworkersGetAllRequest(edgeInstanceId),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleEdgeworkersGetAllResponse(context));
    }

    /**
     * Builds the HttpRequest object for edgeworkersGetAll.
     */
    private HttpRequest buildEdgeworkersGetAllRequest(
            final UUID edgeInstanceId) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/edgeworkers");

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
     * Processes the response for edgeworkersGetAll.
     * @return An object of type EdgeWorkersResponse
     */
    private EdgeWorkersResponse handleEdgeworkersGetAllResponse(
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
        EdgeWorkersResponse result = ApiHelper.deserialize(responseBody,
                EdgeWorkersResponse.class);

        return result;
    }

    /**
     * Create edge worker and generate the pairing information.
     * @param  body  Optional parameter: Example:
     * @return    Returns the EdgeWorkerInformation response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EdgeWorkerInformation edgeworkersCreate(
            final EdgeWorkerRequest body) throws ApiException, IOException {
        HttpRequest request = buildEdgeworkersCreateRequest(body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleEdgeworkersCreateResponse(context);
    }

    /**
     * Create edge worker and generate the pairing information.
     * @param  body  Optional parameter: Example:
     * @return    Returns the EdgeWorkerInformation response from the API call
     */
    public CompletableFuture<EdgeWorkerInformation> edgeworkersCreateAsync(
            final EdgeWorkerRequest body) {
        return makeHttpCallAsync(() -> buildEdgeworkersCreateRequest(body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleEdgeworkersCreateResponse(context));
    }

    /**
     * Builds the HttpRequest object for edgeworkersCreate.
     */
    private HttpRequest buildEdgeworkersCreateRequest(
            final EdgeWorkerRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/edgeworkers");

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
     * Processes the response for edgeworkersCreate.
     * @return An object of type EdgeWorkerInformation
     */
    private EdgeWorkerInformation handleEdgeworkersCreateResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new ErrorResponseException("Request conditions failed", context);
        }
        if (responseCode == 412) {
            throw new ErrorResponseException("Request conditions failed", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        EdgeWorkerInformation result = ApiHelper.deserialize(responseBody,
                EdgeWorkerInformation.class);

        return result;
    }

    /**
     * Pair Edge Worker with Edge Instance.
     * @param  id  Required parameter: EdgeWorker ID
     * @param  body  Optional parameter: Example:
     * @return    Returns the EdgeWorkerInformation response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EdgeWorkerInformation edgeworkersPair(
            final UUID id,
            final EdgeWorkerRequest body) throws ApiException, IOException {
        HttpRequest request = buildEdgeworkersPairRequest(id, body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleEdgeworkersPairResponse(context);
    }

    /**
     * Pair Edge Worker with Edge Instance.
     * @param  id  Required parameter: EdgeWorker ID
     * @param  body  Optional parameter: Example:
     * @return    Returns the EdgeWorkerInformation response from the API call
     */
    public CompletableFuture<EdgeWorkerInformation> edgeworkersPairAsync(
            final UUID id,
            final EdgeWorkerRequest body) {
        return makeHttpCallAsync(() -> buildEdgeworkersPairRequest(id, body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleEdgeworkersPairResponse(context));
    }

    /**
     * Builds the HttpRequest object for edgeworkersPair.
     */
    private HttpRequest buildEdgeworkersPairRequest(
            final UUID id,
            final EdgeWorkerRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/edgeworkers/{id}/pair");

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
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for edgeworkersPair.
     * @return An object of type EdgeWorkerInformation
     */
    private EdgeWorkerInformation handleEdgeworkersPairResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new ErrorResponseException("Request conditions failed", context);
        }
        if (responseCode == 412) {
            throw new ErrorResponseException("Request conditions failed", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        EdgeWorkerInformation result = ApiHelper.deserialize(responseBody,
                EdgeWorkerInformation.class);

        return result;
    }

}