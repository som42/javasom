package ch11exceptioin.lecture;

public class C12polymorphism {
    public static void main(String[] args) {
        //상위타입으로 익셉션으로 잡을려고 한다면
        //순서를 중요하게 봐야한다.

        try {
            //ClassCastException
            //NullPointerException
            //ArithmeticException
        }catch (RuntimeException e){
            //NullPointerException
            //ArithmeticException
            //예외 처리
       }
//        catch () {
//            //ClassCastException
//            //예외 처리
//            //클래스캐취익솁션도 런타임이 상위타입이라 위에코드에
//            //한번잡혀서 또 못한다!
//            //근데 클래스캐취익쎕션을 할라면 순서를 바꿔주면된다
//
//        }

        try{

        }catch (ClassCastException e){

        }catch (RuntimeException e){

        }
    }

}
