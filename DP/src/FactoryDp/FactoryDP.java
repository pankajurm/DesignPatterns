package FactoryDp;


//Factory DP-->when there is superclass and multiple subclasses and we want to get object of subclasses based on input
//and requirement then we create factory class which takes the responsibility of creating object of class based on input
// its also caller Factory method design pattern
//Advantages of Factory DP
//1. Focus on creating object for interface rather than implementation.
//2. Loose coupling more robust code.
//Factory Method: Subclass decide karta hai ki kaunsa object banega.
//Abstract Factory: Ek factory jo related objects ke group banati hai bina unki exact classes ke.
public class FactoryDP {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        int salary = employee.Salary();
        System.out.println("Android Dev Salary: " +salary);

        Employee employee1 = EmployeeFactory.getEmployee("WEB DEVELOPER");
        int salary1 = employee1.Salary();
        System.out.println("Web Dev Salary: " +salary1);
    }
}
