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
import java.util.UUID;

/**
 * This is a model class for EdgeInstanceConnectionDetails type.
 */
public class EdgeInstanceConnectionDetails {
    private UUID edgeInstanceId;
    private LocalDateTime timestamp;
    private LocalDateTime lastConnectedDate;
    private LocalDateTime lastDisconnectedDate;
    private Integer activeMessageCount;
    private Integer expiredMessageCount;
    private Integer failedMessageCount;

    /**
     * Default constructor.
     */
    public EdgeInstanceConnectionDetails() {
    }

    /**
     * Initialization constructor.
     * @param  edgeInstanceId  UUID value for edgeInstanceId.
     * @param  timestamp  LocalDateTime value for timestamp.
     * @param  lastConnectedDate  LocalDateTime value for lastConnectedDate.
     * @param  lastDisconnectedDate  LocalDateTime value for lastDisconnectedDate.
     * @param  activeMessageCount  Integer value for activeMessageCount.
     * @param  expiredMessageCount  Integer value for expiredMessageCount.
     * @param  failedMessageCount  Integer value for failedMessageCount.
     */
    public EdgeInstanceConnectionDetails(
            UUID edgeInstanceId,
            LocalDateTime timestamp,
            LocalDateTime lastConnectedDate,
            LocalDateTime lastDisconnectedDate,
            Integer activeMessageCount,
            Integer expiredMessageCount,
            Integer failedMessageCount) {
        this.edgeInstanceId = edgeInstanceId;
        this.timestamp = timestamp;
        this.lastConnectedDate = lastConnectedDate;
        this.lastDisconnectedDate = lastDisconnectedDate;
        this.activeMessageCount = activeMessageCount;
        this.expiredMessageCount = expiredMessageCount;
        this.failedMessageCount = failedMessageCount;
    }

    /**
     * Getter for EdgeInstanceId.
     * @return Returns the UUID
     */
    @JsonGetter("edgeInstanceId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getEdgeInstanceId() {
        return edgeInstanceId;
    }

