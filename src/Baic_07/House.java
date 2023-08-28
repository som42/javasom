package Baic_07;

public class House {

	public static void main(String[] args) {

		Apt apt = new Apt();  //인스턴스 함수라서 객체를 만든다
		apt.door();

		Dan dan = new Dan();
		dan.door();
		System.out.println("-----------------");

		Apt apt2 = new Dan();
		apt2.door();
		
		Apt dan2 = new Dan();
		dan2.door();
		
		Apt apt3 = new Dan();
		apt3.door();
	}

}

class Apt {
	int room=3;
	void door() {
		System.out.println("문이 열쇠");		
	}
}
class Dan extends Apt{
	void door() {
		System.out.println("문을 도어락"); //오버라이딩(재정의) : 이름똑같은데 내용만바뀐다

	}
}