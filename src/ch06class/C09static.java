package ch06class;

public class C09static {

}
class MyClass09{
    String name;
    static String model;  //static field

    //instance method
    void printName(){
        //instance member끼리 접근 가능
        System.out.println("name = " + name);
        //instance member에서 static member 접근가능
        System.out.println("model = " + model);
    }

    static void printModel(){
        //스택틱 멤버끼리 접근가능
        System.out.println("model = " + model);
        //스택틱 멤버에서 인스턴스 멤버끼리는 접근불가능
//        System.out.println("model = " + name);
    }
}
