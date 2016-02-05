package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.flipkart.covenant.v2.models.Payment;
import com.flipkart.covenant.v2.models.Speed;

/**
 * A filter for HandInHand service.
 *
 * @see com.flipkart.covenant.v2.models.response.HandInHandServiceDefinition
 * @see com.flipkart.covenant.v2.models.request.HandInHandServiceRequest
 */
@JsonTypeName("HAND_IN_HAND")
public class HandInHandFilter extends ServiceFilter {
    /**
     * A filter on {@code Speed}. <p>
     * If null, no filtering is done on this attribute.
     * <b>Optional</b>
     */
    @JsonProperty
    Speed speed = null;

    /**
     * A filter on {@code Payment}. <p>
     * If null, no filtering is done on this attribute.
     * <b>Optional</b>
     */
    @JsonProperty
    Payment payment = null;

}
