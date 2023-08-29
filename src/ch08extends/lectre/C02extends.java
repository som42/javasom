package ch08extends.lectre;

public class C02extends {
    public static void main(String[] args) {
        MySubClass021 o1 = new MySubClass021();
        o1.name = "spring";
        o1.method3();
    }
}
//위 코드에 문법오류가 없다고 작성하기


class MyClass02{
    String name;
    void method3(){
        System.out.println("MyClass02.method3");
    }
}
class MySubClass021 extends MyClass02{

}
// MyClass02 : 상위클래스, 부모클래스, Syper class
// MySubClass021 :  하위클래스, 자식클래스, sub class
