package Baic_04;

public class Bak_lnter_05 {

	static String name= "김신"; // 클래스 멤버 변수 
	static int count=0;		   // 클래스 멤버 변수
	
	
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
		 Who.who_point();
		 Iam.iam_point();
	   }
	}
	static class Who {
		static void who_point() {
			System.out.println("\n넌 누구뉭!!");
		}
	}
	
	static class Iam {
		static void iam_point() {
			System.out.printf("난 %d번째 난장이얌", ++count);
		}
	}
}
