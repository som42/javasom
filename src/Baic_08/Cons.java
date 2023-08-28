package Baic_08;

public class Cons {

	public static void main(String[] args) {
		Com com1 = new Com("김래환",15);
		Com com2 = new Com("김대두",25);
		Com com3 = new Com("김충이",35);
		
		Com[] cco = { com1, com2, com3 };
		for(int i=0;i<cco.length;i++) {
			System.out.println(cco[i].str());
		}
	}

}
class Com{
	String name;
	int age;
	
	
	Com(String name, int age){
		this.name = name;
		this.age = age;	
	}
	String str() {
		return String.format("이름 : %s, 나이 : %d "
				,this.name,this.age);
	}
}
