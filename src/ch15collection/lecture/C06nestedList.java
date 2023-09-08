package ch15collection.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06nestedList {
    public static void main(String[] args) {
        List<List<Integer>> list =  new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        List<Integer> row2 = new ArrayList<>();

        row1.add(9);
        row1.add(7);
        row1.add(5);

        row2.add(10);
        row2.add(20);

        list.add(row1);
        list.add(row2);

        System.out.println("List.get(0).get(0) " + list.get(0).get(0));
        System.out.println("List.get(0).get(1) " + list.get(0).get(1));
        System.out.println("List.get(0).get(2) " + list.get(0).get(2));

        System.out.println("List.get(1).get(0) " + list.get(1).get(0));
        System.out.println("List.get(1).get(1) " + list.get(1).get(1));

        list.add(row1);
        System.out.println("List.get(2).get(0) " + list.get(2).get(0));
        System.out.println("List.get(2).get(1) " + list.get(2).get(1));
        System.out.println("List.get(2).get(2) " + list.get(2).get(2));

        list.get(0).set(0,99);
        System.out.println("List.get(0).get(0) " + list.get(0).get(0));
        System.out.println("List.get(2).get(0) " + list.get(2).get(0));
        list.get(0).set(1,88);
        System.out.println("List.get(0).get(0) " + list.get(0).get(0));
        System.out.println("List.get(2).get(0) " + list.get(2).get(0));
        System.out.println("List.get(1).get(0) " + list.get(1).get(0));
        //참조값을 저장하고 있기때문에 0번째에 값을 넣어도 두번째 0번째 값도바뀐다
    }
}
