package AbstractFactoryDP;

public class Manager implements Employee{
    @Override
    public int salary() {
        return 100000;
    }

    @Override
    public String name() {
        return "This is manager: ";
    }
}
