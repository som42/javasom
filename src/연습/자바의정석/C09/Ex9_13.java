package 연습.자바의정석.C09;

public class Ex9_13 {
    public static void main(String[] args) {

       int a1 = 512;

       //박싱
        Integer b1 = new Integer(a1);
        System.out.println(b1);

        //언박싱
        int a2 = b1.intValue();
        System.out.println(a2);

        System.out.println(a1 == b1); //true
        System.out.println(a1 == a2); //true
        System.out.println(a2 == b1); //true



    }

}
