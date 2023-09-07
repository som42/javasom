package ch13generic.book.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        //k는 TV로 대체, M은 String로 대체
        Product<Tv, String> product1 = new Product<>();

        //Setter 매개값은 반드시 Tv와 String을 제공
        product1.setKind(new Tv());
        product1.setModel("스마트Tv");

        //Getter 리터값은 tv 와 string이 됨
        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        //k는 car로 대체, M은 String로 대체
        Product<Car, String> product2 = new Product<>();

        //Setter 매개값은 반드시 Car와 String로 제공
        product2.setKind(new Car());
        product2.setModel("SUV자동차");

        //Getter 리터값은 Car와 String이 됨
        Car car = product2.getKind();
        String carModel = product2.getModel();
    }
}
