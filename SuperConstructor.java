//classname SuperConstructor.java
class Box{
    double length, breadth, width;

    double CalculateVolume(){
        return length*breadth*width;
    }
    Box(Box ob){
        width = ob.width;
        breadth = ob.breadth;
        length = ob.length;
    }
    Box() {
        length = -1; // use -1 to indicate
        breadth = -1; // an uninitialized
        width = -1; // box
    }

    Box(double length, double breadth, double width){
        System.out.println("Inside constructor");   //illustration
        this.length = length;                       //note that arguement and local variables have same name
        this.breadth = breadth;                     // "this" keyword is used here
        this.width = width;
    }
}
class BoxWeight extends Box{
    double weight;
    BoxWeight(double length, double breadth, double width, double weight){
        super(length, breadth, width);
        System.out.println("Inside constructor");   //illustration
        this.weight = weight;
    }
    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }
    double PrintWeight(){
        return weight;
    }
}
class SuperConstructor{
    public static void main(String args[]){
        Box MyBox1 = new Box(10, 10, 20);
        System.out.println("Volume is " + MyBox1.CalculateVolume());
        BoxWeight MyBox2 = new BoxWeight(10, 10, 20, 50);
        System.out.println("Volume is " + MyBox2.CalculateVolume());
        System.out.println("Weight is " + MyBox2.PrintWeight());
        BoxWeight MyClone = new BoxWeight(MyBox2);
        System.out.println("Volume is " + MyClone.CalculateVolume());
        System.out.println("Weight is " + MyClone.PrintWeight());
    }
}
