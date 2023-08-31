package ch08interface.book.sec12;

import ch07extends.book.sec06.B;


public class InstanceofExample {
    public static void main(String[] args) {

        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
        System.out.println();
        ride(bus);

    }

    public static void ride(Vehicle vehicle){
//        if(vehicle instanceof Bus){
//            Bus bus = new vehicle;
//            bus.checkFare();
//        }

        if(vehicle instanceof Bus bus) {
            bus.checkFare();
        }
            vehicle.run();

    }
}
