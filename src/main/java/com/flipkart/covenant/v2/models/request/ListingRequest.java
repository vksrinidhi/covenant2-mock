package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
* Created by saurabh.agrawal on 25/01/16.
*/
@Data
public class ListingRequest {

    @ApiModelProperty(value = "Any client chosen id, unique in the request scope, that " +
            "should be used to corelate the request and response",
            example = "listing-request-1")
    @JsonProperty(required = true)
    private final String id;

    @JsonProperty(required = true)
    @ApiModelProperty(example = "LSTMOBE6KK93JG5WKB27FPDX7")
    private final String listingId;

    @JsonProperty
    @ApiModelProperty(value = "Selling price of the listing",
            example = "10999")
    private Integer price;

    @JsonProperty
    @ApiModelProperty(value = "Number of units of the listing",
            allowableValues = "range[1, infinity]", example = "1")
    private int quantity = 1;

    @JsonProperty
    private AvailabilityRequest availabilityRequest = new AvailabilityRequest();

    @JsonProperty
    @ApiModelProperty("The services for which promise is requested")
    private ServiceRequest serviceRequest = new ForwardServiceRequest();

    @JsonProperty
    @ApiModelProperty(value = "If specified, inventory is only considered from these sources")
    private List<String> sources;

}
