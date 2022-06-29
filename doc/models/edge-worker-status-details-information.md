
# Edge Worker Status Details Information

## Structure

`EdgeWorkerStatusDetailsInformation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EdgeWorkerId` | `UUID` | Optional | - | UUID getEdgeWorkerId() | setEdgeWorkerId(UUID edgeWorkerId) |
| `HealthDetails` | [`List<EdgeWorkerHealthDetails>`](../../doc/models/edge-worker-health-details.md) | Optional | - | List<EdgeWorkerHealthDetails> getHealthDetails() | setHealthDetails(List<EdgeWorkerHealthDetails> healthDetails) |

## Example (as JSON)

```json
{
  "edgeWorkerId": null,
  "healthDetails": null
}
```

