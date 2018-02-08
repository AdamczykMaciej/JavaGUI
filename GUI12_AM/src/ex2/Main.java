/**
 *
 *  @author Adamczyk Maciej S15170
 *
 */

package ex2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



public class Main {

  public static void main(String[] args) {
	  JFrame frame = new JFrame("JList2");
	  JTextField textField = new JTextField(20);
	  DefaultListModel model = new DefaultListModel();
	  JList list = new JList(model);
	  list.addMouseListener(new MouseListener(){

		@Override
		public void mouseClicked(MouseEvent arg0) {
			if(arg0.isAltDown()) model.remove(list.getSelectedIndex());
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		  
	  });
	  textField.addKeyListener(new KeyListener(){

		

		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_ENTER) // I don't even have to do it, because enter is by default assigned to action, but
				//it is a good practice
				model.addElement(textField.getText());
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		  
	  });
	  
	  
	  list.setPreferredSize(new Dimension(200, 200));
	  frame.setLayout(new FlowLayout());
	  frame.add(list);
	  frame.add(textField);
	  frame.setLocationRelativeTo(null);
	  frame.pack();
	  frame.setVisible(true);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
