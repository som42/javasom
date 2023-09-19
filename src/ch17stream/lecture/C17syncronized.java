package ch17stream.lecture;

public class C17syncronized {
    public static void main(String[] args) throws InterruptedException {
        MyBOx bOx = new MyBOx(0);
        Thread t1 = new Thread( new Task(bOx));
        t1.start();

        Thread t2 = new Thread(new Task(bOx));
        t2.start();

        t1.join();
        t2.join();
        System.out.println("bOx.getValue() = " + bOx.getValue());
    }
    
}
class Task implements Runnable{
    private MyBOx bOx;

    public Task(MyBOx bOx) {
        this.bOx = bOx;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            bOx.increment();
        }
    }
}

class MyBOx{
    private int value;
    private Object lock = new Object();

    public MyBOx(int value) {
        this.value = value;
    }
    public void increment(){
        //synchronized block
        //하나의 객체만 두고 경쟁하게 해야한다.
        synchronized (lock){
        value++;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
