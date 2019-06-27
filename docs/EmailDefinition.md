
# EmailDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The ID of the request |  [optional]
**definitionKey** | **String** | Unique, user-generated key to access the definition object. | 
**name** | **String** | Name of the definition. Must be unique. | 
**content** | [**Content**](Content.md) |  | 
**subscriptions** | [**Subscriptions**](Subscriptions.md) |  | 
**status** | **String** | Operational state of the definition: active, inactive, or deleted. A message sent to an active definition is processed and delivered. A message sent to an inactive definition isn’t processed or delivered. Instead, the message is queued for later processing for up to three days. |  [optional]
**description** | **String** | User-provided description of the send definition. |  [optional]
**classification** | **String** | Marketing Cloud external key of a sending classification defined in Email Studio Administration. Only transactional classifications are permitted. Default is default transactional. |  [optional]
**options** | [**Options**](Options.md) |  |  [optional]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the object was created. |  [optional]
**modifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the object was modified. |  [optional]



