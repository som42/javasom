package ch11exceptioin.lecture;

public class C01exception {
    public static void main(String[] args) {
        //에러 만들어 보기

        System.out.println("실행코드1");
        System.out.println("실행코드2");

        int i = 0;
        int j = 3 / i; // ArithmeticException(산술연산이잘못됬구낭)

        System.out.println("실행코드3");
    }
}
