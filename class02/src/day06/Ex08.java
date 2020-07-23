package day06;

public class Ex08 {

	/*
	
		문제 8)
		
			    *
			   ***
			  *****
			 *******
			*********
	
	 */
	
	
	public static void main(String[] args) {
		
		int row = 5;
		int col = row * 2;
		int i = 0;
		int j = 0;
	
		int star = row;
	
		while (i++ < row) {
	
			while (j++ < col) {
	
				if (j >= star && j <= col - star) {
					System.out.print("*\t");
				} else {
					System.out.print("\s\t");
				}
	
			}
	
			star--;
			j = 0;
			System.out.println("\n");
	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
	
			}
	
		}
		
	}
}
