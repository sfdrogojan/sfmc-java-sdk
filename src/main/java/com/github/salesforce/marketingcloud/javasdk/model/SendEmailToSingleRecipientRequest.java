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
import com.github.salesforce.marketingcloud.javasdk.model.Recipient;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SendEmailToSingleRecipientRequest
 */

public class SendEmailToSingleRecipientRequest {
  @SerializedName("definitionKey")
  private String definitionKey = null;

  @SerializedName("recipient")
  private Recipient recipient = null;

  public SendEmailToSingleRecipientRequest definitionKey(String definitionKey) {
    this.definitionKey = definitionKey;
    return this;
  }

   /**
   * Unique identifier of the definition.
   * @return definitionKey
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the definition.")
  public String getDefinitionKey() {
    return definitionKey;
  }

  public void setDefinitionKey(String definitionKey) {
    this.definitionKey = definitionKey;
  }

  public SendEmailToSingleRecipientRequest recipient(Recipient recipient) {
    this.recipient = recipient;
    return this;
  }

   /**
   * Get recipient
   * @return recipient
  **/
  @ApiModelProperty(required = true, value = "")
  public Recipient getRecipient() {
    return recipient;
  }

  public void setRecipient(Recipient recipient) {
    this.recipient = recipient;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendEmailToSingleRecipientRequest sendEmailToSingleRecipientRequest = (SendEmailToSingleRecipientRequest) o;
    return Objects.equals(this.definitionKey, sendEmailToSingleRecipientRequest.definitionKey) &&
        Objects.equals(this.recipient, sendEmailToSingleRecipientRequest.recipient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definitionKey, recipient);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendEmailToSingleRecipientRequest {\n");
    
    sb.append("    definitionKey: ").append(toIndentedString(definitionKey)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
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
