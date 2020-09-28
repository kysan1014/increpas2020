package day30.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class PingServer02 {

	@SuppressWarnings("resource")
	public PingServer02() {
		ServerSocket server = null;

		try {
			server = new ServerSocket(7777);
			System.out.println("서버 접속 대기");

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Socket socket;
		while (true) {
			try {
				socket = server.accept();
				InetAddress ip = socket.getInetAddress();
				System.out.println(ip.getHostAddress() + " 접속");

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

	}

	public static void main(String[] args) {
		new PingServer02();
	}
}
