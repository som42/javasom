package 연습;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Ex7_7 {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();

        for(int stone : stones){
            list.add(stone);
        }
        //list
        //sort, remove, add, size
        while (list.size()>1){
            //1.sort
            list.sort((o1, o2) -> o2 - o1);
            //2.remove
            int stones1 = list.remove(0);
            int stones2 = list.remove(0);

            //3.add
            int diff = stones1 - stones2;
            if (diff > 0){
                list.add(diff);
            }
        }
        if (list.size() == 1) {
            return list.get(0);
        }

        return 0;

    }
}



//class Solution{
//    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
//        ArrayList<Boolean> list = new ArrayList<>();
//
//        int maxKid =0;
//        for(int i : candies)
//            maxKid = Math.max(maxKid,i);
//        for (int candy : candies){
//            int a = candy + extraCandies;
//            if(a >= maxKid) list.add(true);
//            else list.add(false);
//        }
//        return list;
//
//    }


