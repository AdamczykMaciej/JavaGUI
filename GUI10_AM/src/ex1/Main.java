/**
 *
 *  @author Adamczyk Maciej S15170
 *
 */

package ex1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {

		JFrame jFrame = new JFrame();
		JPanel jPanel = new JPanel();
		JButton jButton = new JButton("Next");
		Color[] colors = { Color.BLUE, Color.CYAN, Color.YELLOW, Color.PINK };
		jButton.addActionListener(new ActionListener() {
			int i = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				jButton.setBackground(colors[i]);
				i += 1;
				if (i == colors.length)
					i = 0;

			}

		});
		jPanel.add(jButton);
		jFrame.add(jPanel);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.pack();
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);
	}
}
