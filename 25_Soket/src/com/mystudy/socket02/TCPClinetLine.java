package com.mystudy.socket02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClinetLine {

	public static void main(String[] args) {
		System.out.println(">>> 클라이언트 시작");
		//0. 사용할 소켓(Socket) 변수 선언
		Socket socket = null;
		
		try {
			//1. 소켓생성(Socket) : 접속할 서버 IP, 포트(port) 정보로 접속
			System.out.println("현재컴퓨터IP: " + InetAddress.getLocalHost());
			System.out.println(">> 서버에 접속");
			socket = new Socket(InetAddress.getLocalHost(), 10000);
			
			//2. 소켓으로부터 in, out 생성 - InputStream, OutputStream
			InputStream is = socket.getInputStream();
			
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);
			
			//3. 읽을(in) 데이타가 있으면 읽고(read)
			//구현안함
			
			//4. 전송할 데이타가 있으면 쓰기(write)
			String msg = "안녕하세요~ 만나서 반갑습니다. 소켓통신 공부중!!!";
			pw.println(msg); //서버쪽으로 쓰기
			System.out.println(">> 전달메시지 : " + msg);
			
			//5. 자원반납(close)
			pw.close();
			is.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println(">>> 클라이언트 종료");
	}

}
