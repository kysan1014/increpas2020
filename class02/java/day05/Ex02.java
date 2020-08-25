package day05;

import java.util.Scanner;

/*

	회문수 판별하기

 */

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		String snum = sc.next();

		/*
		flag 기법
		
			- 프로그램을 실행하다 보면
				두 가지 이상의 경우가 발생하는 순간이 존재함
				그 후 어떤 경우가 발생하였는지 확인하는 기법
		 */
		
		int len = snum.length();
		boolean isPal = true; // flag
		for (int i = 0; i < len / 2; i++) {
			if (snum.charAt(i) != snum.charAt(len - i - 1)) {
				isPal = false;
				break;
			}
		}

		String s = "";
		if (isPal) {
			s = "입니다.";
		} else {
			s = "가 아닙니다.";
		}

		System.out.printf("%s는 회문수%s", snum, s);

		sc.close();
	}

}
