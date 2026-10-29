package roles;

// half advantage against all classes  x(1.5)
public class Berserker extends Status{
        public Berserker(){
        this.maxHealth = 300;
        this.health = 300;
        this.attack = 80;
        this.defence = 25;
        this.magic = 30;
        this.magic_resist = 25;
        this.speed = 40;
    }
    @Override 
    public String getRoleName() {
        return "Berserker";
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
        this.attack += 15;
        this.defence += 5;
        this.magic_resist += 5;
    }
}
