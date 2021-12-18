package com.stachegamer1609.createfa.core.init;

import com.stachegamer1609.createfa.CreateFoodAdditions;
import com.stachegamer1609.createfa.core.objects.items.CheeseburgerItem;
import com.stachegamer1609.createfa.core.objects.items.SchnitzelItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ItemInit {
    //Food
    public static final RegistryObject<Item> HAMBURGER = Registration.ITEMS.register("hamburger", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab).food(new Food.Builder().nutrition(10).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> CHEESE = Registration.ITEMS.register("cheese", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab).food(new Food.Builder().nutrition(1).saturationMod(0.5f).build())));
    public static final RegistryObject<CheeseburgerItem> CHEESEBURGER = Registration.ITEMS.register("cheeseburger", () -> new CheeseburgerItem(new CheeseburgerItem.Properties().tab(CreateFoodAdditions.createfatab).food(new Food.Builder().nutrition(11).saturationMod(0.7f).build())));
    public static final RegistryObject<SchnitzelItem> SCHNITZEL = Registration.ITEMS.register("schnitzel", () -> new SchnitzelItem(new SchnitzelItem.Properties().tab(CreateFoodAdditions.createfatab).food(new Food.Builder().nutrition(9).saturationMod(0.7f).build())));
    public static final RegistryObject<Item> CHICKEN_NUGGETS = Registration.ITEMS.register("chicken_nuggets", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab).food(new Food.Builder().nutrition(3).saturationMod(0.7f).build())));
    public static final RegistryObject<Item> MIXED_EGG = Registration.ITEMS.register("mixed_egg", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab).food(new Food.Builder().nutrition(4).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> FRIES = Registration.ITEMS.register("fries", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab).food(new Food.Builder().nutrition(1).saturationMod(0.5f).build())));
    public static final RegistryObject<Item> MEATBALLS = Registration.ITEMS.register("meatballs", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab).food(new Food.Builder().nutrition(4).saturationMod(0.6f).build())));

    //Items
    public static final RegistryObject<Item> SALT = Registration.ITEMS.register("salt", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab)));
    public static final RegistryObject<Item> BREAD_CRUMBS = Registration.ITEMS.register("bread_crumbs", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab)));
    public static final RegistryObject<Item> GROUND_CHICKEN = Registration.ITEMS.register("ground_chicken", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab)));
    public static final RegistryObject<Item> GROUND_BEEF = Registration.ITEMS.register("ground_beef", () -> new Item(new Item.Properties().tab(CreateFoodAdditions.createfatab)));
    public static final RegistryObject<Item> INCOMPLETE_CHEESEBURGER = Registration.ITEMS.register("incomplete_cheeseburger", () -> new Item(new Item.Properties().tab(null)));
    public static final RegistryObject<Item> INCOMPLETE_HAMBURGER = Registration.ITEMS.register("incomplete_hamburger", () -> new Item(new Item.Properties().tab(null)));
    public static final RegistryObject<Item> INCOMPLETE_SCHNITZEL = Registration.ITEMS.register("incomplete_schnitzel", () -> new Item(new Item.Properties().tab(null)));
    public static final RegistryObject<Item> INCOMPLETE_MEATBALLS = Registration.ITEMS.register("incomplete_meatballs", () -> new Item(new Item.Properties().tab(null)));
    public static final RegistryObject<Item> INCOMPLETE_CHICKEN_NUGGETS = Registration.ITEMS.register("incomplete_chicken_nuggets", () -> new Item(new Item.Properties().tab(null)));

    static void register() {

    }
}
