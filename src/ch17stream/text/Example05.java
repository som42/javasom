package ch17stream.text;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example05 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );

        System.out.println("고전적인 포문");
        for (String item : list){
            if (item.toLowerCase().matches(".*java.*")){
                System.out.println(item);
            }
        }

        System.out.println("stream 사용");
        list.stream()
                .filter(e -> e.toLowerCase().matches(".*java*."))
                .forEach(System.out::println);

        System.out.println("contain 사용");
        list.stream()
                .filter(e -> e.toLowerCase().contains("java"))
                .forEach(System.out::println);


        System.out.println("indexOf사용");
        list.stream()
                .filter(s -> s.toLowerCase().indexOf("JAVA") != -1)
                .forEach(System.out::println);

    }
}
