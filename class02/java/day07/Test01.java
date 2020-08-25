package day07;

public class Test01 {

	public static void main(String[] args) {
		
		// 정수 여섯개를 동시에 관리할 배열 noArr 만들기
		// 배열 선언형식 1
		// 데이터 타입[] 변수명 = new 데이터 타입[개수];
		
		int[] noArr = new int[6];
		
		// 배열에 담긴 내용 순차적으로 추출
		
		for (int i = 0; i < noArr.length; i++) {
			System.out.println(noArr[i] + " | ");
		}
		
		// new라는 명령은 교과서적으로 Heap영역에 인스턴스를 만드는 명령이다.
		
		
	}
	
}
