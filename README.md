# LeeesNC
<a href="https://github.com/blockparole/LeeesNC/releases/latest" alt="Download"><img src="https://img.shields.io/github/downloads/blockparole/LeeesNC/latest/total.svg?label=download%20latest&style=popout-square" /></a>
<a href="https://github.com/blockparole/LeeesNC" alt="Download"><img src="https://img.shields.io/github/languages/code-size/blockparole/LeeesNC.svg?label=repo%20size&style=popout-square" /></a>

A Minecraft Plugin that changes a Players name color on their command.

Usage: `/nc <color modifier + any amount of format modifiers>`  
Example: `/nc ITALIC dark-red STRIKETHROUGH magic underline BOLD`  

|Colors         |Format          |
|---------------|----------------|
|`AQUA`         |`BOLD`          |
|`BLACK`        |`ITALIC`        |
|`BLUE`         |`MAGIC`         |
|`DARK_AQUA`    |`STRIKETHROUGH` |
|`DARK_BLUE`    |`UNDERLINE`     |
|`DARK_GRAY`    |                |
|`DARK_GREEN`   |                |
|`DARK_PURPLE`  |                |
|`DARK_RED`     |                |
|`GOLD`         |                |
|`GRAY`         |                |
|`GREEN`        |                |
|`LIGHT_PURPLE` |                |
|`RED`          |                |
|`WHITE`        |                |
|`YELLOW`       |                |

Player name format is saved in the config file via UUID:
```
command-needs-permission: false
modifier-allowed-bold: true
modifier-allowed-strikethrough: false
modifier-allowed-underline: false
modifier-allowed-italic: true
modifier-allowed-magic: false
9fb22b27-5fda-48ed-8a5a-ad6e1ff30d71: §2§l
```
