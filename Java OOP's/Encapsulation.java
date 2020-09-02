// Encapsulation : wrapping up of data under class  
// protects data from being accessed outside of class 
// Can be achieved by declaring all variables as 'private' and writing public methods for accessing the required variables

// Example for encapsulation 
class Employee{
    private final String name;
    private final int employeeID;
    private final int secretPin;
    
    public Employee(String empname, int empID, int empsecretPin){
        name = empname;
        employeeID = empID;
        secretPin = empsecretPin;
    }

    // get methods only for required fields
    public String getName(){
        return name;
    }
    public int getEmployeeID(){
        return employeeID;
    }
    
    // set methods
    // public void setsecretPin(int newsecretPin){
    //     secretPin = newsecretPin;
    // }
}

class Main { 
   public static void main(String[] args)  
   { 
        System.out.println("Example5: Encapsulation");
        Employee emp = new Employee("anirudh",1,100);
        System.out.println("emp's name: "+emp.getName());
        System.out.println("emp's EmpID: "+emp.getEmployeeID());
        System.out.println("emp's SecretPin: Unable to access {No access method}");
        // emp.setsecretPin(200);
        // System.out.println("emp's SecretPin Successfully updated but can't view {No access}");
   } 
} 
