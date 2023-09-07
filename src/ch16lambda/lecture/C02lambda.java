package ch16lambda.lecture;

public class C02lambda {
    public static void main(String[] args) {
        MyInterface02 o1 = () -> {
            System.out.println("C02lambda.main");
        };
        o1.method();

        //메소드의 몸통이 한줄의 코드가 한 줄이면 중괄호 생략 가능
        MyInterface02 o2 = () -> System.out.println("메소드내 코드가 한줄");
        o2.method();
    }
}

@FunctionalInterface
interface MyInterface02{
    //파라미터 없는 메소드, 리턴없음
    void method();


}
