/**
 *
 *  @author Adamczyk Maciej S15170
 *
 */

package ex3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

  public static void main(String[] args) {
	  JFrame jFrame = new JFrame();
	  JPanel jPanel = new JPanel(new BorderLayout());
	  JLabel jLabel1 = new JLabel("Mummy");
	  jLabel1.setOpaque(true);
	  jLabel1.setBackground(Color.GREEN);
	  jLabel1.setFont(new Font("Cochin", 10, 20));
	  jLabel1.setForeground(Color.WHITE);
	  jLabel1.setToolTipText("It is mummy ");
	  jLabel1.setBorder(BorderFactory.createTitledBorder("BUM"));
	  JLabel jLabel2 = new JLabel("Daddy");
	  jLabel2.setOpaque(true);
	  jLabel2.setBackground(Color.RED);
	  jLabel2.setFont(new Font("Serif", 20, 30));
	  jLabel2.setForeground(Color.MAGENTA);
	  jLabel2.setToolTipText("It is daddy ");
	  jLabel2.setBorder(BorderFactory.createLineBorder(Color.green));
	  JLabel jLabel3 = new JLabel("Reksio");
	  jLabel3.setOpaque(true);
	  jLabel3.setBackground(Color.YELLOW);
	  jLabel3.setFont(new Font("TimesRoman", 30, 40));
	  jLabel3.setForeground(Color.darkGray);
	  jLabel3.setToolTipText("It is reksio ");
	  jLabel3.setBorder(BorderFactory.createMatteBorder(0, 3, 4, 3, Color.blue ));
			  
	  JLabel jLabel4 = new JLabel("Leszek");
	  jLabel4.setOpaque(true);
	  jLabel4.setBackground(Color.PINK);
	  jLabel4.setFont(new Font("Dialog", 40, 50));
	  jLabel4.setForeground(Color.BLUE);
	  jLabel4.setToolTipText("It is leszek ");
	  jLabel4.setBorder(BorderFactory.createRaisedSoftBevelBorder());
	  JLabel jLabel5 = new JLabel("Drwal");
	  jLabel5.setOpaque(true);
	  jLabel5.setBackground(Color.CYAN);
	  jLabel5.setFont(new Font("Arial Black", 50, 60));
	  jLabel5.setForeground(Color.ORANGE);
	  jLabel5.setToolTipText("It is drwal ");
	  jLabel5.setBorder(BorderFactory.createBevelBorder(77));
	  jPanel.add(jLabel1, BorderLayout.WEST);
	  jPanel.add(jLabel2, BorderLayout.EAST);
	  jPanel.add(jLabel3, BorderLayout.SOUTH);
	  jPanel.add(jLabel4, BorderLayout.NORTH);
	  jPanel.add(jLabel5, BorderLayout.CENTER);
	  jFrame.add(jPanel);
	  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  jFrame.pack();
	  jFrame.setLocationRelativeTo(null);
	  jFrame.setVisible(true);
	  
  }
}
