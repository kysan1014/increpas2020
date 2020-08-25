package day22;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class myTest01 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "first");
		map.put(2,  "second");
		map.put(3, "third");
		
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		entrySet.stream().forEach(x -> System.out.println(x));
		
	}
	
	
}
