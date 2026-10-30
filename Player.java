public class Player extends Character{    
    private int level;
    public Player() {
        this.name_Player = "Unknown";
        this.level = 1;
    }
    public Player(String name){
        this.name_Player = name;
        this.level = 1;
    }
    public void levelUpPlayer(){
        level++;
    }

    public void showInfo() {
        System.out.print("----------- Level : " + level + " --------");
        System.out.println();
        System.out.println("Name : " + this.name_Player);
        System.out.println("Role : " + this.role_Player.getRoleName()); 
        System.out.println("-------- Roles Status --------");
        role_Player.showStutus();
    }
}