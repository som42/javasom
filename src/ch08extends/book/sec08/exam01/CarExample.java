package ch08extends.book.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.tire = new Tire();
        //타이어 타입에 타이어를 넣었을때
        myCar.run();
        //런메소드 안에서 실행시킨다
        myCar.tire = new HankookTire();
        myCar.run();

        myCar.tire = new KumhoTire();
        myCar.run();
    }
}
