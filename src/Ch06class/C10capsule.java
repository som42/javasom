package Ch06class;

public class C10capsule {

}

class MyClass10 {
    //특별한 이유가 없다마 private를 붙여주고
    //관련된 메소드 주로 getter,setter를 public로 작성
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

}