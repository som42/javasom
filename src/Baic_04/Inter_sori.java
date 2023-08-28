package Baic_04;

public class Inter_sori {
	
	static void sori( String sound ) { //클래스멤버함수 (메소드)
		
	}
	static class Cat{  //내부 클래스 
		static String so="야옹";   //Cat 클래스 멤버변수
		static void cat_method (String name) {// Cat 멤버 변수
			System.out.printf("고양이 소리 : %s\n ", name);
		}
	}
	static class Tig{  //내부 클래스 
		static String so ="어흥";  //Tig 멤버 변수
		static void tig_method (String name) { //Tig 멤버 함수
			System.out.printf("\n동물의 왕 소리 : %s", name);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("고양이 특징");
		System.out.printf("고양이 소리는 %s\n",Cat.so);
		Cat.cat_method(Cat.so);
		
		System.out.println("호랑이 특징");
		System.out.printf("호랑이 소리는 %s\n",Tig.so);
		Tig.tig_method(Tig.so);
	}

}
