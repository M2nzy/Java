package nov27;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyGUI {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Example");
		
		frame.setLocation(500, 300);
		frame.setPreferredSize(new Dimension(300, 130));
		
		Container contentPane = frame.getContentPane();
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1,1));

		JTextField text = new JTextField();
		JLabel label = new JLabel("Hello");
		JButton button = new JButton("Submit");
		
		action listener = new action(text, label);
		button.addActionListener(listener);
		
		panel.add(text);
		
		contentPane.add(panel, BorderLayout.NORTH);
		contentPane.add(label, BorderLayout.CENTER);
		contentPane.add(button, BorderLayout.SOUTH);
		
		frame.pack();
		frame.setVisible(true);

	}

}

class action implements ActionListener {
	JTextField text;
	JLabel label;

	action(JTextField text, JLabel label) {
		this.text = text;
		this.label = label;
	}

	public void actionPerformed(ActionEvent e) {
		String name = text.getText();
		label.setText("Hello, "+name);
	}
}