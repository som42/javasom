package ch11exceptioin.book.sec02.exam02;

public class ExceptionHandlingExample {
    public static void main(String[] args) {

        try{
            Class.forName("java.lang.String"); //발생가능코드
            System.out.println("java.lang.String 클래스가 존재합니다");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println();
        try{
            Class.forName("java.lang.String2"); //발생가능코드
            System.out.println("java.lang.String2 클래스가 존재합니다");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
