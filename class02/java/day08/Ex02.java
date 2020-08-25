package day08;

import java.util.ArrayList;
import java.util.Arrays;

/*

	문제 2)
	
		"Hong Gil Dong"이라는 문자열을 한글자씩 꺼내서 출력하세요.
		단, 꺼내는 함수는 substring().
		
		bonus 문자 배열로 만들어서 출력

 */

public class Ex02 {
	
	public static void main(String[] args) {
		
		String name = "Hong Gil Dong";
		
		String[] ans1 = {name.substring(0,4), name.substring(5,8), name.substring(9,name.length())};
		
		System.out.println(Arrays.toString(ans1));
		
		String temp = "";
		ArrayList<String> words = new ArrayList<String>();
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ' ') {
				words.add(temp);
				temp = "";
			} else {
				temp += name.charAt(i);
			}
		}
		words.add(temp);
		
		System.out.println(words);
	}


}
