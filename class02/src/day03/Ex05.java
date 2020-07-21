package day03;

import java.util.Random;
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
			
			랜덤 정수 발생 방법
			
			(int) (Math.random() * (큰 수 - 작은 수 + 1) + 작은 수
			
				- Math.random() - 0 <= Math.random() < 1
				
				예) 1 ~ 10
				
					(int) (Math.random() * (10 - 1 + 1) + 1);
					
		 */
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		
//		System.out.print("문자 하나를 입력하세요 : ");
//		char c = sc.next().charAt(0);
		
		char c = (char) rd.nextInt(256);
		
//		char ch = (char) ( ((c >= 65) && (c <= 90)) ? c + 32 : (((c >= 97) && (c <= 122)) ? c - 32 : c) );
		
		char result = (c >= 'A' && c <= 'Z') ? (char) (c + ('a' - 'A')) : ( (c >= 'a' && c <= 'z') ? (char) (c - ('a' - 'A')) : c);
		
		
		String msg = String.format("랜덤하게 발생한 문자 [ %c ]는 < %c >로 변환된다.", c, result);
		
		System.out.println(msg);
		
		
	}

}
