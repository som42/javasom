package ch17stream.text;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example08 {
    public static void main(String[] args) {
        List<Member08> list = Arrays.asList(
                new Member08("홍길동","개발자"),
                new Member08("김나리","디자이너"),
                new Member08("신용권","개발자")
        );
        System.out.println("개발자");
        list.stream()
                .filter(m-> m.getJob().equals("개발자"))
                .toList()
                .forEach(System.out::println);

        System.out.println();

        System.out.println("디자이너");
        list.stream()
                .filter(m ->m.getJob().equals("디자이너"))
                .forEach(System.out::println);



    }
}

