package io.github.ah_lol96.template.config.race;

import io.github.manasmods.manascore.config.api.Comment;
import io.github.manasmods.manascore.config.api.ManasConfig;
import io.github.manasmods.tensura.config.race.RaceConfig;

public class TaratectConfig extends ManasConfig {
   public SmallLesserTaratect SmallLesserTaratect = new SmallLesserTaratect();
   public Orthocadinaht Orthocadinaht = new Orthocadinaht();
   public SmallPoisonTaratect SmallPoisonTaratect = new SmallPoisonTaratect();
   public ZoaEle ZoaEle = new ZoaEle();
   public EdeSaine EdeSaine = new EdeSaine();
   public ZanaHorowa ZanaHorowa = new ZanaHorowa();
   public Arachne Arachne = new Arachne();
   public SmallTaratect SmallTaratect = new SmallTaratect();
   public Taratect Taratect = new Taratect();
   public GreatTaratect GreatTaratect = new GreatTaratect();
   public GreaterTaratect GreaterTaratect = new GreaterTaratect();
   public ArchTaratect ArchTaratect = new ArchTaratect();
   public QueenTaratect QueenTaratect = new QueenTaratect();
   public LesserTaratect LesserTaratect = new LesserTaratect();
   public LesserPoisonTaratect LesserPoisonTaratect = new LesserPoisonTaratect();
   public PoisonTaratect PoisonTaratect = new PoisonTaratect();
   public GreatPoisonTaratect GreatPoisonTaratect = new GreatPoisonTaratect();

   public TaratectConfig() {
   }

   public String getFileName() {
      return "tensura_template/race/taratect_config";
   }

   public static class SmallLesserTaratect extends RaceConfig.Default {
      @Comment("Minimal aura.")
      public double minAura = (double)500.0F;
      @Comment("Maximum aura.")
      public double maxAura = (double)1000.0F;
      @Comment("Minimal magicule.")
      public double minMagicule = (double)100.0F;
      @Comment("Maximum magicule.")
      public double maxMagicule = (double)250.0F;
      @Comment("Bonus Size.")
      public double size = -0.37;
      @Comment("Bonus Max Health.")
      public double maxHealth = (double)-12.0F;
      @Comment("Bonus Max Spiritual Health.")
      public double maxSpiritualHealth = (double)-48.0F;
      @Comment("Bonus Attack Damage.")
      public double attack = -0.7;
      @Comment("Bonus Attack Speed.")
      public double attackSpeed = -0.9;
      @Comment("Bonus Knockback Resistance.")
      public double knockbackResistance = -0.15;
      @Comment("Bonus Movement Speed.")
      public double movementSpeed = 0.07;
      @Comment("Bonus Swimming Speed Multiplier.")
      public double swimSpeed = -0.07;
      @Comment("Shadow Size.")
      public double shadowSize = 0.7;
      @Comment("Eye Height.")
      public double eyeHeight = 0.67;
      @Comment("Hitbox width multiplier.")
      public float width = 1.5F;
      @Comment("Hitbox height multiplier.")
      public float height = 0.48F;
      @Comment("Model Y offset")
      public double yOffset = (double)0.0F;

      public SmallLesserTaratect() {
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

      public double getShadowSize() {
         return this.shadowSize;
      }

      public double getEyeHeight() {
         return this.eyeHeight;
      }

      public float getWidth() {
         return this.width;
      }

      public float getHeight() {
         return this.height;
      }

      public double getYOffset() {
         return this.yOffset;
      }
   }

   public static class Orthocadinaht extends RaceConfig.Default {
      @Comment("EP requirement to evolve into a Orthocadinaht.")
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
      public double maxHealth = (double)820.0F;
      @Comment("Bonus Max Spiritual Health.")
      public double maxSpiritualHealth = (double)6140.0F;
      @Comment("Bonus Attack Damage.")
      public double attack = (double)4.0F;
      @Comment("Bonus Attack Speed.")
      public double attackSpeed = (double)0.5F;
      @Comment("Bonus Knockback Resistance.")
      public double knockbackResistance = -0.3;
      @Comment("Bonus Movement Speed.")
      public double movementSpeed = 0.17;
      @Comment("Bonus Swimming Speed Multiplier.")
      public double swimSpeed = 1.1;
      @Comment("Shadow Size.")
      public double shadowSize = 1.3;
      @Comment("Eye Height.")
      public double eyeHeight = 0.74;
      @Comment("Hitbox width multiplier.")
      public float width = 3.0F;
      @Comment("Hitbox height multiplier.")
      public float height = 1.0F;
      @Comment("Model Y offset")
      public double yOffset = (double)0.0F;

