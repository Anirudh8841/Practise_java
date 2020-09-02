// Inheritance - mechanism by which one class allow to inherit the features of another class
// syntax:  
    // class DerivedClass extends BaseClass{
    //     methods and fields
    // }
// 

// Example for single inheritance
// B --> C 
class BaseClass{
    public void printHI(){
        System.out.println("Hi! from BaseClass");
    }

    public void printClass(){
        System.out.println("Curr - BaseClass");
    }
}

class ChildClass extends BaseClass{
    @Override
    public void printClass(){
        System.out.println("Curr - ChildClass, Parent - BaseClass");
    }
}

class Main { 
   public static void main(String[] args)  
   { 
        System.out.println("Example1: Single Inheritance { B --> C } ");
        BaseClass b = new BaseClass();
        b.printHI();
        b.printClass();
        ChildClass c = new ChildClass();
        c.printHI();
        c.printClass();
   } 
} 