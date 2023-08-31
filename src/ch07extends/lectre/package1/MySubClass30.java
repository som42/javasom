package ch07extends.lectre.package1;

import ch07extends.lectre.MyClass30;

public class MySubClass30 extends MyClass30 {

    public void someMethod(){
        super.protectedMethod();
        super.publicMethod();
//        super.packagePrivateMethod();
//        super.privateMethod();

    }
}
