package day05;

public class Ex04 {

	public static void main(String[] args) {
		
		/*
			문제 4 ]
				1 - 2 + 3 - 4 + 5 - 6 + ..... 했을 경우
				어디까지 계산하면 100이 넘는 숫자가 발생하는지 출력하세요.
				
				힌트 ]
					-1은 -1을 곱할 때마다 부호가 바뀐다.
		 */
		
		int index = 0;
		int sw = -1;
		int sum = 0;
		
		for (int i = 1; ; i++) {
			sw *= sw;
			sum += i * sw;
			if (sum > 100) {
				index = i;
				break;
			}
//			System.out.println(sum);
		}
		
		System.out.printf("수열의 합은 %d번째에 100을 넘는다.\n수열의 합 : %d", index, sum);

	}

}
