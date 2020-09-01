// strictfp - a keyword used for restricting floating-point calculations
// ensures same result on every platform

// strictfp is used with interfaces, classes , methods(non-abstract)
// Syntax:
    // strictfp class/interface base{ 
        // all methods here are implicitly strictfp
    // }
    //  class base{
    //      public strictfp void Method(){} 
    //  }


strictfp class Test1{
    // All methods are implicitly strictfp in this class 
    public void printSum(){
        double a = 1e+10;
        double b = 2e+10;
        System.out.println(a+b);
    }
}
class Test2{
    // strictfp method
    public strictfp void printSum(){
        double a = 1e+10;
        double b = 2e+10;
        System.out.println(a+b);
    }
}

class Main{
    public static void main(String[] args){
        Test1 t1 = new Test1();
        t1.printSum();
        Test2 t2 = new Test2();
        t2.printSum();
    }
}

