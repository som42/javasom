package ch09nested.book.sec06.exam03;

import ch07extends.book.sec06.B;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        class OkListener implements Button.ClickListener {

            @Override
            public void onClick() {
                System.out.println("ok 버튼을 클릭했씁니다");
            }
        }
        btnOk.setClickListener(new OkListener());

        btnOk.click();

        Button btnCancel = new Button();

        class CancelListener implements Button.ClickListener {

            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했씁니다");

            }
        }
        btnCancel.setClickListener(new CancelListener());

        btnCancel.click();
    }


}