      public Orthocadinaht() {
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

      public double getShadowSize() {
         return this.shadowSize;
      }

      public double getEyeHeight() {
         return this.eyeHeight;
      }

      public float getWidth() {
         return this.width;
      }

      public float getHeight() {
         return this.height;
      }

      public double getYOffset() {
         return this.yOffset;
      }
   }

   public static class SmallPoisonTaratect extends RaceConfig.Default {
      @Comment("EP requirement to evolve into a Small Poison Taratect.")
      public double epRequirement = (double)100000.0F;
      @Comment("Minimal aura.")
      public double minAura = (double)33000.0F;
      @Comment("Maximum aura.")
      public double maxAura = (double)33000.0F;
      @Comment("Minimal magicule.")
      public double minMagicule = (double)67000.0F;
      @Comment("Maximum magicule.")
      public double maxMagicule = (double)67000.0F;
      @Comment("Bonus Size.")
      public double size = -0.37;
      @Comment("Bonus Max Health.")
      public double maxHealth = (double)79.0F;
      @Comment("Bonus Max Spiritual Health.")
      public double maxSpiritualHealth = (double)155.0F;
      @Comment("Bonus Attack Damage.")
      public double attack = -0.05;
      @Comment("Bonus Attack Speed.")
      public double attackSpeed = (double)-0.25F;
      @Comment("Bonus Knockback Resistance.")
      public double knockbackResistance = -0.1;
      @Comment("Bonus Movement Speed.")
      public double movementSpeed = 0.074;
      @Comment("Bonus Swimming Speed Multiplier.")
      public double swimSpeed = -0.064;
      @Comment("Shadow Size.")
      public double shadowSize = 0.7;
      @Comment("Eye Height.")
      public double eyeHeight = (double)0.75F;
      @Comment("Hitbox width multiplier.")
      public float width = 1.5F;
      @Comment("Hitbox height multiplier.")
      public float height = 0.48F;
      @Comment("Model Y offset")
      public double yOffset = (double)0.0F;

      public SmallPoisonTaratect() {
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

      public double getShadowSize() {
         return this.shadowSize;
      }

      public double getEyeHeight() {
         return this.eyeHeight;
      }

      public float getWidth() {
         return this.width;
      }

      public float getHeight() {
         return this.height;
      }

      public double getYOffset() {
         return this.yOffset;
      }
   }

   public static class ZoaEle extends RaceConfig.Default {
      @Comment("EP requirement to evolve into a Zoa Ele.")
      public double epRequirement = (double)400000.0F;
      @Comment("Minimal aura.")
      public double minAura = (double)150000.0F;
      @Comment("Maximum aura.")
      public double maxAura = (double)150000.0F;
      @Comment("Minimal magicule.")
      public double minMagicule = (double)250000.0F;
      @Comment("Maximum magicule.")
      public double maxMagicule = (double)250000.0F;
      @Comment("Bonus Size.")
      public double size = (double)0.0F;
      @Comment("Bonus Max Health.")
      public double maxHealth = (double)99.0F;
      @Comment("Bonus Max Spiritual Health.")
      public double maxSpiritualHealth = (double)600.0F;
      @Comment("Bonus Attack Damage.")
      public double attack = (double)0.5F;
      @Comment("Bonus Attack Speed.")
      public double attackSpeed = 0.2;
      @Comment("Bonus Knockback Resistance.")
      public double knockbackResistance = 0.05;
      @Comment("Bonus Movement Speed.")
      public double movementSpeed = 0.078;
      @Comment("Bonus Swimming Speed Multiplier.")
      public double swimSpeed = -0.059;
      @Comment("Shadow Size.")
      public double shadowSize = 1.3;
      @Comment("Eye Height.")
      public double eyeHeight = 0.74;
      @Comment("Hitbox width multiplier.")
      public float width = 3.0F;
      @Comment("Hitbox height multiplier.")
      public float height = 1.0F;
      @Comment("Model Y offset")
      public double yOffset = (double)0.0F;

      public ZoaEle() {
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

      public double getShadowSize() {
         return this.shadowSize;
      }

      public double getEyeHeight() {
         return this.eyeHeight;
      }

      public float getWidth() {
         return this.width;
      }

      public float getHeight() {
         return this.height;
      }

      public double getYOffset() {
         return this.yOffset;
      }
   }

