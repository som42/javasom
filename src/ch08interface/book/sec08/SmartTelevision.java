package ch08interface.book.sec08;

public class SmartTelevision implements RemoteControl,Searchable{

    @Override
    public void turnOn() {
        System.out.println("텔리비전을 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("텔레비전을 끕니다");
    }

    @Override
    public void search(String url) {
        System.out.println(url + "를 검색합니다");
    }
}
