package day30.chat;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

public class ChattingServer {

	private ServerSocket server;
	private Properties prop;
	
	public ChattingServer() {
		
		try {
			server = new ServerSocket(7777);
			prop = new Properties();
			
			while (true) {
				Socket client = server.accept();
				
				InetAddress clientAddr= client.getInetAddress();
				String clientIp = clientAddr.getHostAddress();
				prop.get(clientIp);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new ChattingServer();
	}
}
