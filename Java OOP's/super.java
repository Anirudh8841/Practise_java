// accessing grandparent members
// super - used as a reference variable for referring parent class object

class base{
    int a=1;
    base(){
        System.out.println("In baseClass constructor");
    }
    void printClass(){
        System.out.println("printing baseClass variable a: "+ a);
    }
}
class child extends base{
    int a=2;

    child(){
        super(); // invoking base class constructor
        System.out.println("In childClass constructor");
    }
    void printClass(){
        super.printClass(); // calling baseclass printClass using super
        System.out.println("printing childClass variable a:"+ a +" and from super.a: "+super.a);
    }
}

// cannot use super.super in derived class
// only able to ref immediate parent class
class subchild extends child{
    int a=3;
    subchild(){
        super(); // invoking child class constructor 
        System.out.println("In sub-childClass constructor");
    }
    void printClass(){
        super.printClass(); // calling baseclass printClass using super
        System.out.println("printing sub-childClass variable a:"+ a +" and from super.a: "+super.a );
    }
}

class Main{
    public static void main(String[] args){
        System.out.println("--- Base --- ");
        base b = new base();
        b.printClass();
        System.out.println("--- Child ---");
        child c = new child();
        c.printClass();
        System.out.println("--- Sub-Child ---");
        subchild sc = new subchild();
        sc.printClass();
    }
}