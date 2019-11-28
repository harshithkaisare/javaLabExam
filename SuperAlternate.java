//classname SuperAlternate.java
class SuperClass{
    int i;
    void Showi(){
        System.out.println(i);
    }
}

class SubClass extends SuperClass{
    int i;
    SubClass(int a, int b){
        i = a;
        super.i = b;
    }
    void Sum(){
        int Sum = i + super.i;
        System.out.println("Sum is : " + Sum);
    }
    void Showii(){
        System.out.println(i + " superclass -- " + super.i);
    }
}

class SuperAlternate{
    public static void main(String args[]){
        SuperClass SuperObject = new SuperClass();
        SubClass SubObject = new SubClass(7, 10);
        SuperObject.i = 17;
        SuperObject.Showi();
        System.out.println("*********");
        SubObject.Showii();
        SubObject.Sum();
    }
}
