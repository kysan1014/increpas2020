package day05;

import java.util.Scanner;

public class Extra {

	public static void main(String[] args) {
		
		/*
			정수를 랜덤하게 발생 시키고
			숫자를 입력 받아서
			같은 숫자가 입력될 경우 종료시키는
			프로그램을 작성하시오.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int randInt = (int) (Math.random() * 100 + 1);
		
		System.out.printf("생성된 정수 : %d%n",randInt);
		for (;;) {
			System.out.print("1부터 100까지의 정수를 입력하세요 : ");
			int input = sc.nextInt();
			
			if (input == randInt) {
				break;
			}
			
			System.out.println("랜덤생성된 수와 입력하신 수는 같지 않습니다.\n");
		}
		
		System.out.println("\n수고하셨습니다.");
		
	}
	
}
