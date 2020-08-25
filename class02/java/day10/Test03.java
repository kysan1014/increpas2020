package day10;

import javax.swing.JOptionPane;

public class Test03 {

	/*
	 * 랜덤하게 알파벳을 만들어 출력하는데, 0을 입력받으면 대문자를, 1을 입력받으면 소문자를 만들어 출력하는 프로그램 작성
	 */

	public Test03() {

		displayChar();

	}

	public static void main(String[] args) {

		new Test03();

	}
	
	// 랜덤하게 알파벳을 만들어 출력하는데, 0을 입력받으면 대문자를, 1을 입력받으면 소문자를 만들어 출력하는 함수
	public void displayChar() {
		
		while (true) {
			
			String msg = JOptionPane.showInputDialog("대문자는 [ 0 ], 소문자는 [ 1 ], 종료는 [ q ]를 입력하세요.").trim();
			
			// q를 입력한 경우
			if (msg.equals("q")) {
				JOptionPane.showInputDialog("프로그램을 종료합니다.");
				break;
			}
			
			// 0, 1, q 이외의 값을 입력한 경우
			if (!(msg.equals("1") || msg.equals("0"))) {
				JOptionPane.showMessageDialog(null,"잘못입력하여 다시 시작합니다.");
				continue;
			}
			
			// 0, 1을 입력한 경우
			char ch = generateRandomChar();
			ch = changeCase(ch, Integer.parseInt(msg));
			JOptionPane.showMessageDialog(null, String.format("랜덤하게 생성된 문자는 [ %c ] 입니다.", ch));
		}
		
	}

	// 대소문자를 반전시키는 함수
	public char changeCase(char ch, int sw) {
		if (sw == 1) {
			new Character(ch);
			ch = Character.toLowerCase(ch);
		} else if (sw == 0)
			ch = Character.toUpperCase(ch);
		return ch;
	}

	// 랜덤한 문자를 생성하는 함수
	public char generateRandomChar() {
		char ch = 0;
		while (!(ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'Z'))
			ch = (char) (Math.random() * ('z' - 'A') + 'A');
		return ch;
	}
}
