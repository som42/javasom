package ch07extends.book.sec08.exam02;

public class DriverExample {
    public static void main(String[] args) {

        Drier drier = new Drier();

        Bus bus = new Bus();
        drier.drive(bus);

        Taxi taxi = new Taxi();
        drier.drive(taxi);
    }
}
