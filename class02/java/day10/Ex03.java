package day10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

/*
	문제 3 )
	
		5명의 학생의 java, oracle, html, jsp 점수를 입력받고
		총점과 석차를 구하는 프로그램
 */

public class Ex03 {

	public static void main(String[] args) {
		new TestEx03();
	}
}

class TestEx03 {

	private int[][] scores;
	private int students = 0;

	public TestEx03() {

		students = 5;
		scores = new int[students][];

		for (int i = 0; i < students; i++) {
			scores[i] = getScores();
		}

		for (int i = 0; i < students; i++) {
			getSum(i);
		}

		getRanks();

		printResults();

	}

	private void printResults() {
		
		String msg = "";
		
		String[] scoreLabels = {"  ", "Java", "Oracle", "HTML", "JSP", "Sum", "Rank"};
		
		for (int i = 0; i < scoreLabels.length; i++) {
			msg += String.format("%s    ",scoreLabels[i]);
		}
		msg += "\n";
		
		String[] people = {"A:", "B:", "C:", "D:", "E:"};
		
		for (int i = 0; i < scores.length; i++) {
			msg += String.format("%s   ",people[i]);
			
			for (int j = 0; j < scores[i].length; j++) {
				msg += String.format("%d    ",scores[i][j]);
			}
			
			msg += "\n";
		}
		
		JOptionPane.showMessageDialog(null, msg);

	}

	private void getRanks() {

		Arrays.sort(scores, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o2[o2.length - 2] - o1[o1.length - 2];
			}

		});

		int rank = 0;
		for (int i = 0; i < scores.length; i++) {
			rank++;
			if (i == 0) {
				scores[i][scores[i].length - 1] = rank;
				continue;
			}

			if (scores[i][scores[i].length - 2] == scores[i - 1][scores[i].length - 2]) {
				scores[i][scores[i].length - 1] = scores[i - 1][scores[i].length - 1];
			} else {
				scores[i][scores[i].length - 1] = rank;
			}
		}

	}

	private void getSum(int idx) {

		for (int i = 0; i < scores[idx].length - 3; i++) {
			scores[idx][scores[idx].length - 2] += scores[idx][i];
		}

	}

	private int[] getScores() {
		StringTokenizer tempScores = new StringTokenizer(
				JOptionPane.showInputDialog("Java, Oracle, HTML, JSP 점수를 입력하세요.\n형식 : \"00, 00, 00, 00\""), ",");
		int[] scores = new int[tempScores.countTokens() + 2];

		for (int i = 0; tempScores.hasMoreTokens(); i++) {
			if (i == 4)
				break;
			if (tempScores.hasMoreTokens())
				scores[i] = Integer.parseInt(tempScores.nextToken().trim());
		}

		return scores;
	}

	private void compare() {

	}

}