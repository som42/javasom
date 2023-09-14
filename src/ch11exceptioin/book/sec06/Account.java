package ch11exceptioin.book.sec06;

public class Account {
    private long balance;
    public Account(){}

    public long getBalance() {
        return balance;
    }
    public void deposit(int money){
        balance +=money;
    }
    public void withdraw(int money) throws InstfficientException{
        if (balance <money){
            throw new InstfficientException("잔고 부족 : " +(money-balance)+ " 모자람");
        }
        balance -=money;
    }
}
