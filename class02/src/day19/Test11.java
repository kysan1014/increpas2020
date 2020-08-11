package day19;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test11 {

	public Test11() {

		File file = new File(
				"C:\\Users\\class02\\Dropbox\\2020_increpas_coding_academy\\class\\java\\source\\simpleStore\\v_1_0\\simpleStore_v_1_0\\components\\MainFrame.java");

		useScanner(file);
		
		

	}

	private void useScanner(File file) {
		System.out.println("-----------Using Scanner-------------------------------");
		
		Scanner sc = null;

		try {

			sc = new Scanner(file);
			StringBuffer buff = new StringBuffer();
			while (sc.hasNextLine()) {
				String sourceCode = sc.nextLine();
				buff.append(sourceCode + "\n");
			}
			System.out.println(buff.toString());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test11();
	}

}
