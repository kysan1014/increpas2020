package day06;

public class Test03 {
	/*

	구구단 출력 (do ~ while문 사용)
	
	 */
	
	public static void main(String[] args) {
		
		int dan = 2;
		int gop = 1;
		
		do {
			
			do {
				
				System.out.printf("%2d * %2d = %2d\t", dan, gop, dan * gop);
				
			} while (++gop < 10);
			
			gop = 1;
			System.out.println("\n");
			
		} while (++dan < 10);
		
	}
}
