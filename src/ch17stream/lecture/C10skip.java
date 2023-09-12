package ch17stream.lecture;

import java.util.List;

public class C10skip {
    public static void main(String[] args) {
        var list = List.of(10,9,1,2,5,3);
        list.stream()
                .skip(3)//지나갈때 몇개를 스킵할껀지
                .forEach(System.out::println);

        System.out.println("가장 작은값");
        list.stream()
                .sorted()
                .limit(1)
                .forEach(System.out::println);

        System.out.println("가장 큰값");
        list.stream()
                .sorted()
                .skip(list.size()-1)
                .forEach(System.out::println);

        System.out.println("가장 마지막 원소 출력");
        list.stream()
                .skip(list.size()-1)
                .sorted()
                .forEach(System.out::println);
    }
}
