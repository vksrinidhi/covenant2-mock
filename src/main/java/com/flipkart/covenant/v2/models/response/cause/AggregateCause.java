package com.flipkart.covenant.v2.models.response.cause;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Multiple causes abstracted out as a {@code Cause}
 */
@JsonTypeName("AGGREGATE")
public class AggregateCause extends ArrayList<Cause> implements Cause {

}
