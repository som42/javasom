package Baic_06;

public class Car_Once {

	public static void main(String[] args) {
		Car_Bus car_bus = new Car_Bus();
		car_bus.run();
		
		Car_Trn car_trn =  new Car_Trn();
		car_trn.run();
	}

}
class Car_All{
	String right = "밝기";
	String handle = "파워 핸들";
	int ball = 4;
	
	void run() {
		System.out.println("달린다");
		System.out.println("조명 : " + right);
		System.out.println("파워핸들 : " + handle);
		System.out.println("바퀴 : " + ball);
	}
}

class Car_Bus extends Car_All{
		
}
class Car_Trn extends Car_All{
	
}