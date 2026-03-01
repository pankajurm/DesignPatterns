package AbstractFactoryDP;

public class ADFactory extends EmployeeAbstractFactory{

    @Override
    public Employee createEmployee() {
        return new AD();
    }
}
