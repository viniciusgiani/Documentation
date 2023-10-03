package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Address;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OneOfOrderBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-22T16:35:46.846490845Z[GMT]")


public class OneOfOrderBody   {
  @JsonProperty("products")
  private OneOfoneOfOrderBodyProducts products = null;

  @JsonProperty("address")
  private Address address = null;

  public OneOfOrderBody products(OneOfoneOfOrderBodyProducts products) {
    this.products = products;
    return this;
  }

  /**
   * Get products
   * @return products
   **/
  @Schema(required = true, description = "")
      @NotNull

    public OneOfoneOfOrderBodyProducts getProducts() {
    return products;
  }

  public void setProducts(OneOfoneOfOrderBodyProducts products) {
    this.products = products;
  }

  public OneOfOrderBody address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OneOfOrderBody oneOfOrderBody = (OneOfOrderBody) o;
    return Objects.equals(this.products, oneOfOrderBody.products) &&
        Objects.equals(this.address, oneOfOrderBody.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(products, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OneOfOrderBody {\n");
    
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
