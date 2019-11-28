//classname SimpleInheritance.java
class SuperClass{
    int i, j;
    void Showij(){
        System.out.println(i + " " + j);
    }
}

class SubClass extends SuperClass{
    int k;
    void Sum(){
        int Sum = i + j + k;
        System.out.println("Sum is : " + Sum);
    }
    void Showijk(){
        System.out.println(i + " " + j + " " + k);
    }
}

class SimpleInheritance{
    public static void main(String args[]){
        SuperClass SuperObject = new SuperClass();
        SubClass SubObject = new SubClass();
        SuperObject.i = 10;
        SuperObject.j = 20;
        SuperObject.Showij();
        System.out.println("*********");
        SubObject.i = 15;
        SubObject.j = 25;
        SubObject.k = 35;
        SubObject.Showijk();
        SubObject.Sum();
    }
}
