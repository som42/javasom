package ch08extends.lectre;

public class C10polymorphism {
    public static void main(String[] args) {
        Malamute10 dog1 = new Malamute10();
        Chihuahua10 dog2 = new Chihuahua10();

        //자식 손자 클래스는 부모 클래스라고 할수있지만
        //부모 클래스는 자식 손자 클래스라고 말할수없다.
        Canidea10 can1 = dog1;
        Canidea10 can2 = dog2;

        Animal10 ani1 = dog1;
        Animal10 ani2 = dog2;

        dog1.breath();
        dog2.breath();

        dog1.cry();
        can1.cry();
        ani1.cry();

        dog2.cry();
        can2.cry();
        ani2.cry();
    }
}

class Animal10 {
    public void breath(){
        System.out.println("숨쉬다");
    }
    public void cry(){
        System.out.println("동물이 운다");
    }

}
class Canidea10 extends Animal10 {
}
class Malamute10 extends Canidea10{
    @Override
    public void cry() {
        System.out.println("왕왕");
    }
}
class Chihuahua10 extends Canidea10{
    @Override
    public void cry() {
        System.out.println("왈왈");
    }
}