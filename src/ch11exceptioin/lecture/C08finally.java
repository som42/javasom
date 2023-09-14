package ch11exceptioin.lecture;

public class C08finally {
    public static void main(String[] args) {
        //캐치 블럭없는 코드도 있다!

        try{
            System.out.println("코드 실행");
            return;
        }finally {
            System.out.println("무조건 실행되야하는 코드");
        }
    }
}
