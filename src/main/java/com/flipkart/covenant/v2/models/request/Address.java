package com.flipkart.covenant.v2.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

/**
 * This specifies the address of the customer.
 */
@Data
@JsonTypeName("ADDRESS")
public class Address implements Location {
    @JsonProperty
    private final String addressId;
}
