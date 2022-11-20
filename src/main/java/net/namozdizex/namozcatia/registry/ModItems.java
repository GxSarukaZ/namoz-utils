package net.namozdizex.namozcatia.registry;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.namozdizex.namozcatia.NamoZcatiaMod;

public class ModItems {
    public static final Item ENDERDRAGON_SPAWN_EGG = new SpawnEggItem(EntityType.ENDER_DRAGON, 171717, 520176, new Item.Properties().tab(CreativeModeTab.TAB_MISC));


    public static void init()
    {
        register("enderdragon_spawn_egg",ENDERDRAGON_SPAWN_EGG);
    }

    private static Item register(String key, Item item)
    {
        return Registry.register(Registry.ITEM, new ResourceLocation(NamoZcatiaMod.MOD_ID, key), item);
    }
}
