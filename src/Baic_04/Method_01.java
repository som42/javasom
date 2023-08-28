package Baic_04;

public class Method_01 {
	
	static String name_1 = " 홍길동 "; // 클래스 멤버 함수 
	static void sogae_1( ) {         // 클래스 멤버 함수
		System.out.printf("나는 %s 입니다\n" , name_1);
	}
	
	String name_2 = "이동수";						//인스턴스 멤버 변수
	void sogae_2() {							//인스턴스 멤버 함수 
		System.out.printf("나는 %s 입니다\n" , name_2); 
	}
	
	public static void main(String[] args) {
		System.out.println("클래스 변수를 출력 : " + name_1);
		sogae_1();

		Method_01 ins = new Method_01(); //객체를 생성해서 인스터스 멤버를 사용
 		System.out.println("인스턴스 변수를 출력 : " + ins.name_2);
		ins.sogae_2();
		
		
	}

}
