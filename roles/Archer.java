package roles;

public class Archer extends Roles {
    public Archer(){
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
        System.out.println("Hp : " + health);
        System.out.println("Attack : " + attack);
        System.out.println("Defence : " + defence);
        System.out.println("Magic : " + magic);
        System.out.println("Magic_resistance : " + magic_resist);
        System.out.println("Speed : " + speed);
    }
}
