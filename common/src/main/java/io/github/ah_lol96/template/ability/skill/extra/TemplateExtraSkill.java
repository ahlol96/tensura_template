package io.github.ah_lol96.template.ability.skill.extra;

import io.github.ah_lol96.template.config.skill.TemplateExtraSkillConfig;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.manascore.network.api.util.Changeable;
import io.github.manasmods.manascore.skill.api.ManasSkillInstance;
import io.github.manasmods.tensura.ability.skill.Skill;
import io.github.manasmods.tensura.damage.TensuraDamageHelper;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;

public class TemplateExtraSkill extends Skill {
   private static final TemplateExtraSkillConfig.TemplateExtraSkill CONFIG;

   public TemplateExtraSkill() {
      super(SkillType.EXTRA);
   }

   public ResourceLocation getSkillIcon() {
      return ResourceLocation.fromNamespaceAndPath("tensura_template", "textures/skill/extra/template_extra_skill.png");
   }

   public boolean canBeToggled(ManasSkillInstance instance, LivingEntity entity) {
      return instance.isMastered(entity);
   }

   public int getMaxMastery() {
      return 200;
   }

   public boolean onTouchEntity(ManasSkillInstance instance, LivingEntity attacker, LivingEntity target, DamageSource source, Changeable<Float> amount) {
      if (!this.isInSlot(attacker, instance) && !instance.isToggled()) {
         return true;
      } else if (source.getEntity() != attacker) {
         return true;
      } else if (!TensuraDamageHelper.isPhysicalAttack(source)) {
         return true;
      } else {
         CompoundTag tag = instance.getOrCreateTag();
         int time = tag.getInt("activatedTimes");
         if (time % BASE_CONFIG.Mastery.masteryActivateTime == 0) {
            instance.addMasteryPoint(attacker);
         }

         tag.putInt("activatedTimes", time + 1);
         return true;
      }
   }

   static {
      CONFIG = ((TemplateExtraSkillConfig)ConfigRegistry.getConfig(TemplateExtraSkillConfig.class)).TemplateExtraSkill;
   }
}
