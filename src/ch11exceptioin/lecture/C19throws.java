package ch11exceptioin.lecture;

public class C19throws {
    public static void main(String[] args) {
        try {
            method1();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public static void method1() throws ClassNotFoundException {
        method2();

    }
    public static void method2() throws ClassNotFoundException {
        method3();

    }
    public static void method3() throws ClassNotFoundException{

    }
}
