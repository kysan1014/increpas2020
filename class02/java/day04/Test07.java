package day04;

public class Test07 {
	public static void main(String[] args) {
		
		/*
			랜덤하게 두 자리 숫자를 발생시키고
			50보다 큰지, 작은지, 50과 같은지 판별하시오
			
		 */
		
		int rnum = (int) (Math.random() * (99 - 10 + 1) + 10);
		
		String str = "";
		
		if (rnum > 50) {
			str = "보다 큰 수";
		} else if (rnum == 50) {
			str = "과 같은 수";
		} else {
			str = "보다 작은 수";
		}
		
		String msg = String.format("랜덤하게 발생한 숫자 %d는 50%s 입니다.", rnum, str);
		System.out.println(msg);
		
	}
}
