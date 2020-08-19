package day25;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test10 {

	public Test10() throws IOException, ClassNotFoundException {
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		Friend f = null;
		
		try {
			fin = new FileInputStream("src/day25/friend.txt");
			oin = new ObjectInputStream(fin);
			
			f = (Friend) oin.readObject();
			System.out.println(f);
		} finally {

				oin.close();
				fin.close();
		}
		
		
	}

	public static void main(String[] args) {
		try {
			new Test10();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
