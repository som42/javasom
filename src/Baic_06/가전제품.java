package Baic_06;

public class 가전제품 {

	public static void main(String[] args) {
		Com com = new Com();
		com.ele();
		
		Air air = new Air();
		com.ele_1();
	}

}
class Element {
	
	int weight = 100;
	int power = 200;
	int price = 300;
	
	int we = 80;
	int po = 150;
	int pr = 150;
	
	String a = "kg 입니다";
	String b = "cc 입니다";
	String c = "만원 입니다";
	
	
	void ele() {
		System.out.println("컴퓨터 자세히 보기");
		System.out.println("무게 :" + weight+a);
		System.out.println("파워 :" + power+b);
		System.out.println("가격 :" + price+c );	
		System.out.println("----------------------");
	}
	
	void ele_1() {
		System.out.println("에어콘 자세히 보기");
		System.out.println("무게 :" + we + a);
		System.out.println("파워 :" + po + b);
		System.out.println("가격 :" + pr + c);
	}
}
class Com extends Element{
	
}

class Air extends Element{
	
}
