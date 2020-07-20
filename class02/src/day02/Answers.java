package day02;

import java.util.Scanner;

public class Answers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Questions q = new Questions(sc);
		int qNum = 4;

		for (int j = 0; j < qNum; j++) {

			switch (j) {
			case 0:
				double[] a1 = q.question1();
				if ((int) a1[0] == 3) {
					System.out.printf("�ﰢ���� ���� : %.3f%n", a1[1]);
				} else {
					System.out.printf("�簢���� ���� : %.3f%n", a1[1]);
				}
				System.out.println();
				break;

			case 1:
				double[] a2 = q.question2();
				System.out.printf("���� ���� : %.3f, ���� �ѷ� : %.3f%n", a2[0], a2[1]);
				System.out.println();
				break;

			case 2:
				Object[][] a3 = q.question3();
				for (int i = 0; i < a3.length; i++) {
					System.out.printf("%s ���� : %d%n", a3[i][0], a3[i][1]);
				}
				System.out.println();
				break;

			case 3:
				Object[][] a4 = q.question4();
				for (int i = 0; i < a4.length; i++) {
					System.out.printf("%s �� : %d%n", a4[i][0], a4[i][1]);
				}
				System.out.println();
				break;
			}

			if (j != qNum - 1) {
				System.out.print("��� �Ͻðڽ��ϱ� ? \n �� : 1, �ƴϿ� : 0\t\t");
				int flag = sc.nextInt();
				if (flag == 0) {
					break;
				}
				System.out.println("--------------------------------------------------\n");
			}

		}

		System.out.println("=======================================================\n");
		System.out.println("�����ϼ̽��ϴ�");

		sc.close();

	}

}
