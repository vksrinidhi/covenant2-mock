package com.flipkart.covenant.v2.models.response.cause;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.flipkart.covenant.v2.models.response.TimeRange;
import lombok.Data;

/**
 * A seller's holiday.
 */
@JsonTypeName("SELLER_HOLIDAY")
@Data
public class SellerHoliday extends Holiday {

    @JsonProperty
    private final String sellerId;

    public SellerHoliday(String sellerId, TimeRange holidayTime) {
        super(holidayTime);
        this.sellerId = sellerId;
    }
}
