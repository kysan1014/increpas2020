package day11;

public class Test03 {

	public Test03() {
		// 원 객체 세 개를 만들어보기
		Circle01 c1 = getCircle();
		Circle01 c2 = getCircle();
		Circle01 c3 = getCircle();
		
		// 배열에 담기
		Circle01[] arr = new Circle01[3];
		arr[0] = c1;
		arr[1] = c2;
		arr[2] = c3;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d 번째 원의 반지름 : %d%n"
							+ "\t원의 둘레 : %.2f%n"
							+ "\t원의 넓이 : %.2f%n%n", 
							i, arr[i].radius, arr[i].circonference, arr[i].area);
		}
	}
	
	public Circle01 getCircle() {
		// 객체 생성
		Circle01 c1 = new Circle01();
		// 반지름은 난수로 생성
		c1.setRadius((int) (Math.random() * 46 + 5));		
		return c1;
	}
	
	public static void main(String[] args) {
		new Test03();
	}
	
}
