public class Battle {
    static void BattlePhase(int p1 , int p2 , int turn){
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


        if(p1 % 3 == 1){ // P1 choose Attack
            if(p2 % 3 == 1){
                System.out.println("Attack got blocked"); // P2 guard - blocked
            }else{
                System.out.println("Attack Successfully!"); // P2 not guard - success
            }
        }else if(p1 % 3 == 2){ // P1 choose Strike
            if(p2 % 3 == 2){
                System.out.println("Counter Attack!"); // P2 counter - counter attack
            }else{
                System.out.println("Strike Successfully!"); // P2 not counter - success
            }
        }else if(p1 % 3 == 0){ // P1 choose Magic
            if(p2 % 3 == 0){
                System.out.println("Magic Nullified"); // P2 barrier - nullified
            }else{
                System.out.println("Magic Successfully cast!"); // P2 not barrier - success
            }
        }
    }
}
