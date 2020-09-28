package day30.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class PingClient {

	private final String SERVER_IP = "192.168.0.28";
	private final int SERVER_PORT = 7777;
	
	public PingClient() {

		Socket socket = null;
		
		try {
			socket = new Socket(SERVER_IP, SERVER_PORT);
			
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			String str = "첫 번째 네트워크 프로그램 핑(전은석)";
			byte[] buff = str.getBytes();
			
			out.write(buff);
			
			buff = new byte[1024];
			int len = in.read(buff);
			str = new String(buff, 0, len);
			System.out.println("받은 내용 : " + str);

			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new PingClient();
	}
}
