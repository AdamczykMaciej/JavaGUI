/**
 *
 *  @author Adamczyk Maciej S15170
 *
 */

package ex1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Calc extends JFrame {
	private ArrayList<JButton> comp = new ArrayList<>();
	private JPanel numbers, mainPanel, textPanel;
	private static String operations = "", consoleresult = "", equation = "";
	private static JLabel op, res;
	private double x, y;
	private static double numresult;
	private boolean flag=false;

	public Calc() {
		Font font = new Font("Arial", 20, 20);
		JButton eq = new JButton("=");
		eq.setFont(font);
		eq.setName("eq");
		eq.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (operations.length() == 0)
					;
				else if (operations.length() > 1) {
					if (operations.substring(operations.length() - 2, operations.length() - 1).equals("/")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("*")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("+")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("-")
							|| operations.substring(operations.length() - 1, operations.length()).equals(".")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("="))
						System.out.println("Repeated operator");

					else {
						Calc.displayNumber(" " + eq.getText() + " ");
						Calc.calculate();
						res.setText(String.valueOf(numresult));
					}
				} else {
					Calc.displayNumber(" " + eq.getText() + " ");
					Calc.calculate();
					res.setText(String.valueOf(numresult));
				}
			}

		});
		JButton rem = new JButton("-");
		rem.setFont(font);
		rem.setName("rem");
		rem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (operations.length() == 0)
					;
				else if (operations.length() > 1) {
					if (operations.substring(operations.length() - 2, operations.length() - 1).equals("/")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("*")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("+")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("-")
							|| operations.substring(operations.length() - 1, operations.length()).equals(".")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("="))
						System.out.println("Repeated operator");
					else
						Calc.displayNumber(" " + rem.getText() + " ");
				} else
					Calc.displayNumber(" " + rem.getText() + " ");
			}
		});
		JButton add = new JButton("+");
		add.setFont(font);
		add.setName("add");
		add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (operations.length() == 0)
					;
				else if (operations.length() > 1) {
					if (operations.substring(operations.length() - 2, operations.length() - 1).equals("/")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("*")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("+")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("-")
							|| operations.substring(operations.length() - 1, operations.length()).equals(".")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("="))
						System.out.println("Repeated operator");
					else
						Calc.displayNumber(" " + add.getText() + " ");
				} else
					Calc.displayNumber(" " + add.getText() + " ");
			}
		});
		JButton mul = new JButton("*");
		mul.setFont(font);
		mul.setName("mul");
		mul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (operations.length() == 0)
					;
				else if (operations.length() > 1) {
					if (operations.substring(operations.length() - 2, operations.length() - 1).equals("/")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("*")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("+")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("-")
							|| operations.substring(operations.length() - 1, operations.length()).equals(".")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("="))
						System.out.println("Repeated operator");
					else
						Calc.displayNumber(" " + mul.getText() + " ");
				} else
					Calc.displayNumber(" " + mul.getText() + " ");
			}

		});
		JButton div = new JButton("/");
		div.setFont(font);
		div.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (operations.length() == 0)
					;
				else if (operations.length() > 1) {
					if (operations.substring(operations.length() - 2, operations.length() - 1).equals("/")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("*")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("+")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("-")
							|| operations.substring(operations.length() - 1, operations.length()).equals(".")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("="))
						System.out.println("Repeated operator");
					else
						Calc.displayNumber(" " + div.getText() + " ");
				} else
					Calc.displayNumber(" " + div.getText() + " ");
			}
		});
		div.setName("div");
		JButton n0 = new JButton("0");
		n0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Calc.displayNumber(n0.getText());
			}

		});
		n0.setName("n0");
		JButton n1 = new JButton("1");
		n1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Calc.displayNumber(n1.getText());
			}

		});
		n1.setName("n1");
		JButton n2 = new JButton("2");
		n2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Calc.displayNumber(n2.getText());
			}

		});
		n2.setName("n2");
		JButton n3 = new JButton("3");
		n3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Calc.displayNumber(n3.getText());
			}

		});
		n3.setName("n3");
		JButton n4 = new JButton("4");
		n4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Calc.displayNumber(n4.getText());
			}

		});
		n4.setName("n4");
		JButton n5 = new JButton("5");
		n5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Calc.displayNumber(n5.getText());
			}

		});
		n5.setName("n5");
		JButton n6 = new JButton("6");
		n6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Calc.displayNumber(n6.getText());
			}

		});
		n6.setName("n6");
		JButton n7 = new JButton("7");
		n7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Calc.displayNumber(n7.getText());
			}

		});
		n7.setName("n7");
		JButton n8 = new JButton("8");
		n8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Calc.displayNumber(n8.getText());
			}

		});
		n8.setName("n8");
		JButton n9 = new JButton("9");
		n9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Calc.displayNumber(n9.getText());
			}

		});
		n9.setName("n9");
		JButton clear = new JButton("C");
		clear.setName("clear");
		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Calc.clear();

			}

		});
		JButton dot = new JButton(".");
		dot.setName("dot");
		dot.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (operations.length() == 0)
					;
				else if (operations.length() > 1) {
					if (operations.substring(operations.length() - 1, operations.length() - 0).equals("/")
							|| operations.substring(operations.length() - 1, operations.length() - 0).equals("*")
							|| operations.substring(operations.length() - 1, operations.length() - 0).equals("+")
							|| operations.substring(operations.length() - 1, operations.length() - 0).equals("-")
							|| operations.substring(operations.length() - 1, operations.length() - 0).equals(".")
							|| operations.substring(operations.length() - 1, operations.length() - 0).equals("=")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("/")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("*")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("+")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("-")
							|| operations.substring(operations.length() - 2, operations.length() - 1).equals("="))
						System.out.println("Repeated operator");
					else
						Calc.displayNumber(dot.getText());
				} else
					Calc.displayNumber(dot.getText());

			}
		});

		comp.add(n7); // Button with number 7
		comp.add(n8); // Button with number 8
		comp.add(n9); // Button with number 9
		comp.add(div); // Division button
		comp.add(mul); // Multiplication button
		comp.add(n4); // Button with number 4
		comp.add(n5); // Button with number 5
		comp.add(n6); // Button with number 6
		comp.add(rem); // Subtract button
		comp.add(add); // Add button
		comp.add(n1); // Button with number 1
		comp.add(n2); // Button with number 2
		comp.add(n3); // Button with number 3
		comp.add(clear); // Clear button
		comp.add(eq); // = button
		comp.add(n0); // Button with number 0
		comp.add(dot); // . button

		numbers = new JPanel();
		GridLayout numbersLayout = new GridLayout(4, 5);
		numbersLayout.setHgap(4);
		numbersLayout.setVgap(4);
		numbers.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		numbers.setLayout(numbersLayout);
		// adding components to panel
		for (int i = 0; i <= 16; i++) {
			numbers.add(comp.get(i));
		}

		/*
		 * JTextArea textField = new JTextArea(); textField.setPreferredSize(new
		 * Dimension(280, 80)); textField.setFont(font);
		 * textField.setLineWrap(true);
		 * 
		 * textField.; textPanel = new JPanel(); textPanel.add(textField);
		 * textPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
		 */

		op = new JLabel();
		op.setName("op");
		op.setPreferredSize(new Dimension(30, 30));
		op.setBorder(BorderFactory.createEmptyBorder(12, 12, 0, 12));
		op.setFont(font);
		op.setHorizontalAlignment(SwingConstants.RIGHT);
		op.setText("0.0");

		res = new JLabel();
		res.setBorder(BorderFactory.createEmptyBorder(12, 12, 0, 12));
		res.setFont(font);
		res.setHorizontalAlignment(SwingConstants.RIGHT);
		res.setText("0.0");
		res.setName("res");
		op.setPreferredSize(new Dimension(30, 30));
		textPanel = new JPanel(new GridLayout(2, 1));
		textPanel.add(op);
		textPanel.add(res);

		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(numbers, BorderLayout.CENTER);
		mainPanel.add(textPanel, BorderLayout.NORTH);

		this.setPreferredSize(new Dimension(300, 400));
		this.add(mainPanel);
		this.pack();
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public double add(double x, double y) {
		this.x = x;
		this.y = y;
		equation = x + " + " + y;
		double score = x + y;
		consoleresult = "" + score;
		return score;

	}

	public double subtract(double x, double y) {
		this.x = x;
		this.y = y;
		equation = x + " - " + y;
		double score = x - y;
		consoleresult = "" + score;
		return score;

	}

	public double multiply(double x, double y) {
		this.x = x;
		this.y = y;
		equation = x + " * " + y;
		double score = x * y;
		consoleresult = "" + score;
		return score;
	}

	public double divide(double x, double y) {
		this.x = x;
		this.y = y;
		equation = x + " / " + y;
		double score = x / y;
		if (score == Double.POSITIVE_INFINITY)
			return Double.NaN;
		return score;
	}

	public static double addNum(double x, double y) {
		equation = x + " + " + y;
		double score = x + y;
		consoleresult = "" + score;
		return score;

	}

	public static double subtractNum(double x, double y) {
		equation = x + " - " + y;
		double score = x - y;
		consoleresult = "" + score;
		return score;

	}

	public static double multiplyNum(double x, double y) {
		equation = x + " * " + y;
		double score = x * y;
		consoleresult = "" + score;
		return score;
	}

	public static double divideNum(double x, double y) {
		equation = x + " / " + y;
		double score = x / y;
		if (score == Double.POSITIVE_INFINITY)
			return Double.NaN;
		return score;
	}

	public static void displayNumber(String s) {

		operations += s;
		op.setText(operations);
	}

	public static void clear() {
		operations = "";
		op.setText("0.0");
		numresult = 0;
		res.setText("0.0");

	}

	@Override
	public String toString() {
		if (y == 0)
			return "ERR";
		return equation + " = " + consoleresult;

	}

	public static void calculate() {
		String[] arr = operations.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("/")) {

				numresult = numresult
						+ (Calc.divideNum(Double.parseDouble(arr[i - 1]), Double.parseDouble(arr[i + 1])));
			}
			if (arr[i].equals("*")) {
				
				numresult = numresult
						+ (Calc.multiplyNum(Double.parseDouble(arr[i - 1]), Double.parseDouble(arr[i + 1])));
			}
			if (arr[i].equals("+")) {

				numresult = numresult + (Calc.addNum(Double.parseDouble(arr[i - 1]), Double.parseDouble(arr[i + 1])));
			}
			if (arr[i].equals("-")) {

				numresult = numresult
						+ (Calc.subtractNum(Double.parseDouble(arr[i - 1]), Double.parseDouble(arr[i + 1])));
			}

		}
	}

}
