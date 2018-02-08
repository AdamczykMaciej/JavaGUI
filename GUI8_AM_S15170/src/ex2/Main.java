/**
 *
 *  @author Adamczyk Maciej S15170
 *
 */

package ex2;


import java.io.FilenameFilter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Main extends JFrame {
	

	public static void main(String[] args) throws IOException, NumberFormatException, InterruptedException {
			File directory= new File(args[0]);
		

		final String[] EXTENSIONS = new String[] { "gif", "png", "jpg" };
		final FilenameFilter IMAGE_FILTER = new FilenameFilter() {

			@Override
			public boolean accept(final File dir, final String name) {
				for (final String ext : EXTENSIONS) {
					if (name.endsWith("." + ext)) {
						return (true);
					}
				}
				return (false);
			}
		};
		Main main = new Main();
		main.setTitle("Images");
		for (final File f : directory.listFiles(IMAGE_FILTER)) {
			
				MyImagePanel myPanel = new MyImagePanel(args[0], args[1], args[2], f);
				
				myPanel.setPreferredSize(new Dimension(myPanel.getImage().getWidth(), myPanel.getImage().getHeight()));
				main.getContentPane().add(myPanel);
				
				main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				main.pack();
				main.setVisible(true);
				Thread.sleep(Integer.parseInt(args[1])*1000);
				main.remove(myPanel);
		}
		main.setPreferredSize(new Dimension(1000, 800));
		JPanel textPanel = new JPanel(){
			@Override
			public void paintComponent(Graphics g){
				super.paintComponent(g);
				Graphics2D g2 = (Graphics2D) g;
				g2.setFont(new Font("Arial", 0, Integer.parseInt(args[2])));
				FontMetrics fm = g2.getFontMetrics();
	            int x = ((getWidth() - fm.stringWidth("End of presentation")) / 2);
	            int y = ((getHeight() - fm.getHeight()) / 2) + fm.getAscent();

				g2.drawString("End of presentation", x, y);
			}
		};
		
		main.getContentPane().add(textPanel);
		
		
		main.pack();
		main.setLocationRelativeTo(null);
		main.setVisible(true);
		
		
		
		
		
	}
}
