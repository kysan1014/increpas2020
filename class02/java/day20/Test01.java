package day20;

import java.util.Date;

public class Test01 {

	public Test01() {
		
		int cnt = 0;
		while (cnt++ < 20) {
			Date d = new Date();

			String time = String.format("%d - %d - %d  :  %d : %d : %d", d.getDate(), (d.getMonth() + 1),
					(d.getYear() + 1900), d.getHours(), d.getMinutes(), d.getSeconds());
			System.out.println(time);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		new Test01();
	}
}
