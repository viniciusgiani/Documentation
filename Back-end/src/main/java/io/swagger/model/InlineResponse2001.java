package io.swagger.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* InlineResponse2001
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = OrderSummary.class, name = "OrderSummary"),
  @JsonSubTypes.Type(value = OrderAddress.class, name = "OrderAddress")
})
public interface InlineResponse2001 {

}
