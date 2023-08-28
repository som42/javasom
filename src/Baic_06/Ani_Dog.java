package Baic_06;

public class Ani_Dog extends Ani_All {
	
	String age;
	String[] like = {"놀기","뛰기"};
	
	void like_print() {
		
		System.out.println("\n 강아지가 좋아하는 것들");
		System.out.println("-------------------");
		for( String str:like ) {
			System.out.printf("1. %s \n", str);
		
	
		       
		}
	}

	Ani_Dog(String a){
		super("abc");
		System.out.println("부모클래스 생성자");
		System.out.println("굿굿굿"+10+10);
		
	}
	
}
