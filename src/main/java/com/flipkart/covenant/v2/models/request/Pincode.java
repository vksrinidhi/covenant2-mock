package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

/**
 * Specifies a pincode as location.
 */
@Data
@JsonTypeName("PINCODE")
public class Pincode implements Location {
    @JsonProperty
    private final String pincode;
}
