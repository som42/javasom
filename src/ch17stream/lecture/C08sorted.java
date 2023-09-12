package ch17stream.lecture;

import java.util.List;

public class C08sorted {
    public static void main(String[] args) {
        var list = List.of(3,1,3,4,5,10,11,0);
        list.stream()
                .sorted() //정렬된 값들이 출력되게한다.
                .forEach(System.out::println);
    }
}
