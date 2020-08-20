// Inheritance - mechanism by which one class allow to inherit the features of another class
// syntax:  
    // class derived_class extends base_class{
    //     methods and fields
    // }
// 

// Example for single inheritance
// B --> C 
class Baseclass{
    public void print_hi(){
        System.out.println("Hi! from Baseclass");
    }

    public void print_class(){
        System.out.println("Curr - Baseclass");
    }
}

class Childclass extends Baseclass{
    @Override
    public void print_class(){
        System.out.println("Curr - Childclass, Parent - Baseclass");
    }
}

class Main { 
   public static void main(String[] args)  
   { 
        System.out.println("Example1: Single Inheritance { B --> C } ");
        Baseclass b = new Baseclass();
        b.print_hi();
        b.print_class();
        Childclass c = new Childclass();
        c.print_hi();
        c.print_class();
   } 
} 