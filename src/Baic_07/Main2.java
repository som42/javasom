package Baic_07;

public class Main2 {

	public static void main(String[] args) {
		
//		Car1 car1 =  new Bus1();
//		car1.run1();
		
		Car1 car1 = new Tru1();
		car1.run1();
		

	}
}
class Car1{
	String name="자동차";
	int speed=10;
	void run1() {
		System.out.println("무엇을 넣을 것인가");
	}
}
class Bus1 extends Car1{
	public Bus1() {  //생성자 : 클래스 이름과 똑같다
		name = "버스";
		speed = 60;
		System.out.printf("이름 : %s \n", name);
		System.out.printf("속도 : %d \n", speed);
	}
}
class Tru1 extends Car1{
	Tru1(){
		name = "트럭";
		speed = 100;
		System.out.printf("이름 : %s \n", name);
		System.out.printf("속도 : %d \n", speed);
	}
}
