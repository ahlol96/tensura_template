package io.github.ah_lol96.template.config.skill;

import io.github.manasmods.manascore.config.api.ManasConfig;
import io.github.manasmods.manascore.config.api.ManasSubConfig;

public class TemplateExtraSkillConfig extends ManasConfig {
   public TemplateExtraSkill TemplateExtraSkill = new TemplateExtraSkill();

   public TemplateExtraSkillConfig() {
   }

   public String getFileName() {
      return "tensura_template/ability/extra_config";
   }

   public static class TemplateExtraSkill extends ManasSubConfig {
      public TemplateExtraSkill() {
      }
   }
}
