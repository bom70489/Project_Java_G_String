package roles;

public class Berserker extends Roles{
        public Berserker(){
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
        System.out.println("Hp : " + health);
        System.out.println("Attack : " + attack);
        System.out.println("Defence : " + defence);
        System.out.println("Magic : " + magic);
        System.out.println("Magic_resistance : " + magic_resist);
        System.out.println("Speed : " + speed);
    }
}
