package com.flipkart.covenant.v2.models.response.cause;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * When a category is not serviceable.
 */
@JsonTypeName("CATEGORY_NOT_SERVICEABLE")
public class CategoryNotServiceable extends AbstractAttributeNotAllowed<String> {
    public CategoryNotServiceable(String value) {
        super(value);
    }
}
