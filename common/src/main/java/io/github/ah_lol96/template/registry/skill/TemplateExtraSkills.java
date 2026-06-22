package io.github.ah_lol96.template.registry.skill;

import io.github.ah_lol96.template.ability.skill.extra.*;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.manasmods.manascore.skill.api.ManasSkill;
import io.github.manasmods.manascore.skill.impl.SkillRegistry;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

public class TemplateExtraSkills {
   public static final RegistrySupplier<TemplateExtraSkill> DEADLYPOISON = register("deadly_poison", TemplateExtraSkill::new);

   public TemplateExtraSkills() {
   }

   private static <E extends ManasSkill> RegistrySupplier<E> register(String name, Supplier<E> supplier) {
      return SkillRegistry.SKILLS.register(ResourceLocation.fromNamespaceAndPath("tensura_template", name), supplier);
   }

   public static void init() {
   }
}
