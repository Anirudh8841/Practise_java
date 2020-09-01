// restricting access to derived class method
// cannot ovveride private methods - static binding

class base{
    public void publicMethod(){
        System.out.println("publicMethod in baseClass");
    } 
    private void privateMethod(){
        System.out.println("privateMethod in baseClass");
    }

    class child extends base{
        // here printClass method cannot be private or anything access modifier except public
        public void publicMethod(){
            System.out.println("publicMethod in childclass");
        }
        // here privateMethod can be anything since it is private in base
        private void privateMethod(){
            System.out.println("privateMethod in childClass");
        }
    }

    public static void main(String[] args){
        System.out.println("Example for restricting access to derived class");
        base b = new base();
        child c = b.new child();
        b.publicMethod();
        c.publicMethod();
        b.privateMethod();
        c.privateMethod();
        System.out.println("Overriding failed for privateMethods {No runtime polymorphism}");
        b=c; // base b is referring to child object
        b.publicMethod(); 
        b.privateMethod();
        System.out.println("Overriding works in publicMethods but failed in privateMethods");


    }
}