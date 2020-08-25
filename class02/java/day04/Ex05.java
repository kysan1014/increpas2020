package day04;

/*
	조건문 문제
	
	문제 2]
		201 ~ 500까지의 세자리 숫자를 랜덤하게 발생시켜서
		그 수가 300보다 크면 "300보다 큰수"
		작으면 "300보다 작은수"
		가 출력되게 하세요.
*/

public class Ex05 {
	
	public static void main(String[] args) {
		
		int randint1 = (int) (Math.random() * (500 - 201 + 1) + 201);
		
		String s = "";
		
		if (randint1 >= 300) {
			s = "양수";
		} else {
			s = "음수";
		}
		
		System.out.printf("생성된 수 : %d\n결     과 : %s", randint1, s);
	}
	
}
