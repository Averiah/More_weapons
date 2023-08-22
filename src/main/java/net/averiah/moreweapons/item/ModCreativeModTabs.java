package net.averiah.moreweapons.item;

import net.averiah.moreweapons.moreweapons;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, moreweapons.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOREWEAPONSTAB = CREATIVE_MODE_TABS.register("moreweapons",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.REINFORCEDIRON.get()))
                    .title(Component.translatable("creativetab.moreweaponstab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.REINFORCEDIRON.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                        pOutput.accept(ModItems.REINFORCEDIRONSWORD.get());
                        pOutput.accept(ModItems.IRONDAGGER.get());
                        pOutput.accept(ModItems.WOODENDAGGER.get());
                        pOutput.accept(ModItems.STONEDAGGER.get());
                        pOutput.accept(ModItems.GOLDENDAGGER.get());
                        pOutput.accept(ModItems.DIAMONDDAGGER.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
