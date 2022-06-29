
# Edge Instance Information

## Structure

`EdgeInstanceInformation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | - | UUID getId() | setId(UUID id) |
| `CompanyId` | `UUID` | Optional | - | UUID getCompanyId() | setCompanyId(UUID companyId) |
| `ProductEntitlements` | [`List<ProductEntitlementEnum>`](../../doc/models/product-entitlement-enum.md) | Optional | - | List<ProductEntitlementEnum> getProductEntitlements() | setProductEntitlements(List<ProductEntitlementEnum> productEntitlements) |
| `EnvironmentId` | `UUID` | Optional | - | UUID getEnvironmentId() | setEnvironmentId(UUID environmentId) |
| `PairingCodeId` | `UUID` | Optional | - | UUID getPairingCodeId() | setPairingCodeId(UUID pairingCodeId) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `EdgeType` | [`EdgeTypeEnum`](../../doc/models/edge-type-enum.md) | Optional | - | EdgeTypeEnum getEdgeType() | setEdgeType(EdgeTypeEnum edgeType) |
| `EdgeStatus` | [`EdgeStatusEnum`](../../doc/models/edge-status-enum.md) | Optional | - | EdgeStatusEnum getEdgeStatus() | setEdgeStatus(EdgeStatusEnum edgeStatus) |
| `ClientId` | `String` | Optional | - | String getClientId() | setClientId(String clientId) |
| `ModificationDate` | `LocalDateTime` | Optional | - | LocalDateTime getModificationDate() | setModificationDate(LocalDateTime modificationDate) |
| `Address` | `String` | Optional | - | String getAddress() | setAddress(String address) |
| `DeploymentDate` | `LocalDateTime` | Optional | - | LocalDateTime getDeploymentDate() | setDeploymentDate(LocalDateTime deploymentDate) |
| `LastSeenOnDate` | `LocalDateTime` | Optional | - | LocalDateTime getLastSeenOnDate() | setLastSeenOnDate(LocalDateTime lastSeenOnDate) |
| `StatusDetails` | [`EdgeInstanceStatusDetailsInformation`](../../doc/models/edge-instance-status-details-information.md) | Optional | - | EdgeInstanceStatusDetailsInformation getStatusDetails() | setStatusDetails(EdgeInstanceStatusDetailsInformation statusDetails) |
| `WorkerStatusDetails` | [`List<EdgeWorkerStatusDetailsInformation>`](../../doc/models/edge-worker-status-details-information.md) | Optional | - | List<EdgeWorkerStatusDetailsInformation> getWorkerStatusDetails() | setWorkerStatusDetails(List<EdgeWorkerStatusDetailsInformation> workerStatusDetails) |
| `ReconciliationFailed` | `Boolean` | Optional | - | Boolean getReconciliationFailed() | setReconciliationFailed(Boolean reconciliationFailed) |
| `EncryptionKeyId` | `String` | Optional | - | String getEncryptionKeyId() | setEncryptionKeyId(String encryptionKeyId) |
| `EncryptionKeyDeploymentDate` | `LocalDateTime` | Optional | - | LocalDateTime getEncryptionKeyDeploymentDate() | setEncryptionKeyDeploymentDate(LocalDateTime encryptionKeyDeploymentDate) |
| `IntegrationServicesCount` | `Long` | Optional | - | Long getIntegrationServicesCount() | setIntegrationServicesCount(Long integrationServicesCount) |

## Example (as JSON)

```json
{
  "id": null,
  "companyId": null,
  "productEntitlements": null,
  "environmentId": null,
  "pairingCodeId": null,
  "name": null,
  "edgeType": null,
  "edgeStatus": null,
  "clientId": null,
  "modificationDate": null,
  "address": null,
  "deploymentDate": null,
  "lastSeenOnDate": null,
  "statusDetails": null,
  "workerStatusDetails": null,
  "reconciliationFailed": null,
  "encryptionKeyId": null,
  "encryptionKeyDeploymentDate": null,
  "integrationServicesCount": null
}
```

