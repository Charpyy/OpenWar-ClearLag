package com.openwar.openwarclearlag;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Arrays;
import java.util.List;


public final class Main extends JavaPlugin {
    private String logo = "§8» §cOpenWar §f- §cLag §8« §f";
    private final List<Material> itemsToClear = Arrays.asList(
            Material.matchMaterial("hbm:sulfur"),
            Material.matchMaterial("hbm:niter"),
            Material.matchMaterial("hbm:fluorite"),
            Material.matchMaterial("hbm:lithium"),
            Material.matchMaterial("hbm:ore_uranium"),
            Material.matchMaterial("hbm:ore_uranium_scorched"),
            Material.matchMaterial("hbm:ore_schrabidium"),
            Material.matchMaterial("hbm:ore_thorium"),
            Material.matchMaterial("hbm:ore_titanium"),
            Material.matchMaterial("hbm:ore_sulfur"),
            Material.matchMaterial("hbm:ore_niter"),
            Material.matchMaterial("hbm:ore_copper"),
            Material.matchMaterial("hbm:ore_tungsten"),
            Material.matchMaterial("hbm:ore_aluminium"),
            Material.matchMaterial("hbm:ore_fluorite"),
            Material.matchMaterial("hbm:ore_lead"),
            Material.matchMaterial("hbm:ore_beryllium"),
            Material.matchMaterial("hbm:ore_lignite"),
            Material.matchMaterial("hbm:ore_asbestos"),
            Material.matchMaterial("hbm:ore_rare"),
            Material.matchMaterial("hbm:ore_coal_oil"),
            Material.matchMaterial("hbm:ore_coal_oil_burning"),
            Material.matchMaterial("hbm:cluster_iron"),
            Material.matchMaterial("hbm:cluster_titanium"),
            Material.matchMaterial("hbm:cluster_aluminium"),
            Material.matchMaterial("hbm:cluster_copper"),
            Material.matchMaterial("hbm:ore_cobalt"),
            Material.matchMaterial("hbm:ore_cinnebar"),
            Material.matchMaterial("hbm:ore_coltan"),
            Material.matchMaterial("hbm:ore_reiium"),
            Material.matchMaterial("hbm:ore_weidanium"),
            Material.matchMaterial("hbm:ore_australium"),
            Material.matchMaterial("hbm:ore_verticium"),
            Material.matchMaterial("hbm:ore_unobtainium"),
            Material.matchMaterial("hbm:ore_daffergon"),
            Material.matchMaterial("hbm:stone_depth"),
            Material.matchMaterial("hbm:ore_depth_cinnebar"),
            Material.matchMaterial("hbm:ore_depth_zirconium"),
            Material.matchMaterial("hbm:ore_depth_borax"),
            Material.matchMaterial("hbm:cluster_depth_iron"),
            Material.matchMaterial("hbm:cluster_depth_titanium"),
            Material.matchMaterial("hbm:cluster_depth_tungsten"),
            Material.matchMaterial("hbm:ore_bedrock_coltan"),
            Material.matchMaterial("hbm:ore_bedrock_oil"),
            Material.matchMaterial("hbm:ore_bedrock_block"),
            Material.matchMaterial("hbm:ore_oil"),
            Material.matchMaterial("hbm:ore_oil_empty"),
            Material.matchMaterial("hbm:ore_oil_sand"),
            Material.matchMaterial("hbm:stone_gneiss"),
            Material.matchMaterial("hbm:ore_gneiss_iron"),
            Material.matchMaterial("hbm:ore_gneiss_gold"),
            Material.matchMaterial("hbm:ore_gneiss_uranium"),
            Material.matchMaterial("hbm:ore_gneiss_uranium_scorched"),
            Material.matchMaterial("hbm:ore_gneiss_copper"),
            Material.matchMaterial("hbm:ore_gneiss_asbestos"),
            Material.matchMaterial("hbm:ore_gneiss_lithium"),
            Material.matchMaterial("hbm:ore_gneiss_schrabidium"),
            Material.matchMaterial("hbm:ore_gneiss_rare"),
            Material.matchMaterial("hbm:ore_gneiss_gas"),
            Material.matchMaterial("hbm:ore_tikite"),
            Material.matchMaterial("hbm:ore_nether_coal"),
            Material.matchMaterial("hbm:ore_nether_smoldering"),
            Material.matchMaterial("hbm:ore_nether_cobalt"),
            Material.matchMaterial("hbm:ore_nether_tungsten"),
            Material.matchMaterial("hbm:ore_nether_sulfur"),
            Material.matchMaterial("hbm:ore_nether_fire"),
            Material.matchMaterial("hbm:ore_nether_uranium"),
            Material.matchMaterial("hbm:ore_nether_uranium_scorched"),
            Material.matchMaterial("hbm:ore_nether_plutonium"),
            Material.matchMaterial("hbm:ore_nether_schrabidium"),
            Material.matchMaterial("hbm:stone_depth_nether"),
            Material.matchMaterial("hbm:ore_depth_nether_neodymium"),
            Material.matchMaterial("hbm:ore_depth_nether_nitan"),
            Material.matchMaterial("hbm:block_meteor"),
            Material.matchMaterial("hbm:block_meteor_cobble"),
            Material.matchMaterial("hbm:block_meteor_broken"),
            Material.matchMaterial("hbm:block_meteor_molten"),
            Material.matchMaterial("hbm:block_meteor_treasure"),
            Material.matchMaterial("hbm:ore_meteor_uranium"),
            Material.matchMaterial("hbm:ore_meteor_thorium"),
            Material.matchMaterial("hbm:ore_meteor_titanium"),
            Material.matchMaterial("hbm:ore_meteor_sulfur"),
            Material.matchMaterial("hbm:ore_meteor_copper"),
            Material.matchMaterial("hbm:ore_meteor_tungsten"),
            Material.matchMaterial("hbm:ore_meteor_aluminium"),
            Material.matchMaterial("hbm:ore_meteor_lead"),
            Material.matchMaterial("hbm:ore_meteor_lithium"),
            Material.matchMaterial("hbm:ore_meteor_starmetal"),
            Material.matchMaterial("hbm:meteor_polished"),
            Material.matchMaterial("hbm:meteor_brick"),
            Material.matchMaterial("hbm:meteor_brick_mossy"),
            Material.matchMaterial("hbm:meteor_brick_cracked"),
            Material.matchMaterial("hbm:meteor_brick_chiseled"),
            Material.matchMaterial("hbm:meteor_pillar"),
            Material.matchMaterial("hbm:meteor_spawner"),
            Material.matchMaterial("hbm:meteor_battery"),
            Material.matchMaterial("hbm:brick_jungle"),
            Material.matchMaterial("hbm:brick_jungle_cracked"),
            Material.matchMaterial("hbm:brick_jungle_lava"),
            Material.matchMaterial("hbm:brick_jungle_ooze"),
            Material.matchMaterial("hbm:brick_jungle_mystic"),
            Material.matchMaterial("hbm:brick_jungle_trap"),
            Material.matchMaterial("hbm:brick_jungle_glyph"),
            Material.matchMaterial("hbm:brick_jungle_circle"),
            Material.matchMaterial("hbm:brick_dungeon"),
            Material.matchMaterial("hbm:brick_dungeon_flat"),
            Material.matchMaterial("hbm:brick_dungeon_tile"),
            Material.matchMaterial("hbm:brick_dungeon_circle"),
            Material.DIRT,
            Material.COBBLESTONE,
            Material.ROTTEN_FLESH,
            Material.STONE,
            Material.matchMaterial("hbm:stone_gneiss"),
            Material.matchMaterial("chisel:marble2"),
            Material.ARROW,
            Material.REDSTONE,
            Material.DIAMOND,
            Material.GOLD_ORE,
            Material.IRON_ORE,
            Material.COAL,
            Material.LAPIS_ORE,
            Material.matchMaterial("hbm:fragment_cobalt"),
            Material.matchMaterial("hbm:fragment_neodymium"),
            Material.matchMaterial("hbm:fragment_niobium"),
            Material.matchMaterial("hbm:fragment_cerium"),
            Material.matchMaterial("hbm:fragment_lanthanium"),
            Material.matchMaterial("hbm:fragment_actinium"),
            Material.matchMaterial("hbm:fragment_meteorite"),
            Material.matchMaterial("hbm:fragment_boron"),
            Material.matchMaterial("hbm:crystal_asbestos"),
            Material.matchMaterial("hbm:crystal_schraranium"),
            Material.matchMaterial("hbm:crystal_schrabidium"),
            Material.matchMaterial("hbm:crystal_rare"),
            Material.matchMaterial("hbm:crystal_phosphorus"),
            Material.matchMaterial("hbm:crystal_lithium"),
            Material.matchMaterial("hbm:crystal_cinnebar"),
            Material.matchMaterial("hbm:crystal_cobalt"),
            Material.matchMaterial("hbm:crystal_starmetal"),
            Material.matchMaterial("hbm:crystal_coal"),
            Material.matchMaterial("hbm:crystal_iron"),
            Material.matchMaterial("hbm:crystal_gold"),
            Material.matchMaterial("hbm:crystal_redstone"),
            Material.matchMaterial("hbm:crystal_lapis"),
            Material.matchMaterial("hbm:crystal_diamond"),
            Material.matchMaterial("hbm:crystal_uranium"),
            Material.matchMaterial("hbm:crystal_thorium"),
            Material.matchMaterial("hbm:crystal_plutonium"),
            Material.matchMaterial("hbm:crystal_titanium"),
            Material.matchMaterial("hbm:crystal_sulfur"),
            Material.matchMaterial("hbm:crystal_niter"),
            Material.matchMaterial("hbm:crystal_tungsten"),
            Material.matchMaterial("hbm:crystal_copper"),
            Material.matchMaterial("hbm:crystal_aluminium"),
            Material.matchMaterial("hbm:crystal_fluorite"),
            Material.FLINT,
            Material.GRAVEL,
            Material.matchMaterial("hbm:cinnebar"),
            Material.matchMaterial("hbm:rare_earth_chunk"),
            Material.matchMaterial("hbm:crystal_copper"),
            Material.matchMaterial("hbm:ingot_asbestos"),
            Material.matchMaterial("hbm:fluorite"),
            Material.matchMaterial("hbm:limestone2"),
            Material.matchMaterial("mwc:sulfur_dust"),
            Material.matchMaterial("mwc:graphite_chunk"),
            Material.matchMaterial("mwc:copper_ore"),
            Material.matchMaterial("mwc:tin_ore"),
            Material.matchMaterial("mwc:sulfur_ore"),
            Material.matchMaterial("mwc:lead_ore"),
            Material.matchMaterial("mwc:graphite_ore")
            );
    @Override
    public void onEnable() {
        new BukkitRunnable() {
            @Override
            public void run() {
                announceClear(10, "world");
            }
        }.runTaskTimer(this, 0, 2400);
    }

    private void announceClear(int secondsBefore, String worldName) {
        World world = Bukkit.getWorld(worldName);
        if (world == null) return;

        new BukkitRunnable() {
            int countdown = secondsBefore;

            @Override
            public void run() {
                if (countdown == 0) {
                    sendMessageToWorld(world, "§8→ §7Clearing Items ...");
                    clearItemsInWorld(worldName);
                    cancel();
                    return;
                }
                countdown--;
            }
        }.runTaskTimer(this, 0, 20);
    }
    private void sendMessageToWorld(World world, String message) {
        for (Player player : world.getPlayers()) {
            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(message));
        }
    }

    private void clearItemsInWorld(String worldName) {
        World world = Bukkit.getWorld(worldName);
        if (world != null) {
            for (Entity entity : world.getEntities()) {
                if (entity instanceof Item) {
                    Item item = (Item) entity;
                    ItemStack itemStack = item.getItemStack();
                    if (itemsToClear.contains(itemStack.getType())) {
                        item.remove();
                    }
                }
            }
        }
    }
}