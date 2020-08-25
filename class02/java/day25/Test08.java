package day25;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Test08 {

	public Test08() {
		
		FileInputStream fin = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
		
			fin = new FileInputStream("src/day25/test_text.txt");
			ir = new InputStreamReader(fin);
			br = new BufferedReader(ir);
			pw = new PrintWriter("src/day25/test_text_copy.txt");
			
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				pw.write(line + "\n");
			}
			
			pw.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
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
		new Test08();
	}
}
