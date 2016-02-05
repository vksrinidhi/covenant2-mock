package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.flipkart.covenant.v2.models.Payment;
import com.flipkart.covenant.v2.models.Speed;
import lombok.Data;

/**
 * A filter for Forward service.
 *
 * @see com.flipkart.covenant.v2.models.request.ForwardServiceRequest
 * @see com.flipkart.covenant.v2.models.response.ForwardServiceDefinition
 */
@JsonTypeName("FORWARD")
@Data
public class ForwardFilter extends ServiceFilter {
    /**
     * A filter on {@code Speed}. <p>
     * If null, no filtering is done on this attribute.
     * <b>Optional</b>
     */
    @JsonProperty
    public Speed speed = null;

    /**
     * A filter on {@code Payment}. <p>
     * If null, no filtering is done on this attribute.
     * <b>Optional</b>
     */
    @JsonProperty
    public Payment payment = null;
}
