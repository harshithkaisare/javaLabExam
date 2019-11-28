//classname AbstractAreas.java
abstract class Figure{
    double Dim1, Dim2;
    Figure(double a, double b){
        Dim1 = a;
        Dim2 = b;
    }
    abstract double area();
}
class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a, b);
    }
    double area(){
        System.out.println("Rectangle Area");
        return Dim1*Dim2;
    }
}
class Triangle extends Figure{
    Triangle(double a, double b){
        super(a, b);
    }
    double area(){
        System.out.println("Triangle Area");
        return (Dim1*Dim2)/2;
    }
}
class AbstractAreas{
    public static void main(String args[]){
        Rectangle r = new Rectangle(10, 9);
        Triangle t = new Triangle(10, 8);
        Figure figureREF;
        figureREF = r;
        System.out.println("Area is " + figureREF.area());
        figureREF = t;
        System.out.println("Area is " + figureREF.area());
    }   
}
