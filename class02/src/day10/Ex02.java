package day10;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
	문제 2 )
	
		1차 배열에 4과목의 점수를 입력한 후
		총점과 평균을 구하는 프로그램 만들기
 */
public class Ex02 {

	public static void main(String[] args) {
		
		new TestEx02();
		
	}
	
}

class TestEx02 {
	
	private int[] scores;
	
	public TestEx02() {
		
		int subjects = 4;
		this.scores = new int[subjects + 2];
		
		for (int i = 0; i < subjects; i++) {
			scores[i] = getScore();
		}
		scores[scores.length - 2] = getSum();
		scores[scores.length - 1] = getMean();
		
		printResults();
	}
	
	private void printResults() {
		
		String msg = String.format("당신의 과목 총점은 %d이고 과목 평균은 %d입니다.", scores[scores.length - 2], scores[scores.length - 1]);
		JOptionPane.showMessageDialog(null, msg);
		
	}
	private int getMean() {
		return scores[scores.length - 2] / (scores.length - 2);
	}
	private int getSum() {
		int temp = 0;
		for (int i = 0; i < scores.length - 2; i++) {
			temp += scores[i];
		}
		return temp;
	}
	private int getScore() {
		return Integer.parseInt(JOptionPane.showInputDialog("점수를 입력하세요.").trim());
	}
	
}