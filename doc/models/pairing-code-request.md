
# Pairing Code Request

## Structure

`PairingCodeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EnvironmentId` | `UUID` | Required | - | UUID getEnvironmentId() | setEnvironmentId(UUID environmentId) |
| `ReuseCount` | `Integer` | Optional | - | Integer getReuseCount() | setReuseCount(Integer reuseCount) |
| `ExpirationDate` | `LocalDateTime` | Required | - | LocalDateTime getExpirationDate() | setExpirationDate(LocalDateTime expirationDate) |

## Example (as JSON)

```json
{
  "environmentId": "000013fe-0000-0000-0000-000000000000",
  "reuseCount": null,
  "expirationDate": "2016-03-13T12:52:32.123Z"
}
```

