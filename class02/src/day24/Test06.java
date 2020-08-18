package day24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test06 {

	public Test06() {
		
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day24/FileText.txt");
			
			// 한 글자씩 읽기
			int ch = fin.read();
			System.out.println((char) ch);
			
			// 여러 글자 읽기
			byte[] buff = new byte[1024];
			int len = fin.read(buff);
			String str = new String(buff, 0, len);
			System.out.println(str);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new Test06();
	}
}
