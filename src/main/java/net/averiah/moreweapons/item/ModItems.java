package net.averiah.moreweapons.item;

import net.averiah.moreweapons.moreweapons;
import net.minecraft.world.item.*;
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

    public static final RegistryObject<Item> REINFORCEDIRONSWORD = ITEMS.register("reinforcedironsword",
            () -> new SwordItem(ModItemTier.REINFORCEDIRON,1, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> REINFORCEDIRONPICKAXE = ITEMS.register("reinforcedironpickaxe",
            () -> new PickaxeItem(ModItemTier.REINFORCEDIRON,-1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> REINFORCEDIRONAXE = ITEMS.register("reinforcedironaxe",
            () -> new AxeItem(ModItemTier.REINFORCEDIRON,4, -3.1f, new Item.Properties()));

    public static final RegistryObject<Item> REINFORCEDIRONSHOVEL = ITEMS.register("reinforcedironshovel",
            () -> new ShovelItem(ModItemTier.REINFORCEDIRON,-0.5f, -3f, new Item.Properties()));

    public static final RegistryObject<Item> REINFORCEDIRONDAGGER = ITEMS.register("reinforcedirondagger",
            () -> new SwordItem(ModItemTier.REINFORCEDIRON,-1, -1.9f, new Item.Properties()));

    public static final RegistryObject<Item> REINFORCEDIRONLONGSWORD = ITEMS.register("reinforcedironlongsword",
            () -> new SwordItem(ModItemTier.REINFORCEDIRON,5, -3.2f, new Item.Properties()));

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

    public static final RegistryObject<Item> IRONLONGSWORD = ITEMS.register("ironlongsword",
            () -> new SwordItem(Tiers.IRON,7, -3.2f,  new Item.Properties()));

    public static final RegistryObject<Item> WOODENLONGSWORD = ITEMS.register("woodenlongsword",
            () -> new SwordItem(Tiers.WOOD,7, -3.2f,  new Item.Properties()));

    public static final RegistryObject<Item> STONELONGSWORD = ITEMS.register("stonelongsword",
            () -> new SwordItem(Tiers.STONE,7, -3.2f,  new Item.Properties()));

    public static final RegistryObject<Item> GOLDENLONGSWORD = ITEMS.register("goldenlongsword",
            () -> new SwordItem(Tiers.GOLD,7, -3.2f,  new Item.Properties()));

    public static final RegistryObject<Item> DIAMONDLONGSWORD = ITEMS.register("diamondlongsword",
            () -> new SwordItem(Tiers.DIAMOND,7, -3.2f,  new Item.Properties()));

    public static final RegistryObject<Item> NETHERITELONGSWORD = ITEMS.register("netheritelongsword",
            () -> new SwordItem(Tiers.NETHERITE,7, -3.2f,  new Item.Properties()));

    public static final RegistryObject<Item> NETHERITEDAGGER = ITEMS.register("netheritedagger",
            () -> new SwordItem(Tiers.NETHERITE,1, -1.9f,  new Item.Properties()));

    public static final RegistryObject<Item> STONESTICK = ITEMS.register("stonestick",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
