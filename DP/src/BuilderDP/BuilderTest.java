package BuilderDP;

//while creating object when object contain may attributes there are many problem exists:
//1. we have to pass many arguments to create object.
//2. some parameters might be optional
//3. factory class takes all responsibility for creating object. if the object is heavy then all complexity is the part
//of factory class.
//so in builder pattern be create object step by step and finally return final objects with desired values of attributes

public class BuilderTest {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder()
                .setUserId("1A")
                .setUserName("Pankaj Uramaliya")
                .setEmailId("pankaj@gmail.com")
                .build();
        System.out.println(user1);

        User user2 = User.UserBuilder.builder()
                .setEmailId("rahul@gmail.com")
                .setUserId("1B").setUserName("Rahul")
                .build();
        System.out.println(user2);
    }
}
