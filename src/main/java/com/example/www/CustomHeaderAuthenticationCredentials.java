/*
 * VenafiAsAServiceAPIForEdgeManagementServiceOperationsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.www;

/**
 * Interface for defining the behavior of CustomHeader Authentication.
 */
public interface CustomHeaderAuthenticationCredentials {

    /**
     * String value for tpplApiKey.
     * @return tpplApiKey
     */
    String getTpplApiKey();

    /**
     * Checks if provided credentials matched with existing ones.
     * @param tpplApiKey String value for credentials.
     * @return true if credentials matched.
     */
    boolean equals(String tpplApiKey);
}
