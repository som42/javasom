package 연습.리트코드;

import ch17stream.book.sec12.exam01.Student;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution1512 {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(), //자기자신
                        Collectors.counting()));

        System.out.println("map = " + map);

        map.values()
                .stream()
                .map(n -> (n) * (n - 1) / 2)
                .mapToInt(n -> n.intValue())
                .sum();


        {

        }

        return  0;
    }
}
