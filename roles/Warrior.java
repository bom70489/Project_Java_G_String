package roles;

public class Warrior extends Roles {
    public Warrior(){
        this.maxHealth = 320;
        this.health = 320;
        this.attack = 60;
        this.defence = 35;
        this.magic = 20;
        this.magic_resist = 35;
        this.speed = 30;
    }
    @Override 
    public String getRoleName() {
        return "Warrior";
    }

    @Override 
    public double getDamage() {
        return attack;
    }
    
    @Override 
    public void showStutus() {
        System.out.println("Hp : " + health + " / " + maxHealth);
        System.out.println("Attack : " + attack);
        System.out.println("Defence : " + defence);
        System.out.println("Magic : " + magic);
        System.out.println("Magic_resistance : " + magic_resist);
        System.out.println("Speed : " + speed);
    }
    public void levelUp(){
        this.maxHealth += 25;
        this.attack += 5;
        this.defence += 7.5;
        this.magic += 5;
        this.magic_resist += 7.5;
    }
}