package day06;

public class Ex07 {

	/*
	
		문제 7)
		
			*****
			 ****
			  ***
			   **
			    *
			    
	 */
	
	public static void main(String[] args) {
		
		int row = 5;
		int i = 0;
		int j = 0;

		int star = 0;

		while (i++ < row) {

			while (j++ < row) {

				if (j <= star) {
					System.out.print("\s\t");
				} else {
					System.out.print("*\t");
				}

			}

			star++;
			j = 0;
			System.out.println("\n");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}

		}
		
	}
}
