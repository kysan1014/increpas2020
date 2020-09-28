package day25;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test02 {

	public Test02() {
		try {
			Class<? extends Object> testClass = Class.forName("day25.TestThis");
			System.out.println(testClass);
			TestThis testThis = (TestThis) testClass.newInstance();
			System.out.println(testThis);
			
			try {
				Method m = testClass.getMethod("printX");
				System.out.println(m);
				m.invoke(testThis);
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test02();
	}
}
