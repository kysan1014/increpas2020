package chatting.client;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import chat.client.ChatClient01;
import chat.client.thread.ClientTrd01;
import chatting.client.thread.ClientTrd;

public class ChatClient extends JFrame {
	// 화면 관련 변수
	public JTextArea area;
	public JTextField input;
	public JScrollPane span;

	public JFrame loginFr;
	public JButton loginB, exitB, sendB;
	public JTextField inId;
	public JPasswordField inPw;

	// 통신에 관련된 변수
	public Socket socket;
	public PrintWriter prw;
	public BufferedReader br;

	/*
	 * 채팅은 단순히 문자만 주고 받는 기능으로 만들 예정이다. 따라서 한줄의 문자를 손쉽게 주고 받기 위해서는 println()
	 * readLine()
	 */
	public ChatClient() {
		setUI();
		setLoginFr();

		// 버튼 이벤트 추가
		addEvt(this);

		// 이제 화면이 준비가 되었으니 통신을 준비하자.
		try {
			// 서버에 연결을 시도하자.
//			socket = new Socket("192.168.0.21", 7788);
			socket = new Socket("192.168.0.97", 7788);

			// 통신에 사용할 스트림을 준비한다.
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			prw = new PrintWriter(out);

			InputStreamReader tmp = new InputStreamReader(in);
			br = new BufferedReader(tmp);
		} catch (Exception e) {
			// 이 라인을 실행한다는 것은 작업에 문제가 생긴경우이므로
			// 이 프로그램이 더이상 실행할 의미가 없어졌다.
			// 따라서 이 프로그램을 종료시켜준다.
			close();
		}

	}

	public void close() {
		try {
			prw.close();
			br.close();
			socket.close();
		} catch (Exception e) {
		}
		System.exit(0);
	}

	// 메인창 셋팅
	public void setUI() {
		// 이 클래스는 JFrame을 상속받은 클래스이기 때문에 JFrame의 기능을 가지고 있다.
		this.setTitle("*** cls2 Chat client01 ***");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 채팅 목록
		area = new JTextArea();
		area.setEditable(false);
		area.setFont(new Font("gulim", Font.BOLD, 16));
		span = new JScrollPane(area);
		span.setPreferredSize(new Dimension(420, 460));

		// 입력패널
		JPanel inPan = new JPanel(new BorderLayout());

		// 입력창
		input = new JTextField();
		input.setPreferredSize(new Dimension(350, 30));

		// 버튼
		sendB = new JButton("send");
		sendB.setPreferredSize(new Dimension(100, 30));

		// event 처리
		sendB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/*
				 * // 이함수는 send 버튼을 누르는 순간 작동하는 함수이다. // 할일 // 1. 입력내용 알아내고 String str =
				 * input.getText(); // 2. 입력 내용을 서버에 보내고 if(str == null) { return; }
				 * 
				 * prw.println(str); prw.flush();
				 * 
				 * // 먼저번 입력 내용을 지운다. input.setText("");
				 */
				sendEvt();
			}
		});

		inPan.add(input, BorderLayout.CENTER);
		inPan.add(sendB, BorderLayout.EAST);

		this.add(span, BorderLayout.CENTER);
		this.add(inPan, BorderLayout.SOUTH);

		this.setSize(450, 500);
		this.setResizable(false);
		this.setVisible(false);
	}

	// 로그인창 셋팅 함수
	public void setLoginFr() {
		ChatClient chat = this;
		loginFr = new JFrame("** Login **");
		loginFr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 입력창 만들기
		JLabel lid = new JLabel("I D : ");
		JLabel lpw = new JLabel("P W : ");

		// dimension
		Dimension ldim = new Dimension(35, 11);
		Dimension cdim = new Dimension(150, 32);

		// 라벨사이즈지정
		lid.setPreferredSize(ldim);
		lpw.setPreferredSize(ldim);

		// 라벨 텍스트 정렬
		lid.setHorizontalAlignment(JLabel.RIGHT);
		lpw.setHorizontalAlignment(JLabel.RIGHT);

		// 입력창 만들기
		inId = new JTextField();
		inPw = new JPasswordField();

		// 입력창 사이즈
		inId.setPreferredSize(cdim);
		inPw.setPreferredSize(cdim);

		// 감싸는 패널 만들기
		JPanel idP = new JPanel(new BorderLayout());
		JPanel pwP = new JPanel(new BorderLayout());

		// 패널에 내용추가하기
		idP.add(lid, BorderLayout.WEST);
		idP.add(inId, BorderLayout.CENTER);
		pwP.add(lpw, BorderLayout.WEST);
		pwP.add(inPw, BorderLayout.CENTER);

		// 입력내용 모두 감쌀 패널
		JPanel loginPan = new JPanel();
		loginPan.setPreferredSize(new Dimension(245, 100));
		loginPan.add(idP);
		loginPan.add(pwP);

		// 버튼 추가
		loginB = new JButton("로그인");
		exitB = new JButton("종료");

		// 버튼 패널
		JPanel bPan = new JPanel(new GridLayout(1, 2));
		bPan.setPreferredSize(new Dimension(250, 30));
		bPan.add(loginB);
		bPan.add(exitB);

		loginFr.add(loginPan, BorderLayout.CENTER);
		loginFr.add(bPan, BorderLayout.SOUTH);

		loginFr.setSize(250, 150);
		loginFr.setResizable(false);
		loginFr.setVisible(true);
	}

	public void sendEvt() {
		// 이함수는 send 버튼을 누르는 순간 작동하는 함수이다.
		// 할일
		// 1. 입력내용 알아내고
		String str = input.getText();
		// 2. 입력 내용을 서버에 보내고
		if (str == null) {
			return;
		}

		prw.println(str);
		prw.flush();

		// 먼저번 입력 내용을 지운다.
		input.setText("");
	}

	public void addEvt(ChatClient chat) {
		loginB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				
				ClientTrd t = new ClientTrd(chat); // New Born
				t.start(); // Runnable

				loginFr.setVisible(false);
				chat.setVisible(true);

			}
		});

		exitB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		input.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				char ch = e.getKeyChar();
				if ((int) ch == 10) {
					sendEvt();
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}

			@Override
			public void keyTyped(KeyEvent e) {
			}

		});
	}
}
