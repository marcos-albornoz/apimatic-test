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

/**
 * This is a model class for EncryptionKeysResponse type.
 */
public class EncryptionKeysResponse {
    private List<EncryptionKeyInformation> encryptionKeys;

    /**
     * Default constructor.
     */
    public EncryptionKeysResponse() {
    }

    /**
     * Initialization constructor.
     * @param  encryptionKeys  List of EncryptionKeyInformation value for encryptionKeys.
     */
    public EncryptionKeysResponse(
            List<EncryptionKeyInformation> encryptionKeys) {
        this.encryptionKeys = encryptionKeys;
    }

    /**
     * Getter for EncryptionKeys.
     * @return Returns the List of EncryptionKeyInformation
     */
    @JsonGetter("encryptionKeys")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<EncryptionKeyInformation> getEncryptionKeys() {
        return encryptionKeys;
    }

    /**
     * Setter for EncryptionKeys.
     * @param encryptionKeys Value for List of EncryptionKeyInformation
     */
    @JsonSetter("encryptionKeys")
    public void setEncryptionKeys(List<EncryptionKeyInformation> encryptionKeys) {
        this.encryptionKeys = encryptionKeys;
    }

    /**
     * Converts this EncryptionKeysResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EncryptionKeysResponse [" + "encryptionKeys=" + encryptionKeys + "]";
    }

    /**
     * Builds a new {@link EncryptionKeysResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EncryptionKeysResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .encryptionKeys(getEncryptionKeys());
        return builder;
    }

    /**
     * Class to build instances of {@link EncryptionKeysResponse}.
     */
    public static class Builder {
        private List<EncryptionKeyInformation> encryptionKeys;



        /**
         * Setter for encryptionKeys.
         * @param  encryptionKeys  List of EncryptionKeyInformation value for encryptionKeys.
         * @return Builder
         */
        public Builder encryptionKeys(List<EncryptionKeyInformation> encryptionKeys) {
            this.encryptionKeys = encryptionKeys;
            return this;
        }

        /**
         * Builds a new {@link EncryptionKeysResponse} object using the set fields.
         * @return {@link EncryptionKeysResponse}
         */
        public EncryptionKeysResponse build() {
            return new EncryptionKeysResponse(encryptionKeys);
        }
    }
}
