/*
 * VenafiAsAServiceAPIForEdgeManagementServiceOperationsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.www.models;

import com.example.www.DateTimeHelper;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDateTime;
import java.util.List;

/**
 * This is a model class for NamespaceStatusDetails type.
 */
public class NamespaceStatusDetails {
    private LocalDateTime timestamp;
    private String name;
    private List<PodStatusDetails> pods;

    /**
     * Default constructor.
     */
    public NamespaceStatusDetails() {
    }

    /**
     * Initialization constructor.
     * @param  timestamp  LocalDateTime value for timestamp.
     * @param  name  String value for name.
     * @param  pods  List of PodStatusDetails value for pods.
     */
    public NamespaceStatusDetails(
            LocalDateTime timestamp,
            String name,
            List<PodStatusDetails> pods) {
        this.timestamp = timestamp;
        this.name = name;
        this.pods = pods;
    }

    /**
     * Getter for Timestamp.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("timestamp")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * Setter for Timestamp.
     * @param timestamp Value for LocalDateTime
     */
    @JsonSetter("timestamp")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Pods.
     * @return Returns the List of PodStatusDetails
     */
    @JsonGetter("pods")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PodStatusDetails> getPods() {
        return pods;
    }

    /**
     * Setter for Pods.
     * @param pods Value for List of PodStatusDetails
     */
    @JsonSetter("pods")
    public void setPods(List<PodStatusDetails> pods) {
        this.pods = pods;
    }

    /**
     * Converts this NamespaceStatusDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "NamespaceStatusDetails [" + "timestamp=" + timestamp + ", name=" + name + ", pods="
                + pods + "]";
    }

    /**
     * Builds a new {@link NamespaceStatusDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link NamespaceStatusDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .timestamp(getTimestamp())
                .name(getName())
                .pods(getPods());
        return builder;
    }

    /**
     * Class to build instances of {@link NamespaceStatusDetails}.
     */
    public static class Builder {
        private LocalDateTime timestamp;
        private String name;
        private List<PodStatusDetails> pods;



        /**
         * Setter for timestamp.
         * @param  timestamp  LocalDateTime value for timestamp.
         * @return Builder
         */
        public Builder timestamp(LocalDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for pods.
         * @param  pods  List of PodStatusDetails value for pods.
         * @return Builder
         */
        public Builder pods(List<PodStatusDetails> pods) {
            this.pods = pods;
            return this;
        }

        /**
         * Builds a new {@link NamespaceStatusDetails} object using the set fields.
         * @return {@link NamespaceStatusDetails}
         */
        public NamespaceStatusDetails build() {
            return new NamespaceStatusDetails(timestamp, name, pods);
        }
    }
}
