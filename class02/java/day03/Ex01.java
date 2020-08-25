package day03;

import java.util.Scanner;

public class Ex01 {

	/* 
	 문제1)
	 	두 수를 입력받아,
	 	첫 번째 수가 두 번째 수보다 크면 "양수",
	 	반대이면 "음수" 출력
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 >  num2 ? "양수" : "음수");
		
	}
	
}
