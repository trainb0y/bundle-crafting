package io.github.trainb0y.bundlecrafting

import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.NamespacedKey
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.ShapelessRecipe
import org.bukkit.plugin.java.JavaPlugin

@Suppress("Unused")
class BundleCrafting: JavaPlugin() {

	override fun onEnable() {
		Bukkit.getServer().addRecipe(
			ShapelessRecipe(
				NamespacedKey(this, "bundle-recipe"),
				ItemStack(Material.BUNDLE)
			).apply {
				listOf(
					Material.LEATHER,
					Material.RABBIT_HIDE,
					Material.RABBIT_HIDE,
					Material.RABBIT_HIDE,
					Material.RABBIT_HIDE
				).forEach { addIngredient(it) }
			}
		)
	}
}
