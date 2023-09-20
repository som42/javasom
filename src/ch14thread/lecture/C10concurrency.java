package ch14thread.lecture;

public class C10concurrency {
    private static int value = 0;

    public static void main(String[] args) {
        //동시에 일어나기 때문에 생기는 문제
        //같은 변수, 같은 상태 쓸려고하지마라

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                value++;
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                value++;
            }
        });
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (
                InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("value = " + value);

    }
}