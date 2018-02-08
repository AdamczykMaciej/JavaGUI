/**
 *
 *  @author Adamczyk Maciej S15170
 *
 */

package zad1;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Main extends JFrame {
	
	public Main(){};

  public static void main(String[] args) {
	  
	  Main main = new Main();
	  JTextArea textArea = new JTextArea(10, 20);
	  
	  textArea.setEditable(true);
	  textArea.setForeground(Color.YELLOW);
	  textArea.setBackground(Color.BLUE);
	  textArea.setFont(new Font("Dialog", Font.BOLD + Font.ITALIC, 14));
	 JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	  
	  main.getContentPane().add(scrollPane);
	  main.setLocationRelativeTo(null);
	  main.pack();
	  main.setVisible(true);
	  
  }
}
