package Baic_04;

import java.util.Iterator;

import Baic_01.a;

public class Basic_04_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s_2 = "ABCDRFG";
		String s_1 = "abcdefg";
		int i_1 = 1234567;
		double pi = 3.141592;
		
		System.out.println(String.format( "%20s",s_1) ); //총자리수 20자리로 앞에 공백
		System.out.println(String.format( "%,d",i_1) ); //3자리 마다 콤마
		System.out.println(String.format( "%,#6.3f",pi) ); //총 6자리에서(소수점 포함)소수 3자리
		System.out.println(String.format( "%,06.3f",pi) ); //총 6자리에서(소수점 포함)빈자리 0으로 채워라
	
		System.out.println("------------------------------------");
		
		
		System.out.println(String.format(s_2.toLowerCase()) ); //소문자로 변환
		System.out.println(String.format(s_1.toUpperCase()) );// 대문자로 변환
		
		String s_3 = "  abc  ";
		System.out.println("공백 제거전"+s_3);        // 좌우 공백 제거 하기전
		System.out.println("공백 제거후"+s_3.trim() );// 좌우 공백 제거 후
		System.out.println("-------------------------------------");
		
		System.out.println("문자 추출 : " + s_1.substring(3) ); //네 번째부터 출력
		System.out.println("문자 추출 : " + s_1.substring(3, 5) ); //3부터 5전까지 출력
		
		char[] charA = s_2.toCharArray();
		for(int k=0; k<charA.length; k++)
			System.out.printf("[%d] : %s \n", k,charA[k]);
		System.out.println("-------------------------------------");
		
		String kor = "한글 입력을 시작 합니다.";
		String[] wordA = kor.split(" +"); //공백이 한개 이상 (+)일 때 공백을 구분으로 추출해서 배열에 넣어라
		for( int k=0; k<wordA.length; k++)
			System.out.printf(" [%d] : %s \n", k, wordA[k]);
		System.out.println("-------------------------------------");
		
		System.out.println("알파벳 소문자가 있냐 : " + s_1.matches("[a-z]") ); //소문자가 1개만 있으면 true
		System.out.println("알파벳 소문자가 있냐 : " + s_1.matches("[a-z]+") ); //소문자가 1개이상 있으면 true
		System.out.println("-------------------------------------");
		
//		String pw = "123abc";
//		System.out.println( pw.matches("[0-8]")); //숫자 1개이상 있으면 true
//		
		
		String[] strA = {"자바","웹표준","백엔드","프론트"};
		System.out.println(String.join(", ", strA));
		System.out.println(String.join(" - ", strA));
		
		//문자열 관련 표현식 알파벳 A-65 B-66
		String a1 = "컴퓨터";
		String a2 = "컴퓨터";
		System.out.println( a1.compareTo(a2)); //같으면 0
		
		a2 = "학교";
		System.out.println( a1.compareTo(a2)); // a2가 크면 음수
		
		a2 = "가자";
		System.out.println( a1.compareTo(a2)); // a2가 작으면 양수
		System.out.println("-------------------------------------");
		
		String c_1 = "Abc";
		System.out.println(c_1.equals("abc" )); //대소문자 구분해서 다르면 false
		System.out.println(c_1.equalsIgnoreCase("abc" )); //대소문자 구분없이 같으면 true
		System.out.println("-------------------------------------");
		
		System.out.println(a1.startsWith("컴")); //첫 글자가 컴이면 true
		System.out.println(a1.endsWith("터")); //첫 글자가 컴이면 true
		
		String c_2 = "abc123 ? kbs456:sbs777";
		System.out.println(c_2.replace("?", "")); //?를 공백으로 바꿔라
		System.out.println(c_2.replaceAll("[0-9]", "")); //0~9사이 숫자는 삭제하라
		System.out.println("-------------------------------------");
		
		String book = "1, 자바 학습, 참조 타입, String를 학습합니다., 공유";
		String[] tokens = book.split(",");
		
		System.out.println( "번호 " + tokens[0]);
		System.out.println( "목표 " + tokens[1]);
		System.out.println( "제목 " + tokens[2]);
		System.out.println( "내용 " + tokens[3]);
		System.out.println( "성명 " + tokens[4]);
		
		System.out.println("-------------------------------------");
		for (int i=0; i<tokens.length; i++)
			System.out.println("번호 :"+ tokens[i]);
		
		System.out.println("-------------------------------------");
		for ( String str : tokens) //배열 항목 반복문을 위한 향상된 for문
			System.out.println( str );
		System.out.println("-------------------------------------");
		
		int[] jumsu = {50, 60, 70};
		for( int no : jumsu) {
			System.out.println( no );
		}
		System.out.println("-------------------------------------");
		
		int count = 0;
		String[] nameA = {"홍길동", "이동수", "김철수"};
		for(String str : nameA) {
			count++;
			System.out.printf( "[%d] : %s \n", count ,str );
		}

		
	 }
}


