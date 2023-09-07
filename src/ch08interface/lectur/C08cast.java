package ch08interface.lectur;

public class C08cast {
    public static void main(String[] args) {
        MyInterface08 i1 = new MyClass081();
        i1.method1();

        //인터페이스 받은에게 메서드가 한개뿐이없어서
        //강제변환해서 2번째메서드를 받을수있게 했다
        MyClass081 o1 = (MyClass081) i1;
        o1.otherMethod();
    }
}

interface MyInterface08{
    void method1();
}

class MyClass081 implements MyInterface08{

    @Override
    public void method1() {
        System.out.println("재정의한 메소드!!!");
    }

    public void otherMethod(){
        System.out.println("MyClass081.otherMethod");
    }

    public interface NestedInterface {
    }
}
