package nov27;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Example");

		frame.setPreferredSize(new Dimension(250, 150));
		frame.setLocation(500, 400);

		Container contentPane = frame.getContentPane();

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2));

		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();
		JLabel label = new JLabel("Hello");
		JButton button = new JButton("Input");

		ActionListener listener = new ConfirmButtonActionListener(text1, text2, text3, label);
		button.addActionListener(listener);
		
		panel.add(new JLabel("Name"));
		panel.add(text1);
		panel.add(new JLabel("Major"));
		panel.add(text2);
		panel.add(new JLabel("Code"));
		panel.add(text3);

		contentPane.add(panel, BorderLayout.NORTH);
		contentPane.add(label, BorderLayout.CENTER);
		contentPane.add(button, BorderLayout.SOUTH);

		frame.pack();
		frame.setVisible(true);
	}
}

class ConfirmButtonActionListener implements ActionListener {
	JTextField text1;
	JTextField text2;
	JTextField text3;
	JLabel label;

	ConfirmButtonActionListener(JTextField text1, JTextField text2, JTextField text3, JLabel label) {
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
		this.label = label;
	}

	public void actionPerformed(ActionEvent e) {
		String name = text1.getText();
		String major = text2.getText();
		String code = text3.getText();
		label.setText(name + " - " + major + " - " + code);
	}
}