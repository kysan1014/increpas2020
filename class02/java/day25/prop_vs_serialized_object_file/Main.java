package day25.prop_vs_serialized_object_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

public class Main {

	private final String PATH_PROP = "src/day25/prop_vs_serialized_object_file/prop.properties";
	private final String PATH_LIST = "src/day25/prop_vs_serialized_object_file/list.txt";
	private FileInputStream fin;
	private FileOutputStream fout;
	private ObjectInputStream oin;
	private ObjectOutputStream oout;

//	private 
	public Main() {

		HashMap<String, ArrayList<Friend>> map = initializeMap();

		storePropFile(map);
		storeMapFile(map);

	}

	private void storeMapFile(HashMap<String, ArrayList<Friend>> map) {
		try {
			fout = new FileOutputStream(PATH_LIST);
			oout = new ObjectOutputStream(fout);
			oout.writeObject(map);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oout.close();
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	private void storePropFile(HashMap<String, ArrayList<Friend>> map) {
		Properties prop = new Properties();
		prop.put("list", map.getClass().getName());
		try {
			fout = new FileOutputStream(PATH_PROP);
			prop.store(fout, "friend list");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private HashMap<String, ArrayList<Friend>> initializeMap() {
		HashMap<String, ArrayList<Friend>> map = new HashMap<String, ArrayList<Friend>>();
		ArrayList<Friend> list = new ArrayList<Friend>();
		for (int i = 0; i < 50; i++) {
			list.add(new Friend("히히", 12, 'm'));
		}
		map.put("list", list);

		return map;
	}

	public static void main(String[] args) {
		new Main();
	}

}
