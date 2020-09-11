// create object without exposing creation logic 


class Shape{
    public void printShape(){};
}
class Rectangle extends Shape{
    public void printShape(){
        System.out.println("Rectangle shape");
    }
}
class Circle extends Shape{
    public void printShape(){
        System.out.println("Circular shape");
    }
}

// client needs to know the constructors of lib, also whenever a new shape is added the client needs to change his code according adding one more elseif
// not a good practise to expose and also asking to modify client code  after adding new things to lib
class client{
    private Shape s;
    client(int type){
        if(type==1){
            s = new Rectangle();
        }
        else if(type==2){
            s = new Circle();
        }
    }
    public Shape getShape(){
        return s;
    }
}

class main{
    public static void main(String[] args){
        client c = new client(1);
        c.getShape().printShape();
    }
}
