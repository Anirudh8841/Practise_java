// restricts the instantiation of a class to one object


// classic implementation (not thread safe)
class Singleton1{
    private static Singleton1 obj;
    // private constructor forces us to use of getInstance
    private Singleton1(){
        System.out.println("Called constructor Singleton1");
    }
    public static Singleton1 getInstance(){
        if(obj==null){
            obj = new Singleton1();
        }
        return obj;
    }
}


//  thread safe
class Singleton2{
    private static Singleton2 obj;
    private Singleton2(){
        System.out.println("Called constructor Singleton2");
    }
    public static synchronized Singleton2 getInstance(){
        if(obj==null){
            obj = new Singleton2();
        }
        return obj;
    }
}


// Eager instantiation 
class Singleton3{
    // jvm executes this static intializer when class is loaded sp thread safe
    private static Singleton3 obj = new Singleton3();
    private Singleton3(){
        System.out.println("Called constructor Singleton3");
    }
    public static Singleton3 getInstance(){
        return obj;
    }
}


// double check single synchronize method
class Singleton4{
    private volatile static Singleton4 obj;
    private Singleton4(){
        System.out.println("Called constructor Singleton4");
    }
    public static Singleton4 getInstance(){
        if(obj==null){
            // to make thread safe
            synchronized(Singleton4.class){
                // many threads might have reaced this step one by one
                if(obj==null){
                    obj = new Singleton4();
                }
            }
        }
        return obj;
    }
}


// Bill Pugh Singleton impl
class Singleton{
    private Singleton(){
        System.out.println("Called constructor Singleton");
    }
    // inner class providing instance of singleton class
    private static class BillPughSingleton{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){
        return BillPughSingleton.INSTANCE;
    }
}

class main{
    public static void main(String[] args){
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 ss1 = Singleton1.getInstance();
        
        Singleton2 s2 = Singleton2.getInstance();
        Singleton2 ss2 = Singleton2.getInstance();

        Singleton3 s3 = Singleton3.getInstance();
        Singleton3 ss3 = Singleton3.getInstance();

        Singleton4 s4 = Singleton4.getInstance();
        Singleton4 ss4 = Singleton4.getInstance();

        Singleton s = Singleton.getInstance();
        Singleton ss = Singleton.getInstance();

    }
}