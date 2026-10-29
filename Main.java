import java.util.Scanner;

import roles.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input your name : ");
        Player player1 = new Player(sc.nextLine());
        System.out.println("------- Classes -------");
        System.out.println("1.) Warrior \n2.) Archer \n3.) Lancer \n4.) Rider \n5.) Assassin \n6.) Mage \n7.) Berserker");
        System.out.print("\nSelect your class : ");
        player1.setRole(Status.selectRole(sc.nextInt()));
        System.out.println();
        int random = (int)(Math.random() * 7 ) + 1; // random from 1-7
        Enemy player2 = new Enemy();
        player2.setRole(Status.selectRole(random));
        System.out.println("\n------- Your enemy -------");
        player2.showInfo();
        int turn = 1 ;
        int potion = 3;
        int maxPotion = 3;
        int input;
        while(player1.getRole().getHealth() > 0 && player2.getRole().getHealth() > 0){
            System.out.println("----------- Turn " + turn + " -----------");
            if(turn % 2 == 1){
                System.out.println("Your turn");
                do{
                    System.out.println("1.) Attack \n2.) Potion(" + potion + " / " + maxPotion + ")\n3.) Check status \n4.) Surrender");
                    System.out.print("Choose : ");
                    input = sc.nextInt();
                    if(input == 2){
                        player1.getRole().healCalculation(player1.getRole().getMaxHealth() * 0.3);
                        System.out.println("You healed " + player1.getRole().getMaxHealth() * 0.3);
                        System.out.println("------------------------------");
                        System.out.println("Your Hp : " + player1.getRole().getHealth() + " / " + player1.getRole().getMaxHealth());
                        System.out.println("------------------------------");
                        potion--;
                        break;
                    }else if(input == 3){
                        System.out.println("1.) you \n2.) enemy");
                        System.out.print("Choose : ");
                        int temp = sc.nextInt();
                        if(temp == 1){
                            player1.showInfo();
                            System.out.println("------------------------------");
                        }else if(temp == 2){
                            player2.showInfo();
                            System.out.println("------------------------------");
                        }else{
                            System.out.println("invalid input");
                            System.out.println("------------------------------");
                        }
                    }else if(input == 4){
                        System.out.println("You surrender.");
                        return;
                    }
                }while(input != 1);
                //attack
                System.out.println("------------------------------");
                System.out.println("1.) Attack \n2.) Strike \n3.) Magic");
                System.out.print("Choose : ");
                int p1 = sc.nextInt();
                int p2 = (int)(Math.random() * 3 ) + 1;
                System.out.println("------------------------------");
                double damage = Battle.BattlePhase(p1, p2, turn, player1, player2);
                if(p1 == 2 && p2 == 2){
                    damage *= player2.getRole().checkAdvantage(player1.getRole()); // calculate class's advantage enemy to player
                    player1.getRole().damageCalculation(damage);
                    System.out.println("You receive " + damage + " damage!");
                    System.out.println("------------------------------");
                    System.out.println("Your Hp : " + player1.getRole().getHealth() + " / " + player1.getRole().getMaxHealth());
                    System.out.println("------------------------------");
                    System.out.println("Enemy Hp : " + player2.getRole().getHealth() + " / " + player2.getRole().getMaxHealth());
                    System.out.println("------------------------------");
                }else{
                    damage *= player1.getRole().checkAdvantage(player2.getRole()); // calculate class's advantage player to enemy
                    player2.getRole().damageCalculation(damage);
                    System.out.println("You dealt " + damage + " damage!");
                    System.out.println("------------------------------");
                    System.out.println("Your Hp : " + player1.getRole().getHealth() + " / " + player1.getRole().getMaxHealth());
                    System.out.println("------------------------------");
                    System.out.println("Enemy Hp : " + player2.getRole().getHealth() + " / " + player2.getRole().getMaxHealth());
                    System.out.println("------------------------------");
                }
                
            }else{
                System.out.println("Enemy's turn");
                System.out.println("1.) Guard \n2.) Counter \n3.) Barrier");
                System.out.print("Choose : ");
                int p1 = sc.nextInt();
                int p2 = (int)(Math.random() * 3 ) + 1;
                System.out.println("------------------------------");
                double damage = Battle.BattlePhase(p2, p1, turn, player1, player2);
                if(p1 == 2 && p2 == 2){
                    damage *= player1.getRole().checkAdvantage(player2.getRole()); // calculate class's advantage player to enemy
                    player2.getRole().damageCalculation(damage);
                    System.out.println("You dealt " + damage + " damage!");
                    System.out.println("------------------------------");
                    System.out.println("Your Hp : " + player1.getRole().getHealth() + " / " + player1.getRole().getMaxHealth());
                    System.out.println("------------------------------");
                    System.out.println("Enemy Hp : " + player2.getRole().getHealth() + " / " + player2.getRole().getMaxHealth());
                    System.out.println("------------------------------");
                }else{
                    damage *= player2.getRole().checkAdvantage(player1.getRole()); // calculate class's advantage enemy to player
                    player1.getRole().damageCalculation(damage);
                    System.out.println("You receive " + damage + " damage!");
                    System.out.println("------------------------------");
                    System.out.println("Your Hp : " + player1.getRole().getHealth() + " / " + player1.getRole().getMaxHealth());
                    System.out.println("------------------------------");
                    System.out.println("Enemy Hp : " + player2.getRole().getHealth() + " / " + player2.getRole().getMaxHealth());
                    System.out.println("------------------------------");
                }
            }
            if(player1.getRole().getHealth() == 0){
                System.out.println("You lose to AI...");
            }else if(player2.getRole().getHealth() == 0){
                System.out.println("You win!");
            }
            turn++;
        }
        sc.close();
    }
}