package com.flipkart.covenant.v2.models.response.cause;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * An abstract cause when a limit is exceeded.
 *
 * @param <T> Type of limit that has exceeded.
 */
@Data
abstract class AbstractLimitExceeded<T> implements Cause {

    /**
     * The threshold/limit for this cause.
     */
    @JsonProperty
    private final T limit;

}
