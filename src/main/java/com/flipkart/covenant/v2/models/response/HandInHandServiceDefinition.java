package com.flipkart.covenant.v2.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.flipkart.covenant.v2.models.Payment;
import com.flipkart.covenant.v2.models.Speed;
import lombok.Data;

/**
 * Defines the parameters of hand-in-hand service.
 */
@Data
@JsonTypeName("HAND_IN_HAND")
public class HandInHandServiceDefinition extends ServiceDefinition {
    /**
     * The speed of this service.
     */
    @JsonProperty(required = true)
    private final Speed speed;

    /**
     * The payment type for this service.
     */
    @JsonProperty(required = true)
    private final Payment payment;

}
