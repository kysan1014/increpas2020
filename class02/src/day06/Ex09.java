package day06;

/*
	반복문 문제
		문제 ]
		
		1	2	3	4	5
		10	9	8	7	6
		11	12	13	14	15
		20	19	18	17	16
		21	22	23	24	25
*/

public class Ex09 {

	public static void main(String[] args) {
		
		int row = 5;
		
		int cnt = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				System.out.printf("%d\t", cnt);
			}
			System.out.println("\n");
		}
		
	}
	
}
