package Baic_04;

public class person_Method_03 {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class_print_1();
		
		person_Method_03 ins = new person_Method_03();
		ins.Class_print_2();
	
	}
	
	//클래스 멤버 변수 선은 
	static String name_1 = "김태풍";
	static String jod = "프리";
	static int age = 20;
	
	//클래스 멤버 함수 선언
	static void class_print_1() { 
		System.out.println("클래스 변수 :");
		System.out.println("-------------------");
		System.out.println("이름 : " + name_1);
		System.out.println("직업 : " + jod);
		System.out.println("나이 : " + age);
	}
	
	// 인스턴스 멤버 변수 선언
	 String name_2 = "김태양";
	 String jod_2 = "무직";
	 int age_2 = 30;
	 
	 //인스턴스 멤버 함수 선은 
	 void Class_print_2() {
		 System.out.println("인스턴스 변수 : ");
		 System.out.println("-------------------");
		 System.out.println("이름 : " +  name_2);
		 System.out.println("직업 : " + jod_2);
		 System.out.println("나이 : " + age_2);
	 }
}
