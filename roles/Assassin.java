package roles;

// full advantage against rider and berserker x(1.5)
// disadvantage against mage x(0.75), no advantage against other classes x(1.0)
public class Assassin extends Status {
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
    public double checkAdvantage(Status role){
        switch(role.getRoleName()){
            case "Rider" : 
            case "Berserker" : 
                System.out.print("It's Full advantage! ");
                return FULL_ADVANTAGE;
            case "Mage" : 
                System.out.print("It's Disadvantage! ");
                return DISADVANTAGE;
            default : 
                System.out.print("No advantage. ");
                return NO_ADVANTAGE;
        }
    }
}
