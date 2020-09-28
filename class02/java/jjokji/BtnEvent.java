package jjokji;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BtnEvent implements ActionListener {

	public SendFrame sFr;

	public BtnEvent(SendFrame sFr) {
		this.sFr = sFr;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();

		if (btn == sFr.sendB) {
			sendProc();
		} else if (btn == sFr.resetB) {
			resetProc();
		} else if (btn == sFr.exitB) {
			exitProc();
		}
	}

	private void exitProc() {
		sFr.wframe.setVisible(false);
		sFr.main.fr.setVisible(true);
	}

	private void resetProc() {
		
	}

	private void sendProc() {
		
	}

}
