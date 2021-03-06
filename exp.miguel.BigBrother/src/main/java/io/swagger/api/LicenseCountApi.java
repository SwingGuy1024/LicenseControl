/*
 * NOTE: This class is auto generated by the swagger code generator program (1.0.16).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SuppressWarnings("ALL")
@Api(value = "licenseCount", description = "the licenseCount API")
public interface LicenseCountApi {

    @ApiOperation(value = "Change license count", nickname = "licenseCount", notes = "Change the number of licenses allowed", tags={ "developers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Okay"),
        @ApiResponse(code = 400, message = "Illegal value") })
    @RequestMapping(value = "/licenseCount/{count}",
        method = RequestMethod.POST)
    ResponseEntity<Void> licenseCount(@ApiParam(value = "",required=true) @PathVariable("count") Integer count);

}
