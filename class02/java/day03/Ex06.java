package day03;

import java.util.Scanner;

public class Ex06 {

	/*
		문제6)
			게시물을 게시판에 붙이는데
			하나의 게시판에는 게시물 15개를 붙일 수있다.
			게시물의 갯수를 랜덤하게 입력한 후(Scanner 이용)
			몇 개의 게시판이 필요한지 계산해서 출력하는 프로그램을 작성하시오.
		
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("게시물 수를 입력하세요 : ");
		int posts = sc.nextInt();
		
		System.out.println(posts % 15 == 0 ? posts / 15 : posts / 15 + 1);
		
	}
	
}
