// Topic - Static and intialiazer blocks
// static block - used for static initialisations of a class

class Sample{
    static final int i;

    // Intialiazer block - executes whenever there is instance creation 
    {
        System.out.println("Initialiser block");
    }    
    //static block - executes only once when the class is loaded into memory
    static{
        i = 1;
        System.out.println("Inside static block");
    }
}

class Main{
    public static void main(String args[]){
        Sample s1 = new Sample();
        Sample s2 = new Sample();
        System.out.println("Value in sample s1 is "+s1.i);
    }
}