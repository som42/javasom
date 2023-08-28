package Baic_08;

public class Multi_Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lang lang = new Java(); // Lang 타입의 인스턴스 lang에는 java객체가 들어감
		lang.show();
	}

}
class Lang {
	String name;
	int page;
	int def;
	
	public void show() {
		System.out.println("----------------");
		System.out.println("언 어" + name);
		System.out.println("페이지" + page);
		System.out.println("난이도" + def);
	}
}
class Java extends Lang{
	public Java() {
		name = "자바";
		page = 200;
		def = 50;
	}
	
}
