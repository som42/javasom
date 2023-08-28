package Baic_04;

public class Car_Method_02 {
	
	String handle= "우회전";
	int ball = 10;
	int rotate = 20;
	
//	ball = 4;
	
	void car_run() {
		handle="90도 회전";
		ball=40;
		System.out.printf("1번 코너에서 %s 하세요 ",handle);
		if (  ball < 10 )
			System.out.printf(" 1번 코너에서 %d도 회전하세요 ", rotate);
		else
			System.out.printf(" 1번 코너에서 %d도 회전하세요 ", rotate+50);
	}
	
	public static void main(String[] args) {
		Car_Method_02 car = new Car_Method_02();
		car.car_run();
	}

}
