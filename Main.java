import java.util.Scanner;

import roles.*;

public class Main {
    static Roles select(int number){
        Player player = new Player();
        if(number < 1 || number > 7){
            System.out.println("invalid input your role will be randomly select"); 
            number = (int)(Math.random() * 7 ) + 1;
        }
        switch (number){
            case 1 : player.setRole(new Warrior()); break;
            case 2 : player.setRole(new Archer()); break;
            case 3 : player.setRole(new Lancer()); break;
            case 4 : player.setRole(new Rider()); break;
            case 5 : player.setRole(new Assassin()); break;
            case 6 : player.setRole(new Mage()); break;
            case 7 : player.setRole(new Berserker()); break;
            default : break;
        }
        return player.getRole();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input your name : ");
        Player player1 = new Player(sc.nextLine());
        System.out.println("------- Classes -------");
        System.out.println("1.) Warrior \n2.) Archer \n3.) Lancer \n4.) Rider \n5.) Assassin \n6.) Mage \n7.) Berserker");
        System.out.print("\nSelect your class : ");
        player1.setRole(select(sc.nextInt()));
        System.out.println();
        player1.showInfo();
        int random = (int)(Math.random() * 7 ) + 1; // random from 1-7
        Enemy player2 = new Enemy();
        player2.setRole(select(random));
        System.out.println("\n------- Your enemy -------");
        player2.showInfo();
        System.out.println("------- Battle Phase -------");
        int turn = 1 ;
        while(player1.getRole().getHealth() > 0 && player2.getRole().getHealth() > 0){
            System.out.println("------- turn " + turn + " -------");
            if(turn % 2 == 1){
                System.out.println("Your turn");
                System.out.println("1.) Attack \n2.) Strike \n3.) Magic");
                System.out.print("Choose : ");
                int p1 = sc.nextInt();
                int p2 = (int)(Math.random() * 3 ) + 1;
                double damage = Battle.BattlePhase(p1, p2, turn, player1, player2);
                if(p1 == 2 && p2 == 2){
                    player1.getRole().damageCalculation(damage);
                    System.out.println("You receive " + damage + " damage!");
                    System.out.println("Your Hp : " + player1.getRole().getHealth() + " / " + player1.getRole().getMaxHealth());
                }else{
                    player2.getRole().damageCalculation(damage);
                    System.out.println("You dealt " + damage + " damage!");
                    System.out.println("Enemy Hp : " + player2.getRole().getHealth() + " / " + player2.getRole().getMaxHealth());
                }
                
            }else{
                System.out.println("Enemy's turn");
                System.out.println("1.) Guard \n2.) Counter \n3.) Barrier");
                System.out.print("Choose : ");
                int p1 = sc.nextInt();
                int p2 = (int)(Math.random() * 3 ) + 1;
                double damage = Battle.BattlePhase(p2, p1, turn, player1, player2);
                if(p1 == 2 && p2 == 2){
                    player2.getRole().damageCalculation(damage);
                    System.out.println("You dealt " + damage + " damage!");
                    System.out.println("Enemy Hp : " + player2.getRole().getHealth() + " / " + player2.getRole().getMaxHealth());
                }else{
                    player1.getRole().damageCalculation(damage);
                    System.out.println("You receive " + damage + " damage!");
                    System.out.println("Your Hp : " + player1.getRole().getHealth() + " / " + player1.getRole().getMaxHealth());
                }
            }
            turn++;
        }
        sc.close();
    }
}