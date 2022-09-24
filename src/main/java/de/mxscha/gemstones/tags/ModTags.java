package de.mxscha.gemstones.tags;

import de.mxscha.gemstones.GemStones;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_TIN_TOOL = tag("needs_tin_tool");
        public static final TagKey<Block> NEEDS_AT_LEAST_SAPPHIRE_TOOL = tag("needs_sapphire_tool");
        public static final TagKey<Block> PAXEL_MINEABLE = tag("paxel_mineable");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(GemStones.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
