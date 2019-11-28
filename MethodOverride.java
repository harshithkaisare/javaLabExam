//classname MethodOverride.java
class SuperClass{
    int i;
    SuperClass(int a){
        i = a;
    }
    void show(){
        System.out.println("SuperClass " + i);
    }
}
class SubClass extends SuperClass{
    int j;
    SubClass(int a, int b){
        super(a);
        j = b;
    }
    void show(){
        super.show();
        System.out.println("SubClass " + j);
    }
}
class MethodOverride{
    public static void main(String args[]){
        SubClass obj = new SubClass(15, 19);
        obj.show();
    }
}
