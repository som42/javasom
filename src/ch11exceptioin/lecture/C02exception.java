package ch11exceptioin.lecture;

public class C02exception {
    public static void main(String[] args) {
        //에러 만들기
        System.out.println("code 1...");
        System.out.println("code 2...");

        int[] arr = {1,2};
        int i = arr[2]; //IndexOfBounds Exception

        System.out.println("code 3...");
    }
}
