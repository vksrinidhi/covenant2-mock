package com.flipkart.covenant.v2.models.response.cause;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.flipkart.covenant.v2.models.request.Address;
import lombok.Data;

/**
 * An abstract cause when an attribute is not allowed.
 * @param <T> Type of attribute value
 */
@Data
abstract class AbstractAttributeNotAllowed<T> implements Cause {
    @JsonProperty
    private final T value;
}
