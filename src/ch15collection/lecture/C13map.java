package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class C13map {
    public static void main(String[] args) {
        //map 전체 탐색
        Map<String , String > map = new HashMap<>();
        map.put("학생1","여름");
        map.put("학생2","가을");
        map.put("학생3","겨울");

        //향상된 for
        System.out.println("향상된 for로 전체탐색");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String,String> entry :  entries){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //keySet
        System.out.println("keySet사용해서 전체탐색");
        Set<String> keys = map.keySet();
        for(String key :keys){
            System.out.println(key +":" + map.get(key));
        }

        //forEach
        System.out.println("forEach 메소드로 전체탐색");
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + ":" + value);
            }
        });

    }
}
