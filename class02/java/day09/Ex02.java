package day09;

public class Ex02 {

	public static void main(String[] args) {

		int numberOfStudents = 6;
		String[] subjects = { "국어", "영어", "수학", "코딩", "총점" };
		String[] students = new String[numberOfStudents];
		students[0] = "김영수";
		students[1] = "이영수";
		students[2] = "박영수";
		students[3] = "최영수";
		students[4] = "강영수";
		students[5] = "총  점";

		int[][] scores = new int[numberOfStudents][subjects.length];
		// 난수 생성
		for (int i = 0; i < scores.length - 1; i++) {
			for (int j = 0; j < scores[i].length - 1; j++) {
				scores[i][j] = (int) (Math.random() * 100 + 1);
			}
		}

		// 총점
		for (int i = 0; i < scores.length - 1; i++) {

			int sumIndividual = 0;
			for (int j = 0; j < scores[i].length - 1; j++) {
				sumIndividual += scores[i][j];
				scores[scores.length - 1][j] += scores[i][j];
			}
			scores[i][scores[i].length - 1] = sumIndividual;
			scores[scores.length - 1][scores[i].length - 1] += scores[i][scores[i].length - 1];

		}

		// 프린트
		System.out.print("\t");
		for (int i = 0; i < subjects.length; i++) {
			System.out.printf("%s\t", subjects[i]);
		}
		System.out.println();

		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%s\t", students[i]);
			for (int j = 0; j < scores[i].length; j++) {
				if (j == scores[i].length - 1) System.out.print("[");
				System.out.printf(j == scores[i].length - 1 ? "%d" : "%d\t", scores[i][j]);
				if (j == scores[i].length - 1) System.out.print("]");
			}
			System.out.println();
		}

	}

}
