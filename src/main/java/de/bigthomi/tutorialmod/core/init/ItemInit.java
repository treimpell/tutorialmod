package de.bigthomi.tutorialmod.core.init;

import de.bigthomi.tutorialmod.Tutorialmod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Tutorialmod.MOD_ID);

    public static final RegistryObject<Item> TEST_INGOT = ITEMS.register("test_ingot",
            ()->new Item(new Item.Properties().group(ItemGroup.REDSTONE)));
}
