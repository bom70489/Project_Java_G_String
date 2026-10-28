package roles;
import Affinity_interface.Affinity;

public abstract class Roles implements Affinity {
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
    
    public abstract String getRoleName();
    public abstract double getDamage();
    public abstract void showStutus();
}