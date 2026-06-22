package io.github.ah_lol96.template.registry.skill;

import io.github.ah_lol96.template.ability.skill.unique.*;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.manasmods.manascore.skill.api.ManasSkill;
import io.github.manasmods.manascore.skill.impl.SkillRegistry;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

public class TemplateUniqueSkills {
   public static final RegistrySupplier<TemplateUniqueSkill> TEMPLATEUNIQUE = register("template_unique_skill", TemplateUniqueSkill::new);

   public TemplateUniqueSkills() {
   }

   private static <E extends ManasSkill> RegistrySupplier<E> register(String name, Supplier<E> supplier) {
      return SkillRegistry.SKILLS.register(ResourceLocation.fromNamespaceAndPath("tensura_template", name), supplier);
   }

   public static void init() {
   }
}
