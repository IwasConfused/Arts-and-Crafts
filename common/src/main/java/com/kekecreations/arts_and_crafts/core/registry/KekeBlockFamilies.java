package com.kekecreations.arts_and_crafts.core.registry;

import com.google.common.collect.Maps;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.BlockFamily;
import net.minecraft.world.level.block.Block;

import java.util.Map;
import java.util.stream.Stream;

public class KekeBlockFamilies {

    private static final Map<Block, BlockFamily> BASE_BLOCKS_TO_FAMILIES = Maps.newHashMap();


    //TERRACOTTA SHINGLES FAMILY
    public static final BlockFamily TERRACOTTA_SHINGLES = KekeBlockFamilies.register(KekeBlocks.TERRACOTTA_SHINGLES.get()).slab(KekeBlocks.TERRACOTTA_SHINGLE_SLAB.get()).wall(KekeBlocks.TERRACOTTA_SHINGLE_WALL.get()).stairs(KekeBlocks.TERRACOTTA_SHINGLE_STAIRS.get()).getFamily();
    public static final BlockFamily BLACK_TERRACOTTA_SHINGLES = KekeBlockFamilies.register(KekeBlocks.BLACK_TERRACOTTA_SHINGLES.get()).slab(KekeBlocks.BLACK_TERRACOTTA_SHINGLE_SLAB.get()).wall(KekeBlocks.BLACK_TERRACOTTA_SHINGLE_WALL.get()).stairs(KekeBlocks.BLACK_TERRACOTTA_SHINGLE_STAIRS.get()).getFamily();
    public static final BlockFamily BLUE_TERRACOTTA_SHINGLES = KekeBlockFamilies.register(KekeBlocks.BLUE_TERRACOTTA_SHINGLES.get()).slab(KekeBlocks.BLUE_TERRACOTTA_SHINGLE_SLAB.get()).wall(KekeBlocks.BLUE_TERRACOTTA_SHINGLE_WALL.get()).stairs(KekeBlocks.BLUE_TERRACOTTA_SHINGLE_STAIRS.get()).getFamily();
    public static final BlockFamily BROWN_TERRACOTTA_SHINGLES = KekeBlockFamilies.register(KekeBlocks.BROWN_TERRACOTTA_SHINGLES.get()).slab(KekeBlocks.BROWN_TERRACOTTA_SHINGLE_SLAB.get()).wall(KekeBlocks.BROWN_TERRACOTTA_SHINGLE_WALL.get()).stairs(KekeBlocks.BROWN_TERRACOTTA_SHINGLE_STAIRS.get()).getFamily();
    public static final BlockFamily CYAN_TERRACOTTA_SHINGLES = KekeBlockFamilies.register(KekeBlocks.CYAN_TERRACOTTA_SHINGLES.get()).slab(KekeBlocks.CYAN_TERRACOTTA_SHINGLE_SLAB.get()).wall(KekeBlocks.CYAN_TERRACOTTA_SHINGLE_WALL.get()).stairs(KekeBlocks.CYAN_TERRACOTTA_SHINGLE_STAIRS.get()).getFamily();
    public static final BlockFamily GRAY_TERRACOTTA_SHINGLES = KekeBlockFamilies.register(KekeBlocks.GRAY_TERRACOTTA_SHINGLES.get()).slab(KekeBlocks.GRAY_TERRACOTTA_SHINGLE_SLAB.get()).wall(KekeBlocks.GRAY_TERRACOTTA_SHINGLE_WALL.get()).stairs(KekeBlocks.GRAY_TERRACOTTA_SHINGLE_STAIRS.get()).getFamily();
    public static final BlockFamily GREEN_TERRACOTTA_SHINGLES = KekeBlockFamilies.register(KekeBlocks.GREEN_TERRACOTTA_SHINGLES.get()).slab(KekeBlocks.GREEN_TERRACOTTA_SHINGLE_SLAB.get()).wall(KekeBlocks.GREEN_TERRACOTTA_SHINGLE_WALL.get()).stairs(KekeBlocks.GREEN_TERRACOTTA_SHINGLE_STAIRS.get()).getFamily();
    public static final BlockFamily LIGHT_BLUE_TERRACOTTA_SHINGLES = KekeBlockFamilies.register(KekeBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLES.get()).slab(KekeBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLE_SLAB.get()).wall(KekeBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLE_WALL.get()).stairs(KekeBlocks.LIGHT_BLUE_TERRACOTTA_SHINGLE_STAIRS.get()).getFamily();
    public static final BlockFamily LIGHT_GRAY_TERRACOTTA_SHINGLES = KekeBlockFamilies.register(KekeBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLES.get()).slab(KekeBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLE_SLAB.get()).wall(KekeBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLE_WALL.get()).stairs(KekeBlocks.LIGHT_GRAY_TERRACOTTA_SHINGLE_STAIRS.get()).getFamily();
    public static final BlockFamily LIME_TERRACOTTA_SHINGLES = KekeBlockFamilies.register(KekeBlocks.LIME_TERRACOTTA_SHINGLES.get()).slab(KekeBlocks.LIME_TERRACOTTA_SHINGLE_SLAB.get()).wall(KekeBlocks.LIME_TERRACOTTA_SHINGLE_WALL.get()).stairs(KekeBlocks.LIME_TERRACOTTA_SHINGLE_STAIRS.get()).getFamily();
    public static final BlockFamily MAGENTA_TERRACOTTA_SHINGLES = KekeBlockFamilies.register(KekeBlocks.MAGENTA_TERRACOTTA_SHINGLES.get()).slab(KekeBlocks.MAGENTA_TERRACOTTA_SHINGLE_SLAB.get()).wall(KekeBlocks.MAGENTA_TERRACOTTA_SHINGLE_WALL.get()).stairs(KekeBlocks.MAGENTA_TERRACOTTA_SHINGLE_STAIRS.get()).getFamily();
    public static final BlockFamily ORANGE_TERRACOTTA_SHINGLES = KekeBlockFamilies.register(KekeBlocks.ORANGE_TERRACOTTA_SHINGLES.get()).slab(KekeBlocks.ORANGE_TERRACOTTA_SHINGLE_SLAB.get()).wall(KekeBlocks.ORANGE_TERRACOTTA_SHINGLE_WALL.get()).stairs(KekeBlocks.ORANGE_TERRACOTTA_SHINGLE_STAIRS.get()).getFamily();
    public static final BlockFamily PINK_TERRACOTTA_SHINGLES = KekeBlockFamilies.register(KekeBlocks.PINK_TERRACOTTA_SHINGLES.get()).slab(KekeBlocks.PINK_TERRACOTTA_SHINGLE_SLAB.get()).wall(KekeBlocks.PINK_TERRACOTTA_SHINGLE_WALL.get()).stairs(KekeBlocks.PINK_TERRACOTTA_SHINGLE_STAIRS.get()).getFamily();
    public static final BlockFamily PURPLE_TERRACOTTA_SHINGLES = KekeBlockFamilies.register(KekeBlocks.PURPLE_TERRACOTTA_SHINGLES.get()).slab(KekeBlocks.PURPLE_TERRACOTTA_SHINGLE_SLAB.get()).wall(KekeBlocks.PURPLE_TERRACOTTA_SHINGLE_WALL.get()).stairs(KekeBlocks.PURPLE_TERRACOTTA_SHINGLE_STAIRS.get()).getFamily();
    public static final BlockFamily RED_TERRACOTTA_SHINGLES = KekeBlockFamilies.register(KekeBlocks.RED_TERRACOTTA_SHINGLES.get()).slab(KekeBlocks.RED_TERRACOTTA_SHINGLE_SLAB.get()).wall(KekeBlocks.RED_TERRACOTTA_SHINGLE_WALL.get()).stairs(KekeBlocks.RED_TERRACOTTA_SHINGLE_STAIRS.get()).getFamily();
    public static final BlockFamily WHITE_TERRACOTTA_SHINGLES = KekeBlockFamilies.register(KekeBlocks.WHITE_TERRACOTTA_SHINGLES.get()).slab(KekeBlocks.WHITE_TERRACOTTA_SHINGLE_SLAB.get()).wall(KekeBlocks.WHITE_TERRACOTTA_SHINGLE_WALL.get()).stairs(KekeBlocks.WHITE_TERRACOTTA_SHINGLE_STAIRS.get()).getFamily();
    public static final BlockFamily YELLOW_TERRACOTTA_SHINGLES = KekeBlockFamilies.register(KekeBlocks.YELLOW_TERRACOTTA_SHINGLES.get()).slab(KekeBlocks.YELLOW_TERRACOTTA_SHINGLE_SLAB.get()).wall(KekeBlocks.YELLOW_TERRACOTTA_SHINGLE_WALL.get()).stairs(KekeBlocks.YELLOW_TERRACOTTA_SHINGLE_STAIRS.get()).getFamily();


