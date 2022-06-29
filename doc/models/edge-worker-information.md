
# Edge Worker Information

## Structure

`EdgeWorkerInformation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | - | UUID getId() | setId(UUID id) |
| `CompanyId` | `UUID` | Optional | - | UUID getCompanyId() | setCompanyId(UUID companyId) |
| `Host` | `String` | Optional | - | String getHost() | setHost(String host) |
| `Port` | `Integer` | Optional | - | Integer getPort() | setPort(Integer port) |
| `PairingCode` | `String` | Optional | - | String getPairingCode() | setPairingCode(String pairingCode) |
| `PairingPublicKey` | `String` | Optional | - | String getPairingPublicKey() | setPairingPublicKey(String pairingPublicKey) |
| `EdgeInstanceId` | `UUID` | Optional | - | UUID getEdgeInstanceId() | setEdgeInstanceId(UUID edgeInstanceId) |
| `EnvironmentId` | `UUID` | Optional | - | UUID getEnvironmentId() | setEnvironmentId(UUID environmentId) |
| `Status` | [`StatusEnum`](../../doc/models/status-enum.md) | Optional | - | StatusEnum getStatus() | setStatus(StatusEnum status) |
| `LastSeenOnDate` | `LocalDateTime` | Optional | - | LocalDateTime getLastSeenOnDate() | setLastSeenOnDate(LocalDateTime lastSeenOnDate) |

## Example (as JSON)

```json
{
  "id": null,
  "companyId": null,
  "host": null,
  "port": null,
  "pairingCode": null,
  "pairingPublicKey": null,
  "edgeInstanceId": null,
  "environmentId": null,
  "status": null,
  "lastSeenOnDate": null
}
```

