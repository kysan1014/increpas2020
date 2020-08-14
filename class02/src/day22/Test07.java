package day22;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class Test07 {
	public Test07() {

		Hashtable<String, String> table = new Hashtable<String, String>();
		
		table.put("이름", "홍길동");
		table.put("전화번호1", "010-0000-0000");
		table.put("전화번호2", "010-0000-0001");
		table.put("지원자", "홍길동");
		
//		System.out.println(table.get("이름"));
		
		Collection<String> col = table.values();
		ArrayList<String> list = new ArrayList<String>(col);
		list.forEach(x -> System.out.println(x));
		
		Enumeration<String> en = table.keys();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		Set<Entry<String, String>> set = table.entrySet();
		set.forEach(x -> System.out.println(x));
	
		ArrayList<Entry<String, String>> list1 = new ArrayList<Entry<String, String>>(table.entrySet());
		list1.forEach(x -> System.out.println(x.getKey() + " : " + x.getValue()));
	}

	public static void main(String[] args) {
		new Test07();
	}
}
