package ch11exceptioin.lecture;

public class C06finally {
    public static void main(String[] args) {
        //에러가 발생하던 안하던 실행되는 finally

        System.out.println("code1");
        try{
            int i = 0;
            int j = 3 / i; //에러!
            System.out.println("code2");
        } catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("code3");
        } finally {
            //finally
            // exception 발생과 관계없이 실행되는 block
            System.out.println("꼭 실행 코드!!");
        }

        System.out.println("code4");
    }
}
