# CampaignApi

All URIs are relative to *https://www.exacttargetapis.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCampaign**](CampaignApi.md#createCampaign) | **POST** /hub/v1/campaigns | createCampaign
[**deleteCampaignById**](CampaignApi.md#deleteCampaignById) | **DELETE** /hub/v1/campaigns/{id} | deleteCampaign
[**getCampaignById**](CampaignApi.md#getCampaignById) | **GET** /hub/v1/campaigns/{id} | getCampaign


<a name="createCampaign"></a>
# **createCampaign**
> Campaign createCampaign(body)

createCampaign

Creates a campaign.

### Example
```java
// Import classes:
//import com.github.salesforce.marketingcloud.javasdk.ApiException;
//import com.github.salesforce.marketingcloud.javasdk.api.CampaignApi;


CampaignApi apiInstance = new CampaignApi();
Campaign body = new Campaign(); // Campaign | JSON Parameters
try {
    Campaign result = apiInstance.createCampaign(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignApi#createCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Campaign**](Campaign.md)| JSON Parameters | [optional]

### Return type

[**Campaign**](Campaign.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteCampaignById"></a>
# **deleteCampaignById**
> deleteCampaignById(id)

deleteCampaign

Deletes a campaign.

### Example
```java
// Import classes:
//import com.github.salesforce.marketingcloud.javasdk.ApiException;
//import com.github.salesforce.marketingcloud.javasdk.api.CampaignApi;


CampaignApi apiInstance = new CampaignApi();
BigDecimal id = new BigDecimal(); // BigDecimal | The ID of the campaign to delete
try {
    apiInstance.deleteCampaignById(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignApi#deleteCampaignById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **BigDecimal**| The ID of the campaign to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCampaignById"></a>
# **getCampaignById**
> Campaign getCampaignById(id)

getCampaign

Retrieves a campaign.

### Example
```java
// Import classes:
//import com.github.salesforce.marketingcloud.javasdk.ApiException;
//import com.github.salesforce.marketingcloud.javasdk.api.CampaignApi;


CampaignApi apiInstance = new CampaignApi();
BigDecimal id = new BigDecimal(); // BigDecimal | Campaign ID
try {
    Campaign result = apiInstance.getCampaignById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignApi#getCampaignById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **BigDecimal**| Campaign ID |

### Return type

[**Campaign**](Campaign.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

