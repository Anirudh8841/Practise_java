// High level module/classes should not depend on any low-level module/classes but should depend on abstractions
// Abstraction shouldnot depend upon details but details should depend on abstraction

class BackEndDeveloper{
    public void writeJava(){
        System.out.println("Writing java program");
    }
}

class FrontEndDeveloper{
    public void writeJavascript(){
        System.out.println("Writing javascript program");
    }
}

class Application{
    private BackEndDeveloper b = new BackEndDeveloper();
    private FrontEndDeveloper f = new FrontEndDeveloper();
    public void implement(){
        b.writeJava();
        f.writeJavascript();
    }
}
class Main{
    public static void main(String[] args){
        Application app = new Application();
        app.implement();
    }
}