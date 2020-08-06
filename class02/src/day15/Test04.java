package day15;

public class Test04 {

	public Test04() {

	}

	public static void main(String[] args) {
		new Test04();
	}

}

abstract class Figure {
	public abstract void setArea();

	public abstract void toPrint();
}

class Nemo extends Figure {
	int width, height;
	double area;

	public Nemo() {
	}

	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void setArea() {
		area = width * height;
	}

	@Override
	public void toPrint() {
		String msg = String.format(
								"Nemo 클래스 : 가로 - %d | "
								+ "세로 - %d | 넓이 - %.3f", 
								width, 
								height, 
								area
								);
		System.out.println(msg);
	}

}

class Semo extends Figure {
	int width, height;
	double area;

	public Semo() {
	}

	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void setArea() {
		area = width * height / 2.0;
	}

	@Override
	public void toPrint() {
		String msg = String.format("Semo 클래스 : 가로 - %d | 세로 - %d | 넓이 - %.3f", width, height, area);
		System.out.println(msg);
	}

}

