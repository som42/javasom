//하나의 소스파일에는 하나의 클래스만 작성하는것이 바람직
package Baic_01; 


class Hello3 {
	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은" + t.channel + "입니다");
	}
} 
class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() { ++channel;}
	void channelDown() { --channel;}
	
}
