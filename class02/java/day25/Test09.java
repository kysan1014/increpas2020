package day25;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test09 {

	public Test09() {
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		
		Friend f = getFriend();
		
		try {
			fout = new FileOutputStream("src/day25/friend.txt");
			oout = new ObjectOutputStream(fout);
			
			oout.writeObject(f);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oout.close();
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

	private Friend getFriend() {
		return new Friend("abc", 28, 177.6, 'm', "abd@gmail.com", "010-0000-0001");
	}
	
	public static void main(String[] args) {
		new Test09();
	}

}
