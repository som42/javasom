package ch13generic.tect;

import java.security.Key;

public class C03Example {
    public static void main(String[] args) {
        Container1<String, String> container1 = new Container1<>();
        container1.setKey("홍길동","도적");
        String name1 = container1.getKey();
        String job = container1.getValue();
        System.out.println(name1+job);

        Container1<String, Integer> container2 = new Container1<>();
        container2.setValue("홍길동",35);
        String name2 = container2.getKey();
        int age = container2.getValue();
        System.out.println(name2+age);
    }
}

class Container1<T , T1>{
    private T Key;
    private T1 value;

    public T getKey() {
        return Key;
    }

    public void setKey(T key, T1 value) {
        this.Key = key;
        this.value = value;
    }

    public T1 getValue() {
        return value;
    }

    public void setValue(T key, T1 value) {
        this.Key = key;
        this.value = value;
    }
}



