package ch07extends.book.sec10;

public class PhoneExample {
    public static void main(String[] args) {

//        Phone p = new Phone(); 안된다

        SmartPhone smartPhone = new SmartPhone("김래환");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();

        Phone phone = smartPhone;
        phone.turnOn();
        phone.turnOff();
    }
}
