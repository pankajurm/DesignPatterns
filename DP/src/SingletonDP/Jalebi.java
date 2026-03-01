package SingletonDP;

public class Jalebi {

    //Eager way of creating singleton object.
    //Eager way me static initialization pehle hota hai.
    //In Eager way object creation at the time of class loading
    private static Jalebi jalebi = new Jalebi(); // Eager way

    public static Jalebi getJalebi() {
        return jalebi;
    }
}
