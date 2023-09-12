package 연습.자바의정석.C09;
import java.util.*;

public class do_0 {

 public static void main(String[] args) {
	
     int score = 0;       // 점수를 저장하기 위한 변수 초기화
     char grade = ' ';    // 학점을 저장하기 위한 변수 초기화

     System.out.print("점수를 입력하세요. >");
     Scanner scanner = new Scanner(System.in);
     score = scanner.nextInt();   // 화면에 입력 받은 숫자를 score 변수에 저장

     if(score > 100){
          System.out.println("입력하신 학점은"+score+"입니다.; 100점 이하의 숫자로 다시 입력해주세요.");  
     } else{
     
	if(score >= 90 || score >= 100  ){
         grade = 'A';
     } else if(score >= 80){
         grade = 'B';
     } else if(score >= 70){
         grade = 'C';
     }
     System.out.println("당신의 점수는"+score+"이며, 학점은"+grade+"입니다.");
     }
}

	
  
}