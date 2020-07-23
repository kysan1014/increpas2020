package day06;

public class Ex03 {

	/*
	
	문제 4)
	
	1 2 3 4 5 
	6 7 8 9 10
	11 12 13 14 15
	16 17 18 19 20
	21 22 23 24 25

 */
	public static void main(String[] args) {
		
		int row = 5;
		int col = 5;
		int i = 0;
		int j = 0;
		int n = 0;
		
		while(i++ < row) {
			
			while (j++ < col) {
				
				System.out.printf("%2d\t", ++n);
				
			}
			
			j = 0;
			System.out.println("\n");
		}
		
	}
	
}
