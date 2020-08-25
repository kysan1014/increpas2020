package day06;

public class Ex01 {

	/*
		문제 1)
		
		0 1 2 3 4
		1 2 3 4 5
		2 3 4 5 6
		3 4 5 6 7
		4 5 6 7 8
		
	 */
	
	public static void main(String[] args) {
		
		int row = 5;
		int col = 5;
		int i = 0;
		int j = 0;
		
		while(i < row) {
			
			int n = i;
			
			while (j++ < col) {
				
				System.out.printf("%d\t", n++);
				
			}
			
			i++;
			j = 0;
			System.out.println();
		}
		
	}
	
}
