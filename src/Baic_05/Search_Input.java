package Baic_05;

import java.util.Scanner;
					//extends를 써야 다른 클래스에있는 배열을 들고올수잇다
public class Search_Input extends Search_Array{
	String name;
	void input_name() {
		
		Scanner scanf = new Scanner(System.in);
		
//		System.out.println(nameA);
		
		while(true){
			System.out.println("\n찾는사람이름 : ");
			name = scanf.next();
			
			System.out.printf("이름 %s",name);
			int a=0, sw=0;
		 for(String str : nameA) {
			 if(str.equals(name)) {
				 System.out.println(" 찾았습니다");
				 sw=1;
				 break;				 
			 }
			 
			 a++;	
			 if(a==nameA.length)
				 System.out.println("없다");
		  }
		 
		 
		 
		 line();
		 System.out.printf("%s %d %s",nameA[a],
				 ageA[a],telA[a]);
		 
		 System.out.println("\n 또 찾고싶은 사람이 있나요(ㅇ/ㄴ)");
		 name = scanf.next();
		 if ( name.equals("ㄴ")) {
			 break;
			
		 }
			
	}
		System.out.println("수고했어요");
	}

}
