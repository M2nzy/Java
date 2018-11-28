package nov21;

import javax.swing.*;
import java.awt.*;

public class MyFrame {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Phone Book");

		frame.setLocation(500, 300);
		frame.setPreferredSize(new Dimension(250, 150));
		
		Container contentPane = frame.getContentPane();
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));
		
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();
		panel.add(new JLabel("Name"));
		panel.add(text1);
		panel.add(new JLabel("Address"));
		panel.add(text2);
		panel.add(new JLabel("Phone Number"));
		panel.add(text3);
		
		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.add(new JButton("Submit"), BorderLayout.SOUTH);
		
		frame.pack();
		frame.setVisible(true);
		
	}
}
