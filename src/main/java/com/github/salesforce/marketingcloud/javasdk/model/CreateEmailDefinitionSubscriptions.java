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
 * CreateEmailDefinitionSubscriptions
 */

public class CreateEmailDefinitionSubscriptions {
  @SerializedName("list")
  private String list = null;

  @SerializedName("dataExtension")
  private String dataExtension = null;

  @SerializedName("autoAddSubscriber")
  private Boolean autoAddSubscriber = true;

  @SerializedName("updateSubscriber")
  private Boolean updateSubscriber = null;

  public CreateEmailDefinitionSubscriptions list(String list) {
    this.list = list;
    return this;
  }

   /**
   * Marketing Cloud external key of the list or all subscribers. Contains the subscriber keys and profile attributes.
   * @return list
  **/
  @ApiModelProperty(required = true, value = "Marketing Cloud external key of the list or all subscribers. Contains the subscriber keys and profile attributes.")
  public String getList() {
    return list;
  }

  public void setList(String list) {
    this.list = list;
  }

  public CreateEmailDefinitionSubscriptions dataExtension(String dataExtension) {
    this.dataExtension = dataExtension;
    return this;
  }

   /**
   * Marketing Cloud external key of the triggered send data extension. Each request inserts as a new row in the data extension.
   * @return dataExtension
  **/
  @ApiModelProperty(value = "Marketing Cloud external key of the triggered send data extension. Each request inserts as a new row in the data extension.")
  public String getDataExtension() {
    return dataExtension;
  }

  public void setDataExtension(String dataExtension) {
    this.dataExtension = dataExtension;
  }

  public CreateEmailDefinitionSubscriptions autoAddSubscriber(Boolean autoAddSubscriber) {
    this.autoAddSubscriber = autoAddSubscriber;
    return this;
  }

   /**
   * Adds the recipient’s email address and contact key as a subscriber key to subscriptions.list. Default is true.
   * @return autoAddSubscriber
  **/
  @ApiModelProperty(value = "Adds the recipient’s email address and contact key as a subscriber key to subscriptions.list. Default is true.")
  public Boolean isAutoAddSubscriber() {
    return autoAddSubscriber;
  }

  public void setAutoAddSubscriber(Boolean autoAddSubscriber) {
    this.autoAddSubscriber = autoAddSubscriber;
  }

  public CreateEmailDefinitionSubscriptions updateSubscriber(Boolean updateSubscriber) {
    this.updateSubscriber = updateSubscriber;
    return this;
  }

   /**
   * Updates the recipient’s contact key as a subscriber key with the provided email address and profile attributes to subscriptions.list. Default is true.
   * @return updateSubscriber
  **/
  @ApiModelProperty(value = "Updates the recipient’s contact key as a subscriber key with the provided email address and profile attributes to subscriptions.list. Default is true.")
  public Boolean isUpdateSubscriber() {
    return updateSubscriber;
  }

  public void setUpdateSubscriber(Boolean updateSubscriber) {
    this.updateSubscriber = updateSubscriber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEmailDefinitionSubscriptions createEmailDefinitionSubscriptions = (CreateEmailDefinitionSubscriptions) o;
    return Objects.equals(this.list, createEmailDefinitionSubscriptions.list) &&
        Objects.equals(this.dataExtension, createEmailDefinitionSubscriptions.dataExtension) &&
        Objects.equals(this.autoAddSubscriber, createEmailDefinitionSubscriptions.autoAddSubscriber) &&
        Objects.equals(this.updateSubscriber, createEmailDefinitionSubscriptions.updateSubscriber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list, dataExtension, autoAddSubscriber, updateSubscriber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEmailDefinitionSubscriptions {\n");
    
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    dataExtension: ").append(toIndentedString(dataExtension)).append("\n");
    sb.append("    autoAddSubscriber: ").append(toIndentedString(autoAddSubscriber)).append("\n");
    sb.append("    updateSubscriber: ").append(toIndentedString(updateSubscriber)).append("\n");
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

