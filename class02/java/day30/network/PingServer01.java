package day30.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class PingServer01 {

	public PingServer01() {
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(7777);
			System.out.println("서버 접속 대기");
			
			Socket socket = server.accept();
			System.out.println("서버 접속 완료");
		
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			byte[] buff = new byte[1024];
			int len = in.read(buff);
			String str = new String(buff, 0, len);
			System.out.println("받은 내용 : " + str);
			
			str = "잘 받았다, 마!";
			buff = str.getBytes();
			
			out.write(buff);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new PingServer01();
	}
}
