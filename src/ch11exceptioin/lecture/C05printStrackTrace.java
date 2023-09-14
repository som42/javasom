package ch11exceptioin.lecture;

public class C05printStrackTrace {
    public static void main(String[] args) {

        System.out.println("code1");


        try {
            int i = 0;
            int j = 3 / i; //예외 발생
            System.out.println("code2");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("code3");
    }
}
