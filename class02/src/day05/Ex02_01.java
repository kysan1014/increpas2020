package day05;

import java.util.Scanner;

public class Ex02_01 {

	// 입력받은 수를 정수로 변환하여 회문수 판별

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		int num = Integer.parseInt(sc.next());

		boolean isPal = true;
		int len = (int) (Math.log10(num) + 1); // 첫 번째 자리수 알아내기
		int first = 0, second = 0;
		int firstPow = (int) (Math.pow(10, len - 1));
		int secondPow = 10;
		int temp = num;
		
		for (int i = 0; i < len / 2; i++) {
			
			first = temp / firstPow;
			second = temp % secondPow;
//			System.out.println(first + " " + second + " " + firstPow + " " + secondPow);
			if (first != second) {
				isPal = false;
				break;
			}
			temp = (temp - first * firstPow) / 10;
//			System.out.println("temp " + temp);
			firstPow /= 100;
			
		}

		String s = "";
		if (isPal) {
			s = "입니다.";
		} else {
			s = "가 아닙니다.";
		}

		System.out.printf("%s는 회문수%s", num, s);

		sc.close();

	}

}
