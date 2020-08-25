package day16;

import javax.swing.JOptionPane;

public class ExceptionTest {
	public ExceptionTest() {

		String s = JOptionPane.showInputDialog("");
		
		int i = 0;
		
		try {
			
			i = parseInt(s);

		} catch (NotIntegerException ne) {
			ne.printStackTrace();
			i = -999;

		} catch (OverflowException oe) {
			oe.printStackTrace();
			i = -9999;

		} catch (Exception e) {
			e.printStackTrace();
			i = -99999;

		}

		System.out.println(i);
	}

	public static void main(String[] args) {
		new ExceptionTest();
	}

	public int parseInt(String snum) throws NotIntegerException, OverflowException, BlankException {

		if (snum.equals(""))
			throw new BlankException("공백을 처리하도록 요청하였습니다.");

		if (snum.length() >= 11)
			throw new OverflowException("정수의 최대값을 넘었습니다.");

		int integerParsed = 0;

		for (int i = snum.length() - 1, exp = 1; i >= 0; i--, exp *= 10) {
			char ch = snum.charAt(i);
			if (ch == '.') {
				throw new NotIntegerException("정수가 아닙니다.");
			} else if (ch >= '0' && ch <= '9') {
				integerParsed += (ch - 48) * exp;
			}
		}

		return integerParsed;
	}
}
