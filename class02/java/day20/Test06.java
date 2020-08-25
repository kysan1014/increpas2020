package day20;

import java.text.ChoiceFormat;

public class Test06 {
	public Test06() {
		int[] scores = { 40, 57, 78, 84, 60, 70, 80, 100, 66 };
		String pattern = "0#F|60#D|70<C|80#B|90#A";

		ChoiceFormat form = new ChoiceFormat(pattern);

		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d :  %s%n", scores[i], form.format(scores[i]));
		}

	}

	public static void main(String[] args) {
		new Test06();
	}
}
