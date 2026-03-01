package overriden;

public class Dog {
    Animal a = new Animal();
    void bark() {
        a.eat();
        System.out.println("B class");
    }
}
