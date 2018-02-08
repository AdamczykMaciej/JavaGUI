/**
 *
 *  @author Adamczyk Maciej S15170
 *
 */

package ex2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.JTextComponent;

public class Main {

	public static void addItemsToMenu(JMenu menu, JMenuItem[] item) {
		for (int i = 0; i < item.length; i++) {
			menu.add(item[i]);
		}
	}

	public static void convexBorders(JMenu menu) {
		Border border = BorderFactory.createRaisedBevelBorder();
		for (int i = 0; i < menu.getItemCount(); i++) {
			menu.getItem(i).setBorder(border);
		}
	}

	public static void main(String[] args) {

		JFrame jFrame = new JFrame();
		jFrame.setTitle("Simple editor - untitled");
		JTextArea textArea = new JTextArea(20, 30);
		JTextComponent jTextComponent = textArea;
		JMenuBar jMenuBar = new JMenuBar();
		Border border = BorderFactory.createRaisedBevelBorder();
		//Main Menus
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_1);
		JMenu editMenu = new JMenu("Edit");
		editMenu.setMnemonic(KeyEvent.VK_2);
		JMenu optionsMenu = new JMenu("Options");
		optionsMenu.setMnemonic(KeyEvent.VK_3);
		JMenu addressesMenu = new JMenu("Addresses");
		addressesMenu.setMnemonic(KeyEvent.VK_4);
		addressesMenu.setBorder(border);

		JScrollPane scrollPane = new JScrollPane(jTextComponent, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		JMenuItem separator = new JMenuItem();
		JSeparator sep = new JSeparator();
		sep.setBackground(Color.RED);
		separator.setBorder(border);
		separator.add(sep);

		FileNameExtensionFilter textFilter = new FileNameExtensionFilter("Text files", "txt", "docx");

		JMenuItem open = new JMenuItem("Open");
		open.setMnemonic(KeyEvent.VK_O);
		open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		open.setBorder(border);
		open.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser jFileChooser = new JFileChooser(System.getProperty("user.dir"));
				jFileChooser.addChoosableFileFilter(textFilter);

				if (jFileChooser.showOpenDialog(null) != JFileChooser.APPROVE_OPTION)
					return;

				File file = jFileChooser.getSelectedFile();
				String fileName = file.getAbsolutePath();
				
				try (FileReader reader = new FileReader(file)) {
					jTextComponent.read(reader, null);
				} catch (IOException ex) {
					JOptionPane.showMessageDialog(jFrame, "Failed during loading a file...", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
				jFrame.setTitle("Simple Editor - " + fileName);
			}
		});

		JMenuItem saveas = new JMenuItem("Save as");
		saveas.setMnemonic(KeyEvent.VK_A);
		saveas.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		saveas.setBorder(border);
		saveas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser jFileChooser = new JFileChooser(System.getProperty("user.dir"));

				if (jFileChooser.showSaveDialog(jFrame) != JFileChooser.APPROVE_OPTION)
					return;
				File file = new File(System.getProperty("user.dir"));
				file = jFileChooser.getSelectedFile();
				file = new File(file.toString() + ".txt");
				try (FileWriter fileWriter = new FileWriter(file)) {
					jTextComponent.write(fileWriter);
				} catch (IOException ex) {
					JOptionPane.showMessageDialog(jFrame, "File not saved", "Failure during saving the file",
							JOptionPane.ERROR_MESSAGE);
				}

