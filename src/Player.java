public class Player {
    private int health;
    private int attackDamage;
    private int numHealthPotions;
    private int healthPotionPower;
    private int healthPotionDropChance;

Player(int health, int attackDamage, int numHealthPotions, int healthPotionPower, int healthPotionDropChance)
{
    this.health = health;
    this.attackDamage = attackDamage;
    this.numHealthPotions = numHealthPotions;
    this.healthPotionPower = healthPotionPower;
    this.healthPotionDropChance = healthPotionDropChance;
}

    public int getHealth() {
        return health;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getNumHealthPotions() {
        return numHealthPotions;
    }

    public int getHealthPotionPower() {
        return healthPotionPower;
    }

    public int getHealthPotionDropChance() {
        return healthPotionDropChance;
    }

    public void setHealth(int damageTaken) {
        health  -= damageTaken;
    }

    public void usePotion (int healthPotionPower) {
    health += healthPotionPower;
    numHealthPotions--;
    }
    public void increaseHealthPotion()
    {
        numHealthPotions++;
    }
}

