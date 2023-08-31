package ch08extends.lectre;

public class MyClass30 {
    private void privateMethod() {
        System.out.println("MyClass30.privateMethod");
    }

    public void publicMethod() {
        System.out.println("MyClass30.publicMethod");
        //private 멤버(필드,생성자,메소드) 접근 가능
        privateMethod();
    }

    void packagePrivateMethod() {
        System.out.println("MyClass30.packagePrivateMethod");

    }
    protected void protectedMethod(){
        System.out.println("MyClass30.protectedMethod");
    }
}
