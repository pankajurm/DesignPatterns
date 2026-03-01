package IteratorDP;


//The Iterator design pattern provides a way to access the elements of an objects without exposing
// its underlying implementation

public class IteratorTest {
    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("Pankaj", "14"));
        userManagement.addUser(new User("dev", "15"));
        userManagement.addUser(new User("raj", "18"));
        userManagement.addUser(new User("deep", "16"));
        userManagement.addUser(new User("prem", "19"));

        MyIterator myIterator = userManagement.getIterator();

        while(myIterator.hasNext()){
            User user = (User) myIterator.next();
            System.out.println(user.getName());
        }

    }
}
