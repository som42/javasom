package ch17stream.text;

import ch12api.text.exam06.Member;

import java.util.Arrays;
import java.util.List;

public class Example06 {
    public static void main(String[] args) {
        List<Member06>list = Arrays.asList(
                new Member06("홍길동",30),
                new Member06("신용권",40),
                new Member06("감자바", 26)
        );
        System.out.println("나이들만 출력");
        list.stream()
                .map(x -> x.getAge())
                .forEach(System.out::println);

        System.out.println("나이들의 합을 구해서 출력");
        Integer reduce = list.stream()
                .map(m -> m.getAge())
                .reduce(0, (a, b) -> a + b);
        //.reduce(0, Interger :: sum);
        System.out.println("reduce = " + reduce);

        System.out.println("가장 많은 나이 reduce로 구해서 출력");
        Integer reduce1 = list.stream()
                .map(m -> m.getAge())
                .reduce(Integer.MAX_VALUE, Math::max);
        System.out.println(reduce1);

        System.out.println("가장 작은 나이 reduce로 구해서 출력");
//        list.stream()
//                .map(s -> s.getAge())
//                .reduce()
    }

}
