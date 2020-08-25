package day06;

/*

	1	10	11	20	21
	2	9	12	19	22
	3	8	13	18	23
	4	7	14	17	24
	5	6	15	16	25

*/

public class Ex11 {

	public static void main(String[] args) {
		
		int row = 5;

		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < row; j++) {
				if (j % 2 == 0) {
					System.out.printf("%d\t", i + j * row);
				} else {
					System.out.printf("%d\t", (j + 1) * row - i + 1);
				}
			}
			System.out.println("\n");
		}
		
	}
	
}
