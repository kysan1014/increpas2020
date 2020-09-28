package day23_properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test02 {

	public Test02() {

		Properties prop = new Properties();
		prop.put("name", "iu");
		prop.put("age", "28");
		prop.put("tel", "010-1111-1111");
		prop.put("addr", "seoul");
		
		FileOutputStream fout = null;
		
		String path = "src/day23_properties/iu.iu";
		try {
			fout = new FileOutputStream(path);
			prop.store(fout, "IU ♥ Me!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		Properties prop1 = new Properties();
		try {
			FileInputStream fin = new FileInputStream(path);
			prop1.load(fin);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		prop1.forEach((key, val) -> {System.out.println(key + " : " + val);});
		
	}
	
	public static void main(String[] args) {
		new Test02();
	}
}
