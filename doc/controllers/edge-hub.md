# Edge Hub

```java
EdgeHubController edgeHubController = client.getEdgeHubController();
```

## Class Name

`EdgeHubController`

## Methods

* [Pairingcodes Get All](../../doc/controllers/edge-hub.md#pairingcodes-get-all)
* [Pairingcodes Create](../../doc/controllers/edge-hub.md#pairingcodes-create)
* [Edgeinstances Get by Id](../../doc/controllers/edge-hub.md#edgeinstances-get-by-id)
* [Edgeinstances Update](../../doc/controllers/edge-hub.md#edgeinstances-update)
* [Edgeinstances Delete](../../doc/controllers/edge-hub.md#edgeinstances-delete)
* [Edgeinstances Get All](../../doc/controllers/edge-hub.md#edgeinstances-get-all)
* [Edgeencryptionkeys Get All](../../doc/controllers/edge-hub.md#edgeencryptionkeys-get-all)
* [Edgeencryptionkeys Get by Id](../../doc/controllers/edge-hub.md#edgeencryptionkeys-get-by-id)
* [Billofmaterials Get Latest](../../doc/controllers/edge-hub.md#billofmaterials-get-latest)


# Pairingcodes Get All

Retrieve list of all pairing codes used by edge instances for company

```java
CompletableFuture<PairingCodeResponse> pairingcodesGetAllAsync()
```

## Response Type

[`PairingCodeResponse`](../../doc/models/pairing-code-response.md)

## Example Usage

```java
edgeHubController.pairingcodesGetAllAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Pairingcodes Create

Generate new pairing code for edge instance registration

```java
CompletableFuture<PairingCodeInformation> pairingcodesCreateAsync(
    final PairingCodeRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`PairingCodeRequest`](../../doc/models/pairing-code-request.md) | Body, Optional | - |

## Response Type

[`PairingCodeInformation`](../../doc/models/pairing-code-information.md)

## Example Usage

```java
edgeHubController.pairingcodesCreateAsync(null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request Conditions Failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Edgeinstances Get by Id

Retrieve edge instance with 'id' attribute matching specified value; specified value should be uuid not numeric

```java
CompletableFuture<EdgeInstanceInformation> edgeinstancesGetByIdAsync(
    final UUID id,
    final Boolean statusDetails)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | EdgeInstance ID |
| `statusDetails` | `Boolean` | Query, Optional | **Default**: `false` |

## Response Type

[`EdgeInstanceInformation`](../../doc/models/edge-instance-information.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
Boolean statusDetails = false;

edgeHubController.edgeinstancesGetByIdAsync(id, statusDetails).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request Conditions Failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 404 | Edge instance not found | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 412 | Request Conditions Failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Edgeinstances Update

Update edge instance with specified new value

```java
CompletableFuture<EdgeInstanceInformation> edgeinstancesUpdateAsync(
    final UUID id,
    final EdgeInstanceRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | EdgeInstance ID |
| `body` | [`EdgeInstanceRequest`](../../doc/models/edge-instance-request.md) | Body, Optional | - |

## Response Type

[`EdgeInstanceInformation`](../../doc/models/edge-instance-information.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

edgeHubController.edgeinstancesUpdateAsync(id, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request Conditions Failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 404 | Edge Instance Not Found | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 412 | Request Conditions Failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Edgeinstances Delete

Delete edge instance

```java
CompletableFuture<EdgeInstanceDeleteResponse> edgeinstancesDeleteAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | EdgeInstance ID |

## Response Type

[`EdgeInstanceDeleteResponse`](../../doc/models/edge-instance-delete-response.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

edgeHubController.edgeinstancesDeleteAsync(id).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request Conditions Failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 404 | Edge Instance Not Found | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 412 | Request Conditions Failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Edgeinstances Get All

Retrieve list of all edge instances for company

```java
CompletableFuture<EdgeInstanceResponse> edgeinstancesGetAllAsync(
    final UUID environmentId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `environmentId` | `UUID` | Query, Optional | - |

## Response Type

[`EdgeInstanceResponse`](../../doc/models/edge-instance-response.md)

## Example Usage

```java
edgeHubController.edgeinstancesGetAllAsync(null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Edgeencryptionkeys Get All

Retrieve the list of edge encryption keys based on query parameters

```java
CompletableFuture<EncryptionKeysResponse> edgeencryptionkeysGetAllAsync(
    final UUID edgeInstanceId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `edgeInstanceId` | `UUID` | Query, Optional | - |

## Response Type

[`EncryptionKeysResponse`](../../doc/models/encryption-keys-response.md)

## Example Usage

```java
edgeHubController.edgeencryptionkeysGetAllAsync(null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Edgeencryptionkeys Get by Id

Retrieve edge encryption key with 'id' attribute matching specified value; specified value should be string not numeric

```java
CompletableFuture<EncryptionKeyInformation> edgeencryptionkeysGetByIdAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | - |

## Response Type

[`EncryptionKeyInformation`](../../doc/models/encryption-key-information.md)

## Example Usage

```java
String id = "id0";

edgeHubController.edgeencryptionkeysGetByIdAsync(id).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request Conditions Failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 404 | Encryption key not found | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 412 | Request Conditions Failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Billofmaterials Get Latest

Retrieve list of latest bills of materials

```java
CompletableFuture<BillOfMaterialResponse> billofmaterialsGetLatestAsync()
```

## Response Type

[`BillOfMaterialResponse`](../../doc/models/bill-of-material-response.md)

## Example Usage

```java
edgeHubController.billofmaterialsGetLatestAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

