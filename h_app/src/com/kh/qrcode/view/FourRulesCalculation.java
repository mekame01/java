package com.kh.qrcode.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FourRulesCalculation extends JFrame {

	private JPanel contentPane;
	private JTextField firstInputNum;
	private JTextField secondInputNum;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FourRulesCalculation frame = new FourRulesCalculation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FourRulesCalculation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		firstInputNum = new JTextField();
		firstInputNum.setBounds(10, 100, 80, 21);
		contentPane.add(firstInputNum);
		firstInputNum.setColumns(10);
		
		secondInputNum = new JTextField();
		secondInputNum.setBounds(102, 100, 80, 21);
		contentPane.add(secondInputNum);
		secondInputNum.setColumns(10);
		
		result = new JTextField();
		result.setEditable(false);
		result.setBounds(342, 100, 80, 21);
		contentPane.add(result);
		result.setColumns(10);
		
		JButton addBtn = new JButton("더하기");
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int first = Integer.parseInt(firstInputNum.getText());
				int second = Integer.parseInt(secondInputNum.getText());
				result.setText(String.valueOf(first + second));
			}
		});
		addBtn.setBounds(212, 25, 100, 40);
		contentPane.add(addBtn);
		
		JButton minusBtn = new JButton("빼기");
		minusBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int first = Integer.parseInt(firstInputNum.getText());
				int second = Integer.parseInt(secondInputNum.getText());
				result.setText(String.valueOf(first - second));
			}
		});
		minusBtn.setBounds(212, 85, 100, 40);
		contentPane.add(minusBtn);
		
		JButton multiplyBtn = new JButton("곱하기");
		multiplyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int first = Integer.parseInt(firstInputNum.getText());
				int second = Integer.parseInt(secondInputNum.getText());
				result.setText(String.valueOf(first * second));
			}
		});
		multiplyBtn.setBounds(212, 145, 100, 40);
		contentPane.add(multiplyBtn);
		
		JButton divideBtn = new JButton("나누기");
		divideBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int first = Integer.parseInt(firstInputNum.getText());
				int second = Integer.parseInt(secondInputNum.getText());
				double res = (double)first / second;
				result.setText(String.valueOf(res));
			}
		});
		divideBtn.setBounds(212, 205, 100, 40);
		contentPane.add(divideBtn);
	}
}
