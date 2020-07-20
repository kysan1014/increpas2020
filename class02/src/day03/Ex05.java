package day03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
			문제 5)
				알파벳 문자를 임의로 입력한 후,
				그 문자가 대문자이면 소문자로 변환하고,
				소문자이면 대문자로 변환.
				특수문자면 그냥 출력
			
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나를 입력하세요 : ");
		char c = sc.next().charAt(0);
		
		char ch = (char) ( ((c >= 65) && (c <= 90)) ? c + 32 : (((c >= 97) && (c <= 122)) ? c - 32 : c) );
		System.out.println(ch);
		
		
	}

}
