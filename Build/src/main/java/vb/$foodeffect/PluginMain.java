package vb.$foodeffect;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.event.*;
import org.bukkit.plugin.java.*;

public class PluginMain extends JavaPlugin implements Listener {

	private static PluginMain instance;

	@Override
	public void onEnable() {
		instance = this;
		getDataFolder().mkdir();
		getServer().getPluginManager().registerEvents(this, this);
		try {
			((org.bukkit.command.CommandSender) (Object) org.bukkit.Bukkit.getConsoleSender())
					.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2yo yo"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onDisable() {
		try {
			((org.bukkit.command.CommandSender) (Object) org.bukkit.Bukkit.getConsoleSender())
					.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2yo yo"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String label, String[] commandArgs) {
		return true;
	}

	public static void procedure(String procedure, List procedureArgs) throws Exception {
	}

	public static Object function(String function, List functionArgs) throws Exception {
		return null;
	}

	public static List createList(Object obj) {
		List list = new ArrayList<>();
		if (obj.getClass().isArray()) {
			int length = java.lang.reflect.Array.getLength(obj);
			for (int i = 0; i < length; i++) {
				list.add(java.lang.reflect.Array.get(obj, i));
			}
		} else if (obj instanceof Collection<?>) {
			list.addAll((Collection<?>) obj);
		} else if (obj instanceof Iterator) {
			((Iterator<?>) obj).forEachRemaining(list::add);
		} else {
			list.add(obj);
		}
		return list;
	}

	public static void createResourceFile(String path) {
		Path file = getInstance().getDataFolder().toPath().resolve(path);
		if (Files.notExists(file)) {
			try (InputStream inputStream = PluginMain.class.getResourceAsStream("/" + path)) {
				Files.createDirectories(file.getParent());
				Files.copy(inputStream, file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static PluginMain getInstance() {
		return instance;
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void onPlayerItemConsumeEvent1(org.bukkit.event.player.PlayerItemConsumeEvent event) throws Exception {
		new org.bukkit.scheduler.BukkitRunnable() {
			public void run() {
				try {
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.COOKED_MUTTON)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.FAST_DIGGING,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.COOKED_PORKCHOP)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.BAD_OMEN,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.COOKED_CHICKEN)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.BAD_OMEN,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.COOKED_BEEF)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.INVISIBILITY,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.COOKED_SALMON)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.CONFUSION,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.BAKED_POTATO)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.FIRE_RESISTANCE,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.COOKED_COD)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.COOKED_RABBIT)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.JUMP,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.BEEF)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.HARM,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.RABBIT)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer())
								.addPotionEffect(new org.bukkit.potion.PotionEffect(
										org.bukkit.potion.PotionEffectType.HERO_OF_THE_VILLAGE, ((int) 100d),
										((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.PORKCHOP)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.POISON,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.MUTTON)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.CONFUSION,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.TROPICAL_FISH)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.LUCK,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.SALMON)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.POISON,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.CHICKEN)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.BLINDNESS,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.COD)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.BLINDNESS,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.SPIDER_EYE)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.CONDUIT_POWER,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.ENCHANTED_GOLDEN_APPLE)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.WEAKNESS,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.APPLE)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.POISON,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.GOLDEN_APPLE)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.WITHER,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.DRIED_KELP)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.WATER_BREATHING,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.CARROT)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.HEALTH_BOOST,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.POTATO)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.GLOWING,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.GOLDEN_CARROT)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.HEAL,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.PUMPKIN_PIE)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.DOLPHINS_GRACE,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.ROTTEN_FLESH)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.LEVITATION,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.MUSHROOM_STEW)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.SLOW_FALLING,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.SUSPICIOUS_STEW)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.SLOW_DIGGING,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.POISONOUS_POTATO)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.SLOW,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.BREAD)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.INCREASE_DAMAGE,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.CAKE)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.SLOW_FALLING,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.MELON_SLICE)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.UNLUCK,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), ((java.lang.Object) null))) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.UNLUCK,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.BEETROOT_SOUP)) {
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.BEETROOT_SOUP)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.ABSORPTION,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.RABBIT_STEW)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.LEVITATION,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.PUFFERFISH)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.CONDUIT_POWER,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), ((java.lang.Object) null))) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.UNLUCK,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.GLOW_BERRIES)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.NIGHT_VISION,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.SWEET_BERRIES)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.NIGHT_VISION,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.BEETROOT)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.ABSORPTION,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.COOKIE)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.POISON,
										((int) 100d), ((int) 3d)));
					}
					if (PluginMain.checkEquals(event.getItem().getType(), org.bukkit.Material.CHORUS_FRUIT)) {
						((org.bukkit.entity.LivingEntity) (Object) event.getPlayer()).addPotionEffect(
								new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION,
										((int) 100d), ((int) 3d)));
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}.runTaskLater(PluginMain.getInstance(), ((long) 10d));
	}

	public static boolean checkEquals(Object o1, Object o2) {
		if (o1 == null || o2 == null) {
			return false;
		}
		return o1 instanceof Number && o2 instanceof Number
				? ((Number) o1).doubleValue() == ((Number) o2).doubleValue()
				: o1.equals(o2);
	}
}
