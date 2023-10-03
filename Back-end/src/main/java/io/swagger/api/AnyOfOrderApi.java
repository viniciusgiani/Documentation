/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.46).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.InlineResponse2001;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-22T16:35:46.846490845Z[GMT]")
@Validated
public interface AnyOfOrderApi {

    @Operation(summary = "Get Order Details", description = "Get Order Details based on Order ID", security = {
        @SecurityRequirement(name = "ApiKeyAuth"),
@SecurityRequirement(name = "BasicAuth"),
@SecurityRequirement(name = "BearerAuth"),
@SecurityRequirement(name = "oAuth2AuthCode", scopes = {
            "read",
"write",
"admin"        })    }, tags={ "Orders" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Return product details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2001.class))) })
    @RequestMapping(value = "/anyOfOrder",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2001> demoOfAnyOf(@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "orderId", required = true) Integer orderId, @NotNull @Parameter(in = ParameterIn.QUERY, description = "Fetch Type:  * `summary` - Will provide Order Summary  * `details` - Will provide Order Summary & Order Address " ,required=true,schema=@Schema(allowableValues={ "summary", "details" }
)) @Valid @RequestParam(value = "fetchType", required = true) String fetchType);

}

