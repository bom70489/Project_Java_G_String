import roles.Healer;
import roles.Warrior;

public class Main {
    public static void main(String[] args) {
        // Class
        Player player1 = new Player();
        
        // Call
        player1.setName("Pakapol");
        player1.setRole(new Warrior());
        player1.showInfo();
    }
}