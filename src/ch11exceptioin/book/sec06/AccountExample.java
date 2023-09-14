package ch11exceptioin.book.sec06;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();
        //예금
        account.deposit(10000);
        System.out.println("예금액 : " + account.getBalance());

        //출금
        try{
            account.withdraw(30000);
        }catch (InstfficientException e){ //예외처리코드와 함께 메소드호출
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
