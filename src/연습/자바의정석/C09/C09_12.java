package 연습.자바의정석.C09;

public class C09_12 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("01");
        StringBuffer sb2 = sb.append(23);
        sb.append('4').append(56); //메서드 체이닝

        StringBuffer sb3 = sb.append(78);
        sb3.append(9.0);

        System.out.println("sb = " + sb);   //0123456789.0
        System.out.println("sb2 = " + sb2); //0123456789.0
        System.out.println("sb3 = " + sb3); //0123456789.0

        System.out.println("sb = " + sb.deleteCharAt(10)); //10 index문자를지운다.
        System.out.println("sb = " + sb.delete(3,6));           // 3부터 6까지  345지운다
        System.out.println("sb = " + sb.insert(3,"abc")); //index 3인곳에 abc를넣는다
        System.out.println("sb = " + sb.replace(6, sb.length(),"END")); //6부터 11까지 지운다 END를추가

        System.out.println("capacity = " + sb.capacity()); //배열 길이가 18
        System.out.println("length = " + sb.length());  //저장된 문자의 갯수


    }
}
