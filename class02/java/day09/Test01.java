package day09;

public class Test01 {

	public static void main(String[] args) {

		// 길이가 각각 다른 1차배열을 관리하는 2차 배열을 만들어보자.

		int[][] num = new int[3][];
		num[0] = new int[3];
		num[1] = new int[5];
		num[2] = new int[7];

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\n--------------------------------------\n");

		// 데이터를 1부터 갯수까지 각각 채워준다
		for (int i = 0; i < num.length; i++) {
			// num에서 관리하는 배열에 하나씩 접근해야 하므로, num의 길이만큼 반복
			for (int j = 0; j < num[i].length; j++) {
				// 데이터를 채워준다.
				num[i][j] = j + 1;
			}
		}


		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\n--------------------------------------\n");

	}

}
