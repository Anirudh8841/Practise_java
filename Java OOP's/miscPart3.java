// Overloading a static method with non static 
// we cannot overload methods if they only differ with static word

class Sample{
    static int Addition(int a,int b){
        return a+b;
    }
    int Addition(int a,int b){
        return a+b;
    }
} 
class Main{
    
    public static void main(String[] args){
        // will get compilation error 
    }
}