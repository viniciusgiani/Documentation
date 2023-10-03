/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.46).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Product;
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
public interface ProductsApi {

    @Operation(summary = "Return product details", description = "Returns the product details from  EazyShop ", security = {
        @SecurityRequirement(name = "ApiKeyAuth"),
@SecurityRequirement(name = "BasicAuth"),
@SecurityRequirement(name = "BearerAuth"),
@SecurityRequirement(name = "oAuth2AuthCode", scopes = {
            "read",
"write",
"admin"        })    }, tags={ "Products" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Return product details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Product.class))),
        
        @ApiResponse(responseCode = "500", description = "An error occured while processing the request. Please contact support@eazyshop.com ") })
    @RequestMapping(value = "/products/{productId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Product> getProductDetails(@Min(100) @Max(1000) @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema(allowableValues={ "100", "1000" }, minimum="100", maximum="1000"
)) @PathVariable("productId") Integer productId);


    @Operation(summary = "List all products", description = "Returns the list of products supported by EazyShop ", security = {
        @SecurityRequirement(name = "ApiKeyAuth"),
@SecurityRequirement(name = "BasicAuth"),
@SecurityRequirement(name = "BearerAuth"),
@SecurityRequirement(name = "oAuth2AuthCode", scopes = {
            "read",
"write",
"admin"        })    }, tags={ "Products" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A list of products", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Product.class)))),
        
        @ApiResponse(responseCode = "500", description = "An error occured while processing the request. Please contact support@eazyshop.com ") })
    @RequestMapping(value = "/products",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Product>> getProducts(@Min(100) @Max(1000) @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema(allowableValues={ "100", "1000" }, minimum="100", maximum="1000"
)) @Valid @RequestParam(value = "categoryId", required = false) Integer categoryId);

}

