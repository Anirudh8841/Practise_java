// Example for heirarchial inheritance
// B -> C1 B -> C2 
class Baseclass{
 
    public void print_hi(){
        System.out.println("Hi! from Baseclass");
    }

    public void print_class(){
        System.out.println("Curr - Baseclass");
    }
}

class Childclass1 extends Baseclass{

    @Override
    public void print_class(){
        System.out.println("Curr - Childclass1, Parent - Baseclass");
    }
}

class Childclass2 extends Baseclass{

    @Override
    public void print_class(){
        System.out.println("Curr - Childclass2, Parent - Baseclass");
    }
} 


class Main { 

   public static void main(String[] args)  
   { 
        System.out.println("Example3: Hierarchial Inheritance { B -> C1, B -> C2 } ");
        Baseclass b = new Baseclass();
        b.print_hi();
        b.print_class();

        Childclass1 c1 = new Childclass1();
        c1.print_class();

        Childclass2 c2 = new Childclass2();
        c2.print_class();
   } 
} 