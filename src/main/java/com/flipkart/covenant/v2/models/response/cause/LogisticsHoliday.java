package com.flipkart.covenant.v2.models.response.cause;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.flipkart.covenant.v2.models.response.TimeRange;

/**
 * A logistics partner's holiday.
 */
@JsonTypeName("LOGISTICS_HOLIDAY")
public class LogisticsHoliday extends Holiday {

    protected LogisticsHoliday(TimeRange holidayTime) {
        super(holidayTime);
    }
}
