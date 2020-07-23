package day06;

public class Ex02_01 {

	/*
	
		문제 6)
		
		*
		* *
		* * *
		* * * *
		* * * * *
		
	
	 */
	
	public static void main(String[] args) {
		
		int row = 5;
		int col = 5;
		int i = 0;
		int j = 0;
		
		while(i++ < row) {
			
			while(j++ < i) {
				
				System.out.print("*\t");
				
			}
			
			j = 0;
			System.out.println("\n");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
			
		}
		
	}
}
