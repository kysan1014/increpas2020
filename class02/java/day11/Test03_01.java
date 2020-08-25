package day11;

public class Test03_01 {

	public Test03_01() {
		// 원 객체 세 개를 만들어보기
		Circle01 c1 = getCircle();

		System.out.printf("원의 반지름 : %d%n"
						+ "원의 둘레 : %.2f%n"
						+ "원의 넓이 : %.2f%n%n",
						c1.radius, c1.circonference, c1.area);
		
		c1.setRadius(7);
		System.out.printf("원의 반지름 : %d%n"
					+ "원의 둘레 : %.2f%n"
					+ "원의 넓이 : %.2f%n%n",
					c1.radius, c1.circonference, c1.area);

	}

	public Circle01 getCircle() {
		// 객체 생성
		Circle01 c1 = new Circle01();
		// 반지름은 난수로 생성
		c1.setRadius((int) (Math.random() * 46 + 5));
		return c1;
	}

	public static void main(String[] args) {
		new Test03_01();
	}

}