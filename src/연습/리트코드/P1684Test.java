package 연습.리트코드;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1684Test {

    @Test
    void countConsistentStrings() {
        P1684 o = new P1684();
        int i = o.countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"});
        assertEquals(2,i);
        int j = o.countConsistentStrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"});
        assertEquals(7,j);
        int k = o.countConsistentStrings("cad", new String[]{"cc","acd","b","ba","bac","bad","ac","d"});
        assertEquals(4,k);
    }
}