package 연습.자바의정석.C09;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ex11_1 {
    public static void main(String[] args) {
        //기분 길이 (용량, capacity)가 10인 ArrayList를 생성
        ArrayList list1  = new ArrayList(10);
        //ArrayList에는 객체만 저장가능
        //autoboxing에 의해 기본형이 참조형으로 자동 변환

//      list1.add(new Integer(5));
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        //subList는 ArrList 일부를 뽑아서 새로운 리스트를 만든다
        ArrayList list2 = new ArrayList(list1.subList(1,4)); //index 1부터 4까지
        System.out.println(list1);
        System.out.println(list2);

        //Collection은 인터페이스, Collections는 유틸클래스
        Collections.sort(list1); //list1과 list2를 정렬한다
        Collections.sort(list2);
        System.out.println(list1);
        System.out.println(list2);

        //list1이 list2에 모든 요소를 포함하고 있느냐 물어 보는거
        System.out.println("list1.containsAll(list2) = " + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3,"A");//원하는 index 위치에 새로 추가할수있다.
        System.out.println(list2);

        list2.set(3,"AA"); //index 3에 있는자리에 AA로 바꾼다.
        System.out.println(list2);

        list1.add(0,"1"); //index0번 자리에 문자1넣기
        System.out.println(list1);
        //Integer 1 찾기
        System.out.println("list1.indexOf(1) = " + list1.indexOf(1));
        //String 1 찾기 //출력은 갖지만 같은 1이 아니다 그래서 찾을때 다르다
        System.out.println("list1.indexOf(\"1\") = " + list1.indexOf("1"));

        list1.remove(1); //index 0번 자리 지우기
        list1.remove(new Integer(1));//1을 삭제
        
        //list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다
        System.out.println("list1.retainAll(list2) = " + list1.retainAll(list2));
        System.out.println(list1);
        System.out.println(list2);

        //list2에서 list1에 포함된 객체들을 삭제한다.
        for (int i = list2.size()-1; i>=0; i--){
            if (true)
                list2.remove(0);
        }
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
    }
}
