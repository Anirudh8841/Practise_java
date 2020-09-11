// High level module/classes should not depend on any low-level module/classes but should depend on abstractions
// Abstraction shouldnot depend upon details but details should depend on abstraction
import java.util.*;
interface Developer{
    public void develop();
}

class BackEndDeveloper implements Developer{
    @Override
    public void develop(){
        writeJava();
    }   
    private void writeJava(){
        System.out.println("Writing Java program");
    }
}


class FrontEndDeveloper implements Developer{
    @Override
    public void develop(){
        writeJavascript();
    }   
    private void writeJavascript(){
        System.out.println("Writing Javascript program");
    }
}

class Application{
    private List<Developer> dlist  = new ArrayList<Developer>();
    public void addDeveloper(){
        BackEndDeveloper b = new BackEndDeveloper();
        FrontEndDeveloper f = new FrontEndDeveloper();
        dlist.add(b);
        dlist.add(f);
    }
    public void implement(){
        for(Developer d:dlist){
            d.develop();
        }
    }
}

class Main {
    public static void main(String[] args){
        Application app = new Application();
        app.addDeveloper();
        app.implement();
    }
}
