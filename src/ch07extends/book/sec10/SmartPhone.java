package ch07extends.book.sec10;

public class SmartPhone extends Phone {
    SmartPhone(String owner){
        super(owner);
    }

    void internetSearch(){
        System.out.println("인터넷을 검색합니다.");
    }
}
