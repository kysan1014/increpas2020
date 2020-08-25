package day19;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test04 {

	public Test04() {

		String url = "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=023&aid=0003553008";

		String temp = String.copyValueOf(url.toCharArray(), 0, url.length());

		useStringStaticClassMethods(temp);
		
		useStringTokenizer(temp);

		useRegularExpression(temp);
		
		useStringSplitWithRegex(url);

	}

	private void useStringSplitWithRegex(String url) {
		String[] keyVals = url.split("[?&=]");
		int len = keyVals.length;
		
		String[] key = new String[len/2];
		String[] value = new String[len/2];

		
		for (int i = 1; i < len; i += 2) {
			key[i / 2] = keyVals[i];
			value[i / 2] = keyVals[i + 1];
		}
		
		System.out.println(Arrays.deepToString(key));
		System.out.println(Arrays.deepToString(value));
	}

	private void useRegularExpression(String url) {
		Pattern pattern = Pattern.compile("[A-Za-z_][0-9A-Za-z_]+=[0-9A-Za-z_]+");
		Matcher matcher = pattern.matcher(url);

		int len = url.split("=").length - 1;

		String[] key = new String[len];
		String[] value = new String[len];
		
		for (int i = 0; matcher.find(); i++) {
			String parsed = matcher.group();
			key[i] = parsed.substring(0, parsed.indexOf("="));
			value[i] = parsed.substring(parsed.indexOf("=") + 1);
		}

		System.out.println(Arrays.deepToString(key));
		System.out.println(Arrays.deepToString(value));
	}

	private void useStringTokenizer(String url) {
		StringTokenizer tokenizer = new StringTokenizer(url.substring(url.indexOf("?") + 1), "&");
		int cnt = tokenizer.countTokens();
		String[] key = new String[cnt];
		String[] value = new String[cnt];

		String token;
		for (int i = 0; tokenizer.hasMoreTokens(); i++) {
			token = tokenizer.nextToken();
			int index = token.indexOf("=");
			key[i] = token.substring(0, index);
			value[i] = token.substring(index + 1);
		}

		System.out.println(Arrays.deepToString(key));
		System.out.println(Arrays.deepToString(value));
	}

	private void useStringStaticClassMethods(String url) {
		String temp = url;
		int cnt = 0;
		for (; temp.indexOf("=") != -1; cnt++) {
			temp = temp.substring(temp.indexOf("=") + 1);
		}

		String[] key = new String[cnt];
		String[] value = new String[cnt];

		String param = String.copyValueOf(url.toCharArray(), 0, url.length());
		String[] result;
		boolean isRunning = true;
		int i = 0;
		while (isRunning) {

			System.out.print(i + " : ");
			System.out.println(param);

			result = parseKeyValueFromUrl(param);
			param = result[2];
			key[i] = result[0];
			value[i] = result[1];

			if (param.length() == 0) {
				isRunning = false;
			}

			i++;
		}

		System.out.println(Arrays.deepToString(key));
		System.out.println(Arrays.deepToString(value));
	}

	public String[] parseKeyValueFromUrl(String url) {
		String[] result = new String[3];
		String temp = String.copyValueOf(url.toCharArray(), 0, url.length());

		if (url.indexOf("?") != -1) {
			temp = url.substring(url.indexOf("?") + 1);
		}

		if (url.indexOf("&") != -1) {
			result[2] = temp.substring(temp.indexOf("&") + 1);
		} else {
			result[2] = "";
		}

		result[0] = temp.substring(0, temp.indexOf("="));
		if (result[2].length() != 0) {
			result[1] = temp.substring(temp.indexOf("=") + 1, temp.indexOf("&"));
		} else {
			result[1] = temp.substring(temp.indexOf("=") + 1, temp.length());
		}

		return result;
	}

	public static void main(String[] args) {
		new Test04();
	}

}
