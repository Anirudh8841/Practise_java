// Example for Multilevel inheritance
// B --> C1 --> C2
class BaseClass{
 
    public void printHI(){
        System.out.println("Hi! from BaseClass");
    }

    public void printClass(){
        System.out.println("Curr - BaseClass");
    }
}

class ChildClass1 extends BaseClass{

    @Override
    public void printClass(){
        System.out.println("Curr - ChildClass1, Parent - BaseClass");
    }
}

class ChildClass2 extends ChildClass1{

    @Override
    public void printClass(){
        System.out.println("Curr - ChildClass2, Parent - ChildClass1");
    }
} 


class Main { 

   public static void main(String[] args)  
   { 
        System.out.println("Example2: Multi Level Inheritance { B --> C1 --> C2} ");
        BaseClass b = new BaseClass();
        b.printHI();
        b.printClass();

        ChildClass1 c1 = new ChildClass1();
        c1.printClass();

        ChildClass2 c2 = new ChildClass2();
        c2.printClass();
   } 
} 