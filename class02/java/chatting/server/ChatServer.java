package chatting.server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import chatting.server.thread.ServerTrd;

public class ChatServer {
	ServerSocket server;
	/*
		내가 준 데이터는 다른 클라이언트에게도 전달해야 한다.
		따라서 서버 입장에서는
		자신에게 접속한 클라이언트의 정보를 알고 있어야 한다.
		
		따라서 서버에 접속한 클라이언트의 정보를 기억할 변수를 준비한다.
	 */
	public ArrayList<ServerTrd> clientList;

	public ChatServer() {
		// 접속 대기 소켓을 준비한다.
		try {
			server = new ServerSocket(7788);
			clientList = new ArrayList<ServerTrd>();

		} catch(Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		System.out.println("### 서버 준비 완료 ###");
		
		/*
			이제 접속을 계속 받으면 된다.
			==> 반복 처리한다.
		 */
		while(true) {
			try {
				Socket socket = server.accept();
				
				
				/*
					어제는 지금 만들어진 접속을 가지고 여기서 처리를 했다.
					지금은 각각의 클라이언트와 대화하는 프로그램을 독립적으로 만들 예정이다.
				 */
				ServerTrd t = new ServerTrd(this, socket);

				clientList.add(t);
				System.out.println("********** 2 : " + clientList.size());
				/*
					t 안에는 그 클라이언트에 대한 모든 정보를 변수로 준비하고 있고
					t를 통째로 넣어주면 필요할 때 저어보를 꺼내서 사용할 수 있게된다.
				 */
				t.start();
			} catch(Exception e) {
				System.out.println("********** 3 : " + clientList.size());
				System.out.println("클라이언트 접속 종료");
//				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new ChatServer();
	}

}
