package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C19modifiable {
    public static void main(String[] args) {
        List<String> list1 = List.of("html", "css","react","js");
        //새로운것을 추가하고 싶을때 new ArrayList로 다시만들어주면된다
        //새로만들고 기존에꺼를 복사해줘야 한다.
        List<String > list2 = new ArrayList<>(list1);

        list2.add("java");

        System.out.println(list1);
        System.out.println(list2);
        System.out.println("프로그램 실행 중 ....");
    }
}
