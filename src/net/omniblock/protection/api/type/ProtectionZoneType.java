package net.omniblock.protection.api.type;

import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;

import net.omniblock.network.library.helpers.ItemBuilder;

public enum ProtectionZoneType {

	COAL_PROTECTION(
			"Protecci�n de Carb�n", "CARB�N", 4, 5000, 
			new ItemBuilder(Material.COAL_ORE)
				.amount(1)
				.name("&8&l(&7Protecci�n&8&l) &64&6&lx&64&6&lx&64")
				.lore("")
				.lore("&8- &7Este bloque proteger� el �rea")
				.lore("&7especificada en su nombre. Solo")
				.lore("&7podr� ser utilizado en el mundo")
				.lore("&7PVE.")
				.lore("")
				.build()),
	IRON_PROTECTION(
			"Protecci�n de Hierro", "HIERRO", 8, 10000, 
			new ItemBuilder(Material.IRON_ORE)
				.amount(1)
				.name("&8&l(&7Protecci�n&8&l) &68&6&lx&68&6&lx&68")
				.lore("")
				.lore("&8- &7Este bloque proteger� el �rea")
				.lore("&7especificada en su nombre. Solo")
				.lore("&7podr� ser utilizado en el mundo")
				.lore("&7PVE.")
				.lore("")
				.build()),
	
	GOLD_PROTECTION(
			"Protecci�n de Oro", "ORO", 16, 20000, 
			new ItemBuilder(Material.GOLD_ORE)
				.amount(1)
				.name("&8&l(&7Protecci�n&8&l) &616&6&lx&616&6&lx&616")
				.lore("")
				.lore("&8- &7Este bloque proteger� el �rea")
				.lore("&7especificada en su nombre. Solo")
				.lore("&7podr� ser utilizado en el mundo")
				.lore("&7PVE.")
				.lore("")
				.build()),
	
	DIAMOND_PROTECTION(
			"Protecci�n de Diamante", "DIAMANTE", 32, 40000, 
			new ItemBuilder(Material.DIAMOND_ORE)
				.amount(1)
				.name("&8&l(&7Protecci�n&8&l) &632&6&lx&632&6&lx&632")
				.lore("")
				.lore("&8- &7Este bloque proteger� el �rea")
				.lore("&7especificada en su nombre. Solo")
				.lore("&7podr� ser utilizado en el mundo")
				.lore("&7PVE.")
				.lore("")
				.build()),
	
	EMERALD_PROTECTION(
			"Protecci�n de Esmeralda", "ESMERALDA", 64, 80000, 
			new ItemBuilder(Material.EMERALD_ORE)
				.amount(1)
				.name("&8&l(&7Protecci�n&8&l) &664&6&lx&664&6&lx&664")
				.lore("")
				.lore("&8- &7Este bloque proteger� el �rea")
				.lore("&7especificada en su nombre. Solo")
				.lore("&7podr� ser utilizado en el mundo")
				.lore("&7PVE.")
				.lore("")
				.build()),
	
	;
	
	private ItemStack protectionItem;
	
	private String name;
	private String shortname;
	
	private int radius;
	private int price;
	
	
	ProtectionZoneType(String name, String shortname, int radius, int price, ItemStack protectionItem){
		
		this.name = name;
		this.shortname = shortname;
		
		this.radius = radius;
		this.price = price;
		
		this.protectionItem = protectionItem;
		
	}

	public String getName() {
		return name;
	}

	public String getShortname() {
		return shortname;
	}
	
	public int getRadius() {
		return radius;
	}

	public int getPrice() {
		return price;
	}
	
	public ItemStack getProtectionItem() {
		return protectionItem;
	}
	
}
