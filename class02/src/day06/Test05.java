package day06;

public class Test05 {

	/*
		
		두 사람이 등산을 한다.
		한 사람은 산 아래에서 초당 0.54km의 속도로 올라가고,
		한 사람은 산 정상에서 아래로 초당 1.0km의 속도로 내려간다.
		산의 높이가 7564km라고 가정하였을 때,
		두 사람이 만나는 시점은 몇 분, 몇 초 후인지 계산하시오.
		
	 */
	
	public static void main(String[] args) {
		
		double p1 = .54;
		double p2 = 1.07;
		double height = 7564.;
		
		int seconds = 0;
		for (int i = 0; ; i++) {
			if (p1 * i + p2 * i >= height) {
				seconds = i;
				break;
			}
		}
		
		String msg = "두 사람이 만나는 시간은 %d분 %d초 후입니다.";
		System.out.printf(msg, seconds / 60, seconds % 60);
		
	}
	
}
