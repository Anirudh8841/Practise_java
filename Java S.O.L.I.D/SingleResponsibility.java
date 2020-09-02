// every class should have only have a single job/responsibility/purpose
// Pros - 1. Testing becomes easy with less functionality 
//        2. Leads to better code organisation since smaller and well purposed classes are easy to search


class Employee{
    final String name;
    final int employeeID;
    String address;

    Employee(String name, int employeeID,String address){
        this.name =  name;
        this.employeeID = employeeID;
        this.address = address;

    }
}

// EmployeeSetting without SRP
// both updating and validation jobs in single class so NO SRP
class EmployeeSetting{
    static void changeAddress(Employee employee,String newAdress){
        if(validEmployee(employee)){
            employee.address = newAdress;
        }
    }

    static boolean validEmployee(Employee employee){
        if(employee.employeeID>0){
            return true;
        }
        else{
            return false;
        }
    }
}

// EmployeeSetting with SRP
// Two class for two jobs (EmployeeSettingSRP for updating and EmployeeAuthentication for validation)
class EmployeeSettingSRP{
    static void changeAddress(Employee employee,String newAdress){
        if(EmployeeAuthentication.validEmployee(employee)){
            employee.address = newAdress;
        }
    }
}
class EmployeeAuthentication{
    static boolean validEmployee(Employee employee){
        if(employee.employeeID>0){
            return true;
        }
        else{
            return false;
        }
    }
}

class Main{
    public static void main(String[] args){
        Employee e = new Employee("ani",1,"a");
        EmployeeSetting.changeAddress(e,"address changed without SRP");
        System.out.println(e.address);
        EmployeeSettingSRP.changeAddress(e,"address changed with SRP");
        System.out.println(e.address);

    }
}
