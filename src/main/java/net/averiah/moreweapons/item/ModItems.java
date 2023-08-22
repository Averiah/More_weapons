package net.averiah.moreweapons.item;

import net.averiah.moreweapons.moreweapons;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.net.Inet4Address;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, moreweapons.MOD_ID);

    public static final RegistryObject<Item> REINFORCEDIRON = ITEMS.register("reinforcediron",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> REINFORCEDIRONSWORD = ITEMS.register("reinforcedironsword",
            () -> new SwordItem(ModItemTier.REINFORCEDIRON,1, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> IRONDAGGER = ITEMS.register("irondagger",
            () -> new SwordItem(Tiers.IRON,1, -1.9f,  new Item.Properties()));

    public static final RegistryObject<Item> WOODENDAGGER = ITEMS.register("woodendagger",
            () -> new SwordItem(Tiers.WOOD,1, -1.9f,  new Item.Properties()));

    public static final RegistryObject<Item> STONEDAGGER = ITEMS.register("stonedagger",
            () -> new SwordItem(Tiers.STONE,1, -1.9f,  new Item.Properties()));

    public static final RegistryObject<Item> GOLDENDAGGER = ITEMS.register("goldendagger",
            () -> new SwordItem(Tiers.GOLD,1, -1.9f,  new Item.Properties()));

    public static final RegistryObject<Item> DIAMONDDAGGER = ITEMS.register("diamonddagger",
            () -> new SwordItem(Tiers.DIAMOND,1, -1.9f,  new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
