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
import com.github.salesforce.marketingcloud.javasdk.model.GetDefinitionSendStatusForRecipientResponseInfo;
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
 * GetDefinitionSendStatusForRecipientResponse
 */

public class GetDefinitionSendStatusForRecipientResponse {
  @SerializedName("requestId")
  private String requestId = null;

  @SerializedName("eventCategoryType")
  private String eventCategoryType = null;

  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

  @SerializedName("compositeId")
  private String compositeId = null;

  @SerializedName("info")
  private GetDefinitionSendStatusForRecipientResponseInfo info = null;

  public GetDefinitionSendStatusForRecipientResponse requestId(String requestId) {
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

  public GetDefinitionSendStatusForRecipientResponse eventCategoryType(String eventCategoryType) {
    this.eventCategoryType = eventCategoryType;
    return this;
  }

   /**
   * The status of the message
   * @return eventCategoryType
  **/
  @ApiModelProperty(value = "The status of the message")
  public String getEventCategoryType() {
    return eventCategoryType;
  }

  public void setEventCategoryType(String eventCategoryType) {
    this.eventCategoryType = eventCategoryType;
  }

  public GetDefinitionSendStatusForRecipientResponse timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The date the ...
   * @return timestamp
  **/
  @ApiModelProperty(value = "The date the ...")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public GetDefinitionSendStatusForRecipientResponse compositeId(String compositeId) {
    this.compositeId = compositeId;
    return this;
  }

   /**
   * The Id of ...
   * @return compositeId
  **/
  @ApiModelProperty(value = "The Id of ...")
  public String getCompositeId() {
    return compositeId;
  }

  public void setCompositeId(String compositeId) {
    this.compositeId = compositeId;
  }

  public GetDefinitionSendStatusForRecipientResponse info(GetDefinitionSendStatusForRecipientResponseInfo info) {
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @ApiModelProperty(value = "")
  public GetDefinitionSendStatusForRecipientResponseInfo getInfo() {
    return info;
  }

  public void setInfo(GetDefinitionSendStatusForRecipientResponseInfo info) {
    this.info = info;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDefinitionSendStatusForRecipientResponse getDefinitionSendStatusForRecipientResponse = (GetDefinitionSendStatusForRecipientResponse) o;
    return Objects.equals(this.requestId, getDefinitionSendStatusForRecipientResponse.requestId) &&
        Objects.equals(this.eventCategoryType, getDefinitionSendStatusForRecipientResponse.eventCategoryType) &&
        Objects.equals(this.timestamp, getDefinitionSendStatusForRecipientResponse.timestamp) &&
        Objects.equals(this.compositeId, getDefinitionSendStatusForRecipientResponse.compositeId) &&
        Objects.equals(this.info, getDefinitionSendStatusForRecipientResponse.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, eventCategoryType, timestamp, compositeId, info);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDefinitionSendStatusForRecipientResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    eventCategoryType: ").append(toIndentedString(eventCategoryType)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    compositeId: ").append(toIndentedString(compositeId)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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

