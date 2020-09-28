package day25;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Test06 {
	
	private final String PATH = "src/day25/Test01.java";
	private DecimalFormat form;
	
	public Test06() {
		// 타겟 스트림 - byte 기반
		FileInputStream fin = null;
		
		// 보조 스트림 필요 - 연결 스트림
		InputStreamReader ir = null;
		
		// 필터 스트림 - char 기반
		BufferedReader br = null;
		
		try {
			
			form = new DecimalFormat("000");
			fin = new FileInputStream(PATH);
			ir = new InputStreamReader(fin);
			br = new BufferedReader(ir);
			String line = null;
			int i = 0;
			while((line = br.readLine()) != null) {
				String format = form.format(i++);
				System.out.println(format + " | " +line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				ir.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		new Test06();
	}
}

