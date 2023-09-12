package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;

public class C21modifiable {
    public static void main(String[] args) {
        Map<String,Integer> map1 = Map.of(
                "여름",7,
                "가을",8,
                "겨울",20
        );
        Map<String, Integer> map2 = new HashMap<>(map1);
        map2.put("봄",10);

        System.out.println(map2);
        System.out.println(map1);
    }
}
