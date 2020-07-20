package day03;

import java.util.Scanner;

public class Bonus01 {

	/* 
		Bonus01)
			3자리 숫자 (100~999)를 입력받아
			이 숫자에서 가장 가까운 100의 배수를 만들기 위해서는
			얼마가 필요한지 계산해서 출력하는 프로그램
	 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("세자리 수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int n100 = num / 100 * 100;
		int close100 = num - n100 >= 50 ? n100 + 100 : n100;
		
		System.out.printf( "%d이 가까우므로 %d를 %s 한다.", close100, Math.abs(close100 - num), (close100 >= num ? "더해야" : "빼야") );

	}

}
