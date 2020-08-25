package day07;

public class Test05 {

	/*
	 * 
	 * 'a' ~ 'j' 믄지 1-개를 랜덤하게 발생시켜서 배열에 저장. 단 중복된 문자는 허용하지 않는 것으로 한다.
	 * 
	 */

	public static void main(String[] args) {

		int len = 10;

		char[] charArr = new char[10];
		for (int i = 0; i < len; i++) {
			char ch = (char) (Math.random() * ('j' - 'a') + 'a');
			for (int j = 0; j < i; j++) {
				if (ch == charArr[j]) {
					i--;
					break;
				} else {
					charArr[i] = ch;
				}
			}
		}

		for (int i = 0; i < len; i++) {
			System.out.printf("%c\t", charArr[i]);
		}
		System.out.println("\n");

		// 오름차순 정렬

		for (int i = 0; i < charArr.length; i++) {
			for (int j = i + 1; j < charArr.length; j++) {
				char temp = ' ';

				if (charArr[i] > charArr[j]) {
					temp = charArr[i];
					charArr[i] = charArr[j];
					charArr[j] = temp;
				}
			}
		}

		for (int i = 0; i < len; i++) {
			System.out.printf("%c\t", charArr[i]);
		}

	}

}
