package ch08interface.lectur;

import ch08interface.book.sec08.Searchable;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C09cast {
    public static void main(String[] args) {
        CharSequence c = "제주";

        String s = (String) c;
        Object o = (Object) c;
        Serializable se = (Serializable) c;
        Comparable co = (Comparable)c;
        Constable con = (Constable)c;
        ConstantDesc cd = (ConstantDesc)c;


        System.out.println("End");
    }
}

