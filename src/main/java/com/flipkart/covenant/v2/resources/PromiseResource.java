package com.flipkart.covenant.v2.resources;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flipkart.covenant.v2.models.GetPromiseRequest;
import com.flipkart.covenant.v2.models.GetPromiseResponse;
import com.flipkart.covenant.v2.models.Policy;
import com.flipkart.covenant.v2.models.ShipTogether;
import io.swagger.annotations.*;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * Created by saurabh.agrawal on 27/01/16.
 */
@SwaggerDefinition(
        info = @Info(
                description = "The new Promise Engine APIs",
                title = "The Promise Engine APIs",
                contact = @Contact(
                        name = "Saurabh Agrawal",
                        email = "saurabh.agrawal@flipkart.com"
                ),
                version = "v0.1"),
        consumes = {"application/json"},
        produces = {"application/json"},
        schemes = {SwaggerDefinition.Scheme.HTTP},
        externalDocs = @ExternalDocs(value = "Confluence Doc", url = "https://confluence.fkinternal.com/display/FF/PE+Scope+Definition")
)
@Api("Promises Resource")
@Path("promises")
public class PromiseResource {

    @POST
    @ApiOperation(value = "Get Promise Options",
            notes = "This API gives promise options for the requested listings, " +
                    "assuming all requested policies can be applied.")
    public GetPromiseResponse getPromise(GetPromiseRequest request) {
        return null;
    }
}
