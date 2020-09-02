// Java dont support multiple inheritance 
// But it can be achieved through interfaces
// B1, B2 -> C

interface base1{
    public void printBase1();
    public void printClass();
}

interface base2{
    public void printBase2();
    public void printClass();
}

interface child  extends base1,base2{
    public void printClass();
}

class ChildClass implements child {
    public void printBase1(){
        System.out.println("Hi!, method from base1");
    }
    public void printBase2(){
        System.out.println("Hi!, method from base2");
    }
    @Override
    public void printClass(){
        System.out.println("Curr - Child, Parent:  base1 and base2");
    }
}

class Main { 
   public static void main(String[] args)  
   { 
        System.out.println("Example4: Multiple Inheritance { B1, B2 -> C } ");
        ChildClass c = new ChildClass();
        c.printBase1();
        c.printBase2();
        c.printClass();
   } 
} 