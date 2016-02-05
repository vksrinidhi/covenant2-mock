package com.flipkart.covenant.v2.models.response.cause;

/**
 * A cause is an explanation for a value
 *
 * @see com.flipkart.covenant.v2.models.response.cause.AggregateCause
 * @see com.flipkart.covenant.v2.models.response.cause.CategoryNotServiceable
 * @see com.flipkart.covenant.v2.models.response.cause.CodLimitExceeded
 * @see com.flipkart.covenant.v2.models.response.cause.LogisticsHoliday
 * @see com.flipkart.covenant.v2.models.response.cause.PrepaidLimitExceeded
 * @see com.flipkart.covenant.v2.models.response.cause.SellerHoliday
 * @see com.flipkart.covenant.v2.models.response.cause.SizeNotServiceable
 */
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AggregateCause.class, name = "AGGREGATE"),
        @JsonSubTypes.Type(value = CategoryNotServiceable.class, name = "CATEGORY_NOT_SERVICEABLE"),
        @JsonSubTypes.Type(value = CodLimitExceeded.class, name = "COD_LIMIT_EXCEEDED"),
        @JsonSubTypes.Type(value = LogisticsHoliday.class, name = "LOGISTICS_HOLIDAY"),
        @JsonSubTypes.Type(value = PrepaidLimitExceeded.class, name="PREPAID_LIMIT_EXCEEDED"),
        @JsonSubTypes.Type(value = SellerHoliday.class, name = "SELLER_HOLIDAY"),
        @JsonSubTypes.Type(value = SizeNotServiceable.class, name = "SIZE_NOT_SERVICEABLE")
})
public interface Cause {

}
