package day13;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Test01 {
	public Test01() {

	}

	public static void main(String[] arg) {
		String str = "10,20,25,35,50";
		// str을 ,를 기준으로 배열로 만드세요.
		int len = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ',') {
				len += 1;
			}
		}

		String[] arr = new String[len];

		StringTokenizer token = new StringTokenizer(str, ",");

		for (int i = 0; token.hasMoreTokens(); i++) {
			arr[i] = token.nextToken();
		}

		System.out.println(Arrays.toString(arr));
	}
}
