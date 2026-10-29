public class Enemy extends Character{

    public Enemy(){
        this.name_Player = "Toto"; //defalut name Toto
    }
    public Enemy(String roleName , String diff){
        this.name_Player += roleName + diff; //enemy name change according to diffeculty 
    }
    
    public void showInfo() {
        System.out.println("Name : " + this.name_Player);
        System.out.println("Role : " + this.role_Player.getRoleName()); 
        System.out.println("-------- Roles Status --------");
        role_Player.showStutus();
    }
}
