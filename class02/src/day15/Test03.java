package day15;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test03 {

	public Test03() {
		String str = "25,50,80,75,90";
		ArrayList<String> list = getArr(str);
		toPrint(list);
	}
	
	public ArrayList<String> getArr(String str) {
		ArrayList<String> list = new ArrayList<String>();
		
		StringTokenizer tokenizer = new StringTokenizer(str, ",");
		
		for(; tokenizer.hasMoreTokens(); ) {
			list.add(tokenizer.nextToken());
		}
		
		return list;
	}
	
	public void toPrint(ArrayList<String> list) {
		
		for (String str : list) {
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		new Test03();
	}
	
}
