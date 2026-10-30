package roles;

// full advantage EVERY SHI x(1.5)
public class Skibidi extends Status{
        public Skibidi(){
        this.maxHealth = 999;
        this.health = 999;
        this.attack = 999;
        this.defence = 999;
        this.magic = 999;
        this.magic_resist = 999;
        this.speed = 999;
    }
    @Override 
    public String getRoleName() {
        return "Skibidi God";
    }
    
    @Override 
    public void showStutus() {
        System.out.println("Secret");
    }
    public void levelUp(){
        this.maxHealth += 10000;
        this.attack += 1000;
        this.defence += 1000;
        this.magic += 1000;
        this.magic_resist += 1000;
    }

    public double checkAdvantage(Status role){
        switch(role.getRoleName()){
            default : 
                System.out.print("All For One.");
                return FULL_ADVANTAGE;
        }
    }
}