    //CHALK FAMILY
    public static final BlockFamily BLACK_CHALK = KekeBlockFamilies.register(KekeBlocks.BLACK_CHALK.get()).slab(KekeBlocks.BLACK_CHALK_SLAB.get()).wall(KekeBlocks.BLACK_CHALK_WALL.get()).stairs(KekeBlocks.BLACK_CHALK_STAIRS.get()).getFamily();
    public static final BlockFamily BLUE_CHALK = KekeBlockFamilies.register(KekeBlocks.BLUE_CHALK.get()).slab(KekeBlocks.BLUE_CHALK_SLAB.get()).wall(KekeBlocks.BLUE_CHALK_WALL.get()).stairs(KekeBlocks.BLUE_CHALK_STAIRS.get()).getFamily();
    public static final BlockFamily BROWN_CHALK = KekeBlockFamilies.register(KekeBlocks.BROWN_CHALK.get()).slab(KekeBlocks.BROWN_CHALK_SLAB.get()).wall(KekeBlocks.BROWN_CHALK_WALL.get()).stairs(KekeBlocks.BROWN_CHALK_STAIRS.get()).getFamily();
    public static final BlockFamily CYAN_CHALK = KekeBlockFamilies.register(KekeBlocks.CYAN_CHALK.get()).slab(KekeBlocks.CYAN_CHALK_SLAB.get()).wall(KekeBlocks.CYAN_CHALK_WALL.get()).stairs(KekeBlocks.CYAN_CHALK_STAIRS.get()).getFamily();
    public static final BlockFamily GRAY_CHALK = KekeBlockFamilies.register(KekeBlocks.GRAY_CHALK.get()).slab(KekeBlocks.GRAY_CHALK_SLAB.get()).wall(KekeBlocks.GRAY_CHALK_WALL.get()).stairs(KekeBlocks.GRAY_CHALK_STAIRS.get()).getFamily();
    public static final BlockFamily GREEN_CHALK = KekeBlockFamilies.register(KekeBlocks.GREEN_CHALK.get()).slab(KekeBlocks.GREEN_CHALK_SLAB.get()).wall(KekeBlocks.GREEN_CHALK_WALL.get()).stairs(KekeBlocks.GREEN_CHALK_STAIRS.get()).getFamily();
    public static final BlockFamily LIGHT_BLUE_CHALK = KekeBlockFamilies.register(KekeBlocks.LIGHT_BLUE_CHALK.get()).slab(KekeBlocks.LIGHT_BLUE_CHALK_SLAB.get()).wall(KekeBlocks.LIGHT_BLUE_CHALK_WALL.get()).stairs(KekeBlocks.LIGHT_BLUE_CHALK_STAIRS.get()).getFamily();
    public static final BlockFamily LIGHT_GRAY_CHALK = KekeBlockFamilies.register(KekeBlocks.LIGHT_GRAY_CHALK.get()).slab(KekeBlocks.LIGHT_GRAY_CHALK_SLAB.get()).wall(KekeBlocks.LIGHT_GRAY_CHALK_WALL.get()).stairs(KekeBlocks.LIGHT_GRAY_CHALK_STAIRS.get()).getFamily();
    public static final BlockFamily LIME_CHALK = KekeBlockFamilies.register(KekeBlocks.LIME_CHALK.get()).slab(KekeBlocks.LIME_CHALK_SLAB.get()).wall(KekeBlocks.LIME_CHALK_WALL.get()).stairs(KekeBlocks.LIME_CHALK_STAIRS.get()).getFamily();
    public static final BlockFamily MAGENTA_CHALK = KekeBlockFamilies.register(KekeBlocks.MAGENTA_CHALK.get()).slab(KekeBlocks.MAGENTA_CHALK_SLAB.get()).wall(KekeBlocks.MAGENTA_CHALK_WALL.get()).stairs(KekeBlocks.MAGENTA_CHALK_STAIRS.get()).getFamily();
    public static final BlockFamily ORANGE_CHALK = KekeBlockFamilies.register(KekeBlocks.ORANGE_CHALK.get()).slab(KekeBlocks.ORANGE_CHALK_SLAB.get()).wall(KekeBlocks.ORANGE_CHALK_WALL.get()).stairs(KekeBlocks.ORANGE_CHALK_STAIRS.get()).getFamily();
    public static final BlockFamily PINK_CHALK = KekeBlockFamilies.register(KekeBlocks.PINK_CHALK.get()).slab(KekeBlocks.PINK_CHALK_SLAB.get()).wall(KekeBlocks.PINK_CHALK_WALL.get()).stairs(KekeBlocks.PINK_CHALK_STAIRS.get()).getFamily();
    public static final BlockFamily PURPLE_CHALK = KekeBlockFamilies.register(KekeBlocks.PURPLE_CHALK.get()).slab(KekeBlocks.PURPLE_CHALK_SLAB.get()).wall(KekeBlocks.PURPLE_CHALK_WALL.get()).stairs(KekeBlocks.PURPLE_CHALK_STAIRS.get()).getFamily();
    public static final BlockFamily RED_CHALK = KekeBlockFamilies.register(KekeBlocks.RED_CHALK.get()).slab(KekeBlocks.RED_CHALK_SLAB.get()).wall(KekeBlocks.RED_CHALK_WALL.get()).stairs(KekeBlocks.RED_CHALK_STAIRS.get()).getFamily();
    public static final BlockFamily WHITE_CHALK = KekeBlockFamilies.register(KekeBlocks.WHITE_CHALK.get()).slab(KekeBlocks.WHITE_CHALK_SLAB.get()).wall(KekeBlocks.WHITE_CHALK_WALL.get()).stairs(KekeBlocks.WHITE_CHALK_STAIRS.get()).getFamily();
    public static final BlockFamily YELLOW_CHALK = KekeBlockFamilies.register(KekeBlocks.YELLOW_CHALK.get()).slab(KekeBlocks.YELLOW_CHALK_SLAB.get()).wall(KekeBlocks.YELLOW_CHALK_WALL.get()).stairs(KekeBlocks.YELLOW_CHALK_STAIRS.get()).getFamily();



    public static BlockFamily.Builder register(Block baseBlock) {
        BlockFamily.Builder builder = new BlockFamily.Builder(baseBlock);
        BlockFamily blockFamily = BASE_BLOCKS_TO_FAMILIES.put(baseBlock, builder.getFamily());
        if (blockFamily != null) {
            throw new IllegalStateException("Duplicate family definition for " + BuiltInRegistries.BLOCK.getKey(baseBlock));
        }
        return builder;
    }

    public static Stream<BlockFamily> getFamilies() {
        return BASE_BLOCKS_TO_FAMILIES.values().stream();
    }
}
