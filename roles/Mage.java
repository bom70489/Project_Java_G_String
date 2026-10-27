package roles;
public class Mage extends All_Roles {
    private int hp = 125;
    private int atk = 25;
    
    @Override 
    public String getRoleName() {
        return "Mage";
    }

    @Override 
    public int getDamage() {
        return atk;
    }

    @Override 
    public void showStutus() {
        System.out.println("Hp : " + hp);
        System.out.println("Attack : " + atk);
    }
}
