package ch12api.lecture;

public class C07equals {
    public static void main(String[] args) {
        MyClass07 o1 = new MyClass07("한여름");
        MyClass07 o2 = new MyClass07("한여름");
        MyClass07 o3 = new MyClass07("한겨울");

        System.out.println(o1 == o2); //
        System.out.println(o1.equals(o2));//재정의안해서 펄스

        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());

        System.out.println(o1.equals(o3));

    }

}

class MyClass07{
    private String name;

    public MyClass07(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {  //해시코드재정의
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        MyClass07 o = (MyClass07) obj;//형변화함때려주고
       return this.name.equals(o.name);
    }
}
