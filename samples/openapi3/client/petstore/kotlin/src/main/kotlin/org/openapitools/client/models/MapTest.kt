/**
* OpenAPI Petstore
* This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
*
* OpenAPI spec version: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import com.squareup.moshi.Json
/**
 * 
 * @param mapMapOfString 
 * @param mapOfEnumString 
 * @param directMap 
 * @param indirectMap 
 */
data class MapTest (
    val mapMapOfString: kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, kotlin.String>>? = null,
    val mapOfEnumString: MapTest.MapOfEnumString? = null,
    val directMap: kotlin.collections.Map<kotlin.String, kotlin.Boolean>? = null,
    val indirectMap: kotlin.collections.Map<kotlin.String, kotlin.Boolean>? = null
) {

    /**
    * 
    * Values: uPPER,lower
    */
    enum class MapOfEnumString(val value: kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;){
    
        @Json(name = "UPPER") uPPER("UPPER"),
    
        @Json(name = "lower") lower("lower");
    
    }

}
