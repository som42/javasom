package ch11exceptioin.book.sec02.exam01;

public class ExceptionHandlingExample2 {
    public static void printLength(String data){
        try {
            int result = data.length(); //data가 null경우 NullPointerException발생
            System.out.println("문자 수 = " + result);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
//            System.out.println(e.toString());
//            e.printStackTrace(); 예외정보를 얻는 3가지 방법
        }finally {
            System.out.println("[마무리 실행] \n");
        }
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작] \n");
        printLength("ThisIsJava");
        printLength(null); //오류
        System.out.println("[프로그램 종료}");

    }
}
