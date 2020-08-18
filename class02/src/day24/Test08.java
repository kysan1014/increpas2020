package day24;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test08 {

	public Test08() {
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;

		try {
			fout = new FileOutputStream("src/day24/buffered_text.txt");
			bout = new BufferedOutputStream(fout);
			
			String str = "Yeah! What's up, yeal!\r\nI'm fine. Thank you, and you?";
			
			byte[] buff = str.getBytes();
			
			bout.write(buff);
			
			bout.flush();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {

			try {
				bout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		new Test08();
	}
}
