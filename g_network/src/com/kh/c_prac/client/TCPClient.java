package com.kh.c_prac.client;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public void clientStart() {
		//1. 서버의 IP와 Port를 가지고 있는 변수 선언
		String serverIP = "121.167.239.244";
		int port = 8080;
		
		//2. Socket 및 스트림 변수 선언(null로)
		Socket socket = null;
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		BufferedReader reader = null;
		
		//3. 서버의 IP와 Port로 통신할 Socket 생성
		try {
			socket = new Socket(serverIP, port);
			
			//4. 연결에 성공하면 서버와의 입출력스트림 생성
			if(socket != null) {
				reader = new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
				oos = new ObjectOutputStream(socket.getOutputStream());
				
				//5. music.dat 파일을 읽어서 서버로 전송
				//	hint : 객체를 읽고 쓸때는 ObjectInputStream ObjectOutputStream
				ois = new ObjectInputStream(new FileInputStream("music.dat"));
				oos.writeObject(ois.readObject());
				
				//6. 서버로부터 끝났다는 메시지(exit)가 돌아오면 통신을 종료
				//		각종 스트림을 반환하고 socket을 닫아준다.
				if(reader.readLine().equals("exit")) {
					System.out.println("서버가 exit 전송함.");
					socket.close();
					ois.close();
					oos.close();
					reader.close();
				}
			}
				
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
