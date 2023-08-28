package Baic_04;

public class 연습 {
	
	static String food_1 = "김치";
	static void fo () {
		System.out.printf("\n오늘의 밑반찬 : %s\n", food_1);
	}
	
	String food_2 = "안심스테이크";
	void fo_1 () {
		System.out.printf("오늘의 메인 : %s\n", food_2);	
	}
	public static void main(String[] args) {
		System.out.printf("static 변수 %s", food_1);
		연습 ins = new 연습();
		fo();
		//()메서드라는뜻이라서 무조건 붙인다 
		
		fo();
		ins.fo_1();
		
		System.out.printf("\n인스턴스 변수 : %s\n",ins.food_2);
		ins.fo_1();
	}

}
