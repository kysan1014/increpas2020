package day04;

/*
	조건문 문제
	문제 1]
		두 수를 랜덤하게 발생시켜서 각각 변수에 담고
		첫번째 수가 두번째 수보다 크면 "양수" (같은 경우 양수로 처리)
		첫번째 수가 두번째 수보다 작으면 "음수"
		를 출력하세요.
*/

public class Ex04 {

	public static void main(String[] args) {
		
		int randint1 = (int) (Math.random() * (100 - 1 + 1));
		int randint2 = (int) (Math.random() * (100 - 1 + 1));

		String s = "";
		
		if (randint1 >= randint2) {
			s = "양수";
		} else {
			s = "음수";
		}
		
		System.out.printf("첫 번째 수 : %d\n두 번째 수 : %d\n결\t과 : %s",randint1, randint2, s);
		
	}
	
}
