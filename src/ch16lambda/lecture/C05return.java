package ch16lambda.lecture;

public class C05return {
    public static void main(String[] args) {
        MyInterface05 o1 = () -> {
            System.out.println("명력문;");
            System.out.println("명력문2;");
            return 0;
        };


        MyInterface05 o2 = () -> 0;


    }
}
@FunctionalInterface
interface MyInterface05{
    int method();

}

class MyClass05 implements MyInterface05{

    @Override
    public int method() {
        return 1;
    }
}
