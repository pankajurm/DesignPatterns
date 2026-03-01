package PrototypeDP;

//The concept is to copy an existing object rather than creating a new instance from scratch because creating new object
//may be costly.
//this approach saves costly resources and time, especially when object creation is a heavy process.
//isme object ki new copy nhi bnate pehle bane object ko new login me use karte hai. clone ki help se second third time logic
//likhne se bach jate hai
//Prototype DP two type ke hote hai.
//1. Shallow copy-->when we create the object and wants to copy the object in shallow copy, copy the reference of the
//object and not copy the object. if we change the value of object then copy object value also be the change
//2. Deep Copy --> in deep copy


public class PrototypeTest {
    public static void main(String[] args) throws InterruptedException {
        NetworkConnection networkConnection = new NetworkConnection();

        networkConnection.setIp("192.225.12.10.4");
        networkConnection.loadData(); //2 sec time taken to load the data.

        //we want new object of network connection
        NetworkConnection networkConnection2 = null;
        try {
            //NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
            networkConnection2 = (NetworkConnection) networkConnection.clone();
            NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection);

            networkConnection.getDomains().remove(0);
            System.out.println(networkConnection);

            System.out.println(networkConnection2);
            System.out.println(networkConnection3);

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
