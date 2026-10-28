import java.util.Scanner;

import roles.*;

public class Main {
    static Roles select(int number){
        Player player = new Player();
        switch (number){
            case 1 : player.setRole(new Warrior()); break;
            case 2 : player.setRole(new Archer()); break;
            case 3 : player.setRole(new Lancer()); break;
            case 4 : player.setRole(new Rider()); break;
            case 5 : player.setRole(new Assassin()); break;
            case 6 : player.setRole(new Mage()); break;
            case 7 : player.setRole(new Berserker()); break;
        }
        return player.getRole();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input your name : ");
        Player player1 = new Player(sc.nextLine());
        System.out.println("\n------- Classes -------");
        System.out.println("1.Warrior \n2.Archer \n3.Lancer \n4.Rider \n5.Assassin \n6.Mage \n7.Berserker");
        System.out.print("\nSelect your class : ");
        player1.setRole(select(sc.nextInt()));
        player1.showInfo();
        sc.close();
    }
}