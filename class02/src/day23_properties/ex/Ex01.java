package day23_properties.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Ex01 {

	public Ex01() {
		
		long start = System.currentTimeMillis();
		
		Properties prop = new Properties();
		
		String path = "src/day23_properties/iu.iu";
		
		try {
			FileInputStream fin = new FileInputStream(path);
			prop.load(fin);
			Set<Entry<Object, Object>> set = prop.entrySet();
			
			for (Entry<Object, Object> e : set) {
				System.out.println(e.getKey() + " : " + e.getValue());
			}
			
//			Iterator<Entry<Object, Object>> iter = set.iterator();
//			while (iter.hasNext()) {
//				Entry<Object, Object> e = iter.next();
//				System.out.println(e.getKey() + " : " + e.getValue());
//			}
			
//			prop.forEach((key, val) -> System.out.println(key + " : " + val));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		
		int kb = 1024;
		int mb = kb * 1024;
		Runtime runtime = Runtime.getRuntime();
		System.out.println("사용 메모리 (b) : " + (runtime.totalMemory() - runtime.freeMemory()));
		System.out.println("사용 메모리 (kb) : " + (runtime.totalMemory() - runtime.freeMemory()) / kb);
		System.out.println("사용 메모리 (mb) : " + (runtime.totalMemory() - runtime.freeMemory()) / mb);
		System.out.println("처리 시간 (ms) : " + (end - start));
		
		
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
