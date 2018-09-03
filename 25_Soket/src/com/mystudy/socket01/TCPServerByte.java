package com.mystudy.socket01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerByte {

	public static void main(String[] args) {
		//서버측 : ServerSocket 객체가 클라이어트의 접속을 기다린다.
		ServerSocket server = null;
		try {
			System.out.println("[서버] 시작");
			//서버쪽에서 10000번 포트를 열고 서비스 대기하겠다.
			server = new ServerSocket(10000);
			
			//서버에서 해당포트로 접속한 클라이언트의 소켓정보 추출
			Socket socket = server.accept();
			
			System.out.println("[서버] 클라이언트 접속");
			
			//소켓으로 부터 Input, Output 스트림 객체 생성
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			//InputStream 객체를 이용해서 읽어들임
			byte[] buf = new byte[100];
			//is.read(buf); //읽기
			//System.out.println("[서버]받은 메시지: " + new String(buf));
			
			while (true) {
				int readValue = is.read(buf);
				if (readValue == -1) break;
				String msg = new String(buf);
				System.out.println("받은메시지: " + msg);
			}
			
			
			is.close();
			os.close();
			
			System.out.println("[서버] 종료");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
