/*
 * VenafiAsAServiceAPIForEdgeManagementServiceOperationsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.www.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for EdgeInstanceDeleteResponse type.
 */
public class EdgeInstanceDeleteResponse {
    private String name;

    /**
     * Default constructor.
     */
    public EdgeInstanceDeleteResponse() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     */
    public EdgeInstanceDeleteResponse(
            String name) {
        this.name = name;
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
     * Converts this EdgeInstanceDeleteResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EdgeInstanceDeleteResponse [" + "name=" + name + "]";
    }

    /**
     * Builds a new {@link EdgeInstanceDeleteResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EdgeInstanceDeleteResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName());
        return builder;
    }

    /**
     * Class to build instances of {@link EdgeInstanceDeleteResponse}.
     */
    public static class Builder {
        private String name;



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
         * Builds a new {@link EdgeInstanceDeleteResponse} object using the set fields.
         * @return {@link EdgeInstanceDeleteResponse}
         */
        public EdgeInstanceDeleteResponse build() {
            return new EdgeInstanceDeleteResponse(name);
        }
    }
}
