
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `defaultHost` | `String` | *Default*: `"www.example.com"` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | `ReadonlyHttpClientConfiguration` | Http Client Configuration instance. |
| `tpplApiKey` | `String` |  |

The API client can be initialized as follows:

```java
VenafiAsAServiceAPIForEdgeManagementServiceOperationsClient client = new VenafiAsAServiceAPIForEdgeManagementServiceOperationsClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .customHeaderAuthenticationCredentials("tppl-api-key")
    .environment(Environment.PRODUCTION)
    .defaultHost("www.example.com")
    .build();
```

## Venafi as a Service API for Edge Management Service OperationsClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getEdgeHubController()` | Provides access to EdgeHub controller. | `EdgeHubController` |
| `getEdgeWorkerController()` | Provides access to EdgeWorker controller. | `EdgeWorkerController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getDefaultHost()` | defaultHost value. | `String` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | `ReadonlyHttpClientConfiguration` |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

