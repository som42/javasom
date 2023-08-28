package Baic_06;

public class OverLoad {

	static void car() {
		
		System.out.println("자동차 소개");
	}
	static void car(int value) {
		System.out.println("자동차 가격 : " + value);
	}
	static void car(String name ) {
		System.out.println("자동차 이름 : " + name);
	}
	static void car(int yea,int b) {
		System.out.println("자동차 연도 : " + yea + " 자동차 cc : " + b);
	}
	static void car(int a, double b) {
		System.out.println("자동차 상속세 : " + a);
		System.out.println("자동차 세금 : " + b);
	}
	
	
	public static void main(String[] args) {
		
		car();       //메소드 호출
		car(500);
		car("제니시스");
		car(2023,300);
		car(10,11.5);
	}

}
