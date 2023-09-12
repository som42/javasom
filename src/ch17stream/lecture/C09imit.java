package ch17stream.lecture;

import java.util.List;

public class C09imit {
    public static void main(String[] args) {
        var list = List.of(3,9,10,11,1,0,-3);
        list.stream()
                .limit(5) //내가원하는 거만큼 자르겠다.
                .forEach(System.out::println);

        System.out.println("가장 작은 값 3개를 출력하기");
        list.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("앞에 3개를 정렬해서 출력해라");
        list.stream()
                .limit(3)
                .sorted()
                .forEach(System.out::println);


    }
}
