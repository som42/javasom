package Baic_08;

public class Extends_1 {

	public static void main(String[] args) {
		
		Chi my = new Chi(10,20); //  10:부모 돈  20:자신의돈
		System.out.println("홍길동 기준 -(홍길동)총 재산 : " + my.chi_money);
		System.out.println("홍길동 기준 -(홍길동)부모님의 총 재산 : " + my.p_price);
		
		
		Chi my2 = new Chi(35,25); //  10:부모 돈  20:자신의돈
		System.out.println("이동수 기준 -(이동수)총 재산 : " +my2.chi_money);
		System.out.println("이동수 기준 -(이동수)부모님의 총 재산 : " + my2.p_price);
	
		
	}

}

class ParMoney{
	int p_money; //부모 돈
	int p_kum=100;   //부모 재산
	int p_price; //늘어난 재산
	ParMoney(int ex1){ //10을 전달받고
		p_money = ex1; // 부모 돈은 10
		p_price =  p_money + p_kum;	//10+100
	}	
}
class Chi extends ParMoney {
	int chi_money;
	int chi_kum=50;
	int chi_price;
	Chi(int ex1, int ex2){
		super(ex1); //10
		chi_money = ex2; //20 
		chi_money =  chi_kum + chi_money; //50+20
		
	}
}
