package ch08extends.book.sec08.exam01;

public class Car {
    public Tire tire;

    public void run(){
        tire.roll();
        //각 상속받은 클래스에 roll이 있음으로
        //안전하게 실행할수있다.
    }
}
