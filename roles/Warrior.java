package roles;

public class Warrior extends Roles {
    public Warrior(){
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
        System.out.println("Hp : " + health);
        System.out.println("Attack : " + attack);
        System.out.println("Defence : " + defence);
        System.out.println("Magic : " + magic);
        System.out.println("Magic_resistance : " + magic_resist);
        System.out.println("Speed : " + speed);
    }
}