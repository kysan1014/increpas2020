package day03;

import java.util.Scanner;

public class Ex03 {

	/*
		* 삼항연산자로
	
		문제3)
			세 수를 입력받아,
			큰 순서대로 출력하기
			
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int first, second, third;
		
		System.out.print("첫 번째 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수를 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.print("세 번째 수를 입력하세요 : ");
		int num3 = sc.nextInt();
		System.out.println();
		
		// 최대 최소 값
		
		first = num1 >= num2 ? num1 : num2;
		second = num1 < num2 ? num1 : num2;
		first = first >= num3 ? first : num3;
		third = second < num3 ? second : num3;
		
		// 중간 수 찾기
		
		int m1 = num2 < num3 ? num2 : num3;
		int m2 = num1 < num3 ? num1 : num3;
		second = second >= m1 ? second : m1;
		second = second >= m2 ? second : m2;

		
		System.out.printf("가장 큰 수\t:\t%d%n",first);
		System.out.printf("중간 수",second);
		System.out.printf("가장 작은 수\t:\t%d%n", third);
		
	}
	
}
