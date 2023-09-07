package ch12api.lecture;

public class C11string {
    public static void main(String[] args) {
        //String : 문자열
        String a = "제주";
        String b = "제주";
        String c = new String("제주");

        System.out.println(a == b);
        System.out.println(a == c);

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}
