package 연습;

import java.lang.module.FindException;

public class Ex7_7 {
    public int[] solution(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            numbers[i]* =2;
        }
        return numbers;
    }
}