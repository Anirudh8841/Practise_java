// a class/functions/modules should remain closed for modification but should have the option for extension
// below is an example for calculating areas of various shapes 

// Without OCP
class Rectangle{
    final double length;
    final double breadth;
    Rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }
}
class Circle{
    final double radius;
    Circle(double radius){
        this.radius = radius;
    }
}
class CalculateArea{
    static double CalculateRectangleArea(double length,double breadth){
        return length*breadth;
    }
    static double CalculateCircleArea(double radius){
        return (22*radius*radius/7);
    }
}
// now if we want to add area for new shape lets say triangle
// we create a class for the triangle and then modify the CalculateArea
// this way of modifying class is not good for practise 


// With OCP 
interface Shape{
    public double calculateAreaOCP();
}
class RectangleOCP implements Shape{
    final double length;
    final double breadth;
    RectangleOCP(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double calculateAreaOCP(){
        return length*breadth;
    }    
}
class CircleOCP implements Shape{
    final double radius;
    CircleOCP(double radius){
        this.radius = radius;
    }
    public double calculateAreaOCP(){
        return (22*radius*radius/7);
    }
}
// now if we want to add area for a new shape then we can simply add a class implementing shape


class Main{
    public static void main(String[] args){
        Rectangle r = new Rectangle(2,3);
        RectangleOCP rOCP = new RectangleOCP(2,3); 
        Circle c = new Circle(7);
        CircleOCP cOCP = new CircleOCP(7);
        System.out.println("OCP - can add new shapes without modifying the CaclulateArea class");
    }
}

