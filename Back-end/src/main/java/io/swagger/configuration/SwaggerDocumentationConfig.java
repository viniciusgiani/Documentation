package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-09-22T16:35:46.846490845Z[GMT]")
@Configuration
public class SwaggerDocumentationConfig {

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.OAS_30)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
                    .build()
                .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("EazyShop Products APIs Definition")
            .description("# About Us **EazyShop** is a open market product selling company. Any website can list our products by  using our _APIs_. Shipping & other logistics will be taken care by us. You will get an `Affiliate commision` for selling our products. # Categories suported   - Mobiles     - Apple     - Samsung     - OnePlus   - Laptops   - Televisions   - Headphones ")
            .license("EazyShop License")
            .licenseUrl("https://www.eazyshop.com/licenses/LICENSE-2.0.html")
            .termsOfServiceUrl("https://www.eazyshop.com/support")
            .version("0.0.1")
            .contact(new Contact("","", "support@eazyshop.com"))
            .build();
    }

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
            .info(new Info()
                .title("EazyShop Products APIs Definition")
                .description("# About Us **EazyShop** is a open market product selling company. Any website can list our products by  using our _APIs_. Shipping & other logistics will be taken care by us. You will get an `Affiliate commision` for selling our products. # Categories suported   - Mobiles     - Apple     - Samsung     - OnePlus   - Laptops   - Televisions   - Headphones ")
                .termsOfService("https://www.eazyshop.com/support")
                .version("0.0.1")
                .license(new License()
                    .name("EazyShop License")
                    .url("https://www.eazyshop.com/licenses/LICENSE-2.0.html"))
                .contact(new io.swagger.v3.oas.models.info.Contact()
                    .email("support@eazyshop.com")));
    }

}
