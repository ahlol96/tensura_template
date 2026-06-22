package io.github.ah_lol96.template.config.race;

import io.github.manasmods.manascore.config.api.Comment;
import io.github.manasmods.manascore.config.api.ManasConfig;
import io.github.manasmods.tensura.config.race.RaceConfig;

public class OgreConfig extends ManasConfig {
   public OgreShaman OgreShaman = new OgreShaman();
   public HighOgre HighOgre = new HighOgre();
   public OgreGeneral OgreGeneral = new OgreGeneral();
   public OgreKing OgreKing = new OgreKing();
   public WrathOni WrathOni = new WrathOni();

   public OgreConfig() {
   }

   public String getFileName() {
      return "tensura_template/race/ogre_config";
   }

   public static class OgreShaman extends RaceConfig.Default {
      @Comment("EP requirement to evolve into an Ogre Shaman.")
      public double epRequirement = (double)15000.0F;
      @Comment("The number of Essences consumed to evolve into an Ogre Shaman.")
      public int essenceRequirement = 10;
      @Comment("Minimal aura.")
      public double minAura = (double)9000.0F;
      @Comment("Maximum aura.")
      public double maxAura = (double)9000.0F;
      @Comment("Minimal magicule.")
      public double minMagicule = (double)6000.0F;
      @Comment("Maximum magicule.")
      public double maxMagicule = (double)6000.0F;
      @Comment("Bonus Size.")
      public double size = (double)0.25F;
      @Comment("Bonus Max Health.")
      public double maxHealth = (double)20.0F;
      @Comment("Bonus Max Spiritual Health.")
      public double maxSpiritualHealth = (double)150.0F;
      @Comment("Bonus Attack Damage.")
      public double attack = (double)5.0F;
      @Comment("Bonus Attack Speed.")
      public double attackSpeed = (double)1.0F;
      @Comment("Bonus Knockback Resistance.")
      public double knockbackResistance = 0.1;
      @Comment("Bonus Movement Speed.")
      public double movementSpeed = 0.12;
      @Comment("Bonus Swimming Speed Multiplier.")
      public double swimSpeed = (double)0.0F;

      public OgreShaman() {
      }

      public double getMinAura() {
         return this.minAura;
      }

      public double getMaxAura() {
         return this.maxAura;
      }

      public double getMinMagicule() {
         return this.minMagicule;
      }

      public double getMaxMagicule() {
         return this.maxMagicule;
      }

      public double getSize() {
         return this.size;
      }

      public double getMaxHealth() {
         return this.maxHealth;
      }

      public double getMaxSpiritualHealth() {
         return this.maxSpiritualHealth;
      }

      public double getAttack() {
         return this.attack;
      }

      public double getAttackSpeed() {
         return this.attackSpeed;
      }

      public double getKnockbackResistance() {
         return this.knockbackResistance;
      }

      public double getMovementSpeed() {
         return this.movementSpeed;
      }

      public double getSwimSpeed() {
         return this.swimSpeed;
      }
   }

   public static class HighOgre extends RaceConfig.Default {
      @Comment("EP requirement to evolve into a High Ogre.")
      public double epRequirement = (double)60000.0F;
      @Comment("Minimal aura.")
      public double minAura = (double)30000.0F;
      @Comment("Maximum aura.")
      public double maxAura = (double)30000.0F;
      @Comment("Minimal magicule.")
      public double minMagicule = (double)30000.0F;
      @Comment("Maximum magicule.")
      public double maxMagicule = (double)30000.0F;
      @Comment("Bonus Size.")
      public double size = (double)0.5F;
      @Comment("Bonus Max Health.")
      public double maxHealth = (double)140.0F;
      @Comment("Bonus Max Spiritual Health.")
      public double maxSpiritualHealth = (double)460.0F;
      @Comment("Bonus Attack Damage.")
      public double attack = (double)5.5F;
      @Comment("Bonus Attack Speed.")
      public double attackSpeed = (double)1.5F;
      @Comment("Bonus Knockback Resistance.")
      public double knockbackResistance = 0.3;
      @Comment("Bonus Movement Speed.")
      public double movementSpeed = 0.3;
      @Comment("Bonus Swimming Speed Multiplier.")
      public double swimSpeed = 1.1;

      public HighOgre() {
      }

      public double getMinAura() {
         return this.minAura;
      }

      public double getMaxAura() {
         return this.maxAura;
      }

      public double getMinMagicule() {
         return this.minMagicule;
      }

      public double getMaxMagicule() {
         return this.maxMagicule;
      }

      public double getSize() {
         return this.size;
      }

      public double getMaxHealth() {
         return this.maxHealth;
      }

      public double getMaxSpiritualHealth() {
         return this.maxSpiritualHealth;
      }

      public double getAttack() {
         return this.attack;
      }

      public double getAttackSpeed() {
         return this.attackSpeed;
      }

      public double getKnockbackResistance() {
         return this.knockbackResistance;
      }

      public double getMovementSpeed() {
         return this.movementSpeed;
      }

      public double getSwimSpeed() {
         return this.swimSpeed;
      }
   }

   public static class OgreGeneral extends RaceConfig.Default {
      @Comment("EP requirement to evolve into an Ogre General.")
      public double epRequirement = (double)150000.0F;
      @Comment("Minimal aura.")
      public double minAura = (double)50000.0F;
      @Comment("Maximum aura.")
      public double maxAura = (double)50000.0F;
      @Comment("Minimal magicule.")
      public double minMagicule = (double)100000.0F;
      @Comment("Maximum magicule.")
      public double maxMagicule = (double)100000.0F;
      @Comment("Bonus Size.")
      public double size = (double)0.5F;
      @Comment("Bonus Max Health.")
      public double maxHealth = (double)180.0F;
      @Comment("Bonus Max Spiritual Health.")
      public double maxSpiritualHealth = (double)580.0F;
      @Comment("Bonus Attack Damage.")
      public double attack = 6.3;
      @Comment("Bonus Attack Speed.")
      public double attackSpeed = 2.3;
      @Comment("Bonus Knockback Resistance.")
      public double knockbackResistance = 0.4;
      @Comment("Bonus Movement Speed.")
      public double movementSpeed = 0.35;
      @Comment("Bonus Swimming Speed Multiplier.")
      public double swimSpeed = 1.3;

