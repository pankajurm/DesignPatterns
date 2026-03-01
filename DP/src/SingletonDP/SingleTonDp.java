package SingletonDP;


//constructor should be private
//object create with the help of method.
//create field to store object is private.

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//To break singleton there is many way.
//1. Reflection API to break singleton2.
public class SingleTonDp {
    public static void main(String[] args) throws Exception{
        //new Samosa(); //we cant call because constructor is private
        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());

        Samosa samosa2 = Samosa.getSamosa();
        System.out.println(samosa2.hashCode());

        System.out.println(Jalebi.getJalebi().hashCode());
        System.out.println(Jalebi.getJalebi().hashCode());
        Jalebi j1 = Jalebi.getJalebi();
        Jalebi j2 = Jalebi.getJalebi();
        System.out.println(j1==j2); //true

        //break singleton

//        ThreadSamosa s1 = ThreadSamosa.getInstance();
//        System.out.println(s1.hashCode()); //hashCode Same
//
        ThreadSamosa s2 = ThreadSamosa.getInstance();
        System.out.println("S2: " +s2.hashCode()); //hashCode Same

        /*Constructor<ThreadSamosa> constructor = ThreadSamosa.class.getDeclaredConstructor();

        constructor.setAccessible(true); // constructor private to public
        ThreadSamosa newInstance = constructor.newInstance();
        ThreadSamosa s3 = constructor.newInstance();
        System.out.println(s3.hashCode()); //hashCode different


        //singleton break se bachne ke liye kya kre it means ya to object na bne ya object same aaye.
        //there is 2 way to solve the singleton break
        //1.if object is there or exist --> so we throw the exception inside the constructor.threadSamosa line no. 8
        //2. use enum*/
//        ThreadSamosa s4 = ThreadSamosa.INSTANCE; //enum
//        System.out.println("S4: " +s4.hashCode());

        //another way to save singleton break
        //1.-->Deserialization: solution: implementing readResolve method.
        //2.--> using cloning

        ThreadSamosa s5 = ThreadSamosa.getInstance();
        System.out.println("S5: "+s5.hashCode());
        /*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(s5);

        System.out.println("serialization done...");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        ThreadSamosa s6 = (ThreadSamosa)ois.readObject();
        System.out.println("S6: " +s6.hashCode());
        System.out.println(" Deserialization done..");*/

        //using cloning
        //implement Cloneable in ThreadSamosa class
        //create Object clone method inside ThreadSamosa class
        // Throw exception CloneNotSupported in clone method.
        ThreadSamosa s7 = (ThreadSamosa)s5.clone();
        System.out.println("S7: " +s5.hashCode());
    }
}
