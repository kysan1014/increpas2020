package day08;

public class Test01 {

	public static void main(String[] args) {
		
		String str1 = "abcd"; // 리터럴 풀의 문자열 주소를 담음
		String str2 = new String("abcd"); // Heap 영역의 인스턴스의 주소를 담음
		
		String str3 = "abcd";
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
	}
	
}
