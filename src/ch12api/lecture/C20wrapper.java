package ch12api.lecture;

public class C20wrapper {
    public static void main(String[] args) {
    //Wrapper class : 기본 타입을 감사고 있는 클래스

    // 기본타입 : byte, short, int, long, float, double, char, boolean
    //wrapper class : Byte, Short, Integer, Long, Double, Character, Boolean

    // boxing : 기본타입 -> 참조타입
    // unboxing : 참조타입 -> 기본타입

    //boxing
    int i = 500;
//    Integer j = new Integer(i); 빡싱
    Integer k = Integer.valueOf(i);

        System.out.println(i);
        System.out.println(k);

        //unboxing
        Integer l = Integer.valueOf(1000);
        int m = l.intValue();  //언박싱

        System.out.println(l);
        System.out.println(m);

        //auto boxing
        int n = 777;
        Integer o = n; //auto boxing

        //auto unboxing
        Integer p = Integer.valueOf(888);
        int q = p; //오토 언박싱



    }
}
