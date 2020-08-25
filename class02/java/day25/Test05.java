package day25;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test05 {

	private final String PATH = "src/day25/Test01.java";
	
	public Test05() {
		FileReader fr = null;
		BufferedReader br = null;

		String line = null;
		try {
			fr = new FileReader(PATH);
			br = new BufferedReader(fr);
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);
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
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test05();
	}
}
