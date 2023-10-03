/**
 * EazyShop Products APIs Definition
 * # About Us **EazyShop** is a open market product selling company. Any website can list our products by  using our _APIs_. Shipping & other logistics will be taken care by us. You will get an `Affiliate commision` for selling our products. # Categories suported   - Mobiles     - Apple     - Samsung     - OnePlus   - Laptops   - Televisions   - Headphones 
 *
 * OpenAPI spec version: 0.0.1
 * Contact: support@eazyshop.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

export interface Product { 
    productId?: number;
    name?: string;
    price?: number;
    categoryName?: string;
    readonly releaseDate?: string;
    /**
     * ***Quantity*** represents `stock` value when this field is being sent by EazyShop.Where as in the scenarios of consumer sending this feild, it represents `number of product items` inside the order. Consumers are expected to handle the scenario of stopping the end user <u>*when the stock value is 0*</u> 
     */
    quantity?: number;
}