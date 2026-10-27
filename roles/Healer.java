package roles;
public class Healer extends All_Roles {
    private int hp = 300;
    private int atk = 5;
    private int heal = 25;

    @Override 
    public String getRoleName() {
        return "Healer";
    }

    @Override 
    public int getDamage() {
        return atk;
    }

    @Override 
    public void showStutus() {
        System.out.println("Hp : " + hp);
        System.out.println("Attack : " + atk);
        System.out.println("Heal : " + heal);
    }
}
