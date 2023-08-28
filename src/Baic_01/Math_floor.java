package Baic_01;
import static java.lang.System.out;
public class Math_floor {

	public static void main(String[] args) {
		// Math 관련 메소드 실습
		System.out.println("무조건 자르기(floor)값 :" + Math.floor(65.6));
		out.printf("2 무조건 자르기(소수점 6자리) 값 : %f", + Math.floor(65.9));
		out.printf("\n3 무조건자르기(총자리수 5개 중 소수점 2자리) 값 :%5.2f", Math.floor(65.9));
		
		out.println("\n4 무조건 올리기(cell) 값 : " + Math.ceil(65.3));
		out.printf("\n5 무조건 올리기(총 자리수 7) 값 : %7.3f", Math.ceil(65.56783));
		
	
	}

}
