package ch08extends.lectre;

public class C13cast {
    public static void main(String[] args) {
        Animal13 ani1 = new Dog13();
        Animal13 ani2 = new Cat13();

        ani1.breath();
        ani2.breath();

        //type casting (강제 형변환) -- 매우 위험
        //부모가 자식꺼 인스턴스 쓰고싶으면 형변환해서 하면된다
        Dog13 d1 = (Dog13)ani1;
        d1.sniff();

        Cat13 c1 = (Cat13)ani2;
        c1.hunt();
    }
}

class Animal13{
    public void breath(){
        System.out.println("숨쉬다");
    }
}
class Dog13 extends Animal13{
    public void sniff(){
        System.out.println("냄새 맡다.");
    }
}

class Cat13 extends Animal13{
    public void hunt(){
        System.out.println("할퀴다");
    }

}
