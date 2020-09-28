package chat.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import chat.server.thread.ServerTrd01;

public class ChatServer01{

	private ServerSocket server;
	private ArrayList<ServerTrd01> clientList;
//	private HashMap<String, String> map;
//	private InputStream in;
//	private InputStreamReader irs;
//	private BufferedReader br;
//	private OutputStream out;
//	private PrintWriter pw;
	
	public ChatServer01() {
		
		try {
			server = new ServerSocket(7788);
			System.out.println(InetAddress.getLocalHost().getHostAddress());
			clientList = new ArrayList<ServerTrd01>();
//			map = new HashMap<String, String>();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println("서버 준비 완료");
		while (true) {
			try {
				Socket client = server.accept();
				
				InputStream in = client.getInputStream();
				
				InputStreamReader irs = new InputStreamReader(in);
				BufferedReader br = new BufferedReader(irs);
				System.out.println(client.getInetAddress().getHostAddress());
				
				String str = br.readLine().trim();
				System.out.println(str);
				String id = str.substring(str.indexOf('=') + 1);
				System.out.println(id);
				
				OutputStream out = client.getOutputStream();
				PrintWriter pw = new PrintWriter(out);
				String ok = "OK";
				pw.println(ok);
				pw.flush();
				
				ServerTrd01 thread = new ServerTrd01(this, client, id);
				clientList.add(thread);
//				map.put(id, ip);
				thread.start();
				
				System.out.println(id + " 접속");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
//	public HashMap<String, String> getMap() {
//		return map;
//	}
	
	public ServerSocket getServer() {
		return server;
	}
	
	public ArrayList<ServerTrd01> getClientList() {
		return clientList;
	}
	
	public static void main(String[] args) {
		new ChatServer01();
	}

}
