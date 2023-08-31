package ch07extends.book.sec08.exam02.p;

public class Ecample {
    public static void action(A a){
        a.method1();

        if(a instanceof C c){
            c.method2();

        }

    }

    public static void main(String[] args) {
        action(new A());
        action(new B());
        action(new C());
    }
}
