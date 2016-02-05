package com.flipkart.covenant.v2.models.response.cause;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * When a listing is not serviceable due to it's size.
 */
@JsonTypeName("SIZE_NOT_SERVICEABLE")
public class SizeNotServiceable extends AbstractAttributeNotAllowed<String> {

    public SizeNotServiceable(String value) {
        super(value);
    }
}
