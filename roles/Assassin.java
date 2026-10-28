package roles;
public class Assassin extends Roles {
    public Assassin(){
        this.maxHealth = 220;
        this.health = 220;
        this.attack = 110;
        this.defence = 15;
        this.magic = 40;
        this.magic_resist = 15;
        this.speed = 100;
    }
    @Override 
    public String getRoleName() {
        return "Assassin";
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
        this.maxHealth += 10;
        this.attack += 20;
        this.defence += 5;
        this.magic += 10;
        this.magic_resist += 5;
    }
}
