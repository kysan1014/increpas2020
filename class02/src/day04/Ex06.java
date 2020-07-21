package day04;

import java.util.Scanner;

/*
	문제 3]
			정수 세개를 입력 받아서
			제일 큰수부터 출력하세요.
*/

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수를 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.print("세 번째 수를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		int temp = 0;
		
		if (num1 < num2) {
			temp = num2;
			num2 = num1;
			num1 = temp;
		}
		
		if (num1 < num3) {
			temp = num3;
			num3 = num1;
			num1 = temp;
		}
		
		if (num2 < num3) {
			temp = num3;
			num3 = num2;
			num2 = temp;
		}
		
		System.out.printf("입력된 수 : %d, %d, %d", num1, num2, num3);
		
	}
}
