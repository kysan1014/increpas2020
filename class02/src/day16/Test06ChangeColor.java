package day16;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test06ChangeColor {
	private JFrame frame;
	private JPanel panelBody, panelheader, panelBottom;
	private JButton btnChange, btnCancel;
	private JLabel lblTitle, lblText;
	private final Color DARK_BLUE = new Color(1, 87, 155);
	private final Color BLUE = new Color(3, 169, 244);
//	private final Color LIGHT_BLUE = new Color(179, 229, 252);
	private final Font D2CODING = new Font("D2Coding", Font.BOLD, 14);
	private final String TITLE = "Click Button & Change Color";

	private final Color[] colors = { new Color(225, 245, 254), new Color(179, 229, 252), new Color(129, 212, 250),
			new Color(79, 195, 247), new Color(41, 182, 246), new Color(3, 169, 244), new Color(3, 155, 229),
			new Color(2, 136, 209), new Color(2, 119, 189), new Color(1, 87, 155), };
	private int i = 0;

	public Test06ChangeColor() {
		frame = new JFrame();

		initialize();

		frame.setVisible(true);
	}

	public void initialize() {
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		initHeader();
		initBody();
		initBottom();

		setActionListeners();
	}

	public void initBottom() {
		panelBottom = new JPanel();
		panelBottom.setLayout(null);
		panelBottom.setPreferredSize(new Dimension(500, 50));
		panelBottom.setBackground(BLUE);
		panelBottom.setFont(D2CODING);
		frame.add(panelBottom, BorderLayout.SOUTH);

		btnChange = new JButton("Change");
		btnChange.setBounds(250, 0, 100, 50);
		btnChange.setPreferredSize(new Dimension(100, 40));
		btnChange.setBackground(BLUE);
		btnChange.setForeground(Color.WHITE);
		btnChange.setFont(D2CODING);
		btnChange.setBorder(null);
		btnChange.setFocusable(false);
		panelBottom.add(btnChange);

		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(375, 0, 100, 50);
		btnCancel.setPreferredSize(new Dimension(100, 40));
		btnCancel.setBackground(BLUE);
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(D2CODING);
		btnCancel.setBorder(null);
		btnCancel.setFocusable(false);
//		btnCancel.addActionListener(new BtnEvent());
		panelBottom.add(btnCancel);
	}

	public void initBody() {
		panelBody = new JPanel();
		panelBody.setBackground(colors[i]);
		panelBody.setPreferredSize(new Dimension(500, 300));
		panelBody.setLayout(new BorderLayout());
		frame.add(panelBody, BorderLayout.CENTER);

		lblText = new JLabel("<html><p>Press the Enter key,<br>Or Click the \"Change\" button!</p></html>");
		lblText.setFont(D2CODING);
		lblText.setForeground(colors[colors.length - 1 - i++]);
		lblText.setFont(D2CODING);
		lblText.setHorizontalAlignment(JLabel.CENTER);
		lblText.setVerticalAlignment(JLabel.CENTER);
		lblText.setHorizontalTextPosition(JLabel.CENTER);
		lblText.setVerticalTextPosition(JLabel.CENTER);
		panelBody.add(lblText, BorderLayout.CENTER);
	}

	public void initHeader() {
		panelheader = new JPanel();
		panelheader.setBackground(DARK_BLUE);
		panelheader.setPreferredSize(new Dimension(500, 50));
		panelheader.setLayout(null);
		frame.add(panelheader, BorderLayout.NORTH);

		lblTitle = new JLabel(TITLE);
		lblTitle.setBounds(25, 15, 250, 30);
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setFont(new Font("D2Coding", Font.BOLD, 18));
		lblTitle.setHorizontalTextPosition(JLabel.CENTER);
		lblTitle.setVerticalTextPosition(JLabel.CENTER);
		panelheader.add(lblTitle);
	}

	public void setActionListeners() {
		btnChange.addActionListener(new BtnEvent(this));
		btnChange.setActionCommand("btnChangeClicked");
		frame.addKeyListener(new BtnEvent(this));
		
		btnCancel.addActionListener(new BtnEvent(this));
		btnCancel.setActionCommand("btnCancelClicked");

		/*
		 * btnChange.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { if (i ==
		 * colors.length) i = 0; if (i > 6) lblText.setForeground(Color.WHITE); else
		 * lblText.setForeground(Color.BLACK);
		 * lblText.setForeground(colors[colors.length - 1 - i]);
		 * panelBody.setBackground(colors[i++]); } });
		 * 
		 * btnCancel.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { System.exit(0); } });
		 * 
		 * btnChange.addKeyListener(new KeyListener() {
		 * 
		 * @Override public void keyTyped(KeyEvent e) { }
		 * 
		 * @Override public void keyReleased(KeyEvent e) { }
		 * 
		 * @Override public void keyPressed(KeyEvent e) { if (e.getKeyCode() ==
		 * KeyEvent.VK_ENTER) { if (i == colors.length) i = 0; if (i > 6)
		 * lblText.setForeground(Color.WHITE); else lblText.setForeground(Color.BLACK);
		 * lblText.setForeground(colors[colors.length - 1 - i]);
		 * panelBody.setBackground(colors[i++]); } } });
		 */
	}

	public JPanel getPanelBody() {
		return panelBody;
	}

	public JButton getBtnChange() {
		return btnChange;
	}

	public JButton getBtnCancel() {
		return btnCancel;
	}

	public JLabel getLblText() {
		return lblText;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public Color[] getColors() {
		return colors;
	}

	public static void main(String[] args) {
		new Test06ChangeColor();
	}

}

class BtnEvent implements ActionListener, KeyListener {

	private Test06ChangeColor t;

	public BtnEvent(Test06ChangeColor t) {
		this.t = t;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String eventCode = e.getActionCommand();
		if (eventCode.equals("btnCancelClicked")) {
			System.exit(0);
		} else if (eventCode.equals("btnChangeClicked")) {
			changeColor();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			changeColor();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
	
	public void changeColor() {
		int i = t.getI();
		Color[] colors = t.getColors();
		if (i == colors.length) {
			i = 0;
			t.setI(0);
		}
		t.getLblText().setForeground(colors[colors.length - 1 - i]);
		t.getPanelBody().setBackground(colors[i++]);
		t.setI(i);
	}

}