    /**
     * Setter for EdgeInstanceId.
     * @param edgeInstanceId Value for UUID
     */
    @JsonSetter("edgeInstanceId")
    public void setEdgeInstanceId(UUID edgeInstanceId) {
        this.edgeInstanceId = edgeInstanceId;
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
     * Getter for LastConnectedDate.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("lastConnectedDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getLastConnectedDate() {
        return lastConnectedDate;
    }

    /**
     * Setter for LastConnectedDate.
     * @param lastConnectedDate Value for LocalDateTime
     */
    @JsonSetter("lastConnectedDate")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setLastConnectedDate(LocalDateTime lastConnectedDate) {
        this.lastConnectedDate = lastConnectedDate;
    }

    /**
     * Getter for LastDisconnectedDate.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("lastDisconnectedDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getLastDisconnectedDate() {
        return lastDisconnectedDate;
    }

    /**
     * Setter for LastDisconnectedDate.
     * @param lastDisconnectedDate Value for LocalDateTime
     */
    @JsonSetter("lastDisconnectedDate")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setLastDisconnectedDate(LocalDateTime lastDisconnectedDate) {
        this.lastDisconnectedDate = lastDisconnectedDate;
    }

    /**
     * Getter for ActiveMessageCount.
     * @return Returns the Integer
     */
    @JsonGetter("activeMessageCount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getActiveMessageCount() {
        return activeMessageCount;
    }

    /**
     * Setter for ActiveMessageCount.
     * @param activeMessageCount Value for Integer
     */
    @JsonSetter("activeMessageCount")
    public void setActiveMessageCount(Integer activeMessageCount) {
        this.activeMessageCount = activeMessageCount;
    }

    /**
     * Getter for ExpiredMessageCount.
     * @return Returns the Integer
     */
    @JsonGetter("expiredMessageCount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getExpiredMessageCount() {
        return expiredMessageCount;
    }

    /**
     * Setter for ExpiredMessageCount.
     * @param expiredMessageCount Value for Integer
     */
    @JsonSetter("expiredMessageCount")
    public void setExpiredMessageCount(Integer expiredMessageCount) {
        this.expiredMessageCount = expiredMessageCount;
    }

    /**
     * Getter for FailedMessageCount.
     * @return Returns the Integer
     */
    @JsonGetter("failedMessageCount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getFailedMessageCount() {
        return failedMessageCount;
    }

    /**
     * Setter for FailedMessageCount.
     * @param failedMessageCount Value for Integer
     */
    @JsonSetter("failedMessageCount")
    public void setFailedMessageCount(Integer failedMessageCount) {
        this.failedMessageCount = failedMessageCount;
    }

    /**
     * Converts this EdgeInstanceConnectionDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EdgeInstanceConnectionDetails [" + "edgeInstanceId=" + edgeInstanceId
                + ", timestamp=" + timestamp + ", lastConnectedDate=" + lastConnectedDate
                + ", lastDisconnectedDate=" + lastDisconnectedDate + ", activeMessageCount="
                + activeMessageCount + ", expiredMessageCount=" + expiredMessageCount
                + ", failedMessageCount=" + failedMessageCount + "]";
    }

    /**
     * Builds a new {@link EdgeInstanceConnectionDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EdgeInstanceConnectionDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .edgeInstanceId(getEdgeInstanceId())
                .timestamp(getTimestamp())
                .lastConnectedDate(getLastConnectedDate())
                .lastDisconnectedDate(getLastDisconnectedDate())
                .activeMessageCount(getActiveMessageCount())
                .expiredMessageCount(getExpiredMessageCount())
                .failedMessageCount(getFailedMessageCount());
        return builder;
    }

    /**
     * Class to build instances of {@link EdgeInstanceConnectionDetails}.
     */
    public static class Builder {
        private UUID edgeInstanceId;
        private LocalDateTime timestamp;
        private LocalDateTime lastConnectedDate;
        private LocalDateTime lastDisconnectedDate;
        private Integer activeMessageCount;
        private Integer expiredMessageCount;
        private Integer failedMessageCount;



        /**
         * Setter for edgeInstanceId.
         * @param  edgeInstanceId  UUID value for edgeInstanceId.
         * @return Builder
         */
        public Builder edgeInstanceId(UUID edgeInstanceId) {
            this.edgeInstanceId = edgeInstanceId;
            return this;
        }

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
         * Setter for lastConnectedDate.
         * @param  lastConnectedDate  LocalDateTime value for lastConnectedDate.
         * @return Builder
         */
        public Builder lastConnectedDate(LocalDateTime lastConnectedDate) {
            this.lastConnectedDate = lastConnectedDate;
            return this;
        }

        /**
         * Setter for lastDisconnectedDate.
         * @param  lastDisconnectedDate  LocalDateTime value for lastDisconnectedDate.
         * @return Builder
         */
        public Builder lastDisconnectedDate(LocalDateTime lastDisconnectedDate) {
            this.lastDisconnectedDate = lastDisconnectedDate;
            return this;
        }

        /**
         * Setter for activeMessageCount.
         * @param  activeMessageCount  Integer value for activeMessageCount.
         * @return Builder
         */
        public Builder activeMessageCount(Integer activeMessageCount) {
            this.activeMessageCount = activeMessageCount;
            return this;
        }

        /**
         * Setter for expiredMessageCount.
         * @param  expiredMessageCount  Integer value for expiredMessageCount.
         * @return Builder
         */
        public Builder expiredMessageCount(Integer expiredMessageCount) {
            this.expiredMessageCount = expiredMessageCount;
            return this;
        }

        /**
         * Setter for failedMessageCount.
         * @param  failedMessageCount  Integer value for failedMessageCount.
         * @return Builder
         */
        public Builder failedMessageCount(Integer failedMessageCount) {
            this.failedMessageCount = failedMessageCount;
            return this;
        }

        /**
         * Builds a new {@link EdgeInstanceConnectionDetails} object using the set fields.
         * @return {@link EdgeInstanceConnectionDetails}
         */
        public EdgeInstanceConnectionDetails build() {
            return new EdgeInstanceConnectionDetails(edgeInstanceId, timestamp, lastConnectedDate,
                    lastDisconnectedDate, activeMessageCount, expiredMessageCount,
                    failedMessageCount);
        }
    }
}
