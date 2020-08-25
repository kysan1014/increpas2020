package day05;

import java.util.Scanner;

/*
	1~10까지 합 구하기
 */

public class Ex03 {

	class Summation {

		public int getSum(int start, int end) {

			int sum = 0;
			for (int i = start; i < end + 1; i++) {
				sum += i;
			}

			return sum;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("==================================");
		System.out.println("n부터 m까지의 합을 구하는 프로그램");
		System.out.println("==================================\n");

		System.out.print("첫 숫자를 입력하세요 : ");
		int start = sc.nextInt();
		System.out.print("끝 숫자를 입력하세요 : ");
		int end = sc.nextInt();

		int sum = new Ex03().new Summation().getSum(start, end);

		System.out.printf("\n%d부터 %d까지의 합 : %d", start, end, sum);

	}

}
