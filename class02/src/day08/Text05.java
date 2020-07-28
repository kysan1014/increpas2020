package day08;

public class Text05 {

	public static void main(String[] args) {
		
		String str1 = "abcd";
		String str2 = new String("efgh");
		
		String str3 = str1 + str2;
		
		// charAt(index)
		char ch =str3.charAt(5);
		System.out.println("str3.charAt(5) : " + ch);
		
		// length()
		int len = str3.length();
		System.out.println("str3 length : " + len);
		
		// indexOf(String)
		int idx = str3.indexOf("cde");
		System.out.println("index of \"cde\" : " + idx);
		
		idx = str3.indexOf("cb");
		System.out.println("index of \"cb\" : " + idx);
		
		
	}
	
}
