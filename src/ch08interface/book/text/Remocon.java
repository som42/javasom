package ch08interface.book.text;

public interface Remocon {
    public void powerOn();
}

class TV implements Remocon{
    @Override
    public void powerOn() {
        System.out.println("텔레비전을 켰습니다");
    }

    public static void main(String[] args) {
        Remocon r = new TV();
        r.powerOn();
    }

}
