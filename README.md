## Hide Item Names
This mod simply hides the little text above the hotbar when you hold an item 

 ![pixil-frame-0 (24)](https://github.com/user-attachments/assets/1000da59-b1a0-46bb-a3e2-c3fe9a525880)

### How it works
Annoyingly, the rendering of the text is not controlled by [RenderGameOverlayEvent](https://github.com/MinecraftForge/MinecraftForge/blob/1.12.x/src/main/java/net/minecraftforge/client/event/RenderGameOverlayEvent.java), and is instead controlled by a GameSetting called heldItemTooltips that cannot be changed during normal gameplay. Why? I don't know, Minecraft Spaghetti code.  
