/*******************************************************************************
 * Copyright 2014-2016, the Biomes O' Plenty Team
 * 
 * This work is licensed under a Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International Public License.
 * 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/.
 ******************************************************************************/

package biomesoplenty.common.init;

import com.google.common.base.CaseFormat;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.item.BOPItems;
import biomesoplenty.common.block.*;
import biomesoplenty.common.crafting.BiomeEssenceRecipe;
import biomesoplenty.common.enums.*;
import biomesoplenty.common.handler.FurnaceFuelHandler;
import biomesoplenty.common.item.ItemDart;
import biomesoplenty.common.item.ItemJarFilled;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModCrafting
{
    
    public static void init()
    {
        addOreRegistration();
        addCraftingRecipies();
        addSmeltingRecipes();
    }
    
    
    private static void addCraftingRecipies()
    {
        
        /*** Dyes ***/
        
        // Flower1
        // CLOVER missing
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, EnumDyeColor.CYAN.getDyeDamage()), new Object[] {BlockBOPFlower.paging.getVariantItem(BOPFlowers.SWAMPFLOWER)});
        GameRegistry.addShapelessRecipe(new ItemStack(BOPItems.black_dye), new Object[] {BlockBOPFlower.paging.getVariantItem(BOPFlowers.DEATHBLOOM)});
        // GLOWFLOWER missing
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, EnumDyeColor.LIGHT_BLUE.getDyeDamage()), new Object[] {BlockBOPFlower.paging.getVariantItem(BOPFlowers.BLUE_HYDRANGEA)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, EnumDyeColor.ORANGE.getDyeDamage()), new Object[] {BlockBOPFlower.paging.getVariantItem(BOPFlowers.ORANGE_COSMOS)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, EnumDyeColor.PINK.getDyeDamage()), new Object[] {BlockBOPFlower.paging.getVariantItem(BOPFlowers.PINK_DAFFODIL)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, EnumDyeColor.MAGENTA.getDyeDamage()), new Object[] {BlockBOPFlower.paging.getVariantItem(BOPFlowers.WILDFLOWER)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, EnumDyeColor.PURPLE.getDyeDamage()), new Object[] {BlockBOPFlower.paging.getVariantItem(BOPFlowers.VIOLET)});
        GameRegistry.addShapelessRecipe(new ItemStack(BOPItems.white_dye), new Object[] {BlockBOPFlower.paging.getVariantItem(BOPFlowers.WHITE_ANEMONE)});
        // ENDERLOTUS missing
        // BROMELIAD missing
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, EnumDyeColor.SILVER.getDyeDamage()), new Object[] {BlockBOPFlower.paging.getVariantItem(BOPFlowers.DANDELION)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, EnumDyeColor.PINK.getDyeDamage()), new Object[] {BlockBOPFlower.paging.getVariantItem(BOPFlowers.PINK_HIBISCUS)});
        GameRegistry.addShapelessRecipe(new ItemStack(BOPItems.white_dye), new Object[] {BlockBOPFlower.paging.getVariantItem(BOPFlowers.LILY_OF_THE_VALLEY)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, EnumDyeColor.ORANGE.getDyeDamage()), new Object[] {BlockBOPFlower.paging.getVariantItem(BOPFlowers.BURNING_BLOSSOM)});

        // Flower 2
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, EnumDyeColor.PURPLE.getDyeDamage()), new Object[] {BlockBOPFlower.paging.getVariantItem(BOPFlowers.LAVENDER)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, EnumDyeColor.YELLOW.getDyeDamage()), new Object[] {BlockBOPFlower.paging.getVariantItem(BOPFlowers.GOLDENROD)});
        GameRegistry.addShapelessRecipe(new ItemStack(BOPItems.blue_dye), new Object[] {BlockBOPFlower.paging.getVariantItem(BOPFlowers.BLUEBELLS)});
        // MINERS_DELIGHT missing
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, EnumDyeColor.LIGHT_BLUE.getDyeDamage()), new Object[] {BlockBOPFlower.paging.getVariantItem(BOPFlowers.ICY_IRIS)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, EnumDyeColor.RED.getDyeDamage()), new Object[] {BlockBOPFlower.paging.getVariantItem(BOPFlowers.ROSE)});

        // Others
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, EnumDyeColor.GRAY.getDyeDamage()), new Object[] {new ItemStack(BOPItems.ash)});
        GameRegistry.addShapelessRecipe(new ItemStack(BOPItems.green_dye), new Object[] {new ItemStack(BOPBlocks.moss)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, EnumDyeColor.LIME.getDyeDamage()), new Object[] {new ItemStack(BOPBlocks.mushroom, 1, BlockBOPMushroom.MushroomType.GLOWSHROOM.ordinal())});
        GameRegistry.addShapelessRecipe(new ItemStack(BOPItems.brown_dye), new Object[] {new ItemStack(BOPBlocks.mushroom, 1, BlockBOPMushroom.MushroomType.FLAT_MUSHROOM.ordinal())});
        GameRegistry.addShapelessRecipe(new ItemStack(BOPItems.blue_dye), new Object[] {new ItemStack(BOPBlocks.mushroom, 1, BlockBOPMushroom.MushroomType.BLUE_MILK_CAP.ordinal())});
        GameRegistry.addShapelessRecipe(new ItemStack(BOPItems.brown_dye), new Object[] {BlockBOPPlant.paging.getVariantItem(BOPPlants.CATTAIL)});
        GameRegistry.addShapelessRecipe(new ItemStack(BOPItems.brown_dye), new Object[] {((BlockBOPDoublePlant)BOPBlocks.double_plant).getVariantItem(BlockBOPDoublePlant.DoublePlantType.TALL_CATTAIL)});

        
        /*** BOP brick and stone stairs and slabs ***/
        
        for (BlockBOPHalfOtherSlab.SlabType slabType : BlockBOPHalfOtherSlab.SlabType.values())
        {
            BlockBOPHalfOtherSlab otherSlab = (BlockBOPHalfOtherSlab)BOPBlocks.other_slab;
            GameRegistry.addShapedRecipe(otherSlab.getVariantItem(slabType, 6), new Object[] {"RRR", 'R', otherSlab.getFullBlockVariantItem(slabType)});
        }
        
        GameRegistry.addShapedRecipe(new ItemStack(BOPBlocks.mud_brick_stairs, 4), new Object[] {"  R", " RR", "RRR", 'R', BOPBlocks.mud_brick_block});
        GameRegistry.addShapedRecipe(new ItemStack(BOPBlocks.mud_brick_stairs, 4), new Object[] {"R  ", "RR ", "RRR", 'R', BOPBlocks.mud_brick_block});
        
        
        /*** Wood stairs and slabs ***/
        
        // Make sticks from any BOP plank
        GameRegistry.addShapedRecipe(new ItemStack(Items.stick, 4), new Object[] {"#", "#", '#', BOPBlocks.planks_0});
        
        // Note you can't make planks (and therefore doors, fences etc) from GIANT_FLOWER and DEAD logs
        
        for (BOPWoods wood : BOPWoods.values())
        {
            if (!wood.hasPlanks()) {continue;}
            GameRegistry.addShapelessRecipe(BlockBOPPlanks.paging.getVariantItem(wood, 4), BlockBOPLog.paging.getVariantItem(wood));
            GameRegistry.addShapedRecipe(BlockBOPHalfWoodSlab.paging.getVariantItem(wood, 6), new Object[] {"###", '#', BlockBOPPlanks.paging.getVariantItem(wood)});
            GameRegistry.addShapedRecipe(new ItemStack(BlockBOPWoodStairs.getBlock(wood), 4), new Object[] {"#  ", "## ", "###", '#', BlockBOPPlanks.paging.getVariantItem(wood)});
            GameRegistry.addShapedRecipe(new ItemStack(BlockBOPDoor.getBlock(wood).getDoorItem(), 3), new Object[] {"##", "##", "##", '#', BlockBOPPlanks.paging.getVariantItem(wood)});
            GameRegistry.addShapedRecipe(new ItemStack(BlockBOPFence.getBlock(wood), 3), new Object[] {"W#W", "W#W", '#', Items.stick, 'W', BlockBOPPlanks.paging.getVariantItem(wood)});       
            GameRegistry.addShapedRecipe(new ItemStack(BlockBOPFenceGate.getBlock(wood), 1), new Object[] {"#W#", "#W#", '#', Items.stick, 'W', BlockBOPPlanks.paging.getVariantItem(wood)});
        }
 
        
        /*** Gems and Gem Blocks ***/
        
        for (BOPGems gem : BOPGems.values())
        {
            GameRegistry.addShapelessRecipe(new ItemStack(BOPItems.gem, 9, gem.ordinal()), new Object[] {new ItemStack(BOPBlocks.gem_ore , 1, gem.ordinal())});
            GameRegistry.addShapedRecipe(new ItemStack(BOPBlocks.gem_block, 1, gem.ordinal()), new Object[] {"AAA", "AAA", "AAA", 'A', new ItemStack(BOPItems.gem, 1, gem.ordinal())});
        }             
        
        /*** Tools, weapons, armor ***/
        
        // Scythes
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BOPItems.wood_scythe), new Object [] {" MM", "M S", "  S", 'M', "plankWood", 'S', "stickWood" }));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BOPItems.stone_scythe), new Object [] {" MM", "M S", "  S", 'M', Blocks.cobblestone, 'S', "stickWood" }));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BOPItems.iron_scythe), new Object [] {" MM", "M S", "  S", 'M', Items.iron_ingot, 'S', "stickWood" }));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BOPItems.gold_scythe), new Object [] {" MM", "M S", "  S", 'M', Items.gold_ingot, 'S', "stickWood" }));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BOPItems.diamond_scythe), new Object [] {" MM", "M S", "  S", 'M', Items.diamond, 'S', "stickWood" }));
        // and in reverse..
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BOPItems.wood_scythe), new Object [] {"MM ", "S M", "S  ", 'M', "plankWood", 'S', "stickWood" }));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BOPItems.stone_scythe), new Object [] {"MM ", "S M", "S  ", 'M', Blocks.cobblestone, 'S', "stickWood" }));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BOPItems.iron_scythe), new Object [] {"MM ", "S M", "S  ", 'M', Items.iron_ingot, 'S', "stickWood" }));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BOPItems.gold_scythe), new Object [] {"MM ", "S M", "S  ", 'M', Items.gold_ingot, 'S', "stickWood" }));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BOPItems.diamond_scythe), new Object [] {"MM ", "S M", "S  ", 'M', Items.diamond, 'S', "stickWood" }));   
        
        // Mud Tools and Armor
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BOPItems.mud_pickaxe), new Object [] {"###", " X ", " X ", '#', BOPItems.mudball, 'X', "stickWood" }));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BOPItems.mud_shovel), new Object [] {"#", "X", "X", '#', BOPItems.mudball, 'X', "stickWood"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BOPItems.mud_sword), new Object [] {"#", "#", "X", '#', BOPItems.mudball, 'X', "stickWood"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BOPItems.mud_axe), new Object [] {"##", "#X", " X", '#', BOPItems.mudball, 'X', "stickWood"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BOPItems.mud_hoe), new Object [] {"##", " X", " X", '#', BOPItems.mudball, 'X', "stickWood"}));
        GameRegistry.addShapedRecipe(new ItemStack(BOPItems.mud_helmet), new Object [] {"###", "# #", '#', BOPItems.mudball});
        GameRegistry.addShapedRecipe(new ItemStack(BOPItems.mud_chestplate), new Object [] {"# #", "###", "###", '#', BOPItems.mudball});
        GameRegistry.addShapedRecipe(new ItemStack(BOPItems.mud_leggings), new Object [] {"###", "# #", "# #", '#', BOPItems.mudball});
        GameRegistry.addShapedRecipe(new ItemStack(BOPItems.mud_boots), new Object [] {"# #", "# #", '#', BOPItems.mudball});
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BOPItems.mud_scythe), new Object [] {" MM", "M S", "  S", 'M', BOPItems.mudball, 'S', "stickWood" }));   
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BOPItems.mud_scythe), new Object [] {"MM ", "S M", "S  ", 'M', BOPItems.mudball, 'S', "stickWood" }));

        // Amethyst Tools and Armor
        GameRegistry.addShapedRecipe(new ItemStack(BOPItems.amethyst_pickaxe), new Object [] {"###", " X ", " X ", '#', new ItemStack(BOPItems.gem, 1, BOPGems.AMETHYST.ordinal()), 'X', Items.iron_ingot});
        GameRegistry.addShapedRecipe(new ItemStack(BOPItems.amethyst_shovel), new Object [] {"#", "X", "X", '#', new ItemStack(BOPItems.gem, 1, BOPGems.AMETHYST.ordinal()), 'X', Items.iron_ingot});
        GameRegistry.addShapedRecipe(new ItemStack(BOPItems.amethyst_sword), new Object [] {"#", "#", "X", '#', new ItemStack(BOPItems.gem, 1, BOPGems.AMETHYST.ordinal()), 'X', Items.iron_ingot});
        GameRegistry.addShapedRecipe(new ItemStack(BOPItems.amethyst_axe), new Object [] {"##", "#X", " X", '#', new ItemStack(BOPItems.gem, 1, BOPGems.AMETHYST.ordinal()), 'X', Items.iron_ingot});
        GameRegistry.addShapedRecipe(new ItemStack(BOPItems.amethyst_hoe), new Object [] {"##", " X", " X", '#', new ItemStack(BOPItems.gem, 1, BOPGems.AMETHYST.ordinal()), 'X', Items.iron_ingot});
        GameRegistry.addShapedRecipe(new ItemStack(BOPItems.amethyst_helmet), new Object [] {"###", "# #", '#', new ItemStack(BOPItems.gem, 1, BOPGems.AMETHYST.ordinal())});
        GameRegistry.addShapedRecipe(new ItemStack(BOPItems.amethyst_chestplate), new Object [] {"# #", "###", "###", '#', new ItemStack(BOPItems.gem, 1, BOPGems.AMETHYST.ordinal())});
        GameRegistry.addShapedRecipe(new ItemStack(BOPItems.amethyst_leggings), new Object [] {"###", "# #", "# #", '#', new ItemStack(BOPItems.gem, 1, BOPGems.AMETHYST.ordinal())});
        GameRegistry.addShapedRecipe(new ItemStack(BOPItems.amethyst_boots), new Object [] {"# #", "# #", '#', new ItemStack(BOPItems.gem, 1, BOPGems.AMETHYST.ordinal())});
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BOPItems.amethyst_scythe), new Object [] {" MM", "M S", "  S", 'M', new ItemStack(BOPItems.gem, 1, BOPGems.AMETHYST.ordinal()), 'S', Items.iron_ingot}));    
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BOPItems.amethyst_scythe), new Object [] {"MM ", "S M", "S  ", 'M', new ItemStack(BOPItems.gem, 1, BOPGems.AMETHYST.ordinal()), 'S', Items.iron_ingot}));    

        // Flower Bands
        GameRegistry.addShapedRecipe(new ItemStack(BOPItems.dull_flower_band), new Object [] {"CCC", "C C", "CCC", 'C', BlockBOPFlower.paging.getVariantItem(BOPFlowers.CLOVER)});
        GameRegistry.addShapedRecipe(new ItemStack(BOPItems.plain_flower_band), new Object [] {"CDC", "D D", "CDC", 'C', BlockBOPFlower.paging.getVariantItem(BOPFlowers.CLOVER), 'D', BlockBOPFlower.paging.getVariantItem(BOPFlowers.ORANGE_COSMOS)});
        GameRegistry.addShapedRecipe(new ItemStack(BOPItems.exotic_flower_band), new Object [] {"CDC", "V V", "CDC", 'C', BlockBOPFlower.paging.getVariantItem(BOPFlowers.CLOVER),'D', BlockBOPFlower.paging.getVariantItem(BOPFlowers.ORANGE_COSMOS), 'V', BlockBOPFlower.paging.getVariantItem(BOPFlowers.VIOLET)});
        
        // Dart Blower
        GameRegistry.addShapedRecipe(new ItemStack(BOPItems.dart_blower), new Object[] {"R R", "R R", "R R", 'R', BlockBOPPlant.paging.getVariantItem(BOPPlants.RIVERCANE)});
        GameRegistry.addShapedRecipe(new ItemStack(BOPItems.dart, 4, ItemDart.DartType.DART.ordinal()), new Object[] {"T", "R", "F", 'T', BlockBOPPlant.paging.getVariantItem(BOPPlants.THORN), 'R', BlockBOPPlant.paging.getVariantItem(BOPPlants.RIVERCANE), 'F', Items.feather});
        GameRegistry.addShapelessRecipe(new ItemStack(BOPItems.dart, 1, ItemDart.DartType.POISONDART.ordinal()), new Object[] {new ItemStack(BOPItems.jar_filled, 1, ItemJarFilled.JarContents.POISON.ordinal()), new ItemStack(BOPItems.dart, 1, ItemDart.DartType.DART.ordinal())});        
        
        
        /*** Biome Finder ***/
        
        GameRegistry.addShapedRecipe(new ItemStack(BOPItems.biome_finder), new Object[] {" E ", "ERE", " E ", 'E', new ItemStack(Items.emerald), 'R', new ItemStack(Items.redstone)});
        GameRegistry.addRecipe(new BiomeEssenceRecipe());
        
        
        /*** Misc Others ***/
        
        GameRegistry.addShapedRecipe(new ItemStack(Items.string), new Object[] {"FFF", "FFF", "FFF", 'F', ((BlockBOPDoublePlant)BOPBlocks.double_plant).getVariantItem(BlockBOPDoublePlant.DoublePlantType.FLAX)});
        GameRegistry.addShapedRecipe(new ItemStack(BOPBlocks.grass, 1, BlockBOPGrass.BOPGrassType.OVERGROWN_NETHERRACK.ordinal()), new Object[] {"SSS", "SNS", "SSS", 'S', Items.wheat_seeds, 'N', Blocks.netherrack});
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.wool), new Object [] {"CCC", "CCC", "CCC", 'C', "plantCattail"}));
        GameRegistry.addShapedRecipe(new ItemStack(Items.coal), new Object[] {"AAA", "AAA", "AAA", 'A', new ItemStack(BOPItems.ash)});
        GameRegistry.addShapedRecipe(new ItemStack(BOPBlocks.ash_block), new Object[] {"AA", "AA", 'A', new ItemStack(BOPItems.ash)});
        GameRegistry.addShapedRecipe(new ItemStack(BOPBlocks.mud, 1), new Object[] {"MM", "MM", 'M', BOPItems.mudball});
        GameRegistry.addShapedRecipe(new ItemStack(BOPBlocks.mud_brick_block), new Object[] {"MM", "MM", 'M', new ItemStack(BOPItems.mud_brick)});        
        GameRegistry.addShapedRecipe(new ItemStack(BOPBlocks.crystal), new Object[] {"CC", "CC", 'C', new ItemStack(BOPItems.crystal_shard)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.mossy_cobblestone, 1, 0), new Object[] {"MMM", "MCM", "MMM", 'M', BOPBlocks.moss, 'C', Blocks.cobblestone});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stonebrick, 1, 1), new Object[] {"MMM", "MSM", "MMM", 'M', BOPBlocks.moss, 'S', Blocks.stonebrick});
        GameRegistry.addShapedRecipe(new ItemStack(BOPItems.enderporter), new Object[] {"IOI", "OAO", "IOI", 'I', Items.ender_eye, 'O', new ItemStack(BOPItems.ghastly_soul), 'A', new ItemStack(BOPItems.gem, 1, BOPGems.AMETHYST.ordinal())});
        GameRegistry.addShapedRecipe(new ItemStack(BOPBlocks.bamboo_thatching), new Object[] {"##", "##", '#', BOPBlocks.bamboo});
        GameRegistry.addShapedRecipe(new ItemStack(BOPBlocks.bamboo, 8), new Object [] {" #", "# ", '#', new ItemStack(BOPBlocks.bamboo_thatching)});
        GameRegistry.addShapedRecipe(new ItemStack(BOPBlocks.bamboo, 8), new Object [] {"# ", " #", '#', new ItemStack(BOPBlocks.bamboo_thatching)});
        GameRegistry.addShapedRecipe(new ItemStack(BOPItems.jar_empty, 3, 0), new Object[] {"# #", "# #", "###", '#', Blocks.glass});
        GameRegistry.addShapelessRecipe(new ItemStack(BOPItems.ambrosia), new Object[] {new ItemStack(BOPItems.pixie_dust), new ItemStack(Items.potionitem, 1, 0), BlockBOPFlower.paging.getVariantItem(BOPFlowers.MINERS_DELIGHT), new ItemStack(BOPBlocks.seaweed, 1, BlockBOPSeaweed.SeaweedType.KELP.ordinal()), BlockBOPPlant.paging.getVariantItem(BOPPlants.ROOT), new ItemStack(BOPItems.crystal_shard), new ItemStack(BOPItems.jar_filled, 1, ItemJarFilled.JarContents.HONEY.ordinal()), new ItemStack(BOPItems.berries), Items.sugar});
        GameRegistry.addShapedRecipe(new ItemStack(BOPBlocks.flesh), new Object[] {"##", "##", '#', new ItemStack(BOPItems.fleshchunk)});
        GameRegistry.addShapedRecipe(new ItemStack(Items.rotten_flesh), new Object[] {"FFF", "FPF", "FFF", 'F', new ItemStack(BOPItems.fleshchunk), 'P', new ItemStack(BOPItems.jar_filled, 1, ItemJarFilled.JarContents.POISON.ordinal())});

        //Bone Segments > Bonemeal
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 3, EnumDyeColor.WHITE.getDyeDamage()), new Object[] {((BlockBOPBones)BOPBlocks.bone_segment).getVariantItem(BlockBOPBones.BoneType.SMALL)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 6, EnumDyeColor.WHITE.getDyeDamage()), new Object[] {((BlockBOPBones)BOPBlocks.bone_segment).getVariantItem(BlockBOPBones.BoneType.MEDIUM)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 12, EnumDyeColor.WHITE.getDyeDamage()), new Object[] {((BlockBOPBones)BOPBlocks.bone_segment).getVariantItem(BlockBOPBones.BoneType.LARGE)});
        
        //Honeycombs
        GameRegistry.addShapedRecipe(new ItemStack(BOPBlocks.hive, 1, BlockBOPHive.HiveType.HONEYCOMB.ordinal()), new Object [] {"##", "##", '#', new ItemStack(BOPItems.honeycomb)});
        GameRegistry.addShapedRecipe(new ItemStack(BOPBlocks.hive, 1, BlockBOPHive.HiveType.FILLED_HONEYCOMB.ordinal()), new Object [] {"##", "##", '#', new ItemStack(BOPItems.filled_honeycomb)});

        //Plants
        GameRegistry.addShapelessRecipe(new ItemStack(BOPItems.shroompowder), new Object[] {new ItemStack(BOPBlocks.mushroom, 1, BlockBOPMushroom.MushroomType.TOADSTOOL.ordinal())});
        GameRegistry.addShapelessRecipe(new ItemStack(BOPItems.jar_filled, 1, ItemJarFilled.JarContents.POISON.ordinal()), new Object[] {BlockBOPPlant.paging.getVariantItem(BOPPlants.POISONIVY), new ItemStack(BOPItems.jar_empty)});
        GameRegistry.addShapelessRecipe(new ItemStack(BOPItems.ricebowl), new Object[] {Items.bowl, BlockBOPPlant.paging.getVariantItem(BOPPlants.WILDRICE)});
        GameRegistry.addShapelessRecipe(new ItemStack(BOPItems.saladfruit), new Object[] {Items.bowl, BOPItems.berries, Items.apple, Items.melon});
        GameRegistry.addShapelessRecipe(new ItemStack(BOPItems.saladveggie), new Object[] {Items.bowl, BOPItems.wildcarrots, Items.carrot, Items.potato});
        GameRegistry.addShapelessRecipe(new ItemStack(BOPItems.saladshroom), new Object[] {Items.bowl, new ItemStack(BOPBlocks.mushroom, 1, BlockBOPMushroom.MushroomType.TOADSTOOL.ordinal()), new ItemStack(BOPBlocks.mushroom, 1, BlockBOPMushroom.MushroomType.PORTOBELLO.ordinal()), new ItemStack(BOPBlocks.mushroom, 1, BlockBOPMushroom.MushroomType.BLUE_MILK_CAP.ordinal())});

        
    }
    
    
    public static void addSmeltingRecipes()
    {
        
        // Register smelting recipes
        GameRegistry.addSmelting(Blocks.dirt, new ItemStack(BOPBlocks.dried_dirt), 0F);
        GameRegistry.addSmelting(BlockBOPPlant.paging.getVariantItem(BOPPlants.TINYCACTUS), new ItemStack(Items.dye, 1, EnumDyeColor.GREEN.getDyeDamage()), 0.2F);
        GameRegistry.addSmelting(BOPItems.mudball, new ItemStack(BOPItems.mud_brick), 0F);
        for (BOPWoods wood : BOPWoods.values())
        {
            if (wood.canMakeCharcoal())
            {
                GameRegistry.addSmelting(BlockBOPLog.paging.getVariantItem(wood), new ItemStack(Items.coal, 1, 1), 0.15F);
            }
        }
        
        // Register items which can be used as fuel
        FurnaceFuelHandler bopFuel = new FurnaceFuelHandler();
        GameRegistry.registerFuelHandler(bopFuel);

        bopFuel.addFuel(BOPBlocks.sapling_0, 100);
        bopFuel.addFuel(BOPBlocks.sapling_1, 100);
        bopFuel.addFuel(BOPBlocks.sapling_2, 100);
        bopFuel.addFuel(BOPBlocks.wood_slab_0, 150);
        bopFuel.addFuel(BOPBlocks.wood_slab_1, 150);
        // Note, we don't have to add all the other wood blocks - by default any block with Material = wood burns with value of 300
        // See TileEntityFurnace.getItemBurnTime()

        bopFuel.addFuel(BOPItems.ash, 400); // TODO: really? 400?  Ash is already burnt but burns better than wooden planks?
        
    }
    
    
    private static void addOreRegistration()
    {
        //Registration in Ore Dictionary

        OreDictionary.registerOre("stickWood", new ItemStack(BOPBlocks.bamboo));
        OreDictionary.registerOre("stickWood", BlockBOPPlant.paging.getVariantItem(BOPPlants.RIVERCANE));
        
        OreDictionary.registerOre("blockMeatRaw", new ItemStack(BOPBlocks.flesh, 1, 0));
        
        OreDictionary.registerOre("foodMushroompowder", new ItemStack(BOPItems.shroompowder));
        OreDictionary.registerOre("foodFruitsalad", new ItemStack(BOPItems.saladfruit));
        OreDictionary.registerOre("foodVeggiesalad", new ItemStack(BOPItems.saladveggie));
        OreDictionary.registerOre("foodMushroomsalad", new ItemStack(BOPItems.saladshroom));
        OreDictionary.registerOre("foodFilledhoneycomb", new ItemStack(BOPItems.filled_honeycomb));
        OreDictionary.registerOre("foodAmbrosia", new ItemStack(BOPItems.ambrosia));
        OreDictionary.registerOre("foodBowlofrice", new ItemStack(BOPItems.ricebowl));
        
        OreDictionary.registerOre("cropWildcarrots", new ItemStack(BOPItems.wildcarrots));
        OreDictionary.registerOre("cropPeach", new ItemStack(BOPItems.peach));
        OreDictionary.registerOre("cropPersimmon", new ItemStack(BOPItems.persimmon));
        OreDictionary.registerOre("cropTurnip", new ItemStack(BOPItems.turnip));
        OreDictionary.registerOre("cropPear", new ItemStack(BOPItems.pear));
        
        OreDictionary.registerOre("listAllfruit", new ItemStack(BOPItems.peach));
        OreDictionary.registerOre("listAllfruit", new ItemStack(BOPItems.persimmon));
        OreDictionary.registerOre("listAllrootveggie", new ItemStack(BOPItems.turnip));
        OreDictionary.registerOre("listAllveggie", new ItemStack(BOPItems.turnip));
        OreDictionary.registerOre("listAllfruit", new ItemStack(BOPItems.pear));
        
        OreDictionary.registerOre("seedTurnip", new ItemStack(BOPItems.turnip_seeds));
        OreDictionary.registerOre("listAllseed", new ItemStack(BOPItems.turnip_seeds));

        OreDictionary.registerOre("dyeBlue", new ItemStack(BOPItems.blue_dye));
        OreDictionary.registerOre("dyeBrown", new ItemStack(BOPItems.brown_dye));
        OreDictionary.registerOre("dyeGreen", new ItemStack(BOPItems.green_dye));
        OreDictionary.registerOre("dyeWhite", new ItemStack(BOPItems.white_dye));
        OreDictionary.registerOre("dyeBlack", new ItemStack(BOPItems.black_dye));
        
        OreDictionary.registerOre("record", new ItemStack(BOPItems.record_corruption));
        OreDictionary.registerOre("record", new ItemStack(BOPItems.record_wanderer));
        
        
        for (BOPGems gem : BOPGems.values())
        {
            // TODO: for some reason, Amethyst was not included in these sections in the 1.7 code - check this is correct, deliberate behavior
            if (gem == BOPGems.AMETHYST) {continue;}
            String gemName = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, gem.name());
            OreDictionary.registerOre("gem"+gemName, new ItemStack(BOPItems.gem, 1, gem.ordinal()));
            OreDictionary.registerOre("ore"+gemName, new ItemStack(BOPBlocks.gem_ore , 1, gem.ordinal()));
        }
        
        for (BOPFlowers flower : BOPFlowers.values())
        {
            String flowerName = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, flower.name());
            OreDictionary.registerOre("flower"+flowerName, BlockBOPFlower.paging.getVariantItem(flower));
        }
        
        for (BOPPlants plant : BOPPlants.values())
        {
            String plantName = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, plant.name());
            OreDictionary.registerOre("plant"+plantName, BlockBOPPlant.paging.getVariantItem(plant));
        }
        OreDictionary.registerOre("plantFlax", ((BlockBOPDoublePlant)BOPBlocks.double_plant).getVariantItem(BlockBOPDoublePlant.DoublePlantType.FLAX));
        OreDictionary.registerOre("plantCattail", ((BlockBOPDoublePlant)BOPBlocks.double_plant).getVariantItem(BlockBOPDoublePlant.DoublePlantType.TALL_CATTAIL));
        
        for (BOPTrees tree : BOPTrees.values())
        {
            OreDictionary.registerOre("treeLeaves", BlockBOPLeaves.paging.getVariantItem(tree));
            if (tree.hasSapling())
            {
                OreDictionary.registerOre("treeSapling", BlockBOPSapling.paging.getVariantItem(tree));
            }
        }
        // TODO: implement fruit trees
        // OreDictionary.registerOre("treeLeaves", new ItemStack(BOPCBlocks.appleLeaves, 1, OreDictionary.WILDCARD_VALUE));
        // OreDictionary.registerOre("treeLeaves", new ItemStack(BOPCBlocks.persimmonLeaves, 1, OreDictionary.WILDCARD_VALUE));
        
        for (BOPWoods wood : BOPWoods.values())
        {
            OreDictionary.registerOre("logWood", BlockBOPLog.paging.getVariantItem(wood));   
            if (wood.hasPlanks())
            {
                OreDictionary.registerOre("plankWood", BlockBOPPlanks.paging.getVariantItem(wood));
                OreDictionary.registerOre("slabWood", BlockBOPHalfWoodSlab.paging.getVariantItem(wood));
                OreDictionary.registerOre("stairWood", new ItemStack(BlockBOPWoodStairs.getBlock(wood)));
                OreDictionary.registerOre("fenceWood", new ItemStack(BlockBOPFence.getBlock(wood)));
                OreDictionary.registerOre("fenceGateWood", new ItemStack(BlockBOPFenceGate.getBlock(wood)));
            }
        }

    }
    
    
}
