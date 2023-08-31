package ch08extends.book.sec10;

import ch08extends.book.sec08.exam02.p.C;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        animalSound(new Dog());
        animalSound(new Cat());
    }
    public static void animalSound(Animal animal){
        animal.sound();
        //상위타입으로 멀받으면 실제인스턴스를 실행시킬수있다.
    }
}
