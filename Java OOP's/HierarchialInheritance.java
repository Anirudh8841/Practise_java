// Example for heirarchial inheritance
// B -> C1 B -> C2 
class BaseClass{
 
    public void printHI(){
        System.out.println("HI! from BaseClass");
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

class Childclass2 extends BaseClass{

    @Override
    public void printClass(){
        System.out.println("Curr - Childclass2, Parent - BaseClass");
    }
} 


class Main { 

   public static void main(String[] args)  
   { 
        System.out.println("Example3: Hierarchial Inheritance { B -> C1, B -> C2 } ");
        BaseClass b = new BaseClass();
        b.printHI();
        b.printClass();

        ChildClass1 c1 = new ChildClass1();
        c1.printClass();

        Childclass2 c2 = new Childclass2();
        c2.printClass();
   } 
} 