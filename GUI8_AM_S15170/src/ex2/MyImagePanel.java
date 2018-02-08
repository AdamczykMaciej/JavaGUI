package ex2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyImagePanel extends JPanel {
	int displayTime=0;
	int fontSize=0;
	File directory;
	BufferedImage bImage;
	public MyImagePanel(){};
	public MyImagePanel(String directory, String displayTime, String fontSize, File imageFile ) {
		this.directory= new File(directory);
		this.displayTime = Integer.parseInt(displayTime);
		this.fontSize = Integer.parseInt(fontSize);
		try {
			this.bImage = ImageIO.read(imageFile);
		} catch (IOException e) {
			System.out.println("no image");
		}
		
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.drawImage(bImage, 0, 0,this.getWidth(), this.getHeight(), this);
		
	}
	
	public BufferedImage getImage(){
		return this.bImage;
	}
	
	

}
