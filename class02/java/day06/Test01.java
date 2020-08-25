package day06;

public class Test01 {

	public static void main(String[] args) {
		
		// 1 ~ 10 출력
		
		int cnt = 0;
		
		while (++cnt < 11) {
			System.out.println(cnt);
		}
		
		System.out.println("\n------------------\n");
		
		cnt = 1;
		
		while (true) {
			System.out.println(cnt++);
			if (cnt > 10) {
				break;
			}
		}
		
		System.out.println("\n------------------\n");
		
		cnt = 1;
		boolean bool = true;
		
		while (bool) {
			System.out.println(cnt++);
			if (cnt > 10) {
				bool = false;
			}
		}
		
		System.out.println("\n------------------\n");
		
	}
	
}
