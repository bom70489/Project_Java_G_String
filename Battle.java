public class Battle {
    static double BattlePhase(int p1 , int p2 , int turn, Player player, Enemy enemy){
        String attacker;
        String defender;
        if(turn % 2 == 1){//our turn
            attacker = "Player";
            defender = "Enemy";
        }
        else{
            attacker = "Enemy";
            defender = "Player";
        }
        
        // Attack 1.Attack 2.Strike 3.Magic
        if(p1 % 3 == 1) System.out.println(attacker + " use attack!");
        else if(p1 % 3 == 2) System.out.println(attacker + " use strike!");
        else if(p1 % 3 == 0) System.out.println(attacker + " use magic!");

        // Defence 1.Guard 2.Counter 3.Barrier
        if(p2 % 3== 1) System.out.println(defender + " use guard!");
        else if(p2 % 3 == 2) System.out.println(defender + " use counter!");
        else if(p2 % 3 == 0) System.out.println(defender + " use barrier!");

        double playerAtk = player.getRole().getAttack();
        double playerMagic = player.getRole().getMagic();
        double playerDefence = player.getRole().getDefence();
        double playerMagicResist = player.getRole().getAttack();
        double playerSpeed = player.getRole().getSpeed();
        double enemyAtk = enemy.getRole().getAttack();
        double enemyMagic = enemy.getRole().getMagic();
        double enemyDefence = enemy.getRole().getDefence();
        double enemyMagicResist = enemy.getRole().getAttack();
        double enemySpeed = enemy.getRole().getSpeed();

        if(turn % 2 == 1){
            if(p1 % 3 == 1){ // P1 choose Attack
                if(p2 % 3 == 1){
                    System.out.println("Attack got blocked"); // P2 guard - blocked
                    return Math.max(1.0,( playerAtk * 0.1 ));
                }else{
                    System.out.println("Attack Successfully!"); // P2 not guard - success
                    if (enemySpeed > playerSpeed) {
                        int DiceAttacker = (int)(Math.random() * 20) + 1;
                        int DiceDefender = (int)(Math.random() * 20) + 1;
                        System.out.println(attacker + " roll! : " + DiceAttacker);
                        System.out.println(defender + " roll! : " + DiceDefender);
                        if (DiceDefender > DiceAttacker) {
                            System.out.println(defender + " successfully dodge!");
                            return 0;
                        } else {
                            System.out.println(defender + " failed to dodge!");
                            return Math.max(1.0,( playerAtk * 1 ) - enemyDefence);
                        }
                    } else {
                        System.out.println(defender + " is too slow to dodge!");
                        return Math.max(1.0,( playerAtk * 1 ) - enemyDefence);
                    }
                }
            }else if(p1 % 3 == 2){ // P1 choose Strike
                if(p2 % 3 == 2){
                    System.out.println("Counter Attack!"); // P2 counter - counter attack
                    return Math.max(1.0, (playerAtk * 1) + (playerMagic * 0.75) - (playerDefence * 0.5) - (playerMagicResist * 0.5));
                }else{
                    System.out.println("Strike Successfully!"); // P2 not counter - success
                    if (enemySpeed > playerSpeed) {
                        int DiceAttacker = (int)(Math.random() * 20) + 1;
                        int DiceDefender = (int)(Math.random() * 20) + 1;
                        System.out.println(attacker + " roll! : " + DiceAttacker);
                        System.out.println(defender + " roll! : " + DiceDefender);
                        if (DiceDefender > DiceAttacker) {
                            System.out.println(defender + " successfully dodge!");
                            return 0;
                        } else {
                            System.out.println(defender + " failed to dodge!");
                            return Math.max(1.0, (playerAtk * 1) + (playerMagic * 0.75) - (enemyDefence * 0.5) - (enemyMagicResist * 0.5));
                        }
                    } else {
                        System.out.println(defender + " is too slow to dodge!");
                        return Math.max(1.0, (playerAtk * 1) + (playerMagic * 0.75) - (enemyDefence * 0.5) - (enemyMagicResist * 0.5));
                    }
                }
            }else if(p1 % 3 == 0){ // P1 choose Magic
                if(p2 % 3 == 0){
                    System.out.println("Magic Nullified"); // P2 barrier - nullified
                    return 0.0;
                }else{
                    System.out.println("Magic Successfully cast!"); // P2 not barrier - success
                    if (enemySpeed > playerSpeed) {
                        int DiceAttacker = (int)(Math.random() * 20) + 1;
                        int DiceDefender = (int)(Math.random() * 20) + 1;
                        System.out.println(attacker + " roll! : " + DiceAttacker);
                        System.out.println(defender + " roll! : " + DiceDefender);
                        if (DiceDefender > DiceAttacker) {
                            System.out.println(defender + " successfully dodge!");
                            return 0;
                        } else {
                            System.out.println(defender + " failed to dodge!");
                            return Math.max(30.0,(playerMagic * 1.2) - enemyMagicResist);
                        }
                    } else {
                        System.out.println(defender + " is too slow to dodge!");
                        return Math.max(30.0,(playerMagic * 1.2) - enemyMagicResist);
                    }
                }
            }
        }else{
            if(p1 % 3 == 1){ // P1 choose Attack
                if(p2 % 3 == 1){
                    System.out.println("Attack got blocked"); // P2 guard - blocked
                    return Math.max(1.0,( enemyAtk * 0.1 ));
                }else{
                    System.out.println("Attack Successfully!"); // P2 not guard - success
                    if (playerSpeed > enemySpeed) {
                        int DiceAttacker = (int)(Math.random() * 20) + 1;
                        int DiceDefender = (int)(Math.random() * 20) + 1;
                        System.out.println(attacker + " roll! : " + DiceAttacker);
                        System.out.println(defender + " roll! : " + DiceDefender);
                        if (DiceDefender > DiceAttacker) {
                            System.out.println(defender + " successfully dodge!");
                            return 0;
                        } else {
                            System.out.println(defender + " failed to dodge!");
                            return Math.max(1.0,( enemyAtk * 1) - playerDefence);
                        }
                    } else {
                        System.out.println(defender + " is too slow to dodge!");
                        return Math.max(1.0,( enemyAtk * 1) - playerDefence);
                    }
                }
            }else if(p1 % 3 == 2){ // P1 choose Strike
                if(p2 % 3 == 2){
                    System.out.println("Counter Attack!"); // P2 counter - counter attack
                    return Math.max(1.0, (enemyAtk * 1) + (enemyMagic * 0.75) - (enemyDefence * 0.5) - (enemyMagicResist * 0.5));
                }else{
                    System.out.println("Strike Successfully!"); // P2 not counter - success
                    if (playerSpeed > enemySpeed) {
                        int DiceAttacker = (int)(Math.random() * 20) + 1;
                        int DiceDefender = (int)(Math.random() * 20) + 1;
                        System.out.println(attacker + " roll! : " + DiceAttacker);
                        System.out.println(defender + " roll! : " + DiceDefender);
                        if (DiceDefender > DiceAttacker) {
                            System.out.println(defender + " successfully dodge!");
                            return 0;
                        } else {
                            System.out.println(defender + " failed to dodge!");
                            return Math.max(1.0, (enemyAtk * 1) + (enemyMagic * 0.75) - (playerDefence * 0.5) - (playerMagicResist * 0.5));
                        }
                    } else {
                        System.out.println(defender + " is too slow to dodge!");
                        return Math.max(1.0, (enemyAtk * 1) + (enemyMagic * 0.75) - (playerDefence * 0.5) - (playerMagicResist * 0.5));
                    }
                }
            }else if(p1 % 3 == 0){ // P1 choose Magic
                if(p2 % 3 == 0){
                    System.out.println("Magic Nullified"); // P2 barrier - nullified
                    return 0;
                }else{
                    System.out.println("Magic Successfully cast!"); // P2 not barrier - success
                    if (playerSpeed > enemySpeed) {
                        int DiceAttacker = (int)(Math.random() * 20) + 1;
                        int DiceDefender = (int)(Math.random() * 20) + 1;
                        System.out.println(attacker + " roll! : " + DiceAttacker);
                        System.out.println(defender + " roll! : " + DiceDefender);
                        if (DiceDefender > DiceAttacker) {
                            System.out.println(defender + " successfully dodge!");
                            return 0;
                        } else {
                            System.out.println(defender + " failed to dodge!");
                            return Math.max(30.0,(enemyMagic * 1.2) - playerMagicResist);
                        }
                    } else {
                        System.out.println(defender + " is too slow to dodge!");
                        return Math.max(30.0,(enemyMagic * 1.2) - playerMagicResist);
                    }
                }
            }
        }
        return 0.0;
    }
}