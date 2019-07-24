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
import com.github.salesforce.marketingcloud.javasdk.model.CreateEmailDefinitionContent;
import com.github.salesforce.marketingcloud.javasdk.model.CreateEmailDefinitionOptionsRequest;
import com.github.salesforce.marketingcloud.javasdk.model.CreateEmailDefinitionSubscriptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * CreateEmailDefinitionRequest
 */

public class CreateEmailDefinitionRequest {
  @SerializedName("requestId")
  private String requestId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("definitionKey")
  private String definitionKey = null;

  @SerializedName("definitionId")
  private String definitionId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("classification")
  private String classification = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("createdDate")
  private OffsetDateTime createdDate = null;

  @SerializedName("modifiedDate")
  private OffsetDateTime modifiedDate = null;

  @SerializedName("content")
  private CreateEmailDefinitionContent content = null;

  @SerializedName("subscriptions")
  private CreateEmailDefinitionSubscriptions subscriptions = null;

  @SerializedName("options")
  private CreateEmailDefinitionOptionsRequest options = null;

   /**
   * The ID of the request
   * @return requestId
  **/
  @ApiModelProperty(value = "The ID of the request")
  public String getRequestId() {
    return requestId;
  }

  public CreateEmailDefinitionRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the definition. Must be unique.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the definition. Must be unique.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateEmailDefinitionRequest definitionKey(String definitionKey) {
    this.definitionKey = definitionKey;
    return this;
  }

   /**
   * Unique, user-generated key to access the definition object.
   * @return definitionKey
  **/
  @ApiModelProperty(required = true, value = "Unique, user-generated key to access the definition object.")
  public String getDefinitionKey() {
    return definitionKey;
  }

  public void setDefinitionKey(String definitionKey) {
    this.definitionKey = definitionKey;
  }

  public CreateEmailDefinitionRequest definitionId(String definitionId) {
    this.definitionId = definitionId;
    return this;
  }

   /**
   * Definition Id
   * @return definitionId
  **/
  @ApiModelProperty(value = "Definition Id")
  public String getDefinitionId() {
    return definitionId;
  }

  public void setDefinitionId(String definitionId) {
    this.definitionId = definitionId;
  }

  public CreateEmailDefinitionRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * User-provided description of the email definition.
   * @return description
  **/
  @ApiModelProperty(value = "User-provided description of the email definition.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateEmailDefinitionRequest classification(String classification) {
    this.classification = classification;
    return this;
  }

   /**
   * Marketing Cloud external key of a sending classification defined in Email Studio Administration. Only transactional classifications are permitted. Default is default transactional.
   * @return classification
  **/
  @ApiModelProperty(value = "Marketing Cloud external key of a sending classification defined in Email Studio Administration. Only transactional classifications are permitted. Default is default transactional.")
  public String getClassification() {
    return classification;
  }

  public void setClassification(String classification) {
    this.classification = classification;
  }

  public CreateEmailDefinitionRequest status(String status) {
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

   /**
   * The date the object was created.
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date the object was created.")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

   /**
   * The date the object was modified.
   * @return modifiedDate
  **/
  @ApiModelProperty(value = "The date the object was modified.")
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }

  public CreateEmailDefinitionRequest content(CreateEmailDefinitionContent content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(required = true, value = "")
  public CreateEmailDefinitionContent getContent() {
    return content;
  }

  public void setContent(CreateEmailDefinitionContent content) {
    this.content = content;
  }

  public CreateEmailDefinitionRequest subscriptions(CreateEmailDefinitionSubscriptions subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

   /**
   * Get subscriptions
   * @return subscriptions
  **/
  @ApiModelProperty(required = true, value = "")
  public CreateEmailDefinitionSubscriptions getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(CreateEmailDefinitionSubscriptions subscriptions) {
    this.subscriptions = subscriptions;
  }

  public CreateEmailDefinitionRequest options(CreateEmailDefinitionOptionsRequest options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @ApiModelProperty(value = "")
  public CreateEmailDefinitionOptionsRequest getOptions() {
    return options;
  }

  public void setOptions(CreateEmailDefinitionOptionsRequest options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEmailDefinitionRequest createEmailDefinitionRequest = (CreateEmailDefinitionRequest) o;
    return Objects.equals(this.requestId, createEmailDefinitionRequest.requestId) &&
        Objects.equals(this.name, createEmailDefinitionRequest.name) &&
        Objects.equals(this.definitionKey, createEmailDefinitionRequest.definitionKey) &&
        Objects.equals(this.definitionId, createEmailDefinitionRequest.definitionId) &&
        Objects.equals(this.description, createEmailDefinitionRequest.description) &&
        Objects.equals(this.classification, createEmailDefinitionRequest.classification) &&
        Objects.equals(this.status, createEmailDefinitionRequest.status) &&
        Objects.equals(this.createdDate, createEmailDefinitionRequest.createdDate) &&
        Objects.equals(this.modifiedDate, createEmailDefinitionRequest.modifiedDate) &&
        Objects.equals(this.content, createEmailDefinitionRequest.content) &&
        Objects.equals(this.subscriptions, createEmailDefinitionRequest.subscriptions) &&
        Objects.equals(this.options, createEmailDefinitionRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, name, definitionKey, definitionId, description, classification, status, createdDate, modifiedDate, content, subscriptions, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEmailDefinitionRequest {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    definitionKey: ").append(toIndentedString(definitionKey)).append("\n");
    sb.append("    definitionId: ").append(toIndentedString(definitionId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
