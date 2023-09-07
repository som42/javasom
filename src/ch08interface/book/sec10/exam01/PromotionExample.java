package ch08interface.book.sec10.exam01;

import ch08interface.book.sec10.exam01.A;
import ch08interface.book.sec10.exam01.B;
import ch08interface.book.sec10.exam01.C;

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a;

        a = b;
        a = c;
        a = d;
        a = e;
    }
}
