package AbstractFactoryDP;

//yha par interface ka object create kre implementation par jyada focus na kare.
//it is similar to factory pattern
//it provide the concept of factory of factories.
//factory use kar rhi hai dusri factory ko object create krne ke liye.
//Factory Method: Subclass decide karta hai ki kaunsa object banega.
//Abstract Factory: Ek factory jo related objects ke group banati hai bina unki exact classes ke.
public class AbstractFactoryDpTest {
    public static void main(String[] args) {


        //I want to get Android Developer
        Employee e1 = EmployeeFactory1.getEmployee(new ADFactory());
        System.out.println("Dev name: " +e1.name());
        System.out.println("Salary of AD: " +e1.salary());

        //web developer
        Employee e2 = EmployeeFactory1.getEmployee(new WDFactory());
        System.out.println("Dev name: " +e2.name());
        System.out.println("Salary of WD: " +e2.salary());

        //Manager
        Employee e3 = EmployeeFactory1.getEmployee(new ManagerFactory());
        System.out.println("Post name: " +e3.name());
        System.out.println("Salary of Manager: " +e3.salary());
    }

}
