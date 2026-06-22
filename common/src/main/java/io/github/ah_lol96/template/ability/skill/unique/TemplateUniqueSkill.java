package io.github.ah_lol96.template.ability.skill.unique;

import io.github.ah_lol96.template.config.skill.TemplateUniqueSkillConfig;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.network.api.util.Changeable;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.skill.Skill;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;

public class TemplateUniqueSkill extends Skill {
   public static final TemplateUniqueSkillConfig.TemplateUniqueSkill CONFIG;

   public TemplateUniqueSkill() {
      super(SkillType.UNIQUE);
   }

   public ResourceLocation getSkillIcon() {
      return ResourceLocation.fromNamespaceAndPath("tensura_template", "textures/skill/unique/template_unique_skill.png");
   }

   public int getMaxMastery() {
      return CONFIG.maxMastery;
   }

   public double getDefaultAcquiringMagiculeCost() {
      return CONFIG.mpAcquirement;
   }

   public boolean canBeToggled(ManasSkillInstance instance, LivingEntity entity) {
      return instance.isMastered(entity);
   }

   public boolean canTick(ManasSkillInstance instance, LivingEntity entity) {
      return instance.isToggled() || this.isInSlot(entity, instance);
   }

   public boolean onTakenDamage(ManasSkillInstance instance, LivingEntity livingEntity, DamageSource source, Changeable<Float> amount) {
      return false;
   }

   public void onTick(ManasSkillInstance instance, LivingEntity entity) {
      CompoundTag tag = instance.getOrCreateTag();
      int level = instance.isMastered(entity) ? 1 : 0;
      if (level == 0) {
         int time = tag.getInt("activatedTimes");
         if (time % BASE_CONFIG.Mastery.masteryActivateTime == 0) {
            instance.addMasteryPoint(entity);
         }

         tag.putInt("activatedTimes", time + 1);
      }

   }

   static {
      CONFIG = ((TemplateUniqueSkillConfig)ConfigRegistry.getConfig(TemplateUniqueSkillConfig.class)).TemplateUniqueSkill;
   }
}
