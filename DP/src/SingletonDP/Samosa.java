package SingletonDP;

public class Samosa {

    private static Samosa instance;
    private Samosa() {
        //for creating singleton class object constructor always be private
    }

    //Lazy way to create singleton object.
    //In Lazy way object call at the time when method is create.
    public static Samosa getSamosa() {

        if (instance == null){
            instance = new Samosa();
        }

        return instance;
    }
}
