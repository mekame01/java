package ncs.test7;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScoreFrame extends JFrame {

	private JPanel contentPane;
	private JTextField javaScore;
	private JTextField sqlScore;
	private JTextField total;
	private JTextField average;
	private JButton calcBtn;

	/**
	 * Create the frame.
	 */
	public ScoreFrame() {
		setTitle("문제 7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("자바 : ");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 12));
		lblNewLabel.setBounds(12, 60, 40, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SQL :");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(220, 60, 40, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("총점 :");
		lblNewLabel_2.setBounds(12, 206, 40, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("평균 :");
		lblNewLabel_3.setBounds(220, 206, 40, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("점수를 입력하세요");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_4.setBounds(12, 10, 410, 30);
		contentPane.add(lblNewLabel_4);
		
		javaScore = new JTextField();
		javaScore.setBounds(54, 57, 116, 21);
		contentPane.add(javaScore);
		javaScore.setColumns(10);
		
		sqlScore = new JTextField();
		sqlScore.setBounds(262, 57, 116, 21);
		contentPane.add(sqlScore);
		sqlScore.setColumns(10);
		
		total = new JTextField();
		total.setEditable(false);
		total.setBounds(54, 203, 116, 21);
		contentPane.add(total);
		total.setColumns(10);
		
		average = new JTextField();
		average.setEditable(false);
		average.setBounds(262, 203, 116, 21);
		contentPane.add(average);
		average.setColumns(10);
		
		calcBtn = new JButton("계산하기");
		calcBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int firstScore = Integer.parseInt(javaScore.getText());
				int secondScore = Integer.parseInt(sqlScore.getText());
				total.setText(String.valueOf(firstScore + secondScore));
				average.setText(String.valueOf(((double)firstScore + secondScore)/2));
			}
		});
		calcBtn.setBounds(151, 124, 97, 23);
		contentPane.add(calcBtn);
	}
}
