package mode;
import Interface.Mode;

public class GameMode implements Mode {
    public static double selectMode(int number) {
        if(number < 1 || number > 3){
            System.out.println("invalid input your role will be randomly select"); //if input not 1-3
            number = (int)(Math.random() * 3 ) + 1; // random from 1 to 3
        }
        switch (number) {
            case 1 : 
                return EASY;
            case 2 :
                return MEDIUM;
            case 3 : 
                return HARD;
            default :
                return EASY; // Default Mode
        }
    }
}