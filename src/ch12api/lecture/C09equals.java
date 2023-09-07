package ch12api.lecture;

public class C09equals {
    public static void main(String[] args) {
        Object o1 = new String("제주");
        Object o2 = new String("부산");
        Object o3 = new String("제주");

        System.out.println(o1 == o2); //서로 다른 인스턴스
        System.out.println(o1 == o3); //서로 다른 인스턴스

        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3)); //서로 문자열은 같다
        //String인스턴스는 equals로 비교해라!
    }
}
