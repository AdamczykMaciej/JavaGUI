/**
 *
 *  @author Adamczyk Maciej S15170
 *
 */

package zad2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main extends JFrame {

	public static void main(String[] args) {
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("P 2");
		JButton button3 = new JButton("The larger button number 3");
		JButton button4 = new JButton("Button 4");
		JButton button5 = new JButton("P5");

		JOptionPane jOptionPanel = new JOptionPane();
		String s = JOptionPane.showInputDialog("Which layout ? A - G");
		JPanel jPanel = new JPanel();
		Main main = new Main();
		main.setDefaultCloseOperation(Main.EXIT_ON_CLOSE);
		if (s==null) System.exit(1);
		switch (s) {
		case "A":
			BorderLayout borderLayout = new BorderLayout();
			jPanel.setLayout(borderLayout);
			jPanel.add(button1, BorderLayout.SOUTH);
			jPanel.add(button2, BorderLayout.EAST);
			jPanel.add(button3, BorderLayout.CENTER);
			jPanel.add(button4, BorderLayout.NORTH);
			jPanel.add(button5, BorderLayout.WEST);
			break;
		case "B":
			FlowLayout flowLayout1 = new FlowLayout();
			jPanel.setLayout(flowLayout1);
			jPanel.add(button1);
			jPanel.add(button2);
			jPanel.add(button3);
			jPanel.add(button4);
			jPanel.add(button5);
			break;

		case "C":
			FlowLayout flowLayout2 = new FlowLayout(FlowLayout.LEFT);
			jPanel.setLayout(flowLayout2);
			jPanel.add(button1);
			jPanel.add(button2);
			jPanel.add(button3);
			jPanel.add(button4);
			jPanel.add(button5);
			break;

		case "D":
			FlowLayout flowLayout3 = new FlowLayout(FlowLayout.RIGHT);
			jPanel.setLayout(flowLayout3);
			jPanel.add(button1);
			jPanel.add(button2);
			jPanel.add(button3);
			jPanel.add(button4);
			jPanel.add(button5);
			break;

		case "E":
			GridLayout gridLayout1 = new GridLayout();
			gridLayout1.setRows(1);
			jPanel.setLayout(gridLayout1);
			jPanel.add(button1);
			jPanel.add(button2);
			jPanel.add(button3);
			jPanel.add(button4);
			jPanel.add(button5);
			break;

		case "F":
			GridLayout gridLayout2 = new GridLayout();
			gridLayout2.setColumns(1);
			gridLayout2.setRows(5);
			jPanel.setLayout(gridLayout2);
			jPanel.add(button1);
			jPanel.add(button2);
			jPanel.add(button3);
			jPanel.add(button4);
			jPanel.add(button5);
			break;

		case "G":
			GridLayout gridLayout3 = new GridLayout();
			gridLayout3.setRows(3);
			gridLayout3.setColumns(2);
			jPanel.setLayout(gridLayout3);
			jPanel.add(button1);
			jPanel.add(button2);
			jPanel.add(button3);
			jPanel.add(button4);
			jPanel.add(button5);
			break;
		default: 
				 System.out.println("Invalid input");
		}
		
		main.getContentPane().add(jPanel);
		main.setLocationRelativeTo(null);
		main.pack();
		main.setVisible(true);
	}
}
