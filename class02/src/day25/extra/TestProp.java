package day25.extra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProp {

	public TestProp() {
		Properties prop = InitializeProperties();

		storeProperties(prop);

		Properties loaded = loadProperties();

		try {
			testProperties(loaded);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void testProperties(Properties prop) 
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String[] keys = { "nemo", "semo", "won" };
		for (int i = 0; i < keys.length; i++) {
			AreaSetter as = (AreaSetter) Class.forName((String) prop.get(keys[i])).newInstance();
			if (as instanceof Won) {
				System.out.println(as.setArea(3));
			} else {
				System.out.println(as.setArea(3, 2));
			}
		}

	}

	private Properties loadProperties() {
		Properties prop = new Properties();
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day25/extra/extra.properties");
			prop.load(fin);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return prop;
	}

	private void storeProperties(Properties prop) {
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day25/extra/extra.properties");
			prop.store(fout, "extra");
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

	private Properties InitializeProperties() {
		Properties prop = new Properties();
		prop.put("semo", new Semo().getClass().getName());
		prop.put("nemo", new Nemo().getClass().getName());
		prop.put("won", new Won().getClass().getName());
		return prop;
	}

	public static void main(String[] args) {
		new TestProp();
	}
}
