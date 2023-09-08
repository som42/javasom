package 연습;

import java.lang.module.FindException;

public class Ex7_7 {
    public static void main(String[] args) {
        for(int i = 0; i<4; i++){
            for(int j=0;j<=3-i;j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1;j++);
             System.out.println("*");
        }
        System.out.println("");
    }
}