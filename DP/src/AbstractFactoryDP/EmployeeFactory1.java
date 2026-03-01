package AbstractFactoryDP;

public class EmployeeFactory1 {

    public static Employee getEmployee(EmployeeAbstractFactory factory) {
        return factory.createEmployee();

    }
}
