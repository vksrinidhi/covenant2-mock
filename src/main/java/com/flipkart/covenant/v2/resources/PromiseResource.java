package com.flipkart.covenant.v2.resources;

import com.flipkart.covenant.v2.models.GetPromiseRequest;
import com.flipkart.covenant.v2.models.GetPromiseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * Created by saurabh.agrawal on 27/01/16.
 */
@Api
@Path("promises")
public class PromiseResource {

    @POST
    @ApiOperation(value = "Get Promise Options - B",
            notes = "This API gives promise options for the requested listings, " +
                    "assuming all requested policies can be applied.")
    public GetPromiseResponse getPromise(GetPromiseRequest request) {
        return null;
    }
}
