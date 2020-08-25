package day05;

import java.util.Random;

public class Ex07 {

	/*
		문제 7 ]
			랜덤한 두수를 입력한 후
			두수의 최대 공약수를 구하는 프로그램을 작성하세요.
			
			힌트 ]
				최대 공약수 구하는 방법
				: 	작은 수부터 시작해서 1씩 감소하면서
					두수가 나누어 떨어지는지 확인한다.
	 */
	
	public static void main(String[] args) {
		
		int ran1 = new Random().nextInt(100) + 1;
		int ran2 = new Random().nextInt(100) + 1;
		
		int len = ran1 > ran2 ? ran1 / 2 : ran2 / 2;

		int common = 0;
		for (int i = 1; i < len + 1; i++) {
			if (ran1 % i == 0 && ran2 % i == 0) {
				common = i;
			}
		}
		
		System.out.printf("%d와 %d의 최대공약수는 %d입니다.", ran1, ran2, common);
	}
	
}
