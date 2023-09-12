package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C16unmodifiable {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("spring");
        list.add("html");

        list.remove(1);

        //수정 불가 리스트 만들기 잠깐쓰고 버리는 목적으로
        List<String> list2 = List.of("java", "react", "css");


    }
}
