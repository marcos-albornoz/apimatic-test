/*
 * VenafiAsAServiceAPIForEdgeManagementServiceOperationsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.www.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.example.www.ApiHelper;
import com.example.www.VenafiAsAServiceAPIForEdgeManagementServiceOperationsClient;
import com.example.www.exceptions.ApiException;
import com.example.www.models.EdgeWorkerRequest;
import com.example.www.testing.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class EdgeWorkerControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static VenafiAsAServiceAPIForEdgeManagementServiceOperationsClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static EdgeWorkerController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getEdgeWorkerController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Retrieve list of all edge workers for company.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestEdgeworkersGetAll() throws Exception {
        // Parameters for the API call
        UUID edgeInstanceId = null;

        // Set callback and perform API call
        try {
            controller.edgeworkersGetAll(edgeInstanceId);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

    }

    /**
     * Create edge worker and generate the pairing information.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestEdgeworkersCreate() throws Exception {
        // Parameters for the API call
        EdgeWorkerRequest body = null;

        // Set callback and perform API call
        try {
            controller.edgeworkersCreate(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 201", 
                201, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

    }

}
