package 연습.리트코드;

import java.sql.ClientInfoStatus;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        //allowed : "ad"
        Set<Character> chars = new HashSet<>();
        for(char c : allowed.toCharArray()){
            chars.add(c);
        }
        chars.contains('a');
        chars.contains('b');

        int count = 0;
        for (String word : words) {
            boolean consistentString = true;
            for (char c : word.toCharArray()) {
                if (!chars.contains(c)) {
                    consistentString = false;
                    break;
                }
            }

            if (consistentString) {
                count++;
            }
        }
        return count;}
}
