package ch08interface.lectur;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C05typeConversion {
    public static void main(String[] args) {
        Integer i = 3;

        Object o = i;
        Number n = i;
        Serializable s = i;
        Comparable<Integer> c = i;
        Constable co = i;
        ConstantDesc ct = i;
        Integer in = i;



    }

}
