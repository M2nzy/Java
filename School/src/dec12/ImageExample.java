package dec12;

import java.awt.*;
import javax.swing.*;

public class ImageExample {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Image");
		Container contentPane = frame.getContentPane();
		frame.setPreferredSize(new Dimension(480, 300));
		contentPane.add(new ImagePanel());

		frame.pack();
		frame.setVisible(true);
	}

}

class ImagePanel extends JPanel {
	
	public void paint(Graphics g) {
		
		Toolkit toolkit = this.getToolkit();
		Image image = toolkit.getImage("Logo.png");
		g.drawImage(image, 0, 0, this);
		
	}
	
}
