package roles;


// full advantage against warrior x(2.0), half advantage against berserker  x(1.5)
// disadvantage against lancer x(0.5), no advantage against other classes x(1.0)
public class Archer extends Roles {
    public Archer(){
        this.maxHealth = 250;
        this.health = 250;
        this.attack = 75;
        this.defence = 20;
        this.magic = 65;
        this.magic_resist = 30;
        this.speed = 50;
    }
    @Override 
    public String getRoleName() {
        return "Archer";
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
