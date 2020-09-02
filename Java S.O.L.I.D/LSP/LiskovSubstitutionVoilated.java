// Every derived class should be substitutable for their base class

// In below example bicycle has no engine 
// and any client based functionalities on vehicle involving engine will fail {exit code}
// So vehicle class object cannot be replacable by bicycle violating LiskovSubstitution principle 

class vehicle{
    final int wheelCount;
    private String owner;
    vehicle(int wheels,String owner){
        this.wheelCount = wheels;
        this.owner = owner;
    }
    public String getOwnerName(){
        return owner;
    }
    public boolean startEngine(){
        // some start functions
        return true;
    };
}

class car extends vehicle{
    final int carNumber;
    car(int carNumber,int wheelCount,String owner){
        super(wheelCount,owner);
        this.carNumber = carNumber;
    }
    
    public boolean startEngine(){
        // car specific start-up
        return true;
    }
} 
class bicycle extends vehicle{
    bicycle(int wheelCount,String owner){
        super(wheelCount,owner);
    }
    // no engine to start so the startengine is not applicable so exiting
    
    public boolean startEngine(){
        // throw some error
        System.out.println("Error: unable to start engine {no engine} - exited");
        System.out.println("Here vehicle cannot be replaced by its derived class {bicycle}");
        System.exit(0);
        return false;
    }
}

class Main{
    public static boolean checkVehicle(vehicle v){
        System.out.println("Checking vehicle "+v.getOwnerName()+" startingengine ");
        if(v.startEngine()==true){
            System.out.println("Engine working fine");
            return true;
        }
        else{
            System.out.println("Engine isn't working");
            return false;
        }
    }

    public static void main(String[] args){
        vehicle v = new vehicle(1,"vehicle");
        bicycle b = new bicycle(2,"bicycle");
        checkVehicle(v);
        checkVehicle(b);
    }
}