
# Namespace Status Details

## Structure

`NamespaceStatusDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Timestamp` | `LocalDateTime` | Optional | - | LocalDateTime getTimestamp() | setTimestamp(LocalDateTime timestamp) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Pods` | [`List<PodStatusDetails>`](../../doc/models/pod-status-details.md) | Optional | - | List<PodStatusDetails> getPods() | setPods(List<PodStatusDetails> pods) |

## Example (as JSON)

```json
{
  "timestamp": null,
  "name": null,
  "pods": null
}
```

