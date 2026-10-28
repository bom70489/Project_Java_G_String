package Affinity_interface;

public interface Affinity {
    public static final double FULL_ADVANTAGE = 2.0;
    public static final double HALF_ADVANTAGE = 1.5;
    public static final double NO_ADVANTAGE = 1.0;
    public static final double DISADVANTAGE = 0.5;
    public void damageCalculation(double amount);
    public void healCalculation(double amount);
    

}
