package ch07extends.book.sec04.exam02;

public class SupersonicAirplaneExanple {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMOde = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMOde = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
