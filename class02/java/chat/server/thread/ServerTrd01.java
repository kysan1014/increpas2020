package chat.server.thread;

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
import java.util.HashMap;

import chat.server.ChatServer01;

public class ServerTrd01 extends Thread {

	private ChatServer01 main;
	private ServerSocket server;
	private ArrayList<ServerTrd01> clientList;
//	private HashMap<String, String> map;
	private Socket client;
	private String id;
	private String ip;

	private InputStream in;
	private InputStreamReader irs;
	private BufferedReader br;
	private OutputStream out;
	private PrintWriter pw;

	public ServerTrd01(ChatServer01 main, Socket client, String id) throws IOException {
		this.main = main;
		this.client = client;
		this.id = id;
		clientList = main.getClientList();
//		this.map = main.getMap();
		in = client.getInputStream();
		irs = new InputStreamReader(in);
		br = new BufferedReader(irs);

		out = client.getOutputStream();
		pw = new PrintWriter(out);

		InetAddress inet = client.getInetAddress();
		ip = inet.getHostAddress();
//		map.put(id, ip);
	}

	@Override
	public void run() {
		try {
			while (true) {
				String msg = br.readLine();
				if (msg == null) break;
				sendMsg(msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
			try {
				if (br != null)
					br.close();
				if (irs != null)
					irs.close();
				if (pw != null)
					pw.close();
				if (client != null)
					client.close();
				clientList.remove(this);
//					map.remove(id);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}

	public void sendMsg(String msg) {
		msg = id + "] " + msg;

		int size = 0;

		synchronized (clientList) {
			size = clientList.size();
			for (int i = 0; i < size; i++) {
				ServerTrd01 tmp = clientList.get(i);

				tmp.getPW().println(msg);
				tmp.getPW().flush();

			}

		}
	}

	public PrintWriter getPW() {
		return pw;
	}

	public void close() throws IOException {
		if (br != null)
			br.close();
		if (irs != null)
			irs.close();
		if (in != null)
			in.close();
		if (pw != null)
			pw.close();
		if (out != null)
			out.close();
	}

}
