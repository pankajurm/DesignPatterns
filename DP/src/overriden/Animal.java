package overriden;

public class Animal {

    void eat() {
        System.out.println("eating");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }
}
