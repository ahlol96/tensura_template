package io.github.ah_lol96.template.fabric;

import io.github.ah_lol96.template.Template;
import net.fabricmc.api.ModInitializer;

public final class TemplateFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Template.init();
    }
}
