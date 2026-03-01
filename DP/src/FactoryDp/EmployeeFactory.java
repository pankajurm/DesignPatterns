package FactoryDp;

public class EmployeeFactory {

    //get the employee
    public static Employee getEmployee(String empType){

        if(empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")){
            return new AndroidDev();
        }
        else if (empType.trim().equalsIgnoreCase("WEB DEVELOPER")){
            return new WebDev();
        }
        else {
            return null;
        }

    }
}
