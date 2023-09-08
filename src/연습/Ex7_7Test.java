package 연습;

import static org.junit.jupiter.api.Assertions.*;

class Ex7_7Test {

    @org.junit.jupiter.api.Test
    void lastStoneWeight() {
        Ex7_7 o1 = new Ex7_7();
        int result1 = o1.lastStoneWeight(new int[]{2,7,4,1,8,1});
        assertEquals(1,result1);

        int result2 = o1.lastStoneWeight(new int[]{1});
        assertEquals(1,result2);


    }
}


