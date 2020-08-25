package day10;

import javax.swing.JOptionPane;

/*
	두 수를 입력받고 계산방식을 입력받아서 
	산술연산의 결과를 보여주는 프로그램을 작성하세요.
 
	각 연산 별로 
 */

public class Test04 {

	public Test04() {

		getResultFromInputData();

	}

	public static void main(String[] args) {
		new Test04();
	}

	// 두 숫자와 연산 기호를 입력받고 계산 결과를 출력
	public void getResultFromInputData() {

		int len = 3;
		int[] data = new int[len];
		while (true) {
			data = getInputData();
			if (!(data[len - 1] == 0)) {
				break;
			} else {
				JOptionPane.showMessageDialog(null, "잘못 입력하셨습니다.\n다시 입력해주세요.");
			}
		}
		int result = calculate((char) data[len - 1], data[0], data[1]);
		printResult(data, result);

	}

	// 두 숫자와 연산 기호 입력받기
	public int[] getInputData() {
		int no1 = Integer.parseInt(JOptionPane.showInputDialog("첫 번째 숫자를 입력하세요.").trim());
		int no2 = Integer.parseInt(JOptionPane.showInputDialog("두 번째 숫자를 입력하세요.").trim());
		int operator = (int) JOptionPane.showInputDialog("계산 방식을 입력하세요.").trim().charAt(0);

		return new int[] { no1, no2, operator };
	}

	// 계산
	public int calculate(char ch, int a, int b) {
		if (ch == '+') {
			return add(a, b);
		} else if (ch == '-') {
			return subtract(a, b);
		} else if (ch == '*') {
			return multiply(a, b);
		} else if (ch == '/') {
			return divide(a, b);
		} else if (ch == '%') {
			return getRemaindor(a, b);
		} else {
			return 0;
		}
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int getRemaindor(int a, int b) {
		return a % b;
	}

	public void printResult(int[] data, int result) {
		JOptionPane.showMessageDialog(null,
				String.format("%d %c %d = %d", data[0], data[data.length - 1], data[1], result));
	}

}
