package day30;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test01 {

	public Test01() {
		getMyIp();
		getNaverIp();
	}

	public void getMyIp() {
		InetAddress ip = null;
		try {
			ip = InetAddress.getLocalHost();
			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	public void getNaverIp() {
		InetAddress ip = null;
		try {
			ip = InetAddress.getByName("www.naver.com");
			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}
