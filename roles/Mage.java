package roles;
public class Mage extends Roles {
    public Mage(){
        this.maxHealth = 250;
        this.health = 250;
        this.attack = 20;
        this.defence = 30;
        this.magic = 100;
        this.magic_resist = 30;
        this.speed = 20;
    }
    @Override 
    public String getRoleName() {
        return "Mage";
    }

    @Override 
    public double getDamage() {
        return magic;
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
        this.attack += 10;
        this.defence += 5;
        this.magic += 20;
        this.magic_resist += 5;
    }
}
