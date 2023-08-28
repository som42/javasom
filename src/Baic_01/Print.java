package Baic_01;



public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. println : 줄바꿈 기능 있는 출력");
		System.out.print("2. print : 줄바꿈 기능이 없는 출력   ");
		System.out.print("3. print : 줄바꿈 기능이 없는 출력-2");
		System.out.printf("\n4. prinf :(줄바꿈 없이) 출력 양식을 지정해서 출력 : %d", 4);
		System.out.printf("\n5.오늘은 %d월 %d일 입니다" , 8 ,16);
		
		System.out.printf("\n6. 파이값 %f (소수점 6자리)입니다." , 3.14);
		System.out.printf("\n7. 파이값 %.2f(소수점 2자리)입니다." , 3.14);
		System.out.printf("\n8. 파이값 %5.3f(총자리수 5개중 소수점 3자리)입니다." , 3.14);
		System.out.printf("\n9. 파이값 %e 입니다." , 3.14159278564);
	
		
		
		
	}

}
