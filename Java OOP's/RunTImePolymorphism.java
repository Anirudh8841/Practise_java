// Method overriding in java supports run time polymorphism
// when a method has same signature in its base and child class, then the execution 
// will depend on the type of object being referred at the run time

class base{
   public void myMethod(){
	System.out.println("Hi... from base class");
   }
}
class child extends base{
   public void myMethod(){
	System.out.println("Hi... from child class");
   }
}

class Main{
   public static void main(String args[]){
    
    System.out.println("Example8: RunTimePolymorphism");

	base b = new base(); // object of type base
    
    child c = new child(); //object of type child

	b.myMethod();

    b=c; // ref b of type base is reffering to child object c 
    
    b.myMethod();
   
   }
}