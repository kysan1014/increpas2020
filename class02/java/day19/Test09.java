package day19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Test09 {

	public Test09() {
		test09();
	}
	
	private void test09() {
		String email = JOptionPane.showInputDialog("이메일 입력");
		
		Pattern pattern = Pattern.compile("^\\p{ASCII}+@\\w([.-_]?\\w)*.\\p{Alpha}{2,3}$");
		Matcher matcher = pattern.matcher(email);

		
		String msg;
		if (matcher.find()) {
			msg = matcher.group() + "은 올바른 이메일입니다.";
		} else {
			msg = email + "은 올바른 이메일이 아닙니다.";
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public static void main(String[] args) {
		new Test09();
	}
}
