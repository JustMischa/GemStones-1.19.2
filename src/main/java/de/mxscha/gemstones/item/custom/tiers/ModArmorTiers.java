package de.mxscha.gemstones.item.custom.tiers;

import de.mxscha.gemstones.GemStones;
import de.mxscha.gemstones.item.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.util.Lazy;

import java.util.function.Supplier;

public enum ModArmorTiers implements ArmorMaterial {

    TIN("tin", 13, new int[]{2, 5, 7, 2}, 12, SoundEvents.ARMOR_EQUIP_GOLD, 1F, 0.0F, () -> {return Ingredient.of(ModItems.TIN_INGOT.get());}),
    RUBY("ruby", 13, new int[]{4, 6, 8, 3}, 10, SoundEvents.ARMOR_EQUIP_GOLD, 2F, 0.0F, () -> {return Ingredient.of(ModItems.RUBY_GEM.get());}),
    SAPPHIRE("sapphire", 13, new int[]{4, 6, 8, 3}, 10, SoundEvents.ARMOR_EQUIP_GOLD, 2F, 0.0F, () -> {return Ingredient.of(ModItems.SAPPHIRE_GEM.get());}),
    CITRINE("citrine", 13, new int[]{4, 6, 8, 3}, 10, SoundEvents.ARMOR_EQUIP_GOLD, 2F, 0.0F, () -> {return Ingredient.of(ModItems.CITRINE_GEM.get());}),
    AMETHYST("amethyst", 13, new int[]{4, 7, 8, 3}, 10, SoundEvents.ARMOR_EQUIP_GOLD, 2F, 0.0F, () -> {return Ingredient.of(ModItems.AMETHYST_GEM.get());}),
    DIOPSIDE("diopside", 13, new int[]{4, 7, 8, 4}, 10, SoundEvents.ARMOR_EQUIP_GOLD, 2F, 0.0F, () -> {return Ingredient.of(ModItems.DIOPSIDE_GEM.get());}),
    JADE("jade", 13, new int[]{5, 8, 9, 5}, 10, SoundEvents.ARMOR_EQUIP_GOLD, 2F, 0.00F, () -> {return Ingredient.of(ModItems.JADE_GEM.get());}),
    CAERULA("caerula", 13, new int[]{5, 8, 10, 5}, 10, SoundEvents.ARMOR_EQUIP_GOLD, 2F, 0.05F, () -> {return Ingredient.of(ModItems.CAERULA_INGOT.get());}),
    ENDER("ender", 13, new int[]{6, 9, 10, 5}, 15, SoundEvents.ARMOR_EQUIP_GOLD, 2F, 0.1F, () -> {return Ingredient.of(ModItems.ENDER_INGOT.get());}),
    FUSION("fusion", 13, new int[]{6, 9, 10, 6}, 15, SoundEvents.ARMOR_EQUIP_GOLD, 3F, 0.1F, () -> {return Ingredient.of(ModItems.FUSION_INGOT.get());}),
    FUSION_NETHERITE("fusion_netherite", 13, new int[]{6, 10, 12, 6}, 15, SoundEvents.ARMOR_EQUIP_GOLD, 4F, 0.15F, () -> {return Ingredient.of(ModItems.FUSION_NETHERITE_INGOT.get());});

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredient;

    ModArmorTiers(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = Lazy.of(repairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return GemStones.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
