
# Edge Instance Health Details

## Structure

`EdgeInstanceHealthDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EdgeInstanceId` | `UUID` | Optional | - | UUID getEdgeInstanceId() | setEdgeInstanceId(UUID edgeInstanceId) |
| `Timestamp` | `LocalDateTime` | Optional | - | LocalDateTime getTimestamp() | setTimestamp(LocalDateTime timestamp) |
| `Systemstatus` | [`List<NamespaceStatusDetails>`](../../doc/models/namespace-status-details.md) | Optional | - | List<NamespaceStatusDetails> getSystemstatus() | setSystemstatus(List<NamespaceStatusDetails> systemstatus) |
| `InstalledCharts` | [`List<NamespaceChartDetails>`](../../doc/models/namespace-chart-details.md) | Optional | - | List<NamespaceChartDetails> getInstalledCharts() | setInstalledCharts(List<NamespaceChartDetails> installedCharts) |

## Example (as JSON)

```json
{
  "edgeInstanceId": null,
  "timestamp": null,
  "systemstatus": null,
  "installedCharts": null
}
```

