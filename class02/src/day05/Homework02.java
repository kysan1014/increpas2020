package day05;

public class Homework02 {

	/*
		과제 2 ]
			1부터 100 사이의 소수를 모두 출력하세요.
	 */
	
	public static void main(String[] args) {
		
		for (int i = 2; i <= 100; i++) {
			
			boolean isPrime = true;
			
			for (int j = 2; j < i / 2 + 1; j++) {
				
				if (i % j == 0) {
					isPrime = false;
					break;
				}
				
			}
			
			if (isPrime) {
				System.out.printf("%d\s",i);
			}
			
			isPrime = true;
			
		}
		
		System.out.println();
	}
	
}
