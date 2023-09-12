package ch15collection.text;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public class C9_1 {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("blve",96);
        map.put("hong",86);
        map.put("white",92);

        String name = null; //최고 점수 받은 아이디 저장하는변수
        int maxScore = 0;  //최고점수 저장하는 변수
        int totalScore = 0; //점수 합계를 저장하는 변수
        int sum = 0;
        int max = 0;
        String id = "";

        for ( Map.Entry<String,Integer> entry : map.entrySet()){
           maxScore += entry.getValue();
           if(max < entry.getValue()){
               max = entry.getValue();
               id = entry.getKey();
           }



            System.out.println("평균 :" + maxScore/3);
            System.out.println(max);
            System.out.println(id);

        }

    }
}
