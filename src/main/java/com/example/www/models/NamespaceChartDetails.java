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
 * This is a model class for NamespaceChartDetails type.
 */
public class NamespaceChartDetails {
    private String name;
    private List<ChartDetails> charts;

    /**
     * Default constructor.
     */
    public NamespaceChartDetails() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  charts  List of ChartDetails value for charts.
     */
    public NamespaceChartDetails(
            String name,
            List<ChartDetails> charts) {
        this.name = name;
        this.charts = charts;
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
     * Getter for Charts.
     * @return Returns the List of ChartDetails
     */
    @JsonGetter("charts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ChartDetails> getCharts() {
        return charts;
    }

    /**
     * Setter for Charts.
     * @param charts Value for List of ChartDetails
     */
    @JsonSetter("charts")
    public void setCharts(List<ChartDetails> charts) {
        this.charts = charts;
    }

    /**
     * Converts this NamespaceChartDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "NamespaceChartDetails [" + "name=" + name + ", charts=" + charts + "]";
    }

    /**
     * Builds a new {@link NamespaceChartDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link NamespaceChartDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .charts(getCharts());
        return builder;
    }

    /**
     * Class to build instances of {@link NamespaceChartDetails}.
     */
    public static class Builder {
        private String name;
        private List<ChartDetails> charts;



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
         * Setter for charts.
         * @param  charts  List of ChartDetails value for charts.
         * @return Builder
         */
        public Builder charts(List<ChartDetails> charts) {
            this.charts = charts;
            return this;
        }

        /**
         * Builds a new {@link NamespaceChartDetails} object using the set fields.
         * @return {@link NamespaceChartDetails}
         */
        public NamespaceChartDetails build() {
            return new NamespaceChartDetails(name, charts);
        }
    }
}
