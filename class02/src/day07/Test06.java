package day07;

import java.util.Arrays;

public class Test06 {

	/*
	 * 
	 * 1~45까지의 숫자 여섯개를 저장할 배열을 만들고 정렬하세요. 중복되는 숫자는 없는 것으로 함
	 * 
	 */

	public static void main(String[] args) {

		/*
			로또는 한 번에 5 게임을 할 수 있음
		 */

		int games = 5; // 로또 티켓 하나당 수행할 수 있는 게임의 수
		int randInts = 6; // 로또 한 번당 필요한 램덤수의 수
		
		int[][] lotteryTicket = new int[games][];

		for (int i = 0; i < lotteryTicket.length; i++) {
			lotteryTicket[i] = generateLotteryNumbers(randInts);
		}

		// 출력
		for (int[] lotterNums : lotteryTicket) {
			System.out.println(Arrays.toString(lotterNums));
		}

	}

	public static int[] generateLotteryNumbers(int len) {

		int[] lotto = new int[len];

		// 랜덤 수 배열 생성
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}

//			System.out.println(Arrays.toString(lotto));
//			System.out.println();

		// 오름차순 정렬 - 버블 정렬
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length - i - 1; j++) {
				int temp = lotto[j];
				if (lotto[j] > lotto[j + 1]) {
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = temp;
				}
//					System.out.print(i + " - " + j + " : ");
//					System.out.println(Arrays.toString(lotto));
			}
		}

//			System.out.println(Arrays.toString(lotto));

		return lotto;
	}

}
