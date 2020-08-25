package day22;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test08 {

	public Test08() {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("둘리", "010-0000-0000");
		map.put("또치", "010-0000-0001");
		map.put("고길동", "010-0000-0002");
		map.put("도우너", "010-0000-0003");
		map.put("마이콜", "010-0000-0004");
		
		map.forEach((key, val) -> System.out.println(key + " : " + val));
	
		Set<String> keys = map.keySet();
		keys.forEach(x -> { 
			if(x.equals("둘리")) System.out.println(map.get(x));
		});
		
		Set<Map.Entry<String, String>> set = map.entrySet();
		set.forEach(x -> {
			if (x.getKey().length() != 3)
				System.out.println(x.getValue());
		});
		
	}

	public static void main(String[] args) {
		new Test08();
	}
}
