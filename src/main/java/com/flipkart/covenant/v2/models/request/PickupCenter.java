package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

/**
 * Specifies a pickup center as location.
 */
@Data
@JsonTypeName("PICKUP_HUB")
public class PickupCenter implements Location {
    @JsonProperty
    private final String pickupCenterId;
}
