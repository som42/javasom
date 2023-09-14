package 연습.리트코드;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution1748 {
    public int sumOfUnique(int[] nums) {
        //1,2,3,2
        // 수 : 몇개
        Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(), //수
                        Collectors.counting()))  //몇개
        //1개인 entry만 거드리고 (filter)
                .entrySet()
                .stream()
                .filter( e-> e.getValue() == 1)
        //entry의 키들
                .map( e -> e.getKey())
        //만 더하기
                .mapToInt(Integer::intValue)
                .sum();


    return 0;
    }

}
