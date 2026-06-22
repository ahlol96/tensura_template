package io.github.ah_lol96.template.config.skill;

import io.github.manasmods.manascore.config.api.ManasConfig;
import io.github.manasmods.manascore.config.api.ManasSubConfig;

public class TemplateUniqueSkillConfig extends ManasConfig {
   public TemplateUniqueSkill TemplateUniqueSkill = new TemplateUniqueSkill();

   public TemplateUniqueSkillConfig() {
   }

   public String getFileName() {
      return "tensura_template/ability/unique_config";
   }

   public static class TemplateUniqueSkill extends ManasSubConfig {
      public double mpAcquirement = (double)25000.0F;
      public int maxMastery = 200;

      public TemplateUniqueSkill() {
      }
   }
}
