package ch08extends.lectre;

public class C03extends {
    public static void main(String[] args) {
        MySubClass031 o1 = new MySubClass031();
        o1.printName();
    }
}

class MyClass03{
    private String name;

    void printName(){
        System.out.println("name = " + name);
    }
}
class MySubClass031 extends MyClass03{

}