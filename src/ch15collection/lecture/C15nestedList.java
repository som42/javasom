package ch15collection.lecture;

import ch08interface.book.sec10.exam01.A;

import java.util.ArrayList;
import java.util.List;

public class C15nestedList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(99);
        list.add(88);
        list.add(77);

        List<List<Integer>> list2 = new ArrayList<>();
        list2.add(List.of(9,8,7));  //of메서드가 새 인스턴스를 만들어주는 메서드
        list2.add(List.of(10,20,30));
        list2.add(List.of(3,4,5));

    }
}
