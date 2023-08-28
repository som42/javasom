package Baic_01;

public class Ham {

	public static void main(String[] args) {
		
		String sang, gu;
		int price, su, kum;
		
		sang = "햄버거";
		gu = "Big Size";
		price = 5000;
		su = 3;
		kum = price*su;
		
		System.out.println("상품명 : "+sang);  
		System.out.printf("규  격: %s", gu);
		System.out.printf("\n가  격: %d", price);
		System.out.printf("\n수  량: %d \n총금액 : %d", su, su*price);
	

	}

}
