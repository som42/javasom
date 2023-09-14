package ch11exceptioin.lecture;

public class C07finally {
    public static void main(String[] args) {
        //리턴되더라도 finally블럭으로 실행시켜보기
        System.out.println("code1");

        try {
            int j = 3 / 3; //에러 발생
            System.out.println("code2");
            return; //리턴을 만나면 5실행이 안됨
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("code3");
        }finally {//리턴을 만나던 안만나던 실행시켜볼려면 finally블럭쓰기
            System.out.println("code4");
        }
        System.out.println("code5");




    }
}