   public static class EdeSaine extends RaceConfig.Default {
      @Comment("EP requirement to evolve into an Ede Saine.")
      public double epRequirement = (double)600000.0F;
      @Comment("Minimal aura.")
      public double minAura = (double)250000.0F;
      @Comment("Maximum aura.")
      public double maxAura = (double)250000.0F;
      @Comment("Minimal magicule.")
      public double minMagicule = (double)350000.0F;
      @Comment("Maximum magicule.")
      public double maxMagicule = (double)350000.0F;
      @Comment("Bonus Size.")
      public double size = (double)0.0F;
      @Comment("Bonus Max Health.")
      public double maxHealth = (double)380.0F;
      @Comment("Bonus Max Spiritual Health.")
      public double maxSpiritualHealth = (double)780.0F;
      @Comment("Bonus Attack Damage.")
      public double attack = (double)1.0F;
      @Comment("Bonus Attack Speed.")
      public double attackSpeed = 0.29;
      @Comment("Bonus Knockback Resistance.")
      public double knockbackResistance = 0.08;
      @Comment("Bonus Movement Speed.")
      public double movementSpeed = 0.078;
      @Comment("Bonus Swimming Speed Multiplier.")
      public double swimSpeed = -0.055;
      @Comment("Shadow Size.")
      public double shadowSize = 1.3;
      @Comment("Eye Height.")
      public double eyeHeight = 0.74;
      @Comment("Hitbox width multiplier.")
      public float width = 3.0F;
      @Comment("Hitbox height multiplier.")
      public float height = 1.0F;
      @Comment("Model Y offset")
      public double yOffset = (double)0.0F;

      public EdeSaine() {
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

      public double getShadowSize() {
         return this.shadowSize;
      }

      public double getEyeHeight() {
         return this.eyeHeight;
      }

      public float getWidth() {
         return this.width;
      }

      public float getHeight() {
         return this.height;
      }

      public double getYOffset() {
         return this.yOffset;
      }
   }

   public static class ZanaHorowa extends RaceConfig.Default {
      @Comment("EP requirement to evolve into a Zana Horowa.")
      public double epRequirement = (double)1000000.0F;
      @Comment("Minimal aura.")
      public double minAura = (double)300000.0F;
      @Comment("Maximum aura.")
      public double maxAura = (double)300000.0F;
      @Comment("Minimal magicule.")
      public double minMagicule = (double)700000.0F;
      @Comment("Maximum magicule.")
      public double maxMagicule = (double)700000.0F;
      @Comment("Bonus Size.")
      public double size = (double)0.0F;
      @Comment("Bonus Max Health.")
      public double maxHealth = (double)680.0F;
      @Comment("Bonus Max Spiritual Health.")
      public double maxSpiritualHealth = (double)5300.0F;
      @Comment("Bonus Attack Damage.")
      public double attack = (double)3.5F;
      @Comment("Bonus Attack Speed.")
      public double attackSpeed = (double)1.0F;
      @Comment("Bonus Knockback Resistance.")
      public double knockbackResistance = 0.3;
      @Comment("Bonus Movement Speed.")
      public double movementSpeed = 0.1;
      @Comment("Bonus Swimming Speed Multiplier.")
      public double swimSpeed = 0.1;
      @Comment("Shadow Size.")
      public double shadowSize = 1.3;
      @Comment("Eye Height.")
      public double eyeHeight = 0.74;
      @Comment("Hitbox width multiplier.")
      public float width = 3.0F;
      @Comment("Hitbox height multiplier.")
      public float height = 1.0F;
      @Comment("Model Y offset")
      public double yOffset = (double)0.0F;

      public ZanaHorowa() {
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

      public double getShadowSize() {
         return this.shadowSize;
      }

      public double getEyeHeight() {
         return this.eyeHeight;
      }

      public float getWidth() {
         return this.width;
      }

      public float getHeight() {
         return this.height;
      }

      public double getYOffset() {
         return this.yOffset;
      }
   }

