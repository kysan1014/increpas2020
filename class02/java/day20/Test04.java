package day20;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test04 {

	public Test04() {

		SimpleDateFormat form = new SimpleDateFormat("yyy년 MM월 dd일 E요일 HH시 mm분 ss초");
		String time = form.format(Calendar.getInstance().getTime());
	
		System.out.println(time);
	}
	
	public static void main(String[] args) {
		new Test04();
	}
	
}