      public OgreGeneral() {
      }

      public double getMinAura() {
         return this.minAura;
      }

      public double getMaxAura() {
         return this.maxAura;
      }

      public double getMinMagicule() {
         return this.minMagicule;
      }

      public double getMaxMagicule() {
         return this.maxMagicule;
      }

      public double getSize() {
         return this.size;
      }

      public double getMaxHealth() {
         return this.maxHealth;
      }

      public double getMaxSpiritualHealth() {
         return this.maxSpiritualHealth;
      }

      public double getAttack() {
         return this.attack;
      }

      public double getAttackSpeed() {
         return this.attackSpeed;
      }

      public double getKnockbackResistance() {
         return this.knockbackResistance;
      }

      public double getMovementSpeed() {
         return this.movementSpeed;
      }

      public double getSwimSpeed() {
         return this.swimSpeed;
      }
   }

   public static class OgreKing extends RaceConfig.Default {
      @Comment("EP requirement to evolve into an Ogre King.")
      public double epRequirement = (double)600000.0F;
      @Comment("Minimal aura.")
      public double minAura = (double)100000.0F;
      @Comment("Maximum aura.")
      public double maxAura = (double)100000.0F;
      @Comment("Minimal magicule.")
      public double minMagicule = (double)500000.0F;
      @Comment("Maximum magicule.")
      public double maxMagicule = (double)500000.0F;
      @Comment("Bonus Size.")
      public double size = (double)0.5F;
      @Comment("Bonus Max Health.")
      public double maxHealth = (double)580.0F;
      @Comment("Bonus Max Spiritual Health.")
      public double maxSpiritualHealth = (double)3430.0F;
      @Comment("Bonus Attack Damage.")
      public double attack = (double)5.5F;
      @Comment("Bonus Attack Speed.")
      public double attackSpeed = (double)2.5F;
      @Comment("Bonus Knockback Resistance.")
      public double knockbackResistance = 0.45;
      @Comment("Bonus Movement Speed.")
      public double movementSpeed = 0.4;
      @Comment("Bonus Swimming Speed Multiplier.")
      public double swimSpeed = (double)2.0F;

      public OgreKing() {
      }

      public double getMinAura() {
         return this.minAura;
      }

      public double getMaxAura() {
         return this.maxAura;
      }

      public double getMinMagicule() {
         return this.minMagicule;
      }

      public double getMaxMagicule() {
         return this.maxMagicule;
      }

      public double getSize() {
         return this.size;
      }

      public double getMaxHealth() {
         return this.maxHealth;
      }

      public double getMaxSpiritualHealth() {
         return this.maxSpiritualHealth;
      }

      public double getAttack() {
         return this.attack;
      }

      public double getAttackSpeed() {
         return this.attackSpeed;
      }

      public double getKnockbackResistance() {
         return this.knockbackResistance;
      }

      public double getMovementSpeed() {
         return this.movementSpeed;
      }

      public double getSwimSpeed() {
         return this.swimSpeed;
      }
   }

   public static class WrathOni extends RaceConfig.Default {
      @Comment("EP requirement to evolve into a Wrath Oni.")
      public double epRequirement = (double)3800000.0F;
      @Comment("Minimal aura.")
      public double minAura = (double)1000000.0F;
      @Comment("Maximum aura.")
      public double maxAura = (double)1000000.0F;
      @Comment("Minimal magicule.")
      public double minMagicule = (double)2800000.0F;
      @Comment("Maximum magicule.")
      public double maxMagicule = (double)2800000.0F;
      @Comment("Bonus Size.")
      public double size = (double)0.0F;
      @Comment("Bonus Max Health.")
      public double maxHealth = (double)1480.0F;
      @Comment("Bonus Max Spiritual Health.")
      public double maxSpiritualHealth = (double)6130.0F;
      @Comment("Bonus Attack Damage.")
      public double attack = (double)7.0F;
      @Comment("Bonus Attack Speed.")
      public double attackSpeed = (double)3.0F;
      @Comment("Bonus Knockback Resistance.")
      public double knockbackResistance = (double)0.5F;
      @Comment("Bonus Movement Speed.")
      public double movementSpeed = 0.45;
      @Comment("Bonus Swimming Speed Multiplier.")
      public double swimSpeed = (double)2.5F;

      public WrathOni() {
      }

      public double getMinAura() {
         return this.minAura;
      }

      public double getMaxAura() {
         return this.maxAura;
      }

      public double getMinMagicule() {
         return this.minMagicule;
      }

      public double getMaxMagicule() {
         return this.maxMagicule;
      }

      public double getSize() {
         return this.size;
      }

      public double getMaxHealth() {
         return this.maxHealth;
      }

      public double getMaxSpiritualHealth() {
         return this.maxSpiritualHealth;
      }

      public double getAttack() {
         return this.attack;
      }

      public double getAttackSpeed() {
         return this.attackSpeed;
      }

      public double getKnockbackResistance() {
         return this.knockbackResistance;
      }

      public double getMovementSpeed() {
         return this.movementSpeed;
      }

      public double getSwimSpeed() {
         return this.swimSpeed;
      }
   }
}
