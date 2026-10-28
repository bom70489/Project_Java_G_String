package roles;

public class Rider extends Roles{
        public Rider(){
        this.maxHealth = 275;
        this.health = 275;
        this.attack = 60;
        this.defence = 30;
        this.magic = 30;
        this.magic_resist = 35;
        this.speed = 70;
    }
    @Override 
    public String getRoleName() {
        return "Rider";
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
        this.maxHealth += 20;
        this.attack += 10;
        this.defence += 5;
        this.magic += 10;
        this.magic_resist += 5;
    }
}
