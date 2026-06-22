package io.github.ah_lol96.template.ability.skill.intrinsic;

import io.github.ah_lol96.template.config.skill.TemplateIntrinsicSkillConfig;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.skill.Skill;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;

public class TemplateIntrinsicSkill extends Skill {
   public static final TemplateIntrinsicSkillConfig.TemplateIntrinsicSkill CONFIG;
   protected static final ResourceLocation TemplateIntrinsicSkill;

   public TemplateIntrinsicSkill() {
      super(SkillType.INTRINSIC);
   }

   public ResourceLocation getSkillIcon() {
      return ResourceLocation.fromNamespaceAndPath("tensura_template", "textures/skill/intrinsic/template_intrinsic_skill.png");
   }

   public int getMaxMastery() {
      return 1000;
   }

   public boolean canBeToggled(ManasSkillInstance instance, LivingEntity living) {
      return instance.getMastery() >= (double)0.0F;
   }

   public boolean canTick(ManasSkillInstance instance, LivingEntity entity) {
      return true;
   }

   public void onToggleOn(ManasSkillInstance instance, LivingEntity entity) {

   }

   public void onToggleOff(ManasSkillInstance instance, LivingEntity entity) {

   }

   public void onTick(ManasSkillInstance instance, LivingEntity entity) {
      if (instance.isToggled()) {
         this.gainMastery(instance, entity);
      }
   }

   private void gainMastery(ManasSkillInstance instance, LivingEntity entity) {
      CompoundTag tag = instance.getOrCreateTag();
      int time = tag.getInt("activatedTimes");
      if (time % BASE_CONFIG.Mastery.masteryActivateTime == 0) {
         instance.addMasteryPoint(entity);
      }

      tag.putInt("activatedTimes", time + 1);
   }

   static {
      CONFIG = ((TemplateIntrinsicSkillConfig)ConfigRegistry.getConfig(TemplateIntrinsicSkillConfig.class)).TemplateIntrinsicSkill;
      TemplateIntrinsicSkill = ResourceLocation.fromNamespaceAndPath("tensura_template", "template_intrinsic_skill");
   }
}
