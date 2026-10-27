import roles.All_Roles;

class Player {    
    private All_Roles role_Player;
    private String name_Player;
    private String sword;
    private int damage = 0;
    Player() {
        this.name_Player = "Unknown";
        this.sword = "Unknown";
        this.damage = 0;
    }
    
    void setName(String name) {
        this.name_Player = name;
    }

    String getName() {
        return name_Player;
    }
    
    void setRole(All_Roles role) {
        this.role_Player = role;
    }

    void setSword(String sword , int damage) {
        
    }

    private void level() {
        int level = 1;
        System.out.print("------- Level " + level + " -------");
        System.out.println();
    }

    private void getRolesStatus() {
        System.out.println("------- Roles Status -------");
        role_Player.showStutus();
    }

    void showInfo() {
        level();
        System.out.println("Name : " + this.name_Player);

        // out When player not select
        if(this.role_Player == null) {
            System.out.println("Please select role");
            return;
        }

        System.out.println("Role : " + this.role_Player.getRoleName()); 
        getRolesStatus();
    }
}