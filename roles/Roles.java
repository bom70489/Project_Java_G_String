package roles;
import Affinity_interface.Affinity;

public abstract class Roles implements Affinity {
    protected double maxHealth;
    protected double health;
    protected double attack;
    protected double defence;
    protected double magic;
    protected double magic_resist;
    protected double speed;

    public void damageCalculation(double amount){
        health -= amount;
    }
    public void healCalculation(double amount){
        health += amount;
    }
    public double getMaxHealth(){
        return maxHealth;
    }
    public double getHealth(){
        return health;
    }
    public double getAttack(){
        return attack;
    }
    public double getDefence(){
        return defence;
    }
    public double getMagic(){
        return magic;
    }
    public double getMagicResistance(){
        return magic_resist;
    }

    public abstract String getRoleName();
    public abstract double getDamage();
    public abstract void showStutus();
    public abstract void levelUp();
}