package ch15collection.lecture;

import java.util.Map;

public class C18unmodifiable {
    public static void main(String[] args) {
        //수정 불가 map
        Map<String, String> map = Map.of(
                "num1","아리",
                "num2","옥자",
                "num3","제인");
        System.out.println(map);
    }
}
