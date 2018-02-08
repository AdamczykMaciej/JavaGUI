package ex2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import com.sun.glass.ui.Size;

public class MyIcon implements Icon {
	private int height;
	private int width;
	private Color color;
	
	public MyIcon(Color color, int width, int height){
		super();
		this.color=color;
		this.width=width;
		this.height=height;
	}
	
	public Color getColor(){
		return this.color;
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return this.height;
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return this.width;
	}

	@Override
	public void paintIcon(Component arg0, Graphics arg1, int arg2, int arg3) {
		Graphics2D g2d = (Graphics2D) arg1;
		g2d.setColor(this.color);
		g2d.fillOval(arg2, arg3,this.width, this.height);
		
		
		
	}
	
	

}
