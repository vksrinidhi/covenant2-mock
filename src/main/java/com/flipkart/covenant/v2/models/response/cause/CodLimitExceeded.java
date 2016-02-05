package com.flipkart.covenant.v2.models.response.cause;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A cause describing the COD limit being exceeded.
 *
 * @see com.flipkart.covenant.v2.models.Payment#COD
 */
@JsonTypeName("COD_LIMIT_EXCEEDED")
public class CodLimitExceeded extends AbstractLimitExceeded<Number> {

    public CodLimitExceeded(Number limit) {
        super(limit);
    }
}
