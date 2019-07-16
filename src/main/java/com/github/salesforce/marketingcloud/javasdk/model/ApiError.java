/*
 * Marketing Cloud REST API
 * Marketing Cloud's REST API is our newest API. It supports multi-channel use cases, is much more lightweight and easy to use than our SOAP API, and is getting more comprehensive with every release.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: mc_sdk@salesforce.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.salesforce.marketingcloud.javasdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * ApiError
 */

public class ApiError {
  @SerializedName("message")
  private String message = null;

  @SerializedName("errorCode")
  private BigDecimal errorCode = null;

  @SerializedName("documentation")
  private String documentation = null;

  public ApiError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The error message
   * @return message
  **/
  @ApiModelProperty(value = "The error message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ApiError errorCode(BigDecimal errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * The specific error code
   * @return errorCode
  **/
  @ApiModelProperty(value = "The specific error code")
  public BigDecimal getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(BigDecimal errorCode) {
    this.errorCode = errorCode;
  }

  public ApiError documentation(String documentation) {
    this.documentation = documentation;
    return this;
  }

   /**
   * Any specific documentation for the error
   * @return documentation
  **/
  @ApiModelProperty(value = "Any specific documentation for the error")
  public String getDocumentation() {
    return documentation;
  }

  public void setDocumentation(String documentation) {
    this.documentation = documentation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiError apiError = (ApiError) o;
    return Objects.equals(this.message, apiError.message) &&
        Objects.equals(this.errorCode, apiError.errorCode) &&
        Objects.equals(this.documentation, apiError.documentation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, errorCode, documentation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiError {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
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

