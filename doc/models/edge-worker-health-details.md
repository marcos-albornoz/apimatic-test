
# Edge Worker Health Details

## Structure

`EdgeWorkerHealthDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EdgeWorkerId` | `UUID` | Optional | - | UUID getEdgeWorkerId() | setEdgeWorkerId(UUID edgeWorkerId) |
| `EdgeInstanceId` | `UUID` | Optional | - | UUID getEdgeInstanceId() | setEdgeInstanceId(UUID edgeInstanceId) |
| `Timestamp` | `LocalDateTime` | Optional | - | LocalDateTime getTimestamp() | setTimestamp(LocalDateTime timestamp) |
| `Host` | `String` | Optional | - | String getHost() | setHost(String host) |
| `Port` | `Integer` | Optional | - | Integer getPort() | setPort(Integer port) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `Age` | `Long` | Optional | - | Long getAge() | setAge(Long age) |
| `CpuUsage` | `Integer` | Optional | - | Integer getCpuUsage() | setCpuUsage(Integer cpuUsage) |
| `MemoryUsage` | `Long` | Optional | - | Long getMemoryUsage() | setMemoryUsage(Long memoryUsage) |
| `Services` | [`List<WorkerServiceStatusDetails>`](../../doc/models/worker-service-status-details.md) | Optional | - | List<WorkerServiceStatusDetails> getServices() | setServices(List<WorkerServiceStatusDetails> services) |

## Example (as JSON)

```json
{
  "edgeWorkerId": null,
  "edgeInstanceId": null,
  "timestamp": null,
  "host": null,
  "port": null,
  "status": null,
  "age": null,
  "cpuUsage": null,
  "memoryUsage": null,
  "services": null
}
```

