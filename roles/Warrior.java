package roles;

public class Warrior extends All_Roles {
    private int hp = 150;
    private int atk = 15;

    @Override 
    public String getRoleName() {
        return "Warrior";
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