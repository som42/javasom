package ch08extends.book.sec07.exam03;

import ch08extends.book.sec07.exam02.Parent;

public class ChildExample {

    public static void main(String[] args) {
        Parent12 parent = new Child();

        parent.field01 = "data1";
        parent.method1();
        parent.method2();
//        parent.field2 = "date2";
//        parent.method3();

        Child child = (Child) parent;

        child.field02 = "data2";
        child.method3();
    }
}
