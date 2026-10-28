package roles;
public class Lancer extends Roles {
    public Lancer(){
        this.health = 280;
        this.attack = 70;
        this.defence = 40;
        this.magic = 20;
        this.magic_resist = 30;
        this.speed = 60;
    }
    @Override 
    public String getRoleName() {
        return "Lancer";
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
