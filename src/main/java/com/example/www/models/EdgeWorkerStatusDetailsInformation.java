/*
 * VenafiAsAServiceAPIForEdgeManagementServiceOperationsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.www.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
import java.util.UUID;

/**
 * This is a model class for EdgeWorkerStatusDetailsInformation type.
 */
public class EdgeWorkerStatusDetailsInformation {
    private UUID edgeWorkerId;
    private List<EdgeWorkerHealthDetails> healthDetails;

    /**
     * Default constructor.
     */
    public EdgeWorkerStatusDetailsInformation() {
    }

    /**
     * Initialization constructor.
     * @param  edgeWorkerId  UUID value for edgeWorkerId.
     * @param  healthDetails  List of EdgeWorkerHealthDetails value for healthDetails.
     */
    public EdgeWorkerStatusDetailsInformation(
            UUID edgeWorkerId,
            List<EdgeWorkerHealthDetails> healthDetails) {
        this.edgeWorkerId = edgeWorkerId;
        this.healthDetails = healthDetails;
    }

    /**
     * Getter for EdgeWorkerId.
     * @return Returns the UUID
     */
    @JsonGetter("edgeWorkerId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getEdgeWorkerId() {
        return edgeWorkerId;
    }

    /**
     * Setter for EdgeWorkerId.
     * @param edgeWorkerId Value for UUID
     */
    @JsonSetter("edgeWorkerId")
    public void setEdgeWorkerId(UUID edgeWorkerId) {
        this.edgeWorkerId = edgeWorkerId;
    }

    /**
     * Getter for HealthDetails.
     * @return Returns the List of EdgeWorkerHealthDetails
     */
    @JsonGetter("healthDetails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<EdgeWorkerHealthDetails> getHealthDetails() {
        return healthDetails;
    }

    /**
     * Setter for HealthDetails.
     * @param healthDetails Value for List of EdgeWorkerHealthDetails
     */
    @JsonSetter("healthDetails")
    public void setHealthDetails(List<EdgeWorkerHealthDetails> healthDetails) {
        this.healthDetails = healthDetails;
    }

    /**
     * Converts this EdgeWorkerStatusDetailsInformation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EdgeWorkerStatusDetailsInformation [" + "edgeWorkerId=" + edgeWorkerId
                + ", healthDetails=" + healthDetails + "]";
    }

    /**
     * Builds a new {@link EdgeWorkerStatusDetailsInformation.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EdgeWorkerStatusDetailsInformation.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .edgeWorkerId(getEdgeWorkerId())
                .healthDetails(getHealthDetails());
        return builder;
    }

    /**
     * Class to build instances of {@link EdgeWorkerStatusDetailsInformation}.
     */
    public static class Builder {
        private UUID edgeWorkerId;
        private List<EdgeWorkerHealthDetails> healthDetails;



        /**
         * Setter for edgeWorkerId.
         * @param  edgeWorkerId  UUID value for edgeWorkerId.
         * @return Builder
         */
        public Builder edgeWorkerId(UUID edgeWorkerId) {
            this.edgeWorkerId = edgeWorkerId;
            return this;
        }

        /**
         * Setter for healthDetails.
         * @param  healthDetails  List of EdgeWorkerHealthDetails value for healthDetails.
         * @return Builder
         */
        public Builder healthDetails(List<EdgeWorkerHealthDetails> healthDetails) {
            this.healthDetails = healthDetails;
            return this;
        }

        /**
         * Builds a new {@link EdgeWorkerStatusDetailsInformation} object using the set fields.
         * @return {@link EdgeWorkerStatusDetailsInformation}
         */
        public EdgeWorkerStatusDetailsInformation build() {
            return new EdgeWorkerStatusDetailsInformation(edgeWorkerId, healthDetails);
        }
    }
}
