package day06;

public class Ex02 {

	/*
	
	문제 2)
	
		* * * * *
		* * * * *
		* * * * *
		* * * * *
		* * * * *
		
	*/
	
	public static void main(String[] args) {
		
		int row = 5;
		int col = 5;
		int i = 0;
		int j = 0;
		
		while(i++ < row) {
			
			while(j++ < col) {
				
				System.out.print("*\t");
				
			}
			
			j = 0;
			System.out.println("\n");
		}
		
	}
}
