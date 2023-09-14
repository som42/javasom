package ch11exceptioin.lecture;

public class C14throw {
    public static void main(String[] args) {
        System.out.println("main code1");
        //throws Exception 메소드를 호출할때는 꼭
        //try를 감싸줘야 한다.
        try {
            method3();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("main code2");
    }

    private static void method3() throws Exception {
        //예외처리코드를 꼭작성해야한다
        //메소드에 꼭 throw Exception 를 명시해야 한다
        throw  new Exception();

    }
}
