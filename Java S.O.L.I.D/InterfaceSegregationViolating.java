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
        // System.out.println("FacetoFace NA");
    }
    public void payOffline(){
        throw new IllegalArgumentException("payOffline NA");
        // System.out.println("payOffline NA");
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