package 연습.자바의정석.C09.ch0914;

import java.text.SimpleDateFormat;
import java.util.Date;

public class chd0914 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-dd");

        //오늘 날짜를 yyyy-MM-dd 형태로 변환하여 반환한다.
        String result = df.format(today);

        System.out.println(result);
    }
}
