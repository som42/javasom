package ch07extends.book.sec03.exam02;

public class SmartPhone extends Phone {


    public SmartPhone(String model, String color) {
        super(model, color);
        System.out.println("생성자 실행됌");
    }
}
