package io.github.ah_lol96.template.config.skill;

import io.github.manasmods.manascore.config.api.ManasConfig;
import io.github.manasmods.manascore.config.api.ManasSubConfig;

public class TemplateIntrinsicSkillConfig extends ManasConfig {
   public TemplateIntrinsicSkill TemplateIntrinsicSkill = new TemplateIntrinsicSkill();

   public TemplateIntrinsicSkillConfig() {
   }

   public String getFileName() {
      return "tensura_template/ability/intrinsic_config";
   }

   public static class TemplateIntrinsicSkill extends ManasSubConfig {
      public TemplateIntrinsicSkill() {
      }
   }
}
