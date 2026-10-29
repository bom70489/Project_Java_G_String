package roles;

// full advantage against archer and berserker x(1.5)
// disadvantage against warrior x(0.75), no advantage against other classes x(1.0)
public class Lancer extends Status {
    public Lancer(){
        this.maxHealth = 280;
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
        System.out.println("Hp : " + health + " / " + maxHealth);
        System.out.println("Attack : " + attack);
        System.out.println("Defence : " + defence);
        System.out.println("Magic : " + magic);
        System.out.println("Magic_resistance : " + magic_resist);
        System.out.println("Speed : " + speed);
    }
    public void levelUp(){
        this.maxHealth += 20;
        this.attack += 7.5;
        this.defence += 7.5;
        this.magic += 7.5;
        this.magic_resist += 7.5;
    }
    public double checkAdvantage(Status role){
        switch(role.getRoleName()){
            case "Archer" : 
            case "Berserker" : 
                System.out.print("It's Full advantage! ");
                return FULL_ADVANTAGE;
            case "Warrior" : 
                System.out.print("It's Disadvantage! ");
                return DISADVANTAGE;
            default : 
                System.out.print("No advantage. ");
                return NO_ADVANTAGE;
        }
    }
}
