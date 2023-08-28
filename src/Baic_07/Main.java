package Baic_07;

public class Main {

	public static void main(String[] args) {
	
		Car car = new Bus();
		car.run();
	    car.road(); 
   //  *결론 : 다형성은 부모(자식)클래스의 결정에 따라 다양한(메소드 선택결정) 형태에 선택을 할수있다.
		Car car1 = new Tru();
		car1.run();
		
		Tru tru = new Tru();
		tru.a();
		tru.a("문자");
		tru.a(10,"문자");
		
		

	}
}
class Car{
	String name="이름은 ";
	int speed = 100;

	void run(){
		System.out.println("부모에서 달린다.");
	}	
	void road() {
		System.out.printf("\n오늘도 사람들을 태우고  달린다");
	}

}
class Bus extends Car{
	
	void run() {
		super.run();
		System.out.printf(name + "버스이고 시속은 "
				+ speed + "으로 달린다 " );		
	}	
	void road() {
		System.out.printf("\n오늘도 사람들을 태우고 버스는 달린다");
	}
}
class Tru extends Car{
	
	void a () {
		System.out.println("매개변수 0");
	}
	void a (String a) {
		System.out.println("매겨변수 1" + a);
	}
	void a (int b, String c) {
		System.out.println("매개변수2 "+b+","+c);
	}
}
