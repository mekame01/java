package com.kh.qrcode.view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.kh.qrcode.maker.QRCodeMaker;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private final Action FileBtnClick = new FileBtnClick();
	private JTextArea urlContents = new JTextArea();
	private JTextArea titleContents = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel appName = new JLabel("QRCodeMaker");
		appName.setFont(new Font("굴림", Font.BOLD, 15));
		appName.setBounds(12, 10, 113, 23);
		contentPane.add(appName);
		
		urlContents.setBounds(10, 70, 150, 170);
		contentPane.add(urlContents);
		
		titleContents.setBounds(170, 70, 150, 170);
		contentPane.add(titleContents);
		
		JLabel url = new JLabel("URL");
		url.setHorizontalAlignment(SwingConstants.CENTER);
		url.setBounds(55, 45, 60, 15);
		contentPane.add(url);
		
		JLabel title = new JLabel("TITLE");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(215, 45, 60, 15);
		contentPane.add(title);
		
		JButton fileBtn = new JButton("파일생성");
		//AbstractAction클래스를 상속받은 내부클래스의 인스턴스를 setAction메서드에 넣어줌
		fileBtn.setAction(FileBtnClick);
		fileBtn.setBounds(335, 90, 90, 60);
		contentPane.add(fileBtn);
		
		JButton clearBtn = new JButton("초기화");
		clearBtn.addMouseListener(new MouseAdapter() {
			//clearBtn영역에 마우스가 올라오면
			@Override
			public void mouseClicked(MouseEvent e) {
				urlContents.setText("");
				titleContents.setText("");
			}
		});
		clearBtn.setBounds(335, 160, 90, 60);
		contentPane.add(clearBtn);
	}
	
	private class FileBtnClick extends AbstractAction {
		public FileBtnClick() {
			putValue(NAME, "파일생성");
		}
		
		//버튼의 클릭 이벤트가 발생하면 수행할 코드
		public void actionPerformed(ActionEvent e) {
			String url = urlContents.getText();
			String title = titleContents.getText();
			QRCodeMaker maker = new QRCodeMaker();
			
			//줄바꿈 문자를 기준으로 문자열을 분리해 배열로 변환
			String[] urlArr = url.split("\n");
			String[] titleArr = title.split("\n");
			
			//url과 title의 쌍이 안 맞을 경우를 대비한 예외처리
			//url의 줄 수가 title의 줄 수보다 적으면 적은 url의 줄 수만큼 반복하면 qr코드를 생성
			if(urlArr.length < titleArr.length) {
				for(int i = 0; i < urlArr.length; i++) {
					//문자열의 앞 뒤 공백을 제거
					urlArr[i] = urlArr[i].trim();
					titleArr[i] = titleArr[i].trim();
					maker.makeQR(urlArr[i], titleArr[i]);
				}
			} else {
				for(int i = 0; i < titleArr.length; i++) {
					//문자열의 앞 뒤 공백을 제거
					urlArr[i] = urlArr[i].trim();
					titleArr[i] = titleArr[i].trim();
					maker.makeQR(urlArr[i], titleArr[i]);
				}
			}
			JOptionPane.showMessageDialog(null,"파일생성이 완료되었습니다.");
		}
	}
}
