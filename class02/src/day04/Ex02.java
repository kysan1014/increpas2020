package day04;

import java.util.Random;

public class Ex02 {

	/*
	문제 2)
	 
		랜덤하게 다섯자리 숫자를 만들고;
		각 자리의 숫자의 합을 구해서 출력해주는 프로그램 작성
	  
	 */
	
	public static void main(String[] args) {
		
		int rand = new Random().nextInt(100000);
		int result = 0;
		
		int temp = rand;
		for (int i = 0, j = 10000; i < 4; i++, j /= 10) {
			result += temp / j;
			temp -= temp / j * j;

		}

		System.out.printf("%d -> %d",rand, result);
	}
	
}
