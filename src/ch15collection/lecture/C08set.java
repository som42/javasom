package ch15collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C08set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("여름");
        set.add("가을");
        set.add("겨울");

        set.forEach(System.out::println);

        System.out.println("시간이 흐른 후");
        set.forEach(System.out::println);
    }
}
