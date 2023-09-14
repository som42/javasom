package ch11exceptioin.lecture;

import java.util.concurrent.CancellationException;

public class C10catch {
    public static void main(String[] args) {
        // 여러가지 캐치블척을 합칠수 있다.

        try{
            //exception 발생 가능 코드
        }catch (ArrayIndexOutOfBoundsException e){
            //exception 처리 코드
        }catch (NumberFormatException e){
            //exception 처리 코드
        }

        try{

        }catch (NullPointerException | CancellationException e){
            //exception 처리코드
        }
    }
}
