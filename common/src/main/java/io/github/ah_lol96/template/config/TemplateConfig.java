package io.github.ah_lol96.template.config;

import io.github.ah_lol96.template.config.skill.*;
import io.github.manasmods.manascore.config.ConfigRegistry;
import io.github.manasmods.tensura.config.ReincarnationConfig;

public class TemplateConfig {
   public TemplateConfig() {
   }

   public static void init() {
      ConfigRegistry.registerConfig(new TemplateIntrinsicSkillConfig());
      ConfigRegistry.registerConfig(new TemplateExtraSkillConfig());
      ConfigRegistry.registerConfig(new TemplateUniqueSkillConfig());
      ConfigRegistry.registerConfig(new TemplateGeneralConfig());
      ConfigRegistry.registerConfig(new ReincarnationConfig());
   }
}
