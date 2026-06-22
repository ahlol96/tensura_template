package io.github.ah_lol96.template;

import io.github.ah_lol96.template.config.TemplateConfig;
import io.github.ah_lol96.template.registry.TemplateRegistry;
import io.github.manasmods.manascore.config.ConfigRegistry;

public final class Template {
    public static final String MOD_ID = "tensura_template"; //TODO replace tensura_template with your mod id

    public static void init() {
        TemplateConfig.init();
        TemplateRegistry.init();
    }

    public static void postInit() {
        ConfigRegistry.saveAllConfigs();
    }
}
