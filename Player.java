import roles.*;

public class Player {    
    private Roles role_Player;
    private String name_Player;
    private int level;
    public Player() {
        this.name_Player = "Unknown";
        this.level = 1;
    }
    public Player(String name){
        this.name_Player = name;
        this.level = 1;
    }
    
    public void setName(String name) {
        this.name_Player = name;
    }

    public String getName() {
        return name_Player;
    }
    
    public void setRole(Roles role) {
        this.role_Player = role;
    }
    public Roles getRole() {
        return role_Player;
    }
    public int getLevel(){
        return level;
    }
    public void setLevel(int level){
        this.level = level;
    }

    void showInfo() {
        System.out.print("------- Level " + getLevel() + " -------");
        System.out.println();
        System.out.println("Name : " + this.name_Player);
        System.out.println("Role : " + this.role_Player.getRoleName()); 
        System.out.println("------- Roles Status -------");
        role_Player.showStutus();
    }
}