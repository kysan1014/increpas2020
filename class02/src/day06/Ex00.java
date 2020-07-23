package day06;

public class Ex00 {

	/*
	
		01]
		
			0 0 0 0 0
			1 1 1 1 1
			2 2 2 2 2
			3 3 3 3 3
			4 4 4 4 4
		
		02]
		
			0 1 2 3 4
			0 1 2 3 4
			0 1 2 3 4
			0 1 2 3 4
			0 1 2 3 4
	
	 */
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%d\t", i);
			}
			System.out.println("\n");
		}
		
		System.out.println("\n\n");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%d\t", j);
			}
			System.out.println("\n");
		}
		
	}
}
