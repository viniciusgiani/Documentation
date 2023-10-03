package io.swagger.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfoneOfOrderBodyProducts
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = Mobile.class, name = "Mobile"),
  @JsonSubTypes.Type(value = Laptop.class, name = "Laptop")
})
public interface OneOfoneOfOrderBodyProducts {

}
