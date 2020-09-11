// create object without exposing creation logic 

enum ShapeType{
    S_Rectangle,
    S_Circle
}

class Shape{
    public void printShape(){

    }
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

// factory methods creates the required object and returns so that object creation is hidden and adding new shapes is easy
class GetShapeFactory {
    public static Shape getShape(ShapeType type){
        if(type == ShapeType.S_Rectangle){
            return new Rectangle();
        }
        else if(type== ShapeType.S_Circle){
            return new Circle();
        }
        else{
            throw new IllegalArgumentException("Shape NA");
        }
    }
}

// client no needs to know about the inner class files , also whenever a new shape is added the client doesnt need to change his code like before
class Client{
    private Shape s;
    Client(Shape s){
       this.s = s;
    }
    public Shape getShape(){
        return s;
    }
}

class main{
    public static void main(String[] args){
        Shape s = GetShapeFactory.getShape(ShapeType.S_Rectangle);
        Client c = new Client(s);
        c.getShape().printShape();
    }
}
