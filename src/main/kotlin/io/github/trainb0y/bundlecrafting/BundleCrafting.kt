package io.github.trainb0y.bundlecrafting

import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.NamespacedKey
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.ShapedRecipe
import org.bukkit.inventory.ShapelessRecipe
import org.bukkit.plugin.java.JavaPlugin

@Suppress("Unused")
class BundleCrafting: JavaPlugin() {
	override fun onEnable() {
		Bukkit.getServer().addRecipe(
			ShapedRecipe(
				NamespacedKey(this, "bundle-recipe"),
				ItemStack(Material.BUNDLE)
			).apply{
				shape("srs","r r","rrr")
				setIngredient('s', Material.STRING)
				setIngredient('r', Material.RABBIT_HIDE)
			}
		)
	}
}
