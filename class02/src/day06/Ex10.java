package day06;

/*

	1 	6	11	16	21
	2	7	12	17	22
	3	8	13	18	23
	4	9	14	19	24
	5	10	15	20	25

*/

public class Ex10 {

	public static void main(String[] args) {
		
		int row = 5;
		
		int cnt = 0;
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < row; j++) {
				System.out.printf("%d\t", i + j * row);
			}
			System.out.println("\n");
		}
		
	}
	
}
