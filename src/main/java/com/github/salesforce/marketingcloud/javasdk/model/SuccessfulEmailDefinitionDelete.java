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

/**
 * SuccessfulEmailDefinitionDelete
 */

public class SuccessfulEmailDefinitionDelete {
  @SerializedName("message")
  private String message = null;

  @SerializedName("requestId")
  private String requestId = null;

  @SerializedName("deletedDefinitionKey")
  private String deletedDefinitionKey = null;

  public SuccessfulEmailDefinitionDelete message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The response message
   * @return message
  **/
  @ApiModelProperty(value = "The response message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public SuccessfulEmailDefinitionDelete requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * The ID of the request
   * @return requestId
  **/
  @ApiModelProperty(value = "The ID of the request")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public SuccessfulEmailDefinitionDelete deletedDefinitionKey(String deletedDefinitionKey) {
    this.deletedDefinitionKey = deletedDefinitionKey;
    return this;
  }

   /**
   * The key of the deleted definition
   * @return deletedDefinitionKey
  **/
  @ApiModelProperty(value = "The key of the deleted definition")
  public String getDeletedDefinitionKey() {
    return deletedDefinitionKey;
  }

  public void setDeletedDefinitionKey(String deletedDefinitionKey) {
    this.deletedDefinitionKey = deletedDefinitionKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessfulEmailDefinitionDelete successfulEmailDefinitionDelete = (SuccessfulEmailDefinitionDelete) o;
    return Objects.equals(this.message, successfulEmailDefinitionDelete.message) &&
        Objects.equals(this.requestId, successfulEmailDefinitionDelete.requestId) &&
        Objects.equals(this.deletedDefinitionKey, successfulEmailDefinitionDelete.deletedDefinitionKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, requestId, deletedDefinitionKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessfulEmailDefinitionDelete {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    deletedDefinitionKey: ").append(toIndentedString(deletedDefinitionKey)).append("\n");
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

