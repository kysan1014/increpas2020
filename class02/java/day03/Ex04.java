package day03;

import java.util.Scanner;

public class Ex04 {

	/*
	 문제4)
	 	년수를 입력받아
	 	그 해가 윤년인지 판별하기
	 	
	 	윤년: 4로 나누어 떨어짐
	 		100으로는 나누어 떨어지지 않음,
	 		400으로 나누어 떨어짐
	 		
	 	예)
	 		1300 - 평년
	 		1600 - 윤년
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년수를 입력하세요 : ");
		int year = sc.nextInt();
		
		System.out.printf("%d년은 %s입니다.", 
				year, 
				(year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)) ? "윤년" : "평년");
		
	}
}
