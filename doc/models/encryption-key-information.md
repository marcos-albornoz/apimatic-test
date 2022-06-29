
# Encryption Key Information

## Structure

`EncryptionKeyInformation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `CompanyId` | `UUID` | Optional | - | UUID getCompanyId() | setCompanyId(UUID companyId) |
| `Key` | `String` | Optional | - | String getKey() | setKey(String key) |
| `KeyAlgorithm` | [`KeyAlgorithmEnum`](../../doc/models/key-algorithm-enum.md) | Optional | - | KeyAlgorithmEnum getKeyAlgorithm() | setKeyAlgorithm(KeyAlgorithmEnum keyAlgorithm) |
| `LastBackupDate` | `LocalDateTime` | Optional | - | LocalDateTime getLastBackupDate() | setLastBackupDate(LocalDateTime lastBackupDate) |

## Example (as JSON)

```json
{
  "id": null,
  "companyId": null,
  "key": null,
  "keyAlgorithm": null,
  "lastBackupDate": null
}
```

