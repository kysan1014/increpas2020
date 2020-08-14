package day20;

import java.text.MessageFormat;

public class Test07 {
	public Test07() {
		String urlPattern = "http://{0}.{1}/";

		MessageFormat form = new MessageFormat(urlPattern);

		String[] data = { "naver", "com" };
		String[][] data1 = { { "google", "com" }, { "daum", "net" }, { "trello", "com" } };


		System.out.println(form.format(data));
//		System.out.println(form.format(data1));
		
		for (int i = 0; i < data1.length; i++) {
			System.out.println(form.format(data1[i]));
		}
	}

	public static void main(String[] args) {
		new Test07();
	}
}
