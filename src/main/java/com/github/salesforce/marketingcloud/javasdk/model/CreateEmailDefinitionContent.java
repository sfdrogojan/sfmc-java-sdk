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
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * CreateEmailDefinitionContent
 */

public class CreateEmailDefinitionContent {
  @SerializedName("customerKey")
  private String customerKey = null;

  public CreateEmailDefinitionContent customerKey(String customerKey) {
    this.customerKey = customerKey;
    return this;
  }

   /**
   * Unique identifier of the content asset.
   * @return customerKey
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "Unique identifier of the content asset.")
  public String getCustomerKey() {
    return customerKey;
  }

  public void setCustomerKey(String customerKey) {
    this.customerKey = customerKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEmailDefinitionContent createEmailDefinitionContent = (CreateEmailDefinitionContent) o;
    return Objects.equals(this.customerKey, createEmailDefinitionContent.customerKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEmailDefinitionContent {\n");
    
    sb.append("    customerKey: ").append(toIndentedString(customerKey)).append("\n");
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

