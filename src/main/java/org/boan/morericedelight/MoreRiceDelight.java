package org.boan.morericedelight;

import net.minecraft.network.chat.Component;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;

@Mod(MoreRiceDelight.MODID)
public class MoreRiceDelight {
    public static final String MODID = "morericedelight";


    public MoreRiceDelight() {
    }

    @EventBusSubscriber(bus = EventBusSubscriber.Bus.GAME)
    public static class PlayerLoggedInHandler {
        @SubscribeEvent
        public static void onLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
            var player = event.getEntity();
            player.displayClientMessage(Component.literal("Welcome to more rice delight!"), true);
        }
    }
}