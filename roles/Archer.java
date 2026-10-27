package roles;

public class Archer extends All_Roles {
    private int hp = 100;
    private int atk = 20;

    @Override 
    public String getRoleName() {
        return "Archer";
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
