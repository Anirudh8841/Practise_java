// Generally CompileTimePolymorphism is achieved in Method overloading and operator overloading
// In java there is no user defined operator overloading support but supports method overloading
// Method overloading - same name but different parameters 

class MyAddition{
    static int Addition(int a,int b){
        return a+b;
    }
    // diff type of arguments
    static double Addition(double a,double b){
        return a+b;
    }
    // diff number of arguments
    static int Addition(int a,int b,int c){
        return a+b+c;
    }
    static double Addition(double a,double b, double c){
        return a+b+c;
    }
}

class Main{
    public static void main(String[] args){
        System.out.println("Example7: CompileTimePolymorphism");
        System.out.println("Integer Additions");
        System.out.println("(1,2):"+MyAddition.Addition(1,2));
        System.out.println("(1,2,3):"+ MyAddition.Addition(1,2,3));
        System.out.println("Double additions");
        System.out.println("(1.0,2.0):"+MyAddition.Addition(1.0,2.0));
        System.out.println("(1.0,2.0,3.0):"+MyAddition.Addition(1.0,2.0,3.0));
    }
}