// Overriding static method
// if the derived class has static function with same signature as in base class 
// then the function will get hidden if a child class object is referenced by parent class

class base { 
    static void printClass() 
    { 
        System.out.println("From baseClass"); 
    } 
} 
  
// B is inheriting A 
class child extends base { 
    static void printClass() 
    { 
        System.out.println("From childClass"); 
    } 
} 
  
class Main { 
    public static void main(String args[]) 
    { 
        base b = new child(); 
        b.printClass(); // prints baseClass (failing runtime polymorphism)   
    } 
} 