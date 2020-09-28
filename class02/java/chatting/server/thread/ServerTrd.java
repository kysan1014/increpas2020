package chatting.server.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

import chatting.server.ChatServer;
import chatting.server.dao.MemberDao;

public class ServerTrd extends Thread {

	ChatServer main;

	// 통신 변수
	Socket socket;
	public PrintWriter prw;
	public BufferedReader br;
	String id;

	public ServerTrd(ChatServer main, Socket socket) throws Exception {
		this.main = main;
		this.socket = socket;

		/*
		 * 아래부분은 원칙적으로 예외처리를 해줘야 하는 부분이다. 그런데 이 클래스의 목적은 해당 클라이언트와 통신할 목적이다. 그런데 만약 스트림을
		 * 만들지 못한다면 대화를 못할 것이다. 따라서 이 프로그램의 존재의 이유가 없어진다.
		 */
		InputStream in = socket.getInputStream();
		OutputStream out = socket.getOutputStream();
		prw = new PrintWriter(out);

		InputStreamReader tmp = new InputStreamReader(in);
		br = new BufferedReader(tmp);

		// 아이피 얻어내고
		InetAddress inet = socket.getInetAddress();

	}

	public void sendMsg(String msg) {
		/*
		 * msg 안에는 클라이언트가 준 대화내용이 기억되어 있다. 우리는 응답을
		 * 
		 * jiwoo ] xxxxxxxx
		 * 
		 * 따라서 응답내용을 꾸며준다.
		 */
		msg = id + " ] - " + msg;

		System.out.println("*** server msg : " + msg);

		// 이제 메세지는 준비되었고 준비된 메세지를 모든 접속한 클라이언트에게 뿌려주면 된다.
		int size = 0; // 전송될 클라이언트의 명수를 기억할 변수

		/*
		 * 참고 ] 응답은 동시에 처리하지 못하고 한사람씩 반복해서 처리해줘야 한다. 그런데 클라이언트의 정보는 clientList 에 기억해서
		 * 처리할 예정이다. 그렇다면 응답은 clientList에 등록된 사람에 한해서 처리해줘야 한다. 그런데 응답을 하는 도중 새로운 접속자가
		 * 발생하면 프로그램이 오류가 발생할 수 있다. 따라서 응답을 도중에는 리스트를 수정하지 못하도록 처리한다.
		 */
		synchronized (main.clientList) {
			size = main.clientList.size();

			for (int i = 0; i < size; i++) {
				// 클라이언트 정보를 꺼낸다.
				ServerTrd tmp = main.clientList.get(i);

				tmp.prw.println(msg);
				tmp.prw.flush();
			}
		}

	}

	public void loginProc(String msg) throws Exception {
		MemberDao mDao = new MemberDao();
		id = msg.substring(0, msg.indexOf('|'));
		String pw = msg.substring(msg.indexOf('|') + 1);
		int cnt = mDao.getLogin(id, pw);
		if (cnt == 1) {
			msg = "110Y";
			synchronized(main.clientList) {
				main.clientList.add(this);
				
				System.out.println(msg);
				
			}
		} else {
			msg = "110N";
//			main.clientList.remove(this);

		}
		prw.println(msg);
		prw.flush();
	}

	public void chatProc(String msg) {
		msg = 130 + id + " ] " + msg;
		synchronized (main.clientList) {
			for (ServerTrd client : main.clientList) {
				client.prw.println(msg);
				client.prw.flush();
			}
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				String msg = br.readLine();
				System.out.println(msg);
				if (msg == null) {
					break;
				}

				int code = Integer.parseInt(msg.substring(0, 3));
				msg = msg.substring(3);
				switch (code) {
				case 210:
					loginProc(msg);
					break;
				case 230:
					System.out.println("server came here!");
					chatProc(msg);
					break;
				default:
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			main.clientList.remove(this);
			try {
				prw.close();
				br.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
