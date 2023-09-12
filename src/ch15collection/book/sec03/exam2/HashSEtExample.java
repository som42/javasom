package ch15collection.book.sec03.exam2;

import java.util.HashSet;
import java.util.Set;

public class HashSEtExample {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();
        
        set.add(new Member("김여름",30));
        set.add(new Member("김여름",30));

        System.out.println("set.size() = " + set.size());
    }
}
