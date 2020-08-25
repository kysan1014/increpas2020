package day19;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class Test06 {

	public Test06() {
		
			String url = "https://www.naver.com/";
			Document doc;
			String s;
			try {
				doc = Jsoup.connect(url).get();
				s = doc.html();
				System.out.println(s);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
	
	public static void main(String[] args) {
		new Test06();
	}
	
}
