package roles;

// full advantage against mage and berserker x(1.5)
// disadvantage against assassin x(0.75), no advantage against other classes x(1.0)
public class Rider extends Status{
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
    public double checkAdvantage(Status role){
        switch(role.getRoleName()){
            case "Mage" : 
            case "Berserker" : 
                System.out.print("It's Full advantage! ");
                return FULL_ADVANTAGE;
            case "Assassin" : 
                System.out.print("It's Disadvantage! ");
                return DISADVANTAGE;
            default : 
                System.out.print("No advantage. ");
                return NO_ADVANTAGE;
        }
    }
}
