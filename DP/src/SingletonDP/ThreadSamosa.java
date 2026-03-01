package SingletonDP;

import java.io.Serial;
import java.io.Serializable;

//public enum ThreadSamosa {
//    INSTANCE
//}
public class ThreadSamosa implements Serializable, Cloneable {

    private static ThreadSamosa instance;

    private ThreadSamosa() {
//        if (instance != null) { // use to save the break singleton
//            throw new RuntimeException("You are trying to break singleton pattern");
//        }
    }


    //public synchronized static ThreadSamosa getInstance(){ //method synchronized.
    public static ThreadSamosa getInstance(){
        if (instance == null){
            synchronized (ThreadSamosa.class){ //block synchronized this is best practice
                if (instance==null){
                    instance = new ThreadSamosa();
                }
            }
        }
        return instance;
    }

    public Object readResolve() { //for deserialization
        return instance;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return instance;
    }

}
