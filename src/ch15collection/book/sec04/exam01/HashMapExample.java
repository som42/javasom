package ch15collection.book.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class HashMapExample {
    public static void main(String[] args) {
        //Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();

        //객체 저장
        map.put("신용권",85);
        map.put("홍길동",90);
        map.put("동장군",80);
        map.put("홍길동",95);

        System.out.println("총 Entry 수 : " + map.size());
        System.out.println();

        System.out.println("향상된 for로 전체 탐색");
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+ ":" + entry.getValue());
        }

        //forEach
        System.out.println("forEach 메소드로 전체탐색");
        map.forEach((key, value) -> System.out.println(key + ":" + value));

        //키로 값 얻기
        String key = "홍길동";
        int value = map.get(key);     //키를 매개값으로 주면 값을 리턴
        System.out.println(key + ": " + value);
        System.out.println();

        //키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()){
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k +" : " + v);
        }
        System.out.println();

        //엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String,Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }
        System.out.println();

        //키로 엔트리 삭제
        map.remove("홍길동");
        System.out.println("총 Entry 수 : " + map.size());
        System.out.println();
    }
}
