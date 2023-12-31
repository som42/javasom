package ch07extends.lectre;

public class C26abstractMethod {
    public static void main(String[] args) {
        Dog26 d1 = new Dog26();
        d1.breath();

        Animal26 a1 = d1;
        a1.breath();

        Animal26 a2 = new Fish26();
        a2.breath();

    }
}

//추상 메소드를 가진 클래스는 꼭 추상 클래스가 되어야한다  abstract
abstract class Animal26{
    //추상 메소드 : 몸통이 없는 메소드
    abstract public void breath();
}

class Dog26 extends Animal26{
    //추상 메소드를 꼭 재정의(오버라이딩) 해야함

    @Override //재정비
    public void breath(){
        System.out.println("까꿍");
    }
}

class Fish26 extends Animal26{
    @Override
    public void breath(){
        System.out.println("우쭈쭈");
    }
}