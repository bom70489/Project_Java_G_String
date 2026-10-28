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
    
    public int getLevel(){
        return level;
    }
    public void setLevel(int level){
        this.level = level;
    }

    public void attack() {
        
    }

    public void showInfo() {
        System.out.print("------- Level " + getLevel() + " -------");
        System.out.println();
        System.out.println("Name : " + this.name_Player);
        System.out.println("Role : " + this.role_Player.getRoleName()); 
        System.out.println("------- Roles Status -------");
        role_Player.showStutus();
    }
}