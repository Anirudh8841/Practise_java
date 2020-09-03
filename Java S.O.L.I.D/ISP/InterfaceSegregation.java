// Do not force to implement an interface which is irrevalent/useless
// Avoids complex big interfaces and provide small client specific interfaces


// by splitting out the interface for payment and for ordering we have brought single responsibility for interface

// we are not forcing anyb clients for implementing unneccesary methods
interface RestaurantOrder{
    public void  placeOrder();
}

interface RestaurantPayment{
    public void payOrder();
}

// for onlineClient
class OnlineClient implements RestaurantOrder,RestaurantPayment{
    public void placeOrder(){
        // procedure for placing online order
        System.out.println("Ordered Online");
    }
    public void payOrder(){
        // procedure for paying online
        System.out.println("Paid Online");

    }
}

// for offlineClient
class OfflineClient implements RestaurantOrder,RestaurantPayment{
    public void placeOrder(){
        // procedure for Face ton Face order
        System.out.println("Ordered Offline");
    }
    public void payOrder(){
        // procedure for paying offline
        System.out.println("Paid Offline");
    }
}

class Main{
    public static void main(String[] args){
        OnlineClient client = new OnlineClient();
        client.placeOrder();
        client.payOrder();
    }
}