package Baic_06;

public class Ani_Main {

	public static void main(String[] args) {
		Ani_Cat ani_cat =new Ani_Cat("고양이 인사");
	
		ani_cat.cry("야옹");
		ani_cat.nam("나비");
		ani_cat.eat("생선잡기","쥐잡기");
		ani_cat.play("귀엽고","앙칼짐");
//		ani_cat.li();
		
//	강이지 객체 생성후 강아지에 관한 상항 소개
		Ani_Dog dog = new Ani_Dog("멍멍 환영합니다.");
		
		dog.cry("멍멍");
		dog.play("잠자기","밥먹기");
		dog.like_print();
		
		
		
	}

}
