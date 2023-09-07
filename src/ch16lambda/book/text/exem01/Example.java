package ch16lambda.book.text.exem01;

import ch09nested.book.sec06.exam03.Button;

public class Example {
    public static void main(String[] args) {
        Button btnOk = new Button();
        btnOk.setClickListener(() -> System.out.println("ok버튼을 입력했습니다")) ;
        btnOk.click();

        Button btnCancel = new Button();
        btnCancel.setClickListener(() -> System.out.println("Cancel 버튼을 입력했습니다"));
        btnCancel.click();
    }
}
