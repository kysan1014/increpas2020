package day04;

import java.util.Random;
import java.util.Scanner;

public class Ex01 {

	static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		
			문제 1) 
				
				두 자리 수를 입력받고, 두 자리 수를 랜덤으로 생성.
				두 수 중에 더 큰 값이 무엇인지 출력
				
				* 추가
				
					입력받은 값이 범위를 벗어나거나, 숫자가 아닌 경우
					자동으로 다시 입력받게 하기
		 */

		int input = getInputRecur();
//		int input = getInputWhile();

		int randint = new Random().nextInt(90) + 10;

		String msg = String.format("입력하신 숫자 %d와 랜덤생성한 숫자 %d 중, 더 큰 값은 %d입니다.", input, randint,
				input > randint ? input : randint);

		System.out.println(msg);

	}

	public static int getInputWhile() {

		int input = 0;
		while (true) {
			try {

				sc = new Scanner(System.in);

				System.out.print("두 자리 수를 입력하세요 : ");
				input = sc.nextInt();

				if (input >= 10 && input < 100) {

					sc.close();
					break;

				}

			} catch (Exception e) {

				System.out.println("다시 입력하세요 : ");

			}

		}

		return input;
	}

	public static int getInputRecur() {

		int input = 0;

		try {

			sc = new Scanner(System.in);

			System.out.print("두 자리 수를 입력하세요 : ");
			input = sc.nextInt();

		} catch (Exception e) {
		}

		if (!(input >= 10 && input < 100)) {

			System.out.println("잘못입력하셨습니다.");
			input = getInputRecur();

		}

		sc.close();

		return input;
	}

}
