package ch14thread.book.sex05.exam02;

public class JoinExample {
    public static void main(String[] args) {


        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            sumThread.join();
        } catch (InterruptedException e) {
            
        }
        System.out.println("1~100까지 합 = " + sumThread.getSum());


    }
}
