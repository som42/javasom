package ch08interface.lectur;

public class C07return {
    public static void main(String[] args) {
        for(int i = 0 ; i < 10;  i++){
        CharSequence charSequence=getCharSequence();
        System.out.println(charSequence);
        }
    }


    public static CharSequence getCharSequence() {
        double d = Math.random();

        if( d < 0.33){
            return  new String("마치자마자간다");
        }else if( d < 0.66 ){
            return  new StringBuffer("공부하고간다");
        }else {
            return  new StringBuffer("적당히하고간다");
        }
    }
}