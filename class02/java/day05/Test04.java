package day05;

// 구구단 출력하기

public class Test04 {

	public static void main(String[] args) {
		
		// 세로로 쭉
		// 바깥 반복문은 단을 증가시켜주는 반복문으로 한다.
		for (int dan = 2; dan <= 9; dan++) {
			
			System.out.printf("*** %d 단 ***", dan);
			
			// 안쪽 반복문은 곱을 증가시켜주는 반복문으로 한다.
			for (int gop = 1; gop < 10; gop++) {
				System.out.printf("%2d * %2d = %2d%n", dan, gop, dan * gop);
			}
			
		}
		
	}
	
}
