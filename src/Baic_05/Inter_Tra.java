package Baic_05;

public class Inter_Tra {
//	static String speed = "속도";
//	
//	static void run(String re) {
//		System.out.printf("%s 특징",re);}
//	static class Bus {
//	static void bus_run(String ee) {
//		System.out.printf("\n버스의 %s는 : 70 ",ee);
//	}
//	
//}
//static class Car {
//	static void Car_run(String ef) {
//		System.out.printf("\n차의 %s 는 : 100 ",ef);
//	}
//	
//}
	static String title;
	static int speed=100;
	
	static void run() {
		System.out.println("달리다");
	}
	static void tra_run() {
		System.out.println("부모에서 달리는 메소드 "+ speed);
	}
	
	static class Bus{
		static int speed =30;
		static void bus_run() {
			System.out.println("버스 속도 : " + speed);
			System.out.println("부모 속도: " + Inter_Tra.speed);
			Inter_Tra.tra_run();
		
		}
	}

	
	public static void main(String[] args) {
//		 run(speed);
//		 Bus.bus_run(speed);
//		 Car.Car_run(speed);
		run();
		tra_run();
		Bus.bus_run();
	}

}
