package day24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test07 {

	public Test07() {

		FileInputStream fin = null;
		FileOutputStream fout = null;

		try {
			fin = new FileInputStream("src/day24/flowers.jpg");
			fout = new FileOutputStream("src/day24/flowers_copy.jpg");

			int len = 0;
			byte[] buff = new byte[1024];
			while ((len = fin.read(buff)) != -1) {
				System.out.write(buff,0,len);
				fout.write(buff);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fout != null) {
					fout.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (fin != null) {
					fin.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		new Test07();
	}
}
