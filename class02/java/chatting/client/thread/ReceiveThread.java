package chatting.client.thread;

import java.io.IOException;

import chatting.client.ClientController;

public class ReceiveThread extends Thread {

	public final int MESSAGE_RECEIVED = 130;

	ClientController main;

	public ReceiveThread(ClientController main) {
		this.main = main;
	}

	@Override
	public void run() {

		try {
			while (true) {
				String msg = main.br.readLine();
				int code = Integer.parseInt(msg.substring(0, 3));
				String temp = msg.substring(3);
				System.out.println("msg from server = " + temp);
				if (code == MESSAGE_RECEIVED) {
					main.frame.area.append(temp + '\n');
					main.frame.span.getVerticalScrollBar()
							.setValue(main.frame.span.getVerticalScrollBar().getMaximum());
					main.frame.input.setText("");
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
			main.close();
		}

	}
}
