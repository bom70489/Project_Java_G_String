public class Battle {
    static double BattlePhase(int p1 , int p2 , int turn, Player player, Enemy enemy){
        String attacker;
        String defender;
        if(turn % 2 == 1){
            attacker = "You";
            defender = "Enemy";
        }
        else{
            attacker = "Enemy";
            defender = "You";
        }
        
        // Attack 1.Attack 2.Strike 3.Magic
        if(p1 % 3 == 1) System.out.println(attacker + " use attack!");
        else if(p1 % 3 == 2) System.out.println(attacker + " use strike!");
        else if(p1 % 3 == 0) System.out.println(attacker + " use magic!");


        // Defence 1.Guard 2.Counter 3.Barrier
        if(p2 % 3== 1) System.out.println(defender + " use guard!");
        else if(p2 % 3 == 2) System.out.println(defender + " use counter!");
        else if(p2 % 3 == 0) System.out.println(defender + " use barrier!");

        if(turn % 2 == 1){
            if(p1 % 3 == 1){ // P1 choose Attack
                if(p2 % 3 == 1){
                    System.out.println("Attack got blocked"); // P2 guard - blocked
                    return Math.max(1.0,(player.getRole().getAttack() * 0.75)-enemy.getRole().getDefence());
                }else{
                    System.out.println("Attack Successfully!"); // P2 not guard - success
                    return Math.max(1.0,(player.getRole().getAttack() * 0.25)-enemy.getRole().getDefence());
                }
            }else if(p1 % 3 == 2){ // P1 choose Strike
                if(p2 % 3 == 2){
                    System.out.println("Counter Attack!"); // P2 counter - counter attack
                    return Math.max(1.0,(enemy.getRole().getAttack() * 1.25)-player.getRole().getDefence());
                }else{
                    System.out.println("Strike Successfully!"); // P2 not counter - success
                    return Math.max(1.0,(player.getRole().getAttack() * 1)-enemy.getRole().getDefence());
                }
            }else if(p1 % 3 == 0){ // P1 choose Magic
                if(p2 % 3 == 0){
                    System.out.println("Magic Nullified"); // P2 barrier - nullified
                    return 0.0;
                }else{
                    System.out.println("Magic Successfully cast!"); // P2 not barrier - success
                    return Math.max(1.0,(player.getRole().getMagic() * 1.5) - enemy.getRole().getMagicResistance());
                }
            }
        }else{
            if(p1 % 3 == 1){ // P1 choose Attack
                if(p2 % 3 == 1){
                    System.out.println("Attack got blocked"); // P2 guard - blocked
                    return Math.max(1.0,(enemy.getRole().getAttack() * 0.25)-player.getRole().getDefence());
                }else{
                    System.out.println("Attack Successfully!"); // P2 not guard - success
                    return Math.max(1.0,(enemy.getRole().getAttack() * 1)-player.getRole().getDefence());
                }
            }else if(p1 % 3 == 2){ // P1 choose Strike
                if(p2 % 3 == 2){
                    System.out.println("Counter Attack!"); // P2 counter - counter attack
                    return Math.max(1.0,(player.getRole().getAttack() * 1.5)-enemy.getRole().getDefence());
                }else{
                    System.out.println("Strike Successfully!"); // P2 not counter - success
                    return Math.max(1.0,(enemy.getRole().getAttack() * 1.5)-player.getRole().getDefence());
                }
            }else if(p1 % 3 == 0){ // P1 choose Magic
                if(p2 % 3 == 0){
                    System.out.println("Magic Nullified"); // P2 barrier - nullified
                    return 0;
                }else{
                    System.out.println("Magic Successfully cast!"); // P2 not barrier - success
                    return Math.max(1.0,(enemy.getRole().getMagic() * 1.25) - player.getRole().getMagicResistance());
                }
            }
        }
        return 0.0;
    }
}
