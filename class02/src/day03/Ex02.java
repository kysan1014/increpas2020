package day03;

import java.util.Scanner;

public class Ex02 {

	/*
	 
	 	문제2
	 		세자리 수를 입력받아
	 		300보다 크면 "300보다 큰 수",
	 		300보다 작으면 "300보다 작은 수"를 출력
	 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("세자리 수를 입력하세요 : ");
		int i = sc.nextInt();
		
		System.out.println(i > 300 ? "300보다 큰 수" : "300보다 작은 수");
	}
	
}
