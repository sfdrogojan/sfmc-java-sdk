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
 * SendSmsToMultipleRecipientsSubscriptionsRequest
 */

public class SendSmsToMultipleRecipientsSubscriptionsRequest {
  @SerializedName("resubscribe")
  private Boolean resubscribe = null;

  public SendSmsToMultipleRecipientsSubscriptionsRequest resubscribe(Boolean resubscribe) {
    this.resubscribe = resubscribe;
    return this;
  }

   /**
   * Forces the message send request to subscribe the mobile number back into a short code if a user may have requested STOP. Often used to ensure that critical transactional messages are delivered irrespective of a mobile number subscriber status.
   * @return resubscribe
  **/
  @ApiModelProperty(value = "Forces the message send request to subscribe the mobile number back into a short code if a user may have requested STOP. Often used to ensure that critical transactional messages are delivered irrespective of a mobile number subscriber status.")
  public Boolean isResubscribe() {
    return resubscribe;
  }

  public void setResubscribe(Boolean resubscribe) {
    this.resubscribe = resubscribe;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendSmsToMultipleRecipientsSubscriptionsRequest sendSmsToMultipleRecipientsSubscriptionsRequest = (SendSmsToMultipleRecipientsSubscriptionsRequest) o;
    return Objects.equals(this.resubscribe, sendSmsToMultipleRecipientsSubscriptionsRequest.resubscribe);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resubscribe);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendSmsToMultipleRecipientsSubscriptionsRequest {\n");
    
    sb.append("    resubscribe: ").append(toIndentedString(resubscribe)).append("\n");
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

