import roles.*;

public abstract class Character {
    protected Roles role_Player;
    protected String name_Player;

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

    public abstract void showInfo();
}
