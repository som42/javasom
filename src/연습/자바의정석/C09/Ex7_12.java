package 연습.자바의정석.C09;

public class Ex7_12 {
    class InstanceInner{
        int iv = 100;
        static int cv = 100;
        final static int CONST = 100;
    }
     class StaticInner{
        int iv = 200;
        static int cv = 200;  //static클래스만 static멤버를 정의할 수 있다.
    }
    void myMEthod(){
        class LocalInner{
            int iv = 300;
            static int cv = 300;
            final static int CONST = 300;
        }
    }
}
