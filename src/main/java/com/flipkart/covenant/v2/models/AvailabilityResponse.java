package com.flipkart.covenant.v2.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

/**
* Created by saurabh.agrawal on 25/01/16.
*/
@ApiModel
class AvailabilityResponse {
    @JsonProperty
    boolean value;

//            int maxQuantity;
}
