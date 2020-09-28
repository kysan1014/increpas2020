package chatting.client.event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

import chatting.client.ClientController;
import chatting.client.ui.ChattingFrame;

public class EnterEvent implements KeyListener{

	public ClientController main;
	
	public EnterEvent(ClientController main) {
		this.main = main;
	}

	@Override
	public void keyPressed(KeyEvent e) {

		int ch = e.getKeyChar();
		
		if (ch == 10) {
			main.event.sendProc();
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {}

	@Override
	public void keyTyped(KeyEvent arg0) {}

}
