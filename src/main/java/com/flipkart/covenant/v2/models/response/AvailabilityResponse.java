package com.flipkart.covenant.v2.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* Created by saurabh.agrawal on 25/01/16.
*/
@ApiModel
@Data
public class AvailabilityResponse {

    @ApiModelProperty(value = "Whether the requested quantity of the listing is available")
    @JsonProperty
    private DetailedResponse<Boolean> isAvailable;

    @ApiModelProperty("The total inventory count available to promise")
    @JsonProperty
    private int maxQuantity;
}
