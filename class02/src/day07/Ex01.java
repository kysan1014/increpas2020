package day07;

import java.util.Random;

public class Ex01 {

	/*
		
		'A' ~ 'J' 대문자를 랜덤하게 100개 발생시켜서
		각 문자가 몇 번 씩 발생되는 지 크래프 형태로 출력하세요
		
		예 )
		
			A(5) : *****
			B(3) : ***
		
	 */
	
	public static void main(String[] args) {
		
		int len = 100;
		int randIntLength = 10;
		char initChar = 'A';
		
		// Character Array Initialization
		
		Random random = new Random();
		char[] charArr = new char[len];
		
		for (int i = 0; i < charArr.length; i++) {
			charArr[i] = (char) (initChar + random.nextInt(randIntLength));
		}
		
		// Counting Alphabets
		
		int[] countChar = new int[randIntLength];
		
		for (char ch : charArr) {
			for (int i = 0; i < randIntLength; i++) {
				if (ch == (char) (initChar + i)) {
					countChar[i]++;
					break;
				}
			}
		}
		
		// Print Result
		char temp = initChar;
		
		for (int result : countChar) {
			
			System.out.printf("%c (%2d) : ", initChar++, result);
			for (int i = 0; i < result; i++) {
				System.out.print("*");
			}
			System.out.println("\n");
			
		}
		
		// -------------------------------------------------------------------------------------
		
	}
	
}
