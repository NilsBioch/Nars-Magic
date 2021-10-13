package nilsschnitzel.nars.magic.blocks;

import nilsschnitzel.nars.magic.NarsMagic;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block LIVING_GOLD_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5.0F, 500F).sounds(BlockSoundGroup.METAL));
    public static final Block DEAD_GOLD_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5.0F, 500F).sounds(BlockSoundGroup.STONE));

    public static final Block CRUDE_FORGE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5.0F, 500F).sounds(BlockSoundGroup.STONE));

    public static final void registerBlock() {
        Registry.register(Registry.BLOCK, new Identifier(NarsMagic.MOD_ID, "living_gold_block"), LIVING_GOLD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(NarsMagic.MOD_ID, "dead_gold_ore"), DEAD_GOLD_ORE);

        Registry.register(Registry.BLOCK, new Identifier(NarsMagic.MOD_ID, "crude_forge"), CRUDE_FORGE);
    }
}
