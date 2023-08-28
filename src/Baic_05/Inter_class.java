package Baic_05;

public class Inter_class { //부모클래스=상위클래스=super
	static String so = "야옹";//Inter_Class 클래스 속성(멤버변수)
	static String ro = "멍멍";
	static void sori(String sound) { //클래스 멤버함수
		System.out.printf("%s의 특징", sound);
	}
	
	static class Cat {     //내부클래스,자식클래스,하위클래스,sub클래스
		static void cat_mathod (String name) { //Cat 클래스 멤버함수(메소드)
			System.out.printf("\n전달 받은 (고양이)소리 : %s \n", name);
	}
}
	static class Dog{
		static void dog_mathod (String name_1) {
			System.out.printf("\n전달 받은 (강아지)소리 : %s \n", name_1);
		}
	}
	public static void main(String[] args) {
		// Cat 클래스 사용
		sori("냥이");
		Cat.cat_mathod(so);
		sori("아지");
		Dog.dog_mathod(ro);
		
		
		
    }

}