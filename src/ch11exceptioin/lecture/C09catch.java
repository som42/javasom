package ch11exceptioin.lecture;

public class C09catch {
    public static void main(String[] args) {
        //코드 에러가 하나 이상 일때

        try{
            int[] arr = {1,0};
            int i = 3 / arr[0];

            System.out.println("try내의 흐름");

            //try block에서
            //여러 exception이 발생할 수 있으면
            //여러 catch 블럭 작성하면 됨
        } catch (ArithmeticException e){
            System.out.println("잘못된 산술연산");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e){
            System.out.println("잘못된 인덱스 참조");
            e.printStackTrace();
        }

        System.out.println("실행흐름 이어감...");
    }
}
