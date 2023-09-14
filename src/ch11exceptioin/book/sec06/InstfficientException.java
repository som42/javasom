package ch11exceptioin.book.sec06;

public class InstfficientException extends Exception{
    public InstfficientException(){
    }
    public InstfficientException(String message){
        super(message);
    }
}
