package day08;

import java.util.Arrays;
import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {

		char[] chs = new char[10];

		for (int i = 0; i < chs.length; i++) {
			chs[i] = (char) (Math.random() * ('Z' - 'A' + 1) + 'A');
			for (int j = 0; j < i; j++) {
				if (chs[i] == chs[j]) {
					i--;
				}
			}
		}

		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < chs.length - i - 1; j++) {
				if (chs[j] > chs[j + 1]) {
					char temp = chs[j];
					chs[j] = chs[j + 1];
					chs[j + 1] = temp;
				}
				System.out.println(Arrays.toString(chs));
			}
		}


	}

}
