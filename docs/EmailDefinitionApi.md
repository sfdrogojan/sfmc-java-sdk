# EmailDefinitionApi

All URIs are relative to *https://www.exacttargetapis.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEmailDefinition**](EmailDefinitionApi.md#createEmailDefinition) | **POST** /messaging/v1/email/definitions/ | createEmailDefinition
[**deleteEmailDefinitionByDefinitionKey**](EmailDefinitionApi.md#deleteEmailDefinitionByDefinitionKey) | **DELETE** /messaging/v1/email/definitions/{definitionKey} | deleteEmailDefinition
[**getEmailDefinitionByDefinitionKey**](EmailDefinitionApi.md#getEmailDefinitionByDefinitionKey) | **GET** /messaging/v1/email/definitions/{definitionKey} | getEmailDefinition
[**getEmailDefinitions**](EmailDefinitionApi.md#getEmailDefinitions) | **GET** /messaging/v1/email/definitions/ | getEmailDefinitions
[**partiallyUpdateEmailDefinition**](EmailDefinitionApi.md#partiallyUpdateEmailDefinition) | **PATCH** /messaging/v1/email/definitions/{definitionKey} | patchEmailDefinition


<a name="createEmailDefinition"></a>
# **createEmailDefinition**
> EmailDefinition createEmailDefinition(body)

createEmailDefinition

Creates the definition for an email.

### Example
```java
// Import classes:
//import com.github.salesforce.marketingcloud.javasdk.ApiException;
//import com.github.salesforce.marketingcloud.javasdk.api.EmailDefinitionApi;


EmailDefinitionApi apiInstance = new EmailDefinitionApi();
EmailDefinition body = new EmailDefinition(); // EmailDefinition | JSON Parameters
try {
    EmailDefinition result = apiInstance.createEmailDefinition(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailDefinitionApi#createEmailDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EmailDefinition**](EmailDefinition.md)| JSON Parameters | [optional]

### Return type

[**EmailDefinition**](EmailDefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteEmailDefinitionByDefinitionKey"></a>
# **deleteEmailDefinitionByDefinitionKey**
> SuccessfulEmailDefinitionDelete deleteEmailDefinitionByDefinitionKey(definitionKey)

deleteEmailDefinition

Deletes the definition for an email.

### Example
```java
// Import classes:
//import com.github.salesforce.marketingcloud.javasdk.ApiException;
//import com.github.salesforce.marketingcloud.javasdk.api.EmailDefinitionApi;


EmailDefinitionApi apiInstance = new EmailDefinitionApi();
String definitionKey = "definitionKey_example"; // String | Unique identifier of the definition to delete
try {
    SuccessfulEmailDefinitionDelete result = apiInstance.deleteEmailDefinitionByDefinitionKey(definitionKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailDefinitionApi#deleteEmailDefinitionByDefinitionKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **definitionKey** | **String**| Unique identifier of the definition to delete |

### Return type

[**SuccessfulEmailDefinitionDelete**](SuccessfulEmailDefinitionDelete.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getEmailDefinitionByDefinitionKey"></a>
# **getEmailDefinitionByDefinitionKey**
> EmailDefinition getEmailDefinitionByDefinitionKey(definitionKey)

getEmailDefinition

Gets send definition configuration details for a definition key.

### Example
```java
// Import classes:
//import com.github.salesforce.marketingcloud.javasdk.ApiException;
//import com.github.salesforce.marketingcloud.javasdk.api.EmailDefinitionApi;


EmailDefinitionApi apiInstance = new EmailDefinitionApi();
String definitionKey = "definitionKey_example"; // String | Unique identifier of the definition to get
try {
    EmailDefinition result = apiInstance.getEmailDefinitionByDefinitionKey(definitionKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailDefinitionApi#getEmailDefinitionByDefinitionKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **definitionKey** | **String**| Unique identifier of the definition to get |

### Return type

[**EmailDefinition**](EmailDefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getEmailDefinitions"></a>
# **getEmailDefinitions**
> EmailDefinitionsResponse getEmailDefinitions(filter, pageSize, page, orderBy)

getEmailDefinitions

Gets a list of send definitions.

### Example
```java
// Import classes:
//import com.github.salesforce.marketingcloud.javasdk.ApiException;
//import com.github.salesforce.marketingcloud.javasdk.api.EmailDefinitionApi;


EmailDefinitionApi apiInstance = new EmailDefinitionApi();
String filter = "filter_example"; // String | Filter by status type. Accepted values are active, inactive, or deleted. Valid operations are eq and neq.
BigDecimal pageSize = new BigDecimal(); // BigDecimal | Number of definitions, which are array elements, to return per paged response.
BigDecimal page = new BigDecimal(); // BigDecimal | Page number to return.
String orderBy = "orderBy_example"; // String | Sort by a dimension. You can sort by only one dimension. Accepted values are definitionKey, name, createdDate, modifiedDate, and status.
try {
    EmailDefinitionsResponse result = apiInstance.getEmailDefinitions(filter, pageSize, page, orderBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailDefinitionApi#getEmailDefinitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter by status type. Accepted values are active, inactive, or deleted. Valid operations are eq and neq. | [optional]
 **pageSize** | **BigDecimal**| Number of definitions, which are array elements, to return per paged response. | [optional]
 **page** | **BigDecimal**| Page number to return. | [optional]
 **orderBy** | **String**| Sort by a dimension. You can sort by only one dimension. Accepted values are definitionKey, name, createdDate, modifiedDate, and status. | [optional]

### Return type

[**EmailDefinitionsResponse**](EmailDefinitionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="partiallyUpdateEmailDefinition"></a>
# **partiallyUpdateEmailDefinition**
> EmailDefinition partiallyUpdateEmailDefinition(definitionKey, body)

patchEmailDefinition

Updates a specific email definition.

### Example
```java
// Import classes:
//import com.github.salesforce.marketingcloud.javasdk.ApiException;
//import com.github.salesforce.marketingcloud.javasdk.api.EmailDefinitionApi;


EmailDefinitionApi apiInstance = new EmailDefinitionApi();
String definitionKey = "definitionKey_example"; // String | Unique identifier of the definition to update
EmailDefinitionDescription body = new EmailDefinitionDescription(); // EmailDefinitionDescription | JSON Parameters
try {
    EmailDefinition result = apiInstance.partiallyUpdateEmailDefinition(definitionKey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailDefinitionApi#partiallyUpdateEmailDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **definitionKey** | **String**| Unique identifier of the definition to update |
 **body** | [**EmailDefinitionDescription**](EmailDefinitionDescription.md)| JSON Parameters | [optional]

### Return type

[**EmailDefinition**](EmailDefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

