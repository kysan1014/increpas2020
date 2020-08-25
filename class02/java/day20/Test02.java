package day20;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test02 {
	public Test02() {

		int cnt = 0;
		while (cnt++ < 10) {
			Calendar cal = Calendar.getInstance();
			Date d = cal.getTime();

			String time = d.toGMTString();

			Pattern pattern = Pattern.compile(
					"((?<date>\\d{1,2})\\s(?<month>\\w{3})\\s(?<year>\\d{4})\\s(?<hour>\\d{1,2}):(?<minute>\\d{1,2}):(?<second>\\d{1,2}))");
			Matcher matcher = pattern.matcher(time);
			String[] t = new String[7];
			int i = 0;
			while (matcher.find() && i++ < 8) {
				t[i - 1] = matcher.group(i);
//				System.out.println(matcher.group());
			}

			System.out.println(Arrays.deepToString(t));

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test02();
	}
}
