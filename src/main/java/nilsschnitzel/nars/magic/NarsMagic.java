package nilsschnitzel.nars.magic;

import net.fabricmc.api.ModInitializer;
import nilsschnitzel.nars.magic.blocks.ModBlocks;
import nilsschnitzel.nars.magic.items.ModItems;

// import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
// import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
// import net.minecraft.block.Blocks;
// import net.minecraft.item.Item;
// import net.minecraft.item.ItemGroup;
// import net.minecraft.util.Identifier;
// import net.minecraft.util.registry.Registry;
// import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NarsMagic implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("modid");

    public static final String MOD_ID = "narsmagic";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlock();
    } 
}
