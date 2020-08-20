// Java dont support multiple inheritance 
// But it can be achieved through interfaces
// B1, B2 -> C

interface base1{
    public void print_base1();
    public void print_class();
}

interface base2{
    public void print_base2();
    public void print_class();
}

interface child  extends base1,base2{
    public void print_class();
}

class childclass implements child {
    public void print_base1(){
        System.out.println("Hi!, method from Baseclass1");
    }
    public void print_base2(){
        System.out.println("Hi!, method from Baseclass2");
    }
    @Override
    public void print_class(){
        System.out.println("Curr - Child, Parent:  base1 and base2");
    }
}

class Main { 
   public static void main(String[] args)  
   { 
        System.out.println("Example4: Multiple Inheritance { B1, B2 -> C } ");
        childclass c = new childclass();
        c.print_base1();
        c.print_base2();
        c.print_class();
   } 
} 