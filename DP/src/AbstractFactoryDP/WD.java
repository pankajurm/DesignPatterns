package AbstractFactoryDP;

public class WD implements Employee{
    @Override
    public int salary() {
        return 45000;
    }

    @Override
    public String name() {
        return "I am Web Developer ";
    }

}
