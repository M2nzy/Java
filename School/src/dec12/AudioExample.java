package dec12;

import java.applet.*;
import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;

public class AudioExample {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Image");
		frame.setPreferredSize(new Dimension(480, 300));

		try {
			
			File file = new File("audio.wav");
			URL url = file.toURL();
			AudioClip audioClip = Applet.newAudioClip(url);
			audioClip.play();
		
		} catch (MalformedURLException mue) {
			
			System.out.println("Fail");
			
		}
		
		frame.pack();
		frame.setVisible(true);

	}

}
