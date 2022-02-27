package io.github.stachesebastian.createfa.core.objects.items;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SpicyyyyItem extends Item {
    public SpicyyyyItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

        if(Screen.hasControlDown() && Screen.hasAltDown() && Screen.hasShiftDown()) {
            components.add(new TextComponent("\u00A74W\u00A7ch\u00A76y \u00A7ei\u00A72s \u00A7ai\u00A7bt \u00A73s\u00A73p\u00A71i\u00A79c\u00A7dy\u00A75?\u00A77!"));
        }
        super.appendHoverText(itemStack, level, components, flag);
    }
}