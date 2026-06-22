package io.github.ah_lol96.template.registry;

import io.github.ah_lol96.template.registry.skill.*;

public class TemplateRegistry {
   public TemplateRegistry() {
   }

   public static void init() {
      TemplateCommonSkills.init();
      TemplateExtraSkills.init();
      TemplateIntrinsicSkills.init();
      TemplateResistanceSkills.init();
      TemplateUniqueSkills.init();
   }
}