				jFrame.setTitle("Simple Editor - " + file.getPath());

			}

		});
		JMenuItem save = new JMenuItem("Save");
		save.setMnemonic(KeyEvent.VK_S);
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		save.setBorder(border);
		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if (jFrame.getTitle().equals("Simple editor - untitled")) {

					saveas.getActionListeners()[0].actionPerformed(arg0);
					
				} else {
					File file = new File(jFrame.getTitle().substring(16, jFrame.getTitle().length()));
					try (FileWriter fileWriter = new FileWriter(file)) {
						jTextComponent.write(fileWriter);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(jFrame, "File not saved", "Failure during saving the file",
								JOptionPane.ERROR_MESSAGE);
					}

				}
			}
		});
		JMenuItem exit = new JMenuItem("Exit");
		exit.setMnemonic(KeyEvent.VK_X);
		exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
		exit.setBorder(border);
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}

		});

		JMenuItem home = new JMenuItem("Home");
		home.setMnemonic(KeyEvent.VK_H);
		home.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK | ActionEvent.SHIFT_MASK));
		home.setBorder(border);
		home.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.replaceSelection("Home address");

			}

		});

		JMenuItem school = new JMenuItem("School");
		school.setMnemonic(KeyEvent.VK_S);
		school.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK | ActionEvent.SHIFT_MASK));
		school.setBorder(border);
		school.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.replaceSelection("School Address");

			}

		});
		JMenuItem theCompany = new JMenuItem("The company");
		theCompany.setMnemonic(KeyEvent.VK_C);
		theCompany.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK | ActionEvent.SHIFT_MASK));
		theCompany.setBorder(border);
		theCompany.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				textArea.replaceSelection("The company address");

			}

		});
		//Sub menus
		JMenu foreground = new JMenu("Foreground");
		foreground.setBorder(border);
		JMenu background = new JMenu("Background");
		background.setBorder(border);
		JMenu fontSize = new JMenu("Font size");
		fontSize.setBorder(border);
		//Creating icons (circles)
		MyIcon yellowCircle = new MyIcon(Color.YELLOW, 14, 14);
		MyIcon orangeCircle = new MyIcon(Color.ORANGE, 14, 14);
		MyIcon redCircle = new MyIcon(Color.RED, 14, 14);
		MyIcon whiteCircle = new MyIcon(Color.WHITE, 14, 14);
		MyIcon blackCircle = new MyIcon(Color.BLACK, 14, 14);
		MyIcon greenCircle = new MyIcon(Color.GREEN, 14, 14);
		//Creating menu items consisting of circles
		JMenuItem fYellow = new JMenuItem("Yellow", yellowCircle);
		fYellow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setForeground(Color.YELLOW);
			}
		});
		JMenuItem fOrange = new JMenuItem("Orange", orangeCircle);
		fOrange.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setForeground(Color.ORANGE);
			}
		});

		JMenuItem fRed = new JMenuItem("Red", redCircle);
		fRed.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setForeground(Color.RED);
			}
		});

		JMenuItem fWhite = new JMenuItem("White", whiteCircle);
		fWhite.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setForeground(Color.WHITE);
			}
		});

		JMenuItem fBlack = new JMenuItem("Black", blackCircle);
		fBlack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setForeground(Color.BLUE);
			}
		});

		JMenuItem fGreen = new JMenuItem("Green", greenCircle);
		fGreen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setForeground(Color.GREEN);
			}
		});

		JMenuItem bYellow = new JMenuItem("Yellow", yellowCircle);
		bYellow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setBackground(Color.YELLOW);
			}
		});

		JMenuItem bOrange = new JMenuItem("Orange", orangeCircle);
		bOrange.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setBackground(Color.ORANGE);
			}

		});

		JMenuItem bRed = new JMenuItem("Red", redCircle);
		bRed.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setBackground(Color.RED);
			}
		});
		JMenuItem bWhite = new JMenuItem("White", whiteCircle);
		bWhite.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setBackground(Color.WHITE);
			}
		});
		JMenuItem bBlack = new JMenuItem("Black", blackCircle);
		bBlack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setBackground(Color.BLACK);
			}
		});
		JMenuItem bGreen = new JMenuItem("Green", greenCircle);
		bGreen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setBackground(Color.GREEN);
			}
		});

		JMenuItem[] foregroundColor = new JMenuItem[] { fYellow, fOrange, fRed, fWhite, fBlack, fGreen };
		JMenuItem[] backgroundColor = new JMenuItem[] { bYellow, bOrange, bRed, bWhite, bBlack, bGreen };
		//Adding fonts
		for (int i = 8; i <= 24; i += 2) {
			final int j = i;
			JMenuItem fontItem = new JMenuItem(i + " pts");
			fontItem.setBorder(border);
			fontSize.add(fontItem).addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					textArea.setFont(new Font(null, 0, j));

				}

			});
		}
		
		addItemsToMenu(foreground, foregroundColor);
		addItemsToMenu(background, backgroundColor);
		convexBorders(foreground);
		convexBorders(background);
		convexBorders(fontSize);

		addressesMenu.add(home);
		addressesMenu.add(school);
		addressesMenu.add(theCompany);
		fileMenu.add(open);
		fileMenu.add(save);
		fileMenu.add(saveas);
		fileMenu.add(sep);
		fileMenu.add(exit);
		editMenu.add(addressesMenu);
		optionsMenu.add(foreground);
		optionsMenu.add(background);
		optionsMenu.add(fontSize);
		jMenuBar.add(fileMenu);
		jMenuBar.add(editMenu);
		jMenuBar.add(optionsMenu);

		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setJMenuBar(jMenuBar);
		jFrame.add(scrollPane);
		jFrame.pack();
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);

	}
}
