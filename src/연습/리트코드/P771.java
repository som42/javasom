package 연습.리트코드;

import java.util.HashSet;
import java.util.Set;

public class P771 {
    public int numJewelsInStones(String jewels, String stones) {

        Set<Character> jewelSet = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            jewelSet.add(c);
        }
        int count = 0;
        for (char c : stones.toCharArray()){
            if (jewelSet.contains(c)){
                count++;
            }
        }

        return count;
    }
}