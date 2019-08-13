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
import org.threeten.bp.OffsetDateTime;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Campaign
 */

public class Campaign {

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("campaignCode")
  private String campaignCode = null;

  @SerializedName("color")
  private String color = null;

  @SerializedName("favorite")
  private Boolean favorite = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("createdDate")
  private OffsetDateTime createdDate = null;

  @SerializedName("modifiedDate")
  private OffsetDateTime modifiedDate = null;

  public Campaign name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the campaign with a maximum length of 128 characters
   * @return name
  **/
  @NotNull
 @Size(max=128)  @ApiModelProperty(required = true, value = "Name of the campaign with a maximum length of 128 characters")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Campaign description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the campaign with a maximum length of 512 characters
   * @return description
  **/
  @NotNull
 @Size(max=512)  @ApiModelProperty(required = true, value = "Description of the campaign with a maximum length of 512 characters")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Campaign campaignCode(String campaignCode) {
    this.campaignCode = campaignCode;
    return this;
  }

   /**
   * Unique identifier for the campaign with a maximum length of 36 characters
   * @return campaignCode
  **/
  @NotNull
 @Size(max=36)  @ApiModelProperty(required = true, value = "Unique identifier for the campaign with a maximum length of 36 characters")
  public String getCampaignCode() {
    return campaignCode;
  }

  public void setCampaignCode(String campaignCode) {
    this.campaignCode = campaignCode;
  }

  public Campaign color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Hex color value
   * @return color
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "Hex color value")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Campaign favorite(Boolean favorite) {
    this.favorite = favorite;
    return this;
  }

   /**
   * Determines if the campaign will be flagged as a favorite
   * @return favorite
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "Determines if the campaign will be flagged as a favorite")
  public Boolean isFavorite() {
    return favorite;
  }

  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }

   /**
   * The id of the campaign
   * @return id
  **/
  @ApiModelProperty(value = "The id of the campaign")
  public String getId() {
    return id;
  }

   /**
   * The date the object was created.
   * @return createdDate
  **/
  @Valid
  @ApiModelProperty(value = "The date the object was created.")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

   /**
   * The date the object was modified.
   * @return modifiedDate
  **/
  @Valid
  @ApiModelProperty(value = "The date the object was modified.")
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Campaign campaign = (Campaign) o;
    return Objects.equals(this.name, campaign.name) &&
        Objects.equals(this.description, campaign.description) &&
        Objects.equals(this.campaignCode, campaign.campaignCode) &&
        Objects.equals(this.color, campaign.color) &&
        Objects.equals(this.favorite, campaign.favorite) &&
        Objects.equals(this.id, campaign.id) &&
        Objects.equals(this.createdDate, campaign.createdDate) &&
        Objects.equals(this.modifiedDate, campaign.modifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, campaignCode, color, favorite, id, createdDate, modifiedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Campaign {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    campaignCode: ").append(toIndentedString(campaignCode)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
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

