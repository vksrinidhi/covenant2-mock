package com.flipkart.covenant.v2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Range;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
* Created by saurabh.agrawal on 25/01/16.
*/
class ServiceabilityResponse {

    @JsonProperty(required = true)
    ServiceOption service;

    @JsonProperty
    Range<Date> promiseTime;

    @JsonProperty
    int price;
}
