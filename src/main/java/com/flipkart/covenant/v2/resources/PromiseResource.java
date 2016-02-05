package com.flipkart.covenant.v2.resources;

import com.flipkart.covenant.v2.models.request.GetPromiseRequest;
import com.flipkart.covenant.v2.models.response.GetPromiseResponse;
import io.swagger.annotations.*;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * Jersey resource class for all operations on the Promise entity
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

    /**
     * Returns promise options for the listings requested.<p>
     * <b>Note:</b> No resource like inventory or vendor capacity will be reserved by this method.
     *
     * @param   request The request parameters
     * @return  The response containing a list of promise options.
     * @see com.flipkart.covenant.v2.models.request.GetPromiseRequest
     * @see com.flipkart.covenant.v2.models.response.GetPromiseResponse
     */
    @POST
    @ApiOperation(value = "Get Promise Options",
            notes = "This API gives promise options for the requested listings")
    public GetPromiseResponse getPromiseOptions(GetPromiseRequest request) {
        return null;
    }
}
