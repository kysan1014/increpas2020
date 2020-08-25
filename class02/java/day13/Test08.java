package day13;

public class Test08 extends Nemo {

	/*
	 	문제 1 ]
	 		
	 		0 ~ 10 사이의 수를 랜덤하게 10개를 발생시켜서
	 		홀수가 나오면 정사각형(Square), 
	 		짝수가 나오면 사각형 (Rectangle)
	 		을 만들어서 Nemo 타입의 배열에 입력하고
	 		하나씩 꺼내서 출력하세요.
	 */
	public Test08() {
		
		Nemo[] nemos = new Nemo[10];
		
		for (int i = 0; i < nemos.length; i++) {
			int rand = (int) (Math.random() * 10 + 1);
			if (rand %2 == 0) {
				nemos[i] = new Square((int) (Math.random() * 10 + 1));
			} else {
				nemos[i] = new Rectangle((int) (Math.random() * 10 + 1),(int) (Math.random() * 10 + 1));				
			}
		}
		
		for (int i = 0; i < nemos.length; i++) {
			nemos[i].toPrint();
		}
		
		System.out.println(nemos[0] instanceof Object);
		System.out.println(nemos[0] instanceof Nemo);
		System.out.println(nemos[0] instanceof Square);
		System.out.println(nemos[0] instanceof Rectangle);
		System.out.println(nemos[1] instanceof Object);
		System.out.println(nemos[1] instanceof Nemo);
		System.out.println(nemos[1] instanceof Square);
		System.out.println(nemos[1] instanceof Rectangle);
		
	}

	public static void main(String[] args) {
		new Test08();
	}
}

class Nemo {
	public void toPrint() {
		System.out.println("이것은 네모입니다.");
	}
}

class Square extends Nemo {
	int width;
	int area;

	public Square() {
	}

	public Square(int width) {
		this.width = width;
		this.area = width * width;
	}

	@Override
	public void toPrint() {
		System.out.printf("이 사각형은 가로와 세로가 %d이고, 넓이가 %d인 정사각형이다.%n", width, area);
	}

}

class Rectangle extends Nemo {
	int width;
	int height;
	int area;

	public Rectangle() {
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		this.area = width * height;
	}

	@Override
	public void toPrint() {
		System.out.printf("이 사각형은 가로가 %d이고, 세로가 %d이고, 넓이가 %d인 직사각형이다.%n", width, height, area);
	}
}