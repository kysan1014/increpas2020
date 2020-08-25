package day10;

/* 

	전역변수 컨트롤 하기
	
	정수 배열 변수를 만들고
	그 변수의 내용을 수정해보자
	
 */

public class Test05 {
	
	private int[] intArr;
	
	public Test05() {
		int len = (int) (Math.random() * 15 + 1);
		this.intArr = initNum(len);
		
		storeData();
		printData();
	}

	// 배열 초기화
	public int[] initNum(int len) {
		return new int[len];
	}
	
	// 정수 배열에 난수 저장
	public void storeData() {
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = (int) (Math.random() * 100 + 1);
		}
	}
	
	// 배열의 값 출력
	public void printData() {
		System.out.println("*** 정수 배열 intArr의 내용 ***\n");
		for (int i = 0; i < intArr.length; i++) {
			System.out.printf("%d\s",intArr[i]);
		}
		System.out.println("\n\n*******************************");
	}
	
	public static void main(String[] args) {
		new Test05();
	}
}
