package ch08extends.lectre.package1;

import ch08extends.lectre.MyClass30;

public class MySubClass30 extends MyClass30 {

    public void someMethod(){
        super.protectedMethod();
        super.publicMethod();
//        super.packagePrivateMethod();
//        super.privateMethod();

    }
}
