package ch09nested.lecture;

public class C09anonymous {
    public static void main(String[] args) {
        MyClass09 o1 = new MySubClass09();
        o1.method1();

        //anonymous class(익명 클래스)
        // 클래스 상속, 인스턴스 생성을 동시에
        MyClass09 o2 = new MyClass09(){
            // 자식 클래스 몸통
            // 필드 메소드 만 가능
            @Override
            void method1(){
                System.out.println("C09anonymous.method1");
            }
        };

        o2.method1();
    }
}

class MyClass09{
    void method1(){
        System.out.println("MyClass09.method1");
    }
}

class MySubClass09 extends MyClass09{
    void method1(){
        System.out.println("MySubClass09.method1");
    }

}