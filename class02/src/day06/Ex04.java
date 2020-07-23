package day06;

public class Ex04 {

	/*
	
		문제 4)
		
		1
		2 3
		4 5 6
		7 8 9 10
		11 12 13 14 15
	
	 */
	
	public static void main(String[] args) {
		
		int i = 0;
		int row = 5;
		
		int n = 1;
		while(i++ < row) {
			int j = 0;
			while(j < i) {
				System.out.printf("%2d\t", n++);
				j++;
			}
			System.out.println("\n");
		}
		
	}
	
}
