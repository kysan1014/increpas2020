package day23_properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test01 {
	/* sample.txt를 읽어서 Map으로 저장하기 */

	public Test01() {

		Properties prop = new Properties();
		/*
			외부 파일과 연결할 예정
			이 작업은 이후 이어지는 IO에서 공부할 때 깊게 알아보도록 한다.
		 */
		
		
//		String path = "src/day23_properties/sample_encoded.txt";
		String path = "src/day23_properties/tel.txt";
		FileInputStream fin = null;
		try {
			File file = new File(path);
			fin = new FileInputStream(file);
			
			prop.load(fin);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		String name = prop.getProperty("name");
//		System.out.println(name);
		String tel = prop.getProperty("gildong");
		System.out.println(tel);
		
		Set<Object> set = prop.keySet();
		
		for (Object element : set) {
			System.out.println(element + " : " + prop.get(element));
		}
	}

	public static void main(String[] args) {
		new Test01();
	}
}
