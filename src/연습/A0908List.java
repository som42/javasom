package 연습;

import java.util.ArrayList;
import java.util.List;

public class A0908List {
    public static void main(String[] args) {
        //컬렉션을 생성
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();
        List<String> listC = new ArrayList<>();
        List<String> listD = new ArrayList<>();

        //값을 추가하기위해서는 add()함수
        listA.add("김봄");
        listA.add("김여름");
        listA.add(new String("김가을"));
        //add(인덱스자리,내용)하면 원하는 자리로 저장됨.
        listA.add(1,"1번째 요소값");

        System.out.println(listA);

        //get(index) 값을 꺼내고 싶을때
        //인덱스를 통한 조회
        String element0 = listA.get(0);
        String element1 = listA.get(1);
        String element3 = listA.get(3);

        System.out.println(listA);

        // remove 값을 삭제하는 법
        //Object element : 동일한 오브젝트로 삭제하기, 삭제결과(t/f)
        //int index :인덱스로 삭제하기, 삭제한 결과값 반환
        System.out.println(listA.remove(1));
        System.out.println(listA.remove("김봄"));

        //contains : 값이 있는지 확인하는 방법
        // 함수인수로 오브젝트를 넘기면 존배여부를 boolean값을 반환

        System.out.println(listA.contains("김봄"));//위에서 지워서 f
        System.out.println(listA.contains("김여름"));//남아있어서 t

        //indexof() : 추가하고싶은 데이터 위치에 해당되는 인덱스값을 알수 없을때
        // 인덱스오브로 위치값을 찾은뒤 add()함수를 이용하는 방법이 있다.

        //김여름 앞에 값 추가하기
        int index = listA.indexOf("김여름");
        listA.add(index,"김여름 앞에 값 추가");

        System.out.println(listA);
    }
}
