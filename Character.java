import roles.*;

public abstract class Character {
    protected Status role_Player;
    protected String name_Player;

    public void setName(String name) {
        this.name_Player = name;
    }
    public String getName() {
        return name_Player;
    }
    public void setRole(Status role) {
        this.role_Player = role;
    }
    public Status getRole() {
        return role_Player;
    }

    public abstract void showInfo();
}
