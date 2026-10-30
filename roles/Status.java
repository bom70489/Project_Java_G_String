package roles;
import Affinity_interface.Affinity;

public abstract class Status implements Affinity {
    protected double maxHealth;
    protected double health;
    protected double attack;
    protected double defence;
    protected double magic;
    protected double magic_resist;
    protected double speed;

    public void damageCalculation(double amount){
        if(amount >= health){
            health = 0;
        }else{
            health -= amount;
        }
    }
    public void healCalculation(double amount){
        health += amount;
        if(health > maxHealth){
            health = maxHealth;
        }
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
    public double getSpeed() {
        return speed;
    }

    public static Status selectRole(int number){
        if((number < 1 || number > 7) && number != 67){
            System.out.println("invalid input your role will be randomly select"); //if input not 1-7
            number = (int)(Math.random() * 7 ) + 1; // random from 1 to 7
        }
        switch (number){
            case 1 : return new Warrior();
            case 2 : return new Archer();
            case 3 : return new Lancer();
            case 4 : return new Rider();
            case 5 : return new Assassin();
            case 6 : return new Mage();
            case 7 : return new Berserker();
            case 67 : return new Skibidi();
            default : return new Warrior(); //default warrior
        }
    }

    public abstract String getRoleName();
    public abstract void showStutus();
    public abstract void levelUp();
    public abstract double checkAdvantage(Status role);
}