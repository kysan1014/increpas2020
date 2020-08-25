package day19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Test08 {

	public Test08() {

//		test08_1();
		
		test08();
	}

	private void test08_1() {
		String fileName = JOptionPane.showInputDialog("파일명 입력");
		
		Pattern pattern = Pattern.compile("[A-Z_$]{1}[a-zA-Z0-9_$]*[.]java");
		Matcher matcher = pattern.matcher(fileName);
		
		String msg;
		if (matcher.find()) {
			msg = matcher.group() + "은 올바른 자바소스파일입니다.";
		} else {
			msg = fileName + "은 올바른 자바소스파일이 아닙니다.";
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}

	private void test08() {
		String fileName = JOptionPane.showInputDialog("파일명 입력");
		
		Pattern pattern = Pattern.compile("(^[\\p{Alpha}|_|\\$|ㄱ-ㅎ|ㅏ-ㅣ|가-힣]{1}[\\w|\\$|ㄱ-ㅎ|ㅏ-ㅣ|가-힣]*\\.java$)");
		Matcher matcher = pattern.matcher(fileName);

		
		String msg;
		if (matcher.find()) {
			msg = matcher.group() + "은 올바른 자바소스파일입니다.";
		} else {
			msg = fileName + "은 올바른 자바소스파일이 아닙니다.";
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public static void main(String[] args) {
		new Test08();
	}
	
}
