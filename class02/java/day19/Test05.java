package day19;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test05 {

	public Test05() {
		String str = "[10,9,8,7,6]";
		String str2 = "[[1,2,3,4,5],[6,7,8,9,10],[11,12,13,14,15],[16,17,18,19,20],[21,22,23,24,25]]";
		String str3 = "[[1,2,3,4,5],[0,0,0,0,0,0],[6,7,8,9,10],[11,12,13,14,15],[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],[16,17,18,19,20],[21,22,23,24,25]]";
		// 위 문자열을 정수배열에 담아주세요,

		parseIntegersUsingRegExp(str);
		parseIntegersUsingRegExp(str2);
		parseIntegersUsingRegExp(str3);
	}
	
	private void parseIntegersUsingRegExp(String url) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		Matcher matcher = Pattern.compile("\\[([0-9,]*)\\]").matcher(url);

		for(int i = 0;matcher.find(); i++) {
			String subUrl = matcher.group();
			Matcher matcher1 = Pattern.compile("[0-9]+").matcher(subUrl);
			list.add(new ArrayList<Integer>());
			for (int j = 0; matcher1.find(); j++) {
				String num = matcher1.group();
				list.get(i).add(new Integer(num));
			}
			
		}
		
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		new Test05();
	}
	
}
