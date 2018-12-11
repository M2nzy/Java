package nov28;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class RockPaperScissors {

	JFrame frame;
	JLabel headlabel, label;
	JButton button1, button2, button3;
	JPanel panel;
	Container contentPane;

	public static void main(String[] args) {
		RockPaperScissors Example = new RockPaperScissors();
		Example.GUI();
	}

	public void GUI() {
		frame = new JFrame("Example");

		frame.setLocation(500, 300);
		frame.setPreferredSize(new Dimension(300, 200));

		contentPane = frame.getContentPane();

		panel = new JPanel();
		panel.setLayout(new GridLayout(1, 3));

		headlabel = new JLabel("아래 버튼 중 하나를 클릭하시오");
		label = new JLabel("가위바위보 게임");
		button1 = new JButton("가위");
		button2 = new JButton("바위");
		button3 = new JButton("보");

		EventHandler handler = new EventHandler(label);
		button1.addActionListener(handler);
		button2.addActionListener(handler);
		button3.addActionListener(handler);

		/*
		 * button1.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) {
		 * 
		 * Random random = new Random(); int npc = random.nextInt(3);
		 * 
		 * switch (npc) { case 0: label.setText("사용자 : 가위 " + "상대방 : 가위 " + "무승부!");
		 * break; case 1: label.setText("사용자 : 가위 " + "상대방 : 바위 " + "상대방 승!"); break;
		 * case 2: label.setText("사용자 : 가위 " + "상대방 : 보 " + "사용자 승!"); break; } } });
		 * 
		 * button2.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) {
		 * 
		 * Random random = new Random(); int npc = random.nextInt(3);
		 * 
		 * switch (npc) { case 0: label.setText("사용자 : 바위 " + "상대방 : 가위 " + "사용자 승!");
		 * break; case 1: label.setText("사용자 : 바위 " + "상대방 : 바위 " + "무승부!"); break; case
		 * 2: label.setText("사용자 : 바위 " + "상대방 : 보 " + "상대방 승!"); break; }
		 * 
		 * } });
		 * 
		 * button3.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { Random random = new Random(); int npc =
		 * random.nextInt(3);
		 * 
		 * switch (npc) { case 0: label.setText("사용자 : 보 " + "상대방 : 가위 " + "상대방 승!");
		 * break; case 1: label.setText("사용자 : 보 " + "상대방 : 바위  " + "사용자 승!"); break;
		 * case 2: label.setText("사용자 : 보 " + "상대방 : 보 " + "무승부!"); break; }
		 * 
		 * } });
		 */

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);

		contentPane.add(headlabel, BorderLayout.NORTH);
		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.add(label, BorderLayout.SOUTH);

		frame.pack();
		frame.setVisible(true);

	}

}

class EventHandler implements ActionListener {

	JLabel label;

	EventHandler(JLabel label) {
		this.label = label;
	}

	public void actionPerformed(ActionEvent e) {

		Random random = new Random();
		int npc = random.nextInt(3);

		switch (e.getActionCommand()) {

		case "가위":
			switch (npc) {
			case 0:
				label.setText("사용자 : 가위 " + "상대방 : 가위 " + "무승부!");
				break;
			case 1:
				label.setText("사용자 : 가위 " + "상대방 : 바위 " + "상대방 승!");
				break;
			case 2:
				label.setText("사용자 : 가위 " + "상대방 : 보 " + "사용자 승!");
				break;
			}
			break;

		case "바위":
			switch (npc) {
			case 0:
				label.setText("사용자 : 바위 " + "상대방 : 가위 " + "사용자 승!");
				break;
			case 1:
				label.setText("사용자 : 바위 " + "상대방 : 바위 " + "무승부!");
				break;
			case 2:
				label.setText("사용자 : 바위 " + "상대방 : 보 " + "상대방 승!");
				break;
			}
			break;

		case "보":
			switch (npc) {
			case 0:
				label.setText("사용자 : 보 " + "상대방 : 가위 " + "상대방 승!");
				break;
			case 1:
				label.setText("사용자 : 보 " + "상대방 : 바위  " + "사용자 승!");
				break;
			case 2:
				label.setText("사용자 : 보 " + "상대방 : 보 " + "무승부!");
				break;
			}
			break;

		}

	}

}