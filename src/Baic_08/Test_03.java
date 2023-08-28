package Baic_08;

public class Test_03 {


	static int pay = 2500000; //변수
	static int su = 55000;
	static double tax = 0.1;
	
	static int func() {
		return (pay+su) - (int)(pay*tax);
	}

	public static void main(String[] args) {
		
		System.out.printf("실수령액은 : "+func()+"원");
		
//		int a=2800000,b=155000,e;
//		e=(a+b)/10;
//		
//		
//		System.out.println(" 월급이 도착했습니다");
//		System.out.printf("\n기본급은 : %d원" , a);
//		System.out.printf("\n수당은 : %d원" , b);
//		System.out.printf("\n세금은 : %d원" , e);
//		System.out.printf("\n실수령액은 : %d원 " , (a+b-e));
//		
		
		

	}

}