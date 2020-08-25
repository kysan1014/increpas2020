package day23_properties;

import java.util.Properties;
import java.util.Set;

public class Test03 {

	Properties prop = null;
	
	public Test03() {
		prop = System.getProperties();
		
		Set<Object> keys = prop.keySet();
		
		for (Object key : keys) {
			System.out.println(key + " : " + prop.get(key));
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
