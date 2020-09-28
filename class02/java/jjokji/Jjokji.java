package jjokji;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.DatagramSocket;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class Jjokji {

	public Properties idToIp, ipToId;
	public JFrame fr;
	JList list;
	JButton sendB;

	DatagramSocket sSocket, rSocket;

	public Jjokji() {
		setMap();
		setUI();
		
	}

	public void setMap() {
		idToIp = new Properties();
		ipToId = new Properties();
		FileInputStream fin1 = null;
		FileInputStream fin2 = null;
		try {
			fin1 = new FileInputStream("java/jjokji/resources/idToIp.properties");
			fin2 = new FileInputStream("java/jjokji/resources/ipToId.properties");

			idToIp.load(fin1);
			ipToId.load(fin2);

			System.out.println(idToIp.get("euisan"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fin1.close();
				fin2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void setUI() {
		fr = new JFrame("*** 쪽지 ***");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				close();
				System.exit(0);
			}

		});

		Set temp = idToIp.keySet();
		Vector<String> v = new Vector<String>(temp);
		list = new JList<String>(v);
		
		JScrollPane span = new JScrollPane(list); 
		sendB = new JButton("보내기");
		sendB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String sid = (String) list.getSelectedValue();
				if (sid == null) {
					JOptionPane.showMessageDialog(null, "먼저아이디를 선택하세요.");
					return;
				}
				SendFrame sFr = new SendFrame(Jjokji.this);
				sFr.field.setText(sid);
				sFr.wframe.setVisible(true);
				fr.setVisible(false);
			}
		});
		
		fr.add("Center", span);
		fr.add("South", sendB);
		fr.setSize(200, 200);
		fr.setResizable(false);
		fr.setVisible(true);
	}
	
	public void close() {
		
	}

	public static void main(String[] args) {
		new Jjokji();
	}

}
