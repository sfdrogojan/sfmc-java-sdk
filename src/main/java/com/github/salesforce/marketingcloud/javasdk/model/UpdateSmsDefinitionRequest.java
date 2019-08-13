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
import com.github.salesforce.marketingcloud.javasdk.model.CreateSmsDefinitionContent;
import com.github.salesforce.marketingcloud.javasdk.model.CreateSmsDefinitionSubscriptions;
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
 * UpdateSmsDefinitionRequest
 */

public class UpdateSmsDefinitionRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("content")
  private CreateSmsDefinitionContent content = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("subscriptions")
  private CreateSmsDefinitionSubscriptions subscriptions = null;

  public UpdateSmsDefinitionRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the definition. Must be unique.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the definition. Must be unique.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateSmsDefinitionRequest content(CreateSmsDefinitionContent content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @Valid
  @ApiModelProperty(value = "")
  public CreateSmsDefinitionContent getContent() {
    return content;
  }

  public void setContent(CreateSmsDefinitionContent content) {
    this.content = content;
  }

  public UpdateSmsDefinitionRequest status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Operational state of the definition: active, inactive, or deleted. A message sent to an active definition is processed and delivered. A message sent to an inactive definition isn’t processed or delivered. Instead, the message is queued for later processing for up to three days.
   * @return status
  **/
  @ApiModelProperty(value = "Operational state of the definition: active, inactive, or deleted. A message sent to an active definition is processed and delivered. A message sent to an inactive definition isn’t processed or delivered. Instead, the message is queued for later processing for up to three days.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public UpdateSmsDefinitionRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * User-provided description of the SMS definition.
   * @return description
  **/
  @ApiModelProperty(value = "User-provided description of the SMS definition.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdateSmsDefinitionRequest subscriptions(CreateSmsDefinitionSubscriptions subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

   /**
   * Get subscriptions
   * @return subscriptions
  **/
  @Valid
  @ApiModelProperty(value = "")
  public CreateSmsDefinitionSubscriptions getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(CreateSmsDefinitionSubscriptions subscriptions) {
    this.subscriptions = subscriptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSmsDefinitionRequest updateSmsDefinitionRequest = (UpdateSmsDefinitionRequest) o;
    return Objects.equals(this.name, updateSmsDefinitionRequest.name) &&
        Objects.equals(this.content, updateSmsDefinitionRequest.content) &&
        Objects.equals(this.status, updateSmsDefinitionRequest.status) &&
        Objects.equals(this.description, updateSmsDefinitionRequest.description) &&
        Objects.equals(this.subscriptions, updateSmsDefinitionRequest.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, content, status, description, subscriptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSmsDefinitionRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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

