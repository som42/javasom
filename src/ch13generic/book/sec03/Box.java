package ch13generic.book.sec03;

public class Box<T> {
    private T t;

    public T get(){
        return t;
    }

    public void set(T t){
        this.t = t;
    }
}
