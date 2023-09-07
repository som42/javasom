package ch06class;

public class C05class {
    public static void main(String[] args) {
        MyClass05 o1 = new MyClass05(); //인스턴트 만드는코드

        System.out.println("o1의 참조값" + System.identityHashCode(o1));

        o1.age = 30;
//        o1.model = "java"; 권장하지않음
        MyClass05.model = "spring"; //클래스 필드라 클래스앞에적어주는게좋음
        System.out.println("o1.age =" + o1.age);

        MyClass05 o2 =  new MyClass05();
        System.out.println("o2.age = " + o2.age);
        System.out.println("o1.model = " + o1.model);
        System.out.println("o2.model = " + o2.model);

    }
}

class MyClass05 {
    //속성 fields
    int age; //instance field  인스턴스 필드
    static String model;
    //static field 스택틱 필드, class field, 정적필드
    //static 클래스에 관한 값이다

    //기능 메소드
    
}