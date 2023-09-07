package ch13generic.lecture;

public class C02generic {
    public static void main(String[] args) {
        MyClass02<Object> o1 = new MyClass02<Object>();
        MyClass02<String> o2 = new MyClass02<String>();
        MyClass02<Integer> o3 = new MyClass02<Integer>();
        MyClass02<Boolean> o4 = new MyClass02<Boolean>();
        //참조 타입만 제네릭이 가능하다.

        MyClass02<Object> o6 = new MyClass02<>();
        MyClass02<String> o7 =  new MyClass02<>();
        //앞에 타입으로 뒤에 유추가가능 하니깐 뒤에타입은 생략가능
    }
}

// generic type  타입 파라미터,
class MyClass02<T>{
    private T a;

}