   public static class Arachne extends RaceConfig.Default {
      @Comment("EP requirement to evolve into an Arachne.")
      public double epRequirement = (double)3500000.0F;
      @Comment("Minimal aura.")
      public double minAura = (double)500000.0F;
      @Comment("Maximum aura.")
      public double maxAura = (double)500000.0F;
      @Comment("Minimal magicule.")
      public double minMagicule = (double)3000000.0F;
      @Comment("Maximum magicule.")
      public double maxMagicule = (double)3000000.0F;
      @Comment("Bonus Size.")
      public double size = (double)0.0F;
      @Comment("Bonus Max Health.")
      public double maxHealth = (double)1030.0F;
      @Comment("Bonus Max Spiritual Health.")
      public double maxSpiritualHealth = (double)10300.0F;
      @Comment("Bonus Attack Damage.")
      public double attack = (double)6.5F;
      @Comment("Bonus Attack Speed.")
      public double attackSpeed = 0.9;
      @Comment("Bonus Knockback Resistance.")
      public double knockbackResistance = 0.45;
      @Comment("Bonus Movement Speed.")
      public double movementSpeed = 0.15;
      @Comment("Bonus Swimming Speed Multiplier.")
      public double swimSpeed = (double)0.5F;
      @Comment("Shadow Size.")
      public double shadowSize = (double)1.5F;
      @Comment("Eye Height.")
      public double eyeHeight = (double)1.0F;
      @Comment("Hitbox width multiplier.")
      public float width = 3.0F;
      @Comment("Hitbox height multiplier.")
      public float height = 1.4F;
      @Comment("Model Y offset")
      public double yOffset = (double)0.0F;

      public Arachne() {
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

      public double getShadowSize() {
         return this.shadowSize;
      }

      public double getEyeHeight() {
         return this.eyeHeight;
      }

      public float getWidth() {
         return this.width;
      }

      public float getHeight() {
         return this.height;
      }

      public double getYOffset() {
         return this.yOffset;
      }
   }

   public static class SmallTaratect extends RaceConfig.Default {
      @Comment("EP requirement to evolve into a Small Taratect.")
      public double epRequirement = (double)20000.0F;
      @Comment("Minimal aura.")
      public double minAura = (double)13400.0F;
      @Comment("Maximum aura.")
      public double maxAura = (double)13400.0F;
      @Comment("Minimal magicule.")
      public double minMagicule = (double)6600.0F;
      @Comment("Maximum magicule.")
      public double maxMagicule = (double)6600.0F;
      @Comment("Bonus Size.")
      public double size = -0.37;
      @Comment("Bonus Max Health.")
      public double maxHealth = (double)-4.0F;
      @Comment("Bonus Max Spiritual Health.")
      public double maxSpiritualHealth = (double)-42.0F;
      @Comment("Bonus Attack Damage.")
      public double attack = -0.6;
      @Comment("Bonus Attack Speed.")
      public double attackSpeed = -0.8;
      @Comment("Bonus Knockback Resistance.")
      public double knockbackResistance = -0.15;
      @Comment("Bonus Movement Speed.")
      public double movementSpeed = 0.07;
      @Comment("Bonus Swimming Speed Multiplier.")
      public double swimSpeed = -0.07;
      @Comment("Shadow Size.")
      public double shadowSize = 0.7;
      @Comment("Eye Height.")
      public double eyeHeight = 0.67;
      @Comment("Hitbox width multiplier.")
      public float width = 1.5F;
      @Comment("Hitbox height multiplier.")
      public float height = 0.48F;
      @Comment("Model Y offset")
      public double yOffset = (double)0.0F;

      public SmallTaratect() {
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

      public double getShadowSize() {
         return this.shadowSize;
      }

      public double getEyeHeight() {
         return this.eyeHeight;
      }

      public float getWidth() {
         return this.width;
      }

      public float getHeight() {
         return this.height;
      }

      public double getYOffset() {
         return this.yOffset;
      }
   }

   public static class Taratect extends RaceConfig.Default {
      @Comment("EP requirement to evolve into a Taratect.")
      public double epRequirement = (double)100000.0F;
      @Comment("Minimal aura.")
      public double minAura = (double)67000.0F;
      @Comment("Maximum aura.")
      public double maxAura = (double)67000.0F;
      @Comment("Minimal magicule.")
      public double minMagicule = (double)33000.0F;
      @Comment("Maximum magicule.")
      public double maxMagicule = (double)33000.0F;
      @Comment("Bonus Size.")
      public double size = -0.2;
      @Comment("Bonus Max Health.")
      public double maxHealth = (double)99.0F;
      @Comment("Bonus Max Spiritual Health.")
      public double maxSpiritualHealth = (double)140.0F;
      @Comment("Bonus Attack Damage.")
      public double attack = -0.1;
      @Comment("Bonus Attack Speed.")
      public double attackSpeed = -0.3;
      @Comment("Bonus Knockback Resistance.")
      public double knockbackResistance = -0.1;
      @Comment("Bonus Movement Speed.")
      public double movementSpeed = 0.073;
      @Comment("Bonus Swimming Speed Multiplier.")
      public double swimSpeed = -0.065;
      @Comment("Shadow Size.")
      public double shadowSize = (double)1.0F;
      @Comment("Eye Height.")
      public double eyeHeight = 0.72;
      @Comment("Hitbox width multiplier.")
      public float width = 2.0F;
      @Comment("Hitbox height multiplier.")
      public float height = 0.9F;
      @Comment("Model Y offset")
      public double yOffset = (double)0.0F;

