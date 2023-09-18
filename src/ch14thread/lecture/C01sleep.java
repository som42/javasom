package ch14thread.lecture;

public class C01sleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("code1");
        Thread.sleep(1000); //흐름을 잠깐 1초멈추는거
        System.out.println("code2");
        Thread.sleep(1000);
        System.out.println("code3");
    }
}
