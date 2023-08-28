package Baic_02;

public class Cast {
	int a=0;
	byte b = (byte)a;
	long kbs = 10;
	double sbs = 3.14*10;
	
	
	void pri() {
		System.out.printf("long형에 정수 입력 : %d ", kbs);
		System.out.printf("\ndouble형에 정수 곱하기 입력 : %f" , sbs);
		System.out.printf("\n바이트 int형이 1바이트(-128~127)에 강제(cast연산자) 변환 :%d" , b);
	}

	public static void main(String[] args) {
		
		Cast cast = new Cast(); // 부모 (자신) 클래스에서 객체 생성
		cast.pri();
		
//		long kbs = 10;
//		System.out.printf("long형에 정수 입력 : %d ", kbs);
//		
//		double sbs = 3.14*10;  //10.0으로 인식한다
//		System.out.printf("\ndouble형에 정수 곱하기 입력 : %f" , sbs);
//		
//		int a = 10;
//		byte b = (byte)a;
//		System.out.printf("\n바이트 int형이 1바이트(-128~127)에 강제(cast연산자) 변환 :%d" , b);
//		
	}

}
