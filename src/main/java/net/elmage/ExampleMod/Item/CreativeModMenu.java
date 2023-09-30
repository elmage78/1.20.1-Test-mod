package net.elmage.ExampleMod.Item;


import net.elmage.ExampleMod.ExampleMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeModMenu {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "examplemod"); // This may not if then substitute for ExampleMod.MOD_ID

    public static final RegistryObject<CreativeModeTab> Items_sale = CREATIVE_MOD_TABS.register("items_sale",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.cereal.get()))
                    .title(Component.translatable("creativetab.items_sale"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.pole.get());
                        pOutput.accept(ModItems.cereal.get());
                        pOutput.accept(Items.DIAMOND);
                    })
                    .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
