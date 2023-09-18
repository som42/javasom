package ch14thread.lecture;

public class C09join {
    public static void main(String[] args) {
        // join : 다른 쓰레드의 종료를 기다림

        Thread t1 = new Thread(()-> {
            for (int i =0; i<5; i++){
                System.out.println("t1. thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();

        // join : 다른 쓰레드의 종료를 기다림
        try {
            t1.join(); // t1이 끝날때까지 기다리다가 메인이시작됨
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i<5; i++){
            System.out.println("main thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
