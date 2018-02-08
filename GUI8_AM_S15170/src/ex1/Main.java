/**
 *
 *  @author Adamczyk Maciej S15170
 *
 */

package ex1;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Main extends JPanel {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Diagonals");
		frame.setLocation(700, 50);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JPanel jPanel = new JPanel() {

			@Override
			public void paintComponent(Graphics g) {//dynamically drawing
				super.paintComponent(g);
				Dimension d = this.getSize();
				Graphics2D g1 = (Graphics2D) g;
				g1.setColor(Color.BLUE);
				g1.setStroke(new BasicStroke(3)); //adjust thickness of lines
				g1.drawLine(0, 0, d.width, d.height); //dynamically
				g1.drawLine(0, d.height, d.width, 0);
				
			}
		};

		jPanel.setPreferredSize(new Dimension(400, 400));
		// JLabel jLabel = new JLabel();
		// jPanel.add(jLabel);
		frame.getContentPane().add(jPanel);
		frame.pack(); // adjust width
		frame.setVisible(true);

	}

}
