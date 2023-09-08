package 연습;

import ch09nested.book.sec07.exam02.RemoteControl;

public interface RomoteContro1 {
    void turnOn1();
    void turnOff1();
}
class Television implements RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("Tv를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv를 끕니다");
    }
}
