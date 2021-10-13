package nilsschnitzel.nars.magic.items;

import nilsschnitzel.nars.magic.NarsMagic;
import nilsschnitzel.nars.magic.blocks.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class ModItems {

    public static final Item GOLD_RING = new Item(new FabricItemSettings().group(ModItemGroup.ITEM_GROUP).maxCount(1));
    public static final Item LIVING_GOLD_INGOT = new Item(new FabricItemSettings().group(ModItemGroup.ITEM_GROUP));
    public static final Item CRUDE_IRON = new Item(new FabricItemSettings().group(ModItemGroup.ITEM_GROUP));
    public static final Item SOUL_GEM = new Item(new FabricItemSettings().group(ModItemGroup.ITEM_GROUP));

    public static final BlockItem LIVING_GOLD_BLOCK = new BlockItem(ModBlocks.LIVING_GOLD_BLOCK, new Item.Settings().group(ModItemGroup.ITEM_GROUP));
    public static final BlockItem DEAD_GOLD_ORE = new BlockItem(ModBlocks.DEAD_GOLD_ORE, new Item.Settings().group(ModItemGroup.ITEM_GROUP));
    public static final BlockItem CRUDE_FORGE = new BlockItem(ModBlocks.CRUDE_FORGE, new Item.Settings().group(ModItemGroup.ITEM_GROUP));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(NarsMagic.MOD_ID, "gold_ring"), GOLD_RING);
        Registry.register(Registry.ITEM, new Identifier(NarsMagic.MOD_ID, "living_gold_ingot"), LIVING_GOLD_INGOT);
        Registry.register(Registry.ITEM, new Identifier(NarsMagic.MOD_ID, "crude_iron"), CRUDE_IRON);
        Registry.register(Registry.ITEM, new Identifier(NarsMagic.MOD_ID, "soul_gem"), SOUL_GEM);
        Registry.register(Registry.ITEM, new Identifier(NarsMagic.MOD_ID, "living_gold_block"), LIVING_GOLD_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(NarsMagic.MOD_ID, "dead_gold_ore"), DEAD_GOLD_ORE);
        Registry.register(Registry.ITEM, new Identifier(NarsMagic.MOD_ID, "crude_forge"), CRUDE_FORGE);
    }
}