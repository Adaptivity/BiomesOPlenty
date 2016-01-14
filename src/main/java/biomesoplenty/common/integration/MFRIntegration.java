package biomesoplenty.common.integration;

import biomesoplenty.api.content.BOPCBiomes;
import biomesoplenty.api.content.BOPCBlocks;
import biomesoplenty.api.content.BOPCItems;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import powercrystals.minefactoryreloaded.api.IFactoryFertilizable;
import powercrystals.minefactoryreloaded.api.IFactoryFruit;
import powercrystals.minefactoryreloaded.api.IFactoryHarvestable;
import powercrystals.minefactoryreloaded.api.IFactoryPlantable;
import powercrystals.minefactoryreloaded.api.ValuedItem;
import powercrystals.minefactoryreloaded.api.FactoryRegistry;
import powercrystals.minefactoryreloaded.api.HarvestType;
import com.google.common.base.Optional;

public class MFRIntegration
{
	protected static void init()
	{
		registerRubberTreeBiomes();
		registerFarmables();
		registerSludgeDrops();
	}

	private static void registerRubberTreeBiomes()
	{
		FactoryRegistry.sendMessage("registerRubberTreeBiome", BOPCBiomes.bayou.biomeName);
		FactoryRegistry.sendMessage("registerRubberTreeBiome", BOPCBiomes.bog.biomeName);
		FactoryRegistry.sendMessage("registerRubberTreeBiome", BOPCBiomes.borealForest.biomeName);
		FactoryRegistry.sendMessage("registerRubberTreeBiome", BOPCBiomes.deciduousForest.biomeName);
		FactoryRegistry.sendMessage("registerRubberTreeBiome", BOPCBiomes.grove.biomeName);
		FactoryRegistry.sendMessage("registerRubberTreeBiome", BOPCBiomes.lushSwamp.biomeName);
		FactoryRegistry.sendMessage("registerRubberTreeBiome", BOPCBiomes.mapleWoods.biomeName);
		FactoryRegistry.sendMessage("registerRubberTreeBiome", BOPCBiomes.rainforest.biomeName);
		FactoryRegistry.sendMessage("registerRubberTreeBiome", BOPCBiomes.seasonalForest.biomeName);
		FactoryRegistry.sendMessage("registerRubberTreeBiome", BOPCBiomes.shield.biomeName);
		FactoryRegistry.sendMessage("registerRubberTreeBiome", BOPCBiomes.temperateRainforest.biomeName);
		FactoryRegistry.sendMessage("registerRubberTreeBiome", BOPCBiomes.thicket.biomeName);
		FactoryRegistry.sendMessage("registerRubberTreeBiome", BOPCBiomes.tropicalRainforest.biomeName);
		FactoryRegistry.sendMessage("registerRubberTreeBiome", BOPCBiomes.woodland.biomeName);
	}

