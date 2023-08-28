package Baic_08;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Par p1 = new Par("홍길도",20);
		System.out.printf("이름 : %s, 나이 : %d", p1.name,p1.age);
		
		System.out.println("---------------------------------");
			
		Par p2 = new Par("이동수",30);
		String str = p2.str();
		System.out.println(str);
	}
	

}
class Par{
	String name;
	int age;
	Par(String name, int age){
		this.name=name;
		this.age=age;		
	}
	String str() {
		return String.format("이름 : %s, 나이 : %d", name, age);
	}
}