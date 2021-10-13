package nilsschnitzel.nars.magic.items;

import nilsschnitzel.nars.magic.NarsMagic;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class ModItemGroup {
    
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build
    (new Identifier(NarsMagic.MOD_ID, "general"),
    () -> new ItemStack(ModItems.SOUL_GEM));
}