      public Taratect() {
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

      public double getShadowSize() {
         return this.shadowSize;
      }

      public double getEyeHeight() {
         return this.eyeHeight;
      }

      public float getWidth() {
         return this.width;
      }

      public float getHeight() {
         return this.height;
      }

      public double getYOffset() {
         return this.yOffset;
      }
   }

   public static class GreatTaratect extends RaceConfig.Default {
      @Comment("EP requirement to evolve into a Great Taratect.")
      public double epRequirement = (double)400000.0F;
      @Comment("Minimal aura.")
      public double minAura = (double)250000.0F;
      @Comment("Maximum aura.")
      public double maxAura = (double)250000.0F;
      @Comment("Minimal magicule.")
      public double minMagicule = (double)150000.0F;
      @Comment("Maximum magicule.")
      public double maxMagicule = (double)150000.0F;
      @Comment("Bonus Size.")
      public double size = (double)0.0F;
      @Comment("Bonus Max Health.")
      public double maxHealth = (double)480.0F;
      @Comment("Bonus Max Spiritual Health.")
      public double maxSpiritualHealth = (double)640.0F;
      @Comment("Bonus Attack Damage.")
      public double attack = (double)0.5F;
      @Comment("Bonus Attack Speed.")
      public double attackSpeed = -0.1;
      @Comment("Bonus Knockback Resistance.")
      public double knockbackResistance = -0.1;
      @Comment("Bonus Movement Speed.")
      public double movementSpeed = 0.093;
      @Comment("Bonus Swimming Speed Multiplier.")
      public double swimSpeed = -0.058;
      @Comment("Shadow Size.")
      public double shadowSize = 1.45;
      @Comment("Eye Height.")
      public double eyeHeight = 0.69;
      @Comment("Hitbox width multiplier.")
      public float width = 2.5F;
      @Comment("Hitbox height multiplier.")
      public float height = 1.2F;
      @Comment("Model Y offset")
      public double yOffset = (double)0.0F;

      public GreatTaratect() {
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

      public double getShadowSize() {
         return this.shadowSize;
      }

      public double getEyeHeight() {
         return this.eyeHeight;
      }

      public float getWidth() {
         return this.width;
      }

      public float getHeight() {
         return this.height;
      }

      public double getYOffset() {
         return this.yOffset;
      }
   }

   public static class GreaterTaratect extends RaceConfig.Default {
      @Comment("EP requirement to evolve into a Greater Taratect.")
      public double epRequirement = (double)800000.0F;
      @Comment("Minimal aura.")
      public double minAura = (double)450000.0F;
      @Comment("Maximum aura.")
      public double maxAura = (double)450000.0F;
      @Comment("Minimal magicule.")
      public double minMagicule = (double)350000.0F;
      @Comment("Maximum magicule.")
      public double maxMagicule = (double)350000.0F;
      @Comment("Bonus Size.")
      public double size = 0.2;
      @Comment("Bonus Max Health.")
      public double maxHealth = (double)680.0F;
      @Comment("Bonus Max Spiritual Health.")
      public double maxSpiritualHealth = (double)840.0F;
      @Comment("Bonus Attack Damage.")
      public double attack = (double)1.5F;
      @Comment("Bonus Attack Speed.")
      public double attackSpeed = 0.4;
      @Comment("Bonus Knockback Resistance.")
      public double knockbackResistance = 0.12;
      @Comment("Bonus Movement Speed.")
      public double movementSpeed = 0.12;
      @Comment("Bonus Swimming Speed Multiplier.")
      public double swimSpeed = -0.03;
      @Comment("Shadow Size.")
      public double shadowSize = (double)2.25F;
      @Comment("Eye Height.")
      public double eyeHeight = 0.67;
      @Comment("Hitbox width multiplier.")
      public float width = 4.0F;
      @Comment("Hitbox height multiplier.")
      public float height = 1.6F;
      @Comment("Model Y offset")
      public double yOffset = (double)0.0F;

