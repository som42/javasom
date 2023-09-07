package ch13generic.lecture;

import ch07extends.book.sec05.Car;
import ch07extends.book.sec06.package2.C;

public class C06wildcard {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a1 = d;
        Cat c = new Cat();
        Animal a2 = c;

        MyClass06<Dog> o1 = new MyClass06<>();

//        MyClass06<Animal> o2 = o1;
//        o2.set(new Animal());
        //와일드 카드를 써서 안전하게쓸수있다.
        MyClass06<? extends Animal> o3 = o1;
        MyClass06<? extends Animal> o6 = new MyClass06<Animal>();
        MyClass06<? extends Animal> o7 = new MyClass06<Dog>();
        MyClass06<? extends Animal> o8 = new MyClass06<Cat>();
        Animal anil = o3.get(); //안전

        anil.animalMethod();

        MyClass06<? super Animal> o4 = new MyClass06<Animal>();
        MyClass06<? super Animal> o5 = new MyClass06<Object>();

        o4.set(new Dog());
        o5.set(new Dog());
        o4.set(new Cat());


    }

}

class Animal{
    public void animalMethod(){

    }
}
class Dog extends Animal{ }
class Cat extends Animal{}

class MyClass06<T>{
    public void set( T param){}
    public T get(){
        return null;
    }

}
