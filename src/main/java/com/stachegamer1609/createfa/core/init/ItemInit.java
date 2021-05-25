package com.stachegamer1609.createfa.core.init;

import com.stachegamer1609.createfa.CreateFoodAdditions;
import com.stachegamer1609.createfa.core.objects.items.CheeseburgerItem;
import com.stachegamer1609.createfa.core.objects.items.SchnitzelItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;

public class ItemInit {
    //Food
    public static final RegistryObject<Item> HAMBURGER = Registration.ITEMS.register("hamburger", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab).food(new Food.Builder().effect(() -> new EffectInstance(Effects.SATURATION, 200 , 1), 0.025f).nutrition(14).saturationMod(1.1f).build())));
    public static final RegistryObject<Item> CHEESE = Registration.ITEMS.register("cheese", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab).food(new Food.Builder().nutrition(1).saturationMod(0.5f).build())));
    public static final RegistryObject<CheeseburgerItem> CHEESEBURGER = Registration.ITEMS.register("cheeseburger", () -> new CheeseburgerItem(new CheeseburgerItem.Properties().tab(CreateFoodAdditions.createfatab).food(new Food.Builder().effect(() -> new EffectInstance(Effects.SATURATION, 200 , 1), 0.05f).nutrition(15).saturationMod(1.1f).build())));
    public static final RegistryObject<SchnitzelItem> SCHNITZEL = Registration.ITEMS.register("schnitzel", () -> new SchnitzelItem(new CheeseburgerItem.Properties().tab(CreateFoodAdditions.createfatab).food(new Food.Builder().effect(() -> new EffectInstance(Effects.SATURATION, 160 , 1), 0.05f).nutrition(12).saturationMod(1.1f).build())));


    //Items
    public static final RegistryObject<Item> SALT = Registration.ITEMS.register("salt", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab)));
    public static final RegistryObject<Item> BREAD_CRUMS = Registration.ITEMS.register("bread_crums", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab)));

    static void register() {
    }
}
