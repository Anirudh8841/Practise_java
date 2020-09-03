// Do not force to implement an interface which is irrevalent/useless
// Avoids complex big interfaces and provide small client specific interfaces


// This interface violates ISP and forces OnlineClient class to implement unneccesary offline methods
interface Restaurant{
    public void OnlineOrder();
    public void TelephoneOrder();
    public void FacetoFaceOrder();
    public void payOnline();
    public void payOffline();
}

// for onlineClient
class OnlineClient implements Restaurant{
    public void OnlineOrder(){
        System.out.println("Accepted Online order");
    }
    public void TelephoneOrder(){
        System.out.println("Accepted Telephone order");
    }
    public void payOnline(){
        System.out.println("Paid Online");
    }
    public void FacetoFaceOrder(){
        throw new IllegalArgumentException("FacetoFace NA");
    }
    public void payOffline(){
        throw new IllegalArgumentException("payOffline NA");
    }    
}

// for offlineClient
class OfflineClient implements Restaurant{
    public void OnlineOrder(){
        throw new IllegalArgumentException("payOnline NA");
    }
    public void TelephoneOrder(){
        throw new IllegalArgumentException("TelephoneOrder NA");
    }
    public void payOnline(){
        throw new IllegalArgumentException("payOnline NA");
    }
    public void FacetoFaceOrder(){
        System.out.println("Ordered FacetoFace");
    }
    public void payOffline(){
        System.out.println("Paid Offline");
    }    
}

class Main{
    public static void main(String[] args){
        OnlineClient client = new OnlineClient();
        client.OnlineOrder();
        client.payOnline();
        client.payOffline();
    }
}