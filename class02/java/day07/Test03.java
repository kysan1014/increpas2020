package day07;

import java.util.Arrays;

public class Test03 {
	
	/*
		'a' 부터 문자 10개를 저장하는 배열을 만들고 출력하는 프로그램을 작성
	*/
	
	public static void main(String[] args) {

		int len = 10;
		char initChar = 'a';
		
		char[] charArr = new char[len];
		
		for (int i = 0; i < charArr.length; i++) {
			charArr[i] = initChar++;
		}
		
		
		System.out.println(Arrays.toString(charArr));
		System.out.println();
		
		
		for (int i = 0; i < charArr.length; i++) {
			System.out.printf("%c\t",charArr[i]);
		}
		System.out.println("\n");
		
		
		for (char ch : charArr) {
			System.out.printf("%c\t",ch);
		}
		System.out.println("\n");
		
		
		int i = 0;
		while (i < charArr.length) {
			System.out.printf("%c\t",charArr[i++]);
		}
		
	}
}
