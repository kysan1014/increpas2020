package day06;

public class Ex05 {
	/*
		문제 5

 	 			*
 	 		   **
    		  ***
   			 ****
   			*****

	 */

	public static void main(String[] args) {
	
		int row = 5;
		int i = 0;
		int j = 0;
	
		int star = row;
	
		while (i++ < row) {
	
			while (j++ < row) {
	
				if (j >= star) {
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