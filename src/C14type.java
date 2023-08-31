import ch08extends.book.sec07.exam03.Parent12;

public class C14type {
    public static void main(String[] args) {

        int a = 3;
        double f = 3.0;
        double g = 32;

        String b = "java";
        Object o = "java";
        Child c = new Child();
        Parent d = new Parent();
    }
}

class Parent{}
    class Child extends Parent{}

