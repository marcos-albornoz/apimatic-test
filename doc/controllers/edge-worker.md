# Edge Worker

```java
EdgeWorkerController edgeWorkerController = client.getEdgeWorkerController();
```

## Class Name

`EdgeWorkerController`

## Methods

* [Edgeinstances Get by Id 1](../../doc/controllers/edge-worker.md#edgeinstances-get-by-id-1)
* [Edgeworker Delete](../../doc/controllers/edge-worker.md#edgeworker-delete)
* [Edgeworkers Get All](../../doc/controllers/edge-worker.md#edgeworkers-get-all)
* [Edgeworkers Create](../../doc/controllers/edge-worker.md#edgeworkers-create)
* [Edgeworkers Pair](../../doc/controllers/edge-worker.md#edgeworkers-pair)


# Edgeinstances Get by Id 1

Retrieve Edge Worker By Id

```java
CompletableFuture<EdgeWorkerInformation> edgeinstancesGetById1Async(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | EdgeWorker ID |

## Response Type

[`EdgeWorkerInformation`](../../doc/models/edge-worker-information.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

edgeWorkerController.edgeinstancesGetById1Async(id).thenAccept(result -> {
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
| 404 | Edge worker not found | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 412 | Request Conditions Failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Edgeworker Delete

Delete edge worker

```java
CompletableFuture<Void> edgeworkerDeleteAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | EdgeWorker ID |

## Response Type

`void`

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

edgeWorkerController.edgeworkerDeleteAsync(id).thenAccept(result -> {
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
| 404 | Edge worker not found | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 412 | Request Conditions Failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Edgeworkers Get All

Retrieve list of all edge workers for company

```java
CompletableFuture<EdgeWorkersResponse> edgeworkersGetAllAsync(
    final UUID edgeInstanceId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `edgeInstanceId` | `UUID` | Query, Optional | - |

## Response Type

[`EdgeWorkersResponse`](../../doc/models/edge-workers-response.md)

## Example Usage

```java
edgeWorkerController.edgeworkersGetAllAsync(null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Edgeworkers Create

Create edge worker and generate the pairing information

```java
CompletableFuture<EdgeWorkerInformation> edgeworkersCreateAsync(
    final EdgeWorkerRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`EdgeWorkerRequest`](../../doc/models/edge-worker-request.md) | Body, Optional | - |

## Response Type

[`EdgeWorkerInformation`](../../doc/models/edge-worker-information.md)

## Example Usage

```java
edgeWorkerController.edgeworkersCreateAsync(null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request conditions failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 412 | Request conditions failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Edgeworkers Pair

Pair Edge Worker with Edge Instance

```java
CompletableFuture<EdgeWorkerInformation> edgeworkersPairAsync(
    final UUID id,
    final EdgeWorkerRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | EdgeWorker ID |
| `body` | [`EdgeWorkerRequest`](../../doc/models/edge-worker-request.md) | Body, Optional | - |

## Response Type

[`EdgeWorkerInformation`](../../doc/models/edge-worker-information.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

edgeWorkerController.edgeworkersPairAsync(id, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request conditions failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 412 | Request conditions failed | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

