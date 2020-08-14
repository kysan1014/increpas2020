package day21;

import java.util.Comparator;
import java.util.Vector;

public class Test02 {

	public Test02() {

		Vector<Circle> list = new Vector<Circle>();

		for (int i = 0; i < 5; i++) {
//			list.add(new Circle((int) (Math.random() * 13 + 1)));
			list.add(new CircleBuilder().setRadius((int) (Math.random() * 13 + 1)).build());
		}

		list.sort(new Comparator<Circle>() {

			@Override
			public int compare(Circle o1, Circle o2) {
				return o1.compareTo(o2);
			}
		});

		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//			System.out.println(// i 번째 Circle);
			System.out.println(list.get(i).getRadius());

		}

	}

	public static void main(String[] args) {
		new Test02();
	}

}

class Circle implements Comparable<Circle> {
	private int radius;
	private double circonference;
	private double area;

	public Circle(int radius) {
		super();
		this.radius = radius;
		setCirconference();
		setArea();
	}

	public Circle() {
		super();
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double getCirconference() {
		return circonference;
	}

	public void setCirconference() {
		this.circonference = Math.PI * 2 * radius;
	}

	public double getArea() {
		return area;
	}

	public void setArea() {
		this.area = Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", circonference=" + circonference + ", area=" + area + "]";
	}

	@Override
	public int compareTo(Circle c) {
		double area = c.getArea();
		if (this.area == area)
			return 0;
		else if (this.area >= area)
			return 1;
		else
			return -1;
	}


}

class CircleBuilder {
	private int radius;
	private double circonference;
	private double area;

	public CircleBuilder() {
	}

	public CircleBuilder setRadius(int radius) {
		this.radius = radius;
		return this;
	}

	public Circle build() {
		return new Circle(this.radius);
	}
}