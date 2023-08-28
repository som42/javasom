package Baic_08;

public class Test_01 {

	static String a = "100";
	static String b = "200";

	static void calc() {
		int _a =  Integer.parseInt(a);
		int _b =  Integer.parseInt(b);
		System.out.printf("%d*%d = %d" ,_a,_b, (_a * _b) );
	}
	public static void main(String[] args) {
/* 문자를 숫자로 변환해서 곱하는거 
		String a = "100";
		String b = "200";

		//문자열을 숫자로 형변환 하는거 
		int _a =  Integer.parseInt(a);
		int _b =  Integer.parseInt(b);
		System.out.println("100*200 = " + (_a * _b) );
	*/	
		Test_01 test_01 = new Test_01();
		test_01.calc();
//		calc();
		
	}

}
