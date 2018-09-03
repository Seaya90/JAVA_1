package com.mystudy.socket01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClientByte {

	public static void main(String[] args) {
		//클라이언트 : Socket을 이용해서 서버에 접속(서버IP주소, 서버포트번호)
		Socket socket = null;
		try {
			System.out.println("---- 클라이언트 -----");
			//                  localhost(현재컴퓨터: 127로 시작하는 IP)
			socket = new Socket("127.0.0.1", 10000);
			
			//생성된 Socket으로 부터 Input, Output 스트림 생성
			OutputStream os = socket.getOutputStream();
			InputStream is = socket.getInputStream();
			
			//OutputStream 이용해서 쓰기
			byte[] buf = "안녕하세요 ~ 반갑습니다.".getBytes();
			
			System.out.println(">> 메시지전송: " + new String(buf));
			os.write(buf);
			
			buf = "자바 소켓통신 공부중~~~".getBytes();
			System.out.println(">> 메시지전송: " + new String(buf));
			os.write(buf);
			
			
			os.flush();
			
			os.close();
			is.close();
			socket.close();
			
			System.out.println(">>> 클라이언트 종료");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
