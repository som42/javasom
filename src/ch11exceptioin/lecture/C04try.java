package ch11exceptioin.lecture;

public class C04try {
    public static void main(String[] args) {
        //좀더 복잡한 try , catch 써보기
        System.out.println("code1");
        System.out.println("code2");
        //exception 발생 안하면 catch 작동하지 않는다
        try {
            int i = 0;
            int j = 3 / i;  //예외가 실행되는순간 catch블럭으로 넘어간다
            System.out.println("code3");
            System.out.println("code4");
        } catch (ArithmeticException e){
            System.out.println("exception code1");
            System.out.println("exception code2");
        }

        System.out.println("code5");
    }
}
