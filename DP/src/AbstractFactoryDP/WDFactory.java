package AbstractFactoryDP;

public class WDFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new WD();
    }
}
