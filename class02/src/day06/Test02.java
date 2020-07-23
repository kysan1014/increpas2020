package day06;

public class Test02 {

	/*

		구구단 출력 (while문 사용)
		
	 */
	
	public static void main(String[] args) {
		
		int dan = 1;
		int gop = 0;
		
		while (dan++ < 10) {
			
			while (gop++ < 10) {
				
				System.out.printf("%2d * %2d = %2d\t", dan, gop, dan * gop);
				
			}
			
			gop = 1;
			System.out.println("\n");
			
		}
		
	}
	
}
