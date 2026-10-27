package weapon;

public class Warrior_Weapon {
    private String weapon = "Unknown";
    private int damage = 0;
    
    // Need to plus;
    public void wooden_Sword() {
        this.weapon = "Wooden-Sword"; 
        this.damage = 10;
    }
    public void stone_Sword() {
        this.weapon = "Stone-Sword";
        this.damage = 15;
    }
    public void iron_Sword() {
        this.weapon = "Iron-Sword"; 
        this.damage = 20;
    }
    public void gold_Sword() {
        this.weapon = "Gold-Sword"; 
        this.damage = 25;
    }
    public void diamond_Sword() {
        this.weapon = "Diamond-Sword";
        this.damage = 30;
    }
}
