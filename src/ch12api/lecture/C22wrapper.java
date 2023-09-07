package ch12api.lecture;

public class C22wrapper {
    public static void main(String[] args) {
        Integer i = 30000;
        Integer j = 30000;

        int k = 30;
        int l = 30;

        System.out.println(k == l);
        System.out.println(i == j); // 참조값

        System.out.println(System.identityHashCode(i));
        System.out.println(System.identityHashCode(j));

        System.out.println(i.equals(j));
    }
}
