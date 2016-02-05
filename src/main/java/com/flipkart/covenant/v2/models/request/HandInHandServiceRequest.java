package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModelProperty;

/**
 * A service where inventory is delivered to a customer, and at the time of
 * delivery, an item is picked up from the customer for reverse.
 */
@JsonTypeName("HAND_IN_HAND")
public class HandInHandServiceRequest extends ServiceRequest {

    /**
     * The source from where inventory was previously dispatched. This is used
     * for determining serviceability to the returns warehouse<p>
     * <b>Optional.</b>
     */
    @JsonProperty
    @ApiModelProperty("The source from where inventory was previously dispatched")
    private String previousSource;

}
