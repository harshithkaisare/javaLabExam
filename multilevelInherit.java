//classname multilevelInherit.java
class A{
    int a;
    A(int a){
        this.a = a;
    }
    void showA(){
        System.out.println("Value of A: " + a);
    }
}
class B extends A{
    int b;
    B(int a, int b){
        super(a);
        this.b = b;
    }
    void showAB(){
        System.out.println("Value of A: " + a);
        System.out.println("Value of B: " + b);
    }
}
class C extends B{
    int c;
    C(int a, int b, int c){
        super(a, b);
        this.c = a;
    }
    void showABC(){
        System.out.println("Value of A: " + a);
        System.out.println("Value of B: " + b);
        System.out.println("Value of C: " + c);
    }
}
class multilevelInherit{
    public static void main(String args[]){
        A Aobj = new A(10);
        B Bobj = new B(20, 30);
        C Cobj = new C(12, 22, 33);
        Aobj.showA();
        Bobj.showAB();
        Cobj.showABC();
    }
}
