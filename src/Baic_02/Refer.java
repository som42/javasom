package Baic_02;

public class Refer {

	public static void main(String[] args) {
		
		int a = 1004;
//		Integer refa = new Integer(10);
		Integer refa = 1004;
		
		System.out.println("값 :" +a );
		System.out.println("값 :" + refa);
		
		String refs = refa.toString();
		System.out.println("refs 크기 : " + refs.length());
		
		Long refl = 547854685454L;
		String refkbs = refl.toString();
		System.out.println("refkbs 크기 : "+ refkbs.length());
		
		System.out.println("Integer.parseInt()를"
				+ "사용하여 정수로 변환 후 출력 : " + Integer.parseInt("65"));
		
		
	}

}
