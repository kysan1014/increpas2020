package day20;

import java.text.ChoiceFormat;

public class Test05 {

	public Test05() {
		
		int[] scores = {40, 57, 78, 84, 60, 80, 100, 66};
		
		String[] formats = {"F", "D", "C", "B", "A"};
		double[] limits = {0, 60, 70, 80, 90};
		
		ChoiceFormat form = new ChoiceFormat(limits, formats);
		
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d :  %s%n",scores[i],form.format(scores[i]));
		}
	}
	
	
	public static void main(String[] args) {
		new Test05();
	}
}
