package ch12api.lecture;

public class C02toString {
    public static void main(String[] args) {
        Object o1 = new MyClass02();
        String s1 = o1.toString();
        System.out.println(s1);

        Object o2 = o1;
        System.out.println(o2.toString());
    }
}

class MyClass02{

    @Override
    public String toString() {
        return "MyClass02 객체입니다";
    }
}
