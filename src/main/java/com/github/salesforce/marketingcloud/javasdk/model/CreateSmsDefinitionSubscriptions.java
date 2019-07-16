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
 * CreateSmsDefinitionSubscriptions
 */

public class CreateSmsDefinitionSubscriptions {
  @SerializedName("shortCode")
  private String shortCode = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("keyword")
  private String keyword = null;

  @SerializedName("autoAddSubscriber")
  private Boolean autoAddSubscriber = true;

  public CreateSmsDefinitionSubscriptions shortCode(String shortCode) {
    this.shortCode = shortCode;
    return this;
  }

   /**
   * The short code for the mobile transmissions for each message on this definition.
   * @return shortCode
  **/
  @ApiModelProperty(required = true, value = "The short code for the mobile transmissions for each message on this definition.")
  public String getShortCode() {
    return shortCode;
  }

  public void setShortCode(String shortCode) {
    this.shortCode = shortCode;
  }

  public CreateSmsDefinitionSubscriptions countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The country code associated with the shortCode for the mobile transmissions for each message on this definition.
   * @return countryCode
  **/
  @ApiModelProperty(required = true, value = "The country code associated with the shortCode for the mobile transmissions for each message on this definition.")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public CreateSmsDefinitionSubscriptions keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

   /**
   * The keyword used to track messages.
   * @return keyword
  **/
  @ApiModelProperty(value = "The keyword used to track messages.")
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public CreateSmsDefinitionSubscriptions autoAddSubscriber(Boolean autoAddSubscriber) {
    this.autoAddSubscriber = autoAddSubscriber;
    return this;
  }

   /**
   * Permits adding a recipient as subscriber against the shortCode using contactKey. When false, the message is rejected if contactKey does not exist as a subscriber. Default is true.
   * @return autoAddSubscriber
  **/
  @ApiModelProperty(value = "Permits adding a recipient as subscriber against the shortCode using contactKey. When false, the message is rejected if contactKey does not exist as a subscriber. Default is true.")
  public Boolean isAutoAddSubscriber() {
    return autoAddSubscriber;
  }

  public void setAutoAddSubscriber(Boolean autoAddSubscriber) {
    this.autoAddSubscriber = autoAddSubscriber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSmsDefinitionSubscriptions createSmsDefinitionSubscriptions = (CreateSmsDefinitionSubscriptions) o;
    return Objects.equals(this.shortCode, createSmsDefinitionSubscriptions.shortCode) &&
        Objects.equals(this.countryCode, createSmsDefinitionSubscriptions.countryCode) &&
        Objects.equals(this.keyword, createSmsDefinitionSubscriptions.keyword) &&
        Objects.equals(this.autoAddSubscriber, createSmsDefinitionSubscriptions.autoAddSubscriber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shortCode, countryCode, keyword, autoAddSubscriber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSmsDefinitionSubscriptions {\n");
    
    sb.append("    shortCode: ").append(toIndentedString(shortCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    autoAddSubscriber: ").append(toIndentedString(autoAddSubscriber)).append("\n");
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

