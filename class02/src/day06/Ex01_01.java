package day06;

public class Ex01_01 {

	/* 
		문제 5)
	
		1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5
	
	 */
	
	public static void main(String[] args) {
		
		int i = 0;
		int row = 5;
		
		while(i++ < row) {
			int j = 0;
			while(j < i) {
				System.out.printf("%2d\t", ++j);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
				}
			}
			System.out.println("\n");
		}
		
	}
	
}