      public GreaterTaratect() {
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

      public double getShadowSize() {
         return this.shadowSize;
      }

      public double getEyeHeight() {
         return this.eyeHeight;
      }

      public float getWidth() {
         return this.width;
      }

      public float getHeight() {
         return this.height;
      }

      public double getYOffset() {
         return this.yOffset;
      }
   }

   public static class ArchTaratect extends RaceConfig.Default {
      @Comment("EP requirement to evolve into an Arch Taratect.")
      public double epRequirement = (double)2500000.0F;
      @Comment("Minimal aura.")
      public double minAura = (double)1500000.0F;
      @Comment("Maximum aura.")
      public double maxAura = (double)1500000.0F;
      @Comment("Minimal magicule.")
      public double minMagicule = (double)1000000.0F;
      @Comment("Maximum magicule.")
      public double maxMagicule = (double)1000000.0F;
      @Comment("Bonus Size.")
      public double size = 0.3;
      @Comment("Bonus Max Health.")
      public double maxHealth = (double)1180.0F;
      @Comment("Bonus Max Spiritual Health.")
      public double maxSpiritualHealth = (double)4640.0F;
      @Comment("Bonus Attack Damage.")
      public double attack = (double)2.5F;
      @Comment("Bonus Attack Speed.")
      public double attackSpeed = 0.55;
      @Comment("Bonus Knockback Resistance.")
      public double knockbackResistance = 0.4;
      @Comment("Bonus Movement Speed.")
      public double movementSpeed = 0.14;
      @Comment("Bonus Swimming Speed Multiplier.")
      public double swimSpeed = 0.1;
      @Comment("Shadow Size.")
      public double shadowSize = 3.1;
      @Comment("Eye Height.")
      public double eyeHeight = 0.83;
      @Comment("Hitbox width multiplier.")
      public float width = 5.0F;
      @Comment("Hitbox height multiplier.")
      public float height = 2.0F;
      @Comment("Model Y offset")
      public double yOffset = (double)0.0F;
      @Comment("Arch Entity Interaction Range")
      public double entityRange = (double)6.0F;
      @Comment("Arch Block Interaction Range")
      public double blockRange = (double)6.0F;
      @Comment("Arch Step Height")
      public double stepHeight = (double)2.0F;

      public ArchTaratect() {
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

      public double getShadowSize() {
         return this.shadowSize;
      }

      public double getEyeHeight() {
         return this.eyeHeight;
      }

      public float getWidth() {
         return this.width;
      }

      public float getHeight() {
         return this.height;
      }

      public double getYOffset() {
         return this.yOffset;
      }

      public double getEntityRange() {
         return this.entityRange;
      }

      public double getBlockRange() {
         return this.blockRange;
      }

      public double getStepHeight() {
         return this.stepHeight;
      }
   }

   public static class QueenTaratect extends RaceConfig.Default {
      @Comment("EP requirement to evolve into a Queen Taratect.")
      public double epRequirement = (double)3500000.0F;
      @Comment("Minimal aura.")
      public double minAura = (double)2500000.0F;
      @Comment("Maximum aura.")
      public double maxAura = (double)2500000.0F;
      @Comment("Minimal magicule.")
      public double minMagicule = (double)1000000.0F;
      @Comment("Maximum magicule.")
      public double maxMagicule = (double)1000000.0F;
      @Comment("Bonus Size.")
      public double size = 0.47;
      @Comment("Bonus Max Health.")
      public double maxHealth = (double)1380.0F;
      @Comment("Bonus Max Spiritual Health.")
      public double maxSpiritualHealth = (double)8640.0F;
      @Comment("Bonus Attack Damage.")
      public double attack = (double)11.0F;
      @Comment("Bonus Attack Speed.")
      public double attackSpeed = 1.8;
      @Comment("Bonus Knockback Resistance.")
      public double knockbackResistance = 0.55;
      @Comment("Bonus Movement Speed.")
      public double movementSpeed = 0.15;
      @Comment("Bonus Swimming Speed Multiplier.")
      public double swimSpeed = 0.1;
      @Comment("Shadow Size.")
      public double shadowSize = 3.1;
      @Comment("Eye Height.")
      public double eyeHeight = 0.86;
      @Comment("Hitbox width multiplier.")
      public float width = 6.0F;
      @Comment("Hitbox height multiplier.")
      public float height = 3.0F;
      @Comment("Model Y offset")
      public double yOffset = (double)0.0F;
      @Comment("Queen Entity Interaction Range")
      public double entityRange = (double)10.0F;
      @Comment("Queen Block Interaction Range")
      public double blockRange = (double)10.0F;
      @Comment("Queen Step Height")
      public double stepHeight = (double)4.0F;

