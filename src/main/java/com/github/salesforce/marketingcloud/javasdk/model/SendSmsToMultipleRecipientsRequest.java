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
import com.github.salesforce.marketingcloud.javasdk.model.Attributes;
import com.github.salesforce.marketingcloud.javasdk.model.Recipient;
import com.github.salesforce.marketingcloud.javasdk.model.SendSmsContentRequest;
import com.github.salesforce.marketingcloud.javasdk.model.SendSmsToMultipleRecipientsSubscriptionsRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SendSmsToMultipleRecipientsRequest
 */

public class SendSmsToMultipleRecipientsRequest {
  @SerializedName("definitionKey")
  private String definitionKey = null;

  @SerializedName("recipients")
  private List<Recipient> recipients = new ArrayList<Recipient>();

  @SerializedName("subscriptions")
  private SendSmsToMultipleRecipientsSubscriptionsRequest subscriptions = null;

  @SerializedName("content")
  private SendSmsContentRequest content = null;

  @SerializedName("attributes")
  private Attributes attributes = null;

  public SendSmsToMultipleRecipientsRequest definitionKey(String definitionKey) {
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

  public SendSmsToMultipleRecipientsRequest recipients(List<Recipient> recipients) {
    this.recipients = recipients;
    return this;
  }

  public SendSmsToMultipleRecipientsRequest addRecipientsItem(Recipient recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Array of recipient objects that contain parameters and metadata for the recipients, such as send tracking and personalization attributes. Use this parameter to send to multiple recipients in one request. Use either the recipient or recipients parameter, but not both.
   * @return recipients
  **/
  @ApiModelProperty(required = true, value = "Array of recipient objects that contain parameters and metadata for the recipients, such as send tracking and personalization attributes. Use this parameter to send to multiple recipients in one request. Use either the recipient or recipients parameter, but not both.")
  public List<Recipient> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<Recipient> recipients) {
    this.recipients = recipients;
  }

  public SendSmsToMultipleRecipientsRequest subscriptions(SendSmsToMultipleRecipientsSubscriptionsRequest subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

   /**
   * Get subscriptions
   * @return subscriptions
  **/
  @ApiModelProperty(value = "")
  public SendSmsToMultipleRecipientsSubscriptionsRequest getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(SendSmsToMultipleRecipientsSubscriptionsRequest subscriptions) {
    this.subscriptions = subscriptions;
  }

  public SendSmsToMultipleRecipientsRequest content(SendSmsContentRequest content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public SendSmsContentRequest getContent() {
    return content;
  }

  public void setContent(SendSmsContentRequest content) {
    this.content = content;
  }

  public SendSmsToMultipleRecipientsRequest attributes(Attributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public Attributes getAttributes() {
    return attributes;
  }

  public void setAttributes(Attributes attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendSmsToMultipleRecipientsRequest sendSmsToMultipleRecipientsRequest = (SendSmsToMultipleRecipientsRequest) o;
    return Objects.equals(this.definitionKey, sendSmsToMultipleRecipientsRequest.definitionKey) &&
        Objects.equals(this.recipients, sendSmsToMultipleRecipientsRequest.recipients) &&
        Objects.equals(this.subscriptions, sendSmsToMultipleRecipientsRequest.subscriptions) &&
        Objects.equals(this.content, sendSmsToMultipleRecipientsRequest.content) &&
        Objects.equals(this.attributes, sendSmsToMultipleRecipientsRequest.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definitionKey, recipients, subscriptions, content, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendSmsToMultipleRecipientsRequest {\n");
    
    sb.append("    definitionKey: ").append(toIndentedString(definitionKey)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

