package ch08extends.lectre;

public class C08super {
    public static void main(String[] args) {
        MySubClass081 o1 = new MySubClass081();
        o1.method();

        MyClass08 o2 = new MyClass08();
        o2.method();
    }
}
class MyClass08 {
    void method(){
        System.out.println("부모의 메소드!");
    }
}

class MySubClass081 extends MyClass08 {
    void method(){
        System.out.println("자식의 메소드!");
        super.method();

        //super 부모의 멤버의 접근할때 사용하는 키워드
    }
}