      public QueenTaratect() {
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

      public double getShadowSize() {
         return this.shadowSize;
      }

      public double getEyeHeight() {
         return this.eyeHeight;
      }

      public float getWidth() {
         return this.width;
      }

      public float getHeight() {
         return this.height;
      }

      public double getYOffset() {
         return this.yOffset;
      }

      public double getEntityRange() {
         return this.entityRange;
      }

      public double getBlockRange() {
         return this.blockRange;
      }

      public double getStepHeight() {
         return this.stepHeight;
      }
   }

   public static class LesserTaratect extends RaceConfig.Default {
      @Comment("EP requirement to evolve into a Lesser Taratect.")
      public double epRequirement = (double)20000.0F;
      @Comment("Minimal aura.")
      public double minAura = (double)13400.0F;
      @Comment("Maximum aura.")
      public double maxAura = (double)13400.0F;
      @Comment("Minimal magicule.")
      public double minMagicule = (double)6600.0F;
      @Comment("Maximum magicule.")
      public double maxMagicule = (double)6600.0F;
      @Comment("Bonus Size.")
      public double size = -0.3;
      @Comment("Bonus Max Health.")
      public double maxHealth = (double)-2.0F;
      @Comment("Bonus Max Spiritual Health.")
      public double maxSpiritualHealth = (double)-40.0F;
      @Comment("Bonus Attack Damage.")
      public double attack = (double)-0.5F;
      @Comment("Bonus Attack Speed.")
      public double attackSpeed = -0.7;
      @Comment("Bonus Knockback Resistance.")
      public double knockbackResistance = -0.13;
      @Comment("Bonus Movement Speed.")
      public double movementSpeed = 0.07;
      @Comment("Bonus Swimming Speed Multiplier.")
      public double swimSpeed = -0.067;
      @Comment("Shadow Size.")
      public double shadowSize = 0.85;
      @Comment("Eye Height.")
      public double eyeHeight = 0.87;
      @Comment("Hitbox width multiplier.")
      public float width = 1.4F;
      @Comment("Hitbox height multiplier.")
      public float height = 0.77F;
      @Comment("Model Y offset")
      public double yOffset = (double)0.0F;

      public LesserTaratect() {
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

      public double getShadowSize() {
         return this.shadowSize;
      }

      public double getEyeHeight() {
         return this.eyeHeight;
      }

      public float getWidth() {
         return this.width;
      }

      public float getHeight() {
         return this.height;
      }

      public double getYOffset() {
         return this.yOffset;
      }
   }

   public static class LesserPoisonTaratect extends RaceConfig.Default {
      @Comment("EP requirement to evolve into a Lesser Poison Taratect.")
      public double epRequirement = (double)150000.0F;
      @Comment("Minimal aura.")
      public double minAura = (double)100000.0F;
      @Comment("Maximum aura.")
      public double maxAura = (double)100000.0F;
      @Comment("Minimal magicule.")
      public double minMagicule = (double)50000.0F;
      @Comment("Maximum magicule.")
      public double maxMagicule = (double)50000.0F;
      @Comment("Bonus Size.")
      public double size = -0.3;
      @Comment("Bonus Max Health.")
      public double maxHealth = (double)100.0F;
      @Comment("Bonus Max Spiritual Health.")
      public double maxSpiritualHealth = (double)2710.0F;
      @Comment("Bonus Attack Damage.")
      public double attack = -0.3;
      @Comment("Bonus Attack Speed.")
      public double attackSpeed = (double)-0.5F;
      @Comment("Bonus Knockback Resistance.")
      public double knockbackResistance = -0.115;
      @Comment("Bonus Movement Speed.")
      public double movementSpeed = 0.078;
      @Comment("Bonus Swimming Speed Multiplier.")
      public double swimSpeed = -0.05;
      @Comment("Shadow Size.")
      public double shadowSize = 0.85;
      @Comment("Eye Height.")
      public double eyeHeight = 0.87;
      @Comment("Hitbox width multiplier.")
      public float width = 1.4F;
      @Comment("Hitbox height multiplier.")
      public float height = 0.77F;
      @Comment("Model Y offset")
      public double yOffset = (double)0.0F;

