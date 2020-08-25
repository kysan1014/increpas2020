package day20;

import java.text.DecimalFormat;

public class Test03 {

	public Test03() {

		double num = 3567.2144687;
		
		String format1 = "0,000,000.000";
		String format2 = "#,###,###.###";
		DecimalFormat form;
		
		
		form= new DecimalFormat(format1);
		String formatted1 = form.format(num);
		System.out.println(formatted1);
		
		System.out.println("졸려!");
		
		form= new DecimalFormat(format2);
		String formatted2 = form.format(num);
		System.out.println(formatted2);
		
		System.out.println("졸려!");
	}
	
	public static void main(String[] args) {
		new Test03();
	}
}
