package ch08extends.lectre;

public class C12polymorphism {
    public static void main(String[] args) {
        Malamute12 dog = new Malamute12();
        dog.breath();
        dog.sniff();

        Animal12 ani = dog;
        ani.breath();
//        ani.sniff(); 자식 기능(메서드)를 갖고못옴

        Animal12 ani12 = new Malamute12();
        ani.breath();
//        ani.sniff();

    }

}
class Animal12{
    public void breath(){
        System.out.println("숨쉬다");
    }
}
class Malamute12 extends Animal12{
    public void sniff(){
        System.out.println("냄새를 맡다");
    }
}