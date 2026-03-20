package one.sweptthr.scgoldenspear;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.event.player.PlayerAnimationType;
import org.bukkit.inventory.ItemStack;

public class SpearPokeListener implements Listener {
	@EventHandler
	public void onPokeSpear( PlayerAnimationEvent event ) {
		ItemStack mainHand = event.getPlayer().getInventory().getItemInMainHand();
		
		if ( event.getAnimationType() == PlayerAnimationType.ARM_SWING
		&& mainHand.getType() == Material.GOLDEN_SPEAR
		&& mainHand.hasItemMeta()
		&& mainHand.getItemMeta().hasDisplayName()
		&& mainHand.getItemMeta().getDisplayName().equals( "§6SweptCraft Golden Spear" ) ) {
			event.getPlayer().setSaturation( Math.min( event.getPlayer().getSaturation() + 3.0f, 20.0f ) );
			Location pos = event.getPlayer().getLocation();
			event.getPlayer().spawnParticle( Particle.HAPPY_VILLAGER, pos.getX(), pos.getY(), pos.getZ(), 7, 0.1, 0.1, 0.1 );
		}
	}
}