	private static void registerFarmables()
	{
		FactoryRegistry.sendMessage("registerHarvestable_Leaves", Block.blockRegistry.getNameForObject(BOPCBlocks.appleLeaves)); // have fruit blocks on it
		FactoryRegistry.sendMessage("registerHarvestable_Leaves", Block.blockRegistry.getNameForObject(BOPCBlocks.colorizedLeaves1));
		FactoryRegistry.sendMessage("registerHarvestable_Leaves", Block.blockRegistry.getNameForObject(BOPCBlocks.colorizedLeaves2));
		FactoryRegistry.sendMessage("registerHarvestable_Leaves", Block.blockRegistry.getNameForObject(BOPCBlocks.leaves1));
		FactoryRegistry.sendMessage("registerHarvestable_Leaves", Block.blockRegistry.getNameForObject(BOPCBlocks.persimmonLeaves)); // have fruit blocks on it
		FactoryRegistry.sendMessage("registerHarvestable_Leaves", Block.blockRegistry.getNameForObject(BOPCBlocks.leaves1));
		FactoryRegistry.sendMessage("registerHarvestable_Leaves", Block.blockRegistry.getNameForObject(BOPCBlocks.leaves2));
		FactoryRegistry.sendMessage("registerHarvestable_Leaves", Block.blockRegistry.getNameForObject(BOPCBlocks.leaves3));
		FactoryRegistry.sendMessage("registerHarvestable_Leaves", Block.blockRegistry.getNameForObject(BOPCBlocks.leaves4));

		FactoryRegistry.sendMessage("registerHarvestable_Log", Block.blockRegistry.getNameForObject(BOPCBlocks.logs1));
		FactoryRegistry.sendMessage("registerHarvestable_Log", Block.blockRegistry.getNameForObject(BOPCBlocks.logs2));
		FactoryRegistry.sendMessage("registerHarvestable_Log", Block.blockRegistry.getNameForObject(BOPCBlocks.logs3));
		FactoryRegistry.sendMessage("registerHarvestable_Log", Block.blockRegistry.getNameForObject(BOPCBlocks.logs4));
		FactoryRegistry.sendMessage("registerHarvestable_Log", Block.blockRegistry.getNameForObject(BOPCBlocks.bamboo));

		FactoryRegistry.sendMessage("registerHarvestable_Mushroom", Block.blockRegistry.getNameForObject(BOPCBlocks.mushrooms));
		FactoryRegistry.sendMessage("registerHarvestable_Standard", Block.blockRegistry.getNameForObject(BOPCBlocks.flowers));
		FactoryRegistry.sendMessage("registerHarvestable_Standard", Block.blockRegistry.getNameForObject(BOPCBlocks.flowers2));
		FactoryRegistry.sendMessage("registerHarvestable_Standard", Block.blockRegistry.getNameForObject(BOPCBlocks.plants));
		FactoryRegistry.sendMessage("registerHarvestable_Standard", Block.blockRegistry.getNameForObject(BOPCBlocks.foliage)); // meta 8 berry bush is right-clickable crop, use registerHarvestable_Crop somehow?
		FactoryRegistry.sendMessage("registerHarvestable_Vine", Block.blockRegistry.getNameForObject(BOPCBlocks.treeMoss));
		FactoryRegistry.sendMessage("registerHarvestable_Vine", Block.blockRegistry.getNameForObject(BOPCBlocks.flowerVine));
		FactoryRegistry.sendMessage("registerHarvestable_Vine", Block.blockRegistry.getNameForObject(BOPCBlocks.willow));
		FactoryRegistry.sendMessage("registerHarvestable_Vine", Block.blockRegistry.getNameForObject(BOPCBlocks.ivy));
		FactoryRegistry.sendMessage("registerHarvestable_Vine", Block.blockRegistry.getNameForObject(BOPCBlocks.wisteria));

		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setString("plant", Block.blockRegistry.getNameForObject(BOPCBlocks.saplings));
		FactoryRegistry.sendMessage("registerFertilizable_Standard", nbt);
		FactoryRegistry.sendMessage("registerPlantable_Sapling", nbt);
		nbt.setString("plant", Block.blockRegistry.getNameForObject(BOPCBlocks.colorizedSaplings));
		FactoryRegistry.sendMessage("registerFertilizable_Standard", nbt);
		FactoryRegistry.sendMessage("registerPlantable_Sapling", nbt);
    	
        /*/Optional[] bopLeaves = { Blocks.leaves1, Blocks.leaves2, Blocks.leaves3, Blocks.leaves4, Blocks.leavesColorized1, Blocks.leavesColorized2, Blocks.treeMoss, Blocks.willow, Blocks.ivy, Blocks.moss };
        Optional[] bopFruitLeaves = { Blocks.leavesFruit, Blocks.leavesFruit2 };
        Optional[] bopLogs = { Blocks.logs1, Blocks.logs2, Blocks.logs3, Blocks.logs4, Blocks.bamboo };
        Optional[] bopMiscStandardHarvestables = { Blocks.flowers, Blocks.plants, Blocks.foliage, Blocks.mushrooms };
        Optional[] bopSaplings = { Blocks.saplings, Blocks.colorizedSaplings };
        
        for(Optional<? extends Block> leaves : bopLeaves)
        {
            FactoryRegistry.registerHarvestable(new Harvestable(leaves.get().blockID, HarvestType.TreeLeaf));
        }
        
        for(Optional<? extends Block> log : bopLogs)
        {
            FactoryRegistry.registerHarvestable(new Harvestable(log.get().blockID, HarvestType.Tree));
        }
        
        for(Optional<? extends Block> harvestable : bopMiscStandardHarvestables)
        {
            FactoryRegistry.registerHarvestable(new Harvestable(harvestable.get().blockID, HarvestType.Normal));
        }
        
        for(Optional<? extends Block> sapling : bopSaplings)
        {
            FactoryRegistry.registerFertilizable(new Fertilizable(sapling.get().blockID));
            FactoryRegistry.registerPlantable(new Plantable(sapling.get().blockID));
        }
        
        for(Optional<? extends Block> leaves : bopFruitLeaves)
        {
            FactoryRegistry.registerHarvestable(new Harvestable(leaves.get().blockID, HarvestType.TreeLeaf));
            FactoryRegistry.registerFruit(new FruitLeaves(leaves.get().blockID));
        }/*/
	}

	private static void registerSludgeDrops()
	{
		FactoryRegistry.sendMessage("registerSludgeDrop", new ValuedItem(15, new ItemStack(BOPCBlocks.driedDirt)));
		FactoryRegistry.sendMessage("registerSludgeDrop", new ValuedItem(15, new ItemStack(BOPCBlocks.hardSand)));
		FactoryRegistry.sendMessage("registerSludgeDrop", new ValuedItem(15, new ItemStack(BOPCBlocks.hardDirt)));
		FactoryRegistry.sendMessage("registerSludgeDrop", new ValuedItem(15, new ItemStack(BOPCItems.misc, 4, 0)));
		FactoryRegistry.sendMessage("registerSludgeDrop", new ValuedItem(25, new ItemStack (BOPCItems.mudball, 4)));
	}
}
