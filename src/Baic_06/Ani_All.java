package Baic_06;



public class Ani_All {
	String name="내 이름은 ";
	String sori="울음 소리 ";
	String age ="내 나이는 ";
	String agg = "내가 좋아하는것은 ";

	int leg =4;
	
	void li() {
		System.out.println("==================");
	}
	void run( ) {
		System.out.println("어떤 동물이 있을까?");
		System.out.println("---------------");
		}
	
	void cry( String a ) {
		System.out.println("--------------------------");
		System.out.printf("나의 울음 소리는 %s 입니다.", a );
			
	}
	void nam (String b) {
		System.out.printf("\n%s%s 입니다",name,b);
	}
	
	String agee ;
	void play(String a, String b) {
		System.out.printf("나의 특징 : %s, %s\n",a,b);
	}
	Ani_All( String a){
		System.out.println("강아지 클래스에서 찾아왓");
	}

}	

