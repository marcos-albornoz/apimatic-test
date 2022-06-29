/*
 * VenafiAsAServiceAPIForEdgeManagementServiceOperationsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.www;

import com.example.www.http.request.HttpRequest;
import java.util.concurrent.CompletableFuture;

public class CustomHeaderAuthenticationManager implements AuthManager, CustomHeaderAuthenticationCredentials {

    private String tpplApiKey;

    /**
     * Constructor that sets custom header parameters.
     */
    public CustomHeaderAuthenticationManager(String tpplApiKey) {
        this.tpplApiKey = tpplApiKey;
    }

    /**
     * String value for tpplApiKey.
     * @return tpplApiKey
     */
    public String getTpplApiKey() {
        return tpplApiKey;
    }

    /**
     * Checks if provided credentials matched with existing ones.
     * @param tpplApiKey String value for credentials.
     * @return true if credentials matched.
     */
    public boolean equals(String tpplApiKey) {
        return tpplApiKey.equals(getTpplApiKey());
    }

    /**
     * Converts this CustomHeaderAuthenticationManager into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomHeaderAuthenticationManager [" + "tpplApiKey=" + tpplApiKey + "]";
    }

    /**
     * Adds custom header parameters (if present) to the given HttpRequest.
     */
    public HttpRequest apply(HttpRequest httpRequest) {
        httpRequest.getHeaders().add("tppl-api-key", tpplApiKey);
        return httpRequest;
    }

    /**
     * Adds custom header parameters (if present) to the given HttpRequest.
     */
    public CompletableFuture<HttpRequest> applyAsync(HttpRequest httpRequest) {
        return CompletableFuture.completedFuture(apply(httpRequest));
    }
}
