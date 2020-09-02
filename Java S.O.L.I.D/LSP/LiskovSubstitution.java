// Every derived class should be substitutable for their base class

class Vehicle{
    final int wheelcount;
    private String owner;
    Vehicle(int wheelcount,String owner){
        this.wheelcount = wheelcount;
        this.owner = owner;
    }
    public String getOwnerName(){
        return owner;
    }
}

class EnginedVehicles extends Vehicle{
    final int vehicleNumber;
    EnginedVehicles(int vehicleNumber,int wheelCount,String owner){
        super(wheelCount,owner);
        this.vehicleNumber = vehicleNumber;
    }
    public boolean startEngine(){
        // some start functions
        return true;
    }
}
class car extends EnginedVehicles{
    car(int carNumber,int wheelCount,String owner){
        super(carNumber,wheelCount,owner);
    }
    @Override
    public boolean startEngine(){
        // car specific start-up
        return true;
    }
}

class NonenginedVehicles extends Vehicle{
    // some functionalities for non engined
    NonenginedVehicles(int wheelcount,String owner){
        super(wheelcount,owner);
    }
}

class bicycle extends NonenginedVehicles{
    bicycle(int wheelCount,String owner){
        super(wheelCount,owner);
    }
}
class Main{
    public static void main(String[] args){
        // removing engine functionalities from Vehicles 
        // And spliting Vehicle into Engined and NonEngined will make sure LSP is followed
        System.out.println("Here Vehicle can be replaced by any of its derived classes {car,bicycle}");
    }
}