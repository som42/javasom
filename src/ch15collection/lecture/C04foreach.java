package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C04foreach {
    public static void main(String[] args) {
        List<MyClass04> list = new ArrayList<>();
        list.add(new MyClass04("여름"));
        list.add(new MyClass04("가을"));
        list.add(new MyClass04("겨울"));

        list.forEach(System.out::println);
    }
}
class MyClass04{
    private String name;

    public MyClass04(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "name=" + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
