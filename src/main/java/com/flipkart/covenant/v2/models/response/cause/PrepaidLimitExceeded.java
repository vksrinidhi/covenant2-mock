package com.flipkart.covenant.v2.models.response.cause;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * When the limit for prepaid is exceeded.
 *
 * @see com.flipkart.covenant.v2.models.Payment#PREPAID
 */
@JsonTypeName("PREPAID_LIMIT_EXCEEDED")
public class PrepaidLimitExceeded extends AbstractLimitExceeded<Number> {

    public PrepaidLimitExceeded(Number limit) {
        super(limit);
    }
}
