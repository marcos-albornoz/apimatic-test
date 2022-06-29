
# Edge Instance Connection Details

## Structure

`EdgeInstanceConnectionDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EdgeInstanceId` | `UUID` | Optional | - | UUID getEdgeInstanceId() | setEdgeInstanceId(UUID edgeInstanceId) |
| `Timestamp` | `LocalDateTime` | Optional | - | LocalDateTime getTimestamp() | setTimestamp(LocalDateTime timestamp) |
| `LastConnectedDate` | `LocalDateTime` | Optional | - | LocalDateTime getLastConnectedDate() | setLastConnectedDate(LocalDateTime lastConnectedDate) |
| `LastDisconnectedDate` | `LocalDateTime` | Optional | - | LocalDateTime getLastDisconnectedDate() | setLastDisconnectedDate(LocalDateTime lastDisconnectedDate) |
| `ActiveMessageCount` | `Integer` | Optional | - | Integer getActiveMessageCount() | setActiveMessageCount(Integer activeMessageCount) |
| `ExpiredMessageCount` | `Integer` | Optional | - | Integer getExpiredMessageCount() | setExpiredMessageCount(Integer expiredMessageCount) |
| `FailedMessageCount` | `Integer` | Optional | - | Integer getFailedMessageCount() | setFailedMessageCount(Integer failedMessageCount) |

## Example (as JSON)

```json
{
  "edgeInstanceId": null,
  "timestamp": null,
  "lastConnectedDate": null,
  "lastDisconnectedDate": null,
  "activeMessageCount": null,
  "expiredMessageCount": null,
  "failedMessageCount": null
}
```

