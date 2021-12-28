package com.stachegamer1609.createfa.core.init;

import com.stachegamer1609.createfa.CreateFoodAdditions;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateFoodAdditions.MOD_ID);

    //Food
    public static final RegistryObject<Item> HAMBURGER = ITEMS.register("hamburger", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab).food(new FoodProperties.Builder().nutrition(10).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.5f).build())));
    public static final RegistryObject<Item> CHEESEBURGER = ITEMS.register("cheeseburger", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab).food(new FoodProperties.Builder().nutrition(11).saturationMod(0.7f).build())));
    public static final RegistryObject<Item> SCHNITZEL = ITEMS.register("schnitzel", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab).food(new FoodProperties.Builder().nutrition(9).saturationMod(0.7f).build())));
    public static final RegistryObject<Item> CHICKEN_NUGGETS = ITEMS.register("chicken_nuggets", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab).food(new FoodProperties.Builder().nutrition(3).saturationMod(0.7f).build())));
    public static final RegistryObject<Item> MIXED_EGG = ITEMS.register("mixed_egg", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> FRIES = ITEMS.register("fries", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.5f).build())));
    public static final RegistryObject<Item> MEATBALLS = ITEMS.register("meatballs", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.6f).build())));

    //Items
    public static final RegistryObject<Item> SALT = ITEMS.register("salt", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab)));
    public static final RegistryObject<Item> BREAD_CRUMBS = ITEMS.register("bread_crumbs", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab)));
    public static final RegistryObject<Item> GROUND_CHICKEN = ITEMS.register("ground_chicken", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab)));
    public static final RegistryObject<Item> GROUND_BEEF = ITEMS.register("ground_beef", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab)));
    public static final RegistryObject<Item> INCOMPLETE_CHEESEBURGER = ITEMS.register("incomplete_cheeseburger", () -> new Item(new Item.Properties().tab(null)));
    public static final RegistryObject<Item> INCOMPLETE_HAMBURGER = ITEMS.register("incomplete_hamburger", () -> new Item(new Item.Properties().tab(null)));
    public static final RegistryObject<Item> INCOMPLETE_SCHNITZEL = ITEMS.register("incomplete_schnitzel", () -> new Item(new Item.Properties().tab(null)));
    public static final RegistryObject<Item> INCOMPLETE_MEATBALLS = ITEMS.register("incomplete_meatballs", () -> new Item(new Item.Properties().tab(null)));
    public static final RegistryObject<Item> INCOMPLETE_CHICKEN_NUGGETS = ITEMS.register("incomplete_chicken_nuggets", () -> new Item(new Item.Properties().tab(null)));
}
