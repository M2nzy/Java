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

		headlabel = new JLabel("�Ʒ� ��ư �� �ϳ��� Ŭ���Ͻÿ�");
		label = new JLabel("���������� ����");
		button1 = new JButton("����");
		button2 = new JButton("����");
		button3 = new JButton("��");

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
		 * switch (npc) { case 0: label.setText("����� : ���� " + "���� : ���� " + "���º�!");
		 * break; case 1: label.setText("����� : ���� " + "���� : ���� " + "���� ��!"); break;
		 * case 2: label.setText("����� : ���� " + "���� : �� " + "����� ��!"); break; } } });
		 * 
		 * button2.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) {
		 * 
		 * Random random = new Random(); int npc = random.nextInt(3);
		 * 
		 * switch (npc) { case 0: label.setText("����� : ���� " + "���� : ���� " + "����� ��!");
		 * break; case 1: label.setText("����� : ���� " + "���� : ���� " + "���º�!"); break; case
		 * 2: label.setText("����� : ���� " + "���� : �� " + "���� ��!"); break; }
		 * 
		 * } });
		 * 
		 * button3.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { Random random = new Random(); int npc =
		 * random.nextInt(3);
		 * 
		 * switch (npc) { case 0: label.setText("����� : �� " + "���� : ���� " + "���� ��!");
		 * break; case 1: label.setText("����� : �� " + "���� : ����  " + "����� ��!"); break;
		 * case 2: label.setText("����� : �� " + "���� : �� " + "���º�!"); break; }
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

		case "����":
			switch (npc) {
			case 0:
				label.setText("����� : ���� " + "���� : ���� " + "���º�!");
				break;
			case 1:
				label.setText("����� : ���� " + "���� : ���� " + "���� ��!");
				break;
			case 2:
				label.setText("����� : ���� " + "���� : �� " + "����� ��!");
				break;
			}
			break;

		case "����":
			switch (npc) {
			case 0:
				label.setText("����� : ���� " + "���� : ���� " + "����� ��!");
				break;
			case 1:
				label.setText("����� : ���� " + "���� : ���� " + "���º�!");
				break;
			case 2:
				label.setText("����� : ���� " + "���� : �� " + "���� ��!");
				break;
			}
			break;

		case "��":
			switch (npc) {
			case 0:
				label.setText("����� : �� " + "���� : ���� " + "���� ��!");
				break;
			case 1:
				label.setText("����� : �� " + "���� : ����  " + "����� ��!");
				break;
			case 2:
				label.setText("����� : �� " + "���� : �� " + "���º�!");
				break;
			}
			break;

		}

	}

}