package com.mystudy.socket03_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEcho {

	public static void main(String[] args) {
		//서버 : 클라이언트에서 메시지를 받고 다시 되돌려줌
		//클라이언트로 부터 메시지를 읽고, 클라이언트 쪽으로 쓰기
		ServerSocket server = null;
		
		//데이타를 읽기 위한 객체를 저장할 변수 선언
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		//데이타를 쓰기 위한 객체를 저장할 변수 선언
		OutputStream os = null;
		OutputStreamWriter osw = null;
		PrintWriter pw = null;
		
		try {
			System.out.println(">>> 서버 시작");
			server = new ServerSocket(10000);
			
			System.out.println(">>> 대기중...");
			Socket socket = server.accept();
			
			//데이타 읽기(Input, read)
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			System.out.println(">>> 메시지 읽기");
			String msg = br.readLine();
			System.out.println("받은메시지: " + msg);
			
			//-----------------------
			//데이타 쓰기(Output, write)
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			pw = new PrintWriter(osw);
			
			pw.println("[서버에서보냄]" + msg);
			pw.flush();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(">>> 서버 종료");
	}

}









