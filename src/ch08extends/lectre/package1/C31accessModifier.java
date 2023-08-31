package ch08extends.lectre.package1;

import ch08extends.lectre.MyClass30;

public class C31accessModifier {
    public static void main(String[] args) {
        MyClass30 o1 = new MyClass30();
//        o1.privateMethod();
        o1.publicMethod();
//        o1.packagePrivateMethod();
//        o1.protectedMethod();
    }
}
