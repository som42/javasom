package ch08extends.book.exercise.p08;

public class ShowTireExample {
    public static void main(String[] args) {


        ShowTire showTire = new ShowTire();
        Tire tire = showTire;

        showTire.run();
        tire.run();
    }
}