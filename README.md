# PojavOptimize
Welcome to PojavOptimize, a modpack that can boost the performance of PojavLauncher...

# ...but wait, why did you make a separate repository for it?
That's because I'll maintain two variants of the modpack.
- The first is now called PojavOptimize: Original, well it's just your familiar modpack that can be accessed [here](https://github.com/PojavLauncherTeam/PojavOptimize).
- The second modpack is under the temporary name "apple", but I already have an official name for it, just wait for the final product to be done.

# Okay, so are both versions maintained in this repository?
Sure.

# Which versions are supported?
- PojavOptimize: Original currently supports Minecraft 1.16.x and 1.17.x.
- PojavOptimize "apple" is under construction, and you will see it come out for Minecraft 1.18.1/1.18.2.

PojavOptimize: Original for Minecraft 1.18.x will be a subset of "apple". That's what you know, for now.

# Which mods are currently/will be added in PojavOptimize?
- For 1.16.5, see [this](https://github.com/PojavLauncherTeam/PojavOptimize)
- For 1.17.1, see [this](https://github.com/PojavLauncherTeam/PojavOptimize/tree/main/1.17.1/mods). (Somehow Doregon ripped the old repo instead of just transferring ownership, sigh.)
- For 1.18.1/1.18.2: 

| Mod | Category | How it works |
| - | - | - |
| Advancement Debug | Fix | Implements an optimized advancement system to increase speed and eliminate potential StackOverflowErrors. |
| Animatica | Decoration | Adds OptiFine's animated textures |
| Architectury | Library | ... |
| Balm | Library | ... |
| Better Biome Blend | Performance | Fixes vanilla biome blending to be faster. Default setting is at an overwhelming level of 29x29, wow. |
| Better FPS: Render Distance | Performance | Implements 3D render distance, further decrease the amount of blocks to render (at 2 chunks: **87%**, from my calculations). This reduction will fade at higher render distances. |
| Better Mount HUD | Fix | When a player is riding a horse, this mod re-adds the hunger bar, and only replace the XP bar with the horse jump bar when pressing jump button. |
| Better Trident Return | Fix | Tridents with Loyalty enchantment will return to the exact same hotbar position as when it was thrown (unless something filled that hotbar position). |
| Fabric Capes | Decoration  | Adds capes from OptiFine and many other mods |
| CEM | Decoration | Adds custom entity models from OptiFine. |
| CIT Resewn | Decoration | Adds CIT from OptiFine. |
| Cloth API | Library | ... |
| Clumps | Performance | Merges XP orbs to reduce lag (especially with mob farms). |
| Colormatic | Decoration | A mod for messing up with texture colors. |
| Complete Config Lib | Library | ... |
| Continuity | Decoration | Adds support for connected textures, like OptiFine. |
| Cull Leaves | Performance | Reduces rendering things behind leaves. |
| Drippy Loading Screen | Decoration | Modifies the loading screen. A preset is available with this modpack. |
| Enhanced Block Entities | Performance, Decoration | Renders block entities as normal blocks, and allows customizing through resource packs. |
| Entity Culling | Performance | Reduces rendering invisible entities. |
| Fabric API | Library | ... |
| Fabric Language Kotlin | Library | ... |
| Fabrishot | Utility | Allows taking a high-resolution screenshot. |
| Fancy Menu | Decoration | Modifies (literally) any menu that's not covered by Drippy Loading Screen. A preset is available with this modpack. |
| Fast Bench | Performance | Caches the crafting recipe, leading to less latency when mass crafting. |
| Fast Furnace | Performance | Same as Fast Bench, but for furnaces. |
| Feature NBT Deadlock Be Gone | Fix | A fandom fix for a bug that can soft lock the game by messing up with NBTs. |
| FerriteCore | Performance | Reduces memory footprint. |
| Isometric Renders | Utility | Allows Indev style world screenshoting. |
| Item Model Fix | Fix | Fixes glitches from item models. |
| Keybinds Galore | Utility | Shows a toast whenever a conflicting keybind is pressed. |
| Konkrete | Library | ... |
| Ksyxis | Performance | Skips/Disables initial chunk loading on joining a singleplayer world. |
| Lambda Better Grass | Decoration | Adds better grass from OptiFine. |
| Lamb Dynamic Lights | Decoration | Adds dynamic lights from OptiFine . |
| Language Reload | Performance, Utility | Allows switching language without reloading ResourceManager. |
| LAN Server Properties | Utility | Adds more options to "Open to LAN" feature. |
| LazyDFU | Performance | Makes DataFixerUpper initialize only when needed, thus reduces memory usage and provides better loading speed. |
| Lithium | Performance | Tweaks the (internal) server by optimizing some logic aspects of the game. |
| Load My Resources | Utility | Loads resource packs. (In this modpack, it serves as a companion for Fancy Menu.)
| Lychee | **Creativity** | ? (currently forgot, sorry) |
| Mod Menu | Utility | Provides a list of installed mods, just like Forge. |
| Mouse Tweaks | Utility | Brings more useful features for the mouse. |
| Nether Portal Fix | Fix | Fixes a bug which makes the XP bar disappear for a bit when switching dimensions. |
| No Null Processors | Fix | Fixes a bug which crashes the game unexpectedly; can be seen more frequently when a chunk pregenerator is working. |
| Not Enough Crashes | Utility | Catches game crashes and provides some crash info, plus the ability to continue playing without reloading the game. |
| Playtime Count | Utility | Healthy mining! Provides a time counter for seeing how long you have played the game. A superior alternative to the boring toast for South Korea players :) |
| Puzzle | Utility | All OptiFine related setting in one! (Acts as a companion with mods that provide OptiFine features.) |
| Shulker Box Tooltips | Utility | Provides an easy look to what's inside a shulker box. |
| Skeleton Fix | Fix | Fixes incorrect head orientation when targeting a player with a different altitude. |
| Smooth Boot | Performance | Multi-threads some aspects of the game. |
| Starlight | Performance | A performant rewrite of the lighting engine. |
| Textile Backup | Utility | Provides easy world backups. |
| Tooltip Fix | Fix | Prevents the tooltip to fall out of the game window. |
| Vistas | Decoration | Allows to create and use panoramas. (For anyone who just wants to have a minimal look and feel.) |
| While We Wait | ? | Simply a piece of music to relax you while the world is loading. (Ironically, Ksyxis will making the relaxation shorter.) |
| WI Zoom | Utility | Zoom from the Wurst hack client. |

...hmm, where is Sodium?

# Downloads
[The original repo](https://github.com/PojavLauncherTeam/PojavOptimize) doesn't have any releases, so I leave it here with my work for 1.17.1 (that has been abandoned, sorry). Just head to the Releases tab below and choose

### For 1.17.1
- The High variant: has Sodium.
- The Low variant: doesn't have Sodium.

### For 1.18.1: 
- The "next" variant: PojavOptimize "apple". (still in alpha state)

### For 1.18.2: (we still need to wait for mods to be stabilized)
