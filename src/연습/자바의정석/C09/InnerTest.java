package 연습.자바의정석.C09;
class AAA{  //AAA는 BBB의 외부 클래스
    int i;
    BBB b = new BBB();
    class BBB{ //BBB의 AAA내부 클래스
        void method(){
//            AAA a = new AAA();
//            System.out.println(a.i);
            System.out.println(i); //객체 생성없이 외부클래스의 멤버 접근 가능
        }
    }
}

//class CCC{
//    BBB b = new BBB();
//}
public class InnerTest {
    public static void main(String[] args) {
//        BBB b = new BBB();
//        b.method();
    }
}
