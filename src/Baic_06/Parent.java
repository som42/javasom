package Baic_06;

public class Parent {
	int age=50;
	String name ="부모";
	
	public Parent(int age, String name) {
		this.age =  age;
		this.name = name;
		System.out.println("나는 부모 생성자(매게변수 2개)");
		System.out.println("나는 부모 생성자 나이 : "
				+ age + ", 이름 : " + name);
	}
	public void pr (int age, String name) {
		System.out.println("자식 클래스에서 호출되어 출려 나이 :"
				+ age + "(,이름 :" + name);
	}
//===========메인 메소드==================
	public static void main(String[] args) {
			Hong hong =  new Hong(10,"홍길동");
			hong.pr(10,"김동황");
	}
//===========메인 메소드=================='
}
class Hong extends Parent {
	Hong(int age, String name){
		super(10, "부모이름");
		
	}
	
}
