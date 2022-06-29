
# Pairing Code Information

## Structure

`PairingCodeInformation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | - | UUID getId() | setId(UUID id) |
| `CompanyId` | `UUID` | Optional | - | UUID getCompanyId() | setCompanyId(UUID companyId) |
| `ProductEntitlements` | [`List<ProductEntitlementEnum>`](../../doc/models/product-entitlement-enum.md) | Optional | - | List<ProductEntitlementEnum> getProductEntitlements() | setProductEntitlements(List<ProductEntitlementEnum> productEntitlements) |
| `EnvironmentId` | `UUID` | Optional | - | UUID getEnvironmentId() | setEnvironmentId(UUID environmentId) |
| `PairingCode` | `String` | Optional | - | String getPairingCode() | setPairingCode(String pairingCode) |
| `ReuseCount` | `Integer` | Optional | - | Integer getReuseCount() | setReuseCount(Integer reuseCount) |
| `ExpirationDate` | `LocalDateTime` | Optional | - | LocalDateTime getExpirationDate() | setExpirationDate(LocalDateTime expirationDate) |
| `ModificationDate` | `LocalDateTime` | Optional | - | LocalDateTime getModificationDate() | setModificationDate(LocalDateTime modificationDate) |

## Example (as JSON)

```json
{
  "id": null,
  "companyId": null,
  "productEntitlements": null,
  "environmentId": null,
  "pairingCode": null,
  "reuseCount": null,
  "expirationDate": null,
  "modificationDate": null
}
```