      public LesserPoisonTaratect() {
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

      public double getShadowSize() {
         return this.shadowSize;
      }

      public double getEyeHeight() {
         return this.eyeHeight;
      }

      public float getWidth() {
         return this.width;
      }

      public float getHeight() {
         return this.height;
      }

      public double getYOffset() {
         return this.yOffset;
      }
   }

   public static class PoisonTaratect extends RaceConfig.Default {
      @Comment("EP requirement to evolve into a Poison Taratect.")
      public double epRequirement = (double)750000.0F;
      @Comment("Minimal aura.")
      public double minAura = (double)600000.0F;
      @Comment("Maximum aura.")
      public double maxAura = (double)600000.0F;
      @Comment("Minimal magicule.")
      public double minMagicule = (double)150000.0F;
      @Comment("Maximum magicule.")
      public double maxMagicule = (double)150000.0F;
      @Comment("Bonus Size.")
      public double size = -0.2;
      @Comment("Bonus Max Health.")
      public double maxHealth = (double)680.0F;
      @Comment("Bonus Max Spiritual Health.")
      public double maxSpiritualHealth = (double)90.0F;
      @Comment("Bonus Attack Damage.")
      public double attack = (double)1.0F;
      @Comment("Bonus Attack Speed.")
      public double attackSpeed = 0.58;
      @Comment("Bonus Knockback Resistance.")
      public double knockbackResistance = (double)0.0F;
      @Comment("Bonus Movement Speed.")
      public double movementSpeed = 0.078;
      @Comment("Bonus Swimming Speed Multiplier.")
      public double swimSpeed = -0.03;
      @Comment("Shadow Size.")
      public double shadowSize = (double)1.0F;
      @Comment("Eye Height.")
      public double eyeHeight = 0.72;
      @Comment("Hitbox width multiplier.")
      public float width = 2.0F;
      @Comment("Hitbox height multiplier.")
      public float height = 0.9F;
      @Comment("Model Y offset")
      public double yOffset = (double)0.0F;

      public PoisonTaratect() {
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

      public double getShadowSize() {
         return this.shadowSize;
      }

      public double getEyeHeight() {
         return this.eyeHeight;
      }

      public float getWidth() {
         return this.width;
      }

      public float getHeight() {
         return this.height;
      }

      public double getYOffset() {
         return this.yOffset;
      }
   }

   public static class GreatPoisonTaratect extends RaceConfig.Default {
      @Comment("EP requirement to evolve into a Great Poison Taratect.")
      public double epRequirement = (double)3800000.0F;
      @Comment("Minimal aura.")
      public double minAura = (double)2800000.0F;
      @Comment("Maximum aura.")
      public double maxAura = (double)2800000.0F;
      @Comment("Minimal magicule.")
      public double minMagicule = (double)1000000.0F;
      @Comment("Maximum magicule.")
      public double maxMagicule = (double)1000000.0F;
      @Comment("Bonus Size.")
      public double size = (double)0.0F;
      @Comment("Bonus Max Health.")
      public double maxHealth = (double)980.0F;
      @Comment("Bonus Max Spiritual Health.")
      public double maxSpiritualHealth = (double)5940.0F;
      @Comment("Bonus Attack Damage.")
      public double attack = (double)3.0F;
      @Comment("Bonus Attack Speed.")
      public double attackSpeed = 0.8;
      @Comment("Bonus Knockback Resistance.")
      public double knockbackResistance = 0.3;
      @Comment("Bonus Movement Speed.")
      public double movementSpeed = 0.15;
      @Comment("Bonus Swimming Speed Multiplier.")
      public double swimSpeed = 0.1;
      @Comment("Shadow Size.")
      public double shadowSize = 1.45;
      @Comment("Eye Height.")
      public double eyeHeight = 0.69;
      @Comment("Hitbox width multiplier.")
      public float width = 2.5F;
      @Comment("Hitbox height multiplier.")
      public float height = 1.2F;
      @Comment("Model Y offset")
      public double yOffset = (double)0.0F;

      public GreatPoisonTaratect() {
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

      public double getShadowSize() {
         return this.shadowSize;
      }

      public double getEyeHeight() {
         return this.eyeHeight;
      }

      public float getWidth() {
         return this.width;
      }

      public float getHeight() {
         return this.height;
      }

      public double getYOffset() {
         return this.yOffset;
      }
   }
}
