package day25;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class ObjectsTest {

	public ObjectsTest() {

		FigureClass[] figures = new FigureClass[3];

		figures[0] = new Nemo();
		figures[1] = new Semo();
		figures[2] = new Won();




		
		

	}

	public static void main(String[] args) {
		new ObjectsTest();
	}
}

interface FigureInterface {
	void setSides(int x, int y);

	void setSides(int x);
}

class FigureClass implements FigureInterface {
	protected int x;
	protected int y;
	protected int area;

	public FigureClass() {
		super();
	}

	public FigureClass(FigureInterface fi) {
		super();
		setArea();
	}

	public FigureClass(int x) {
		super();
		this.x = x;
		setArea();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getArea() {
		return area;
	}

	public void setArea() {
		this.area = x * y;
	}

	@Override
	public void setSides(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void setSides(int x) {
		this.x = x;
	}

}

class Nemo extends FigureClass {

	public Nemo() {
	}

	public Nemo(FigureInterface fi) {
		super(fi);
	}
}

class Semo extends FigureClass {

	public Semo() {
	}

	public Semo(FigureInterface fi) {
		super(fi);
	}

	@Override
	public void setArea() {
		this.area = this.x * this.y / 2;
	}

}

class Won extends FigureClass {

	public Won() {
	}

	public Won(FigureInterface fi) {
		super(fi);
	}

	@Override
	public void setArea() {
		this.area = (int) (Math.PI * this.x * this.x);
	}

}

class BeanUtil {

	public static <T> Properties toProperties(T t) throws Exception {

		Class<T> c = (Class<T>) t.getClass();
		BeanInfo beanInfo = Introspector.getBeanInfo(c);
		Properties p = new Properties();

		for (PropertyDescriptor pd : beanInfo.getPropertyDescriptors()) {
			String name = pd.getName();
			Method m = pd.getReadMethod();
			if (m != null) {
			Object o = m.invoke(t);
			if (o != null)
				p.setProperty(name, o == null ? null : o.toString());
			}
		}
		return p;
	}
}