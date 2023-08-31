package ch07extends.book.sec03;

public class SmartPhone extends Phone {

    public SmartPhone(String model, String Color){
        super();
        this.model = model;
        this.color = color;
        System.out.println("스마트폰 (모델, 컬러)생성자 실행됨");
    }
}
