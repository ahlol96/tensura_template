package io.github.ah_lol96.template.config;

import io.github.manasmods.manascore.config.api.ManasConfig;
import io.github.manasmods.manascore.config.api.ManasSubConfig;

public class TemplateGeneralConfig extends ManasConfig {
   public General General = new General();

   public TemplateGeneralConfig() {
   }

   public String getFileName() {
      return "tensura_template/general";
   }

   public static class General extends ManasSubConfig {
      public boolean refresh = true;

      public General() {
      }
   }
}
