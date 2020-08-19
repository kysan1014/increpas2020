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
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test02();
	}
}
