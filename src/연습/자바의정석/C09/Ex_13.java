package 연습.자바의정석.C09;

public class Ex_13 {
    // 인스턴스 멤버가 static멤버 쓰는건 되지만 static멤버가 인스턴스멤버 쓰는것은 안된다
    class InstanceInner{}
    static class StaticInner{}

    InstanceInner iv = new InstanceInner(); //인스턴스멤버끼리는 직접 접근 가능
    static StaticInner cv = new StaticInner(); //static 멤버끼리는직접 접근 가능
//    static StaticInner ii = new InstanceInner() static 멤버가 인스턴트 멤버접근 불가

    static void staticMethod(){
//      InstanceInner dbj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
    }
    void instanceMethod(){ //인스턴스메서드에서는 인스턴스 멤버와 static 멤버 모두 접근가능
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
//      LocalInner lv = new LocalInner();  //지역 내부 클래스는 외부에서 접근할 수 없다.

    }
    void myMethod(){
        class LocalInner{}
        LocalInner lv = new LocalInner();

        }
}
