// Displaying only essential things
// In java abstraction is achieved by interfaces and abstract classes

// abstract - a non-access modifier (for classes, methods not for varialbles)
// For class:
//   abstract class ClassName{
//     // class body   
//   }
// For methods:
//   abstract type methodName(parameters);

abstract class Employee{
    private final String name;
    private final int employeeID;

    // abstract methods
    abstract void printEmployee();

    // abstract class can have constructor
    public Employee(String name,int employeeID){
        this.name = name;
        this.employeeID = employeeID;
        System.out.println("Constructor Employee is called");
    }

    // abstract classes can have concrete method
    public String getName(){
        return name;
    }
    public int getempID(){
        return employeeID;
    }
}

class Manager extends Employee{
    private final double group;
    private final double salary;
    public Manager(String name, int employeeID, double group, double salary){
        // calling Employee constructor
        super(name,employeeID);
        this.salary = salary;
        this.group = group;
        System.out.println("Constructor Manager is called");
    }
    @Override
    public void printEmployee(){
        System.out.println("Employee details {name:"+getName()+" "+
                                            "empID:"+getempID()+" role: Manager "+ "group: "+group +"}");
    }
}

class Main{
    public static void main(String[] args){
        System.out.println("Example6: Abstraction");
        Employee e1 = new Manager("sam",1,1.0,100.00);
        Employee e2 = new Manager("ani",2,1.2,200.00);
        e1.printEmployee();
        e2.printEmployee();
    }
}