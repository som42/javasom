package ch08interface.book.sec08;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {

        RemoteControl rc = new SmartTelevision();

        rc.turnOn();
        rc.turnOff();

        Searchable searchable = new SmartTelevision();
        searchable.search("https://www.youtube.com/watch?v=jn6V1JIRw-k");
    }
}
