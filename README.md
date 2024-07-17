# BlockPrivacy

BlockPrivacy is a mod that allows for protecting your blocks, such as chests and doors, from unwanted visitors. The core idea is simple block protection with a familiar interface, but simultaneously allowing for advanced features.

Features (checkmark indicates completion):

- [ ] Identifies chests and doors by block type.
- [ ] Supports vanilla and modded doors and chests, or blocks which behave like them.
- [ ] Double doors open together.
- [ ] Protection Managers - Define other players which can add and remove people from the protection on your behalf.
- [ ] Protection Groups - Manage a large number of protections with a single command.
  - The Protection Group Owner is the only person (besides moderators with the appropriate permission) who can delete the protection group and add protection group managers.
  - Protection Group Managers can add and remove people from the group on behalf of the owner.
  - Protection Group Members can access any block that the group is added to.
  - Blocks can support multiple groups.

Development releases will be published with each merge to the main branch and are available for download from the releases section. These development releases are prone to have errors and are not officially supported.

## Supported Versions

| Modloader | Version |  Supported   |
|-----------|---------|--------------|
| Fabric    |  1.20.1 | Yes          |
| Quilt     |  1.20.1 | Unsupported* |
| Forge     |  1.20.1 | Yes          |
| NeoForge  |         | No**         |

* *Quilt should be supported via QuiltedFabricAPI, but it's not officially supported at this time. If anyone wants to change this, please ask!
* **NeoForge doesn't support any version lower than 1.20.4. NeoForge support is planned once a release target other than 1.20.1 is created.
