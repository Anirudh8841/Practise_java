// this is a reference variable referring to current object

class Test{
    final int a;
    final int b;
    
    // this referring to current class constructor 
    Test(){
        this(1,2);
        System.out.println("'this' referring to current class constructor ");
    }

    // this referring to current class instance variables
    Test(int a,int b){
        System.out.println("'this' referring to current class instance variables ");
        this.a = a; 
        this.b = b;
    }

    // this to return current class instance
    public Test get(){
        System.out.println("'this' returned current class instance ");
        return this;
    }

    // this as  as method parameter for printing
    private void print(){
        System.out.println("'this' as method parameter for printing");
        toString(this);
    }

    //this referring to current class method
    public void display(){
        System.out.println("'this' referring to current class method");
        this.print();
    }
    
    private void toString(Test obj){
        System.out.println("printing a= "+obj.a+" b= "+obj.b);
    }
}

class Main{
    public static void main(String[] args){
        Test t= new Test();
        t.get().display();
    }
}