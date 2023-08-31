package ch07extends.lectre;

public class C24constructor {
}
class MyClass24 {
    int age;
    //매개변수가 있는 생성자 작성하면,
    //매개변수 없는 생성자(기본 생성자, )가
    //자동으로 삽입되지 않는다
    MyClass24(int age){
        this.age = age;
    }

}
class MySubClass24 extends MyClass24{
    //명시적으로 상위 클래스 생성자 호출코드 작성
    MySubClass24(){
        super(30);
    }
}
