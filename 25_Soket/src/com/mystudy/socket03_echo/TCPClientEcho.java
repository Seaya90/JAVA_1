package com.mystudy.socket03_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClientEcho {

	public static void main(String[] args) {
		Socket socket = null;
		
		//입력 처리용 객체 저장 변수 선언
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		//출력 처리용 객체 저장 변수 선언
		OutputStream os = null;
		OutputStreamWriter osw = null;
		PrintWriter pw = null;
		
		try {
			System.out.println("----- 클라이언트 -----");
			System.out.println(">>> 서버에 접속");
			socket = new Socket("127.0.0.1", 10000);
			
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			//서버쪽으로 쓰기(Output)
			System.out.println(">>> 메시지 쓰기(client -> server)");
			osw = new OutputStreamWriter(os);
			pw = new PrintWriter(osw);
			
			String sendMsg = "안녕하세요~~~ 반갑습니다.";
			System.out.println(">>보낸메시지 : " + sendMsg);
			pw.println(sendMsg);
			pw.flush();
			
			//-----------------------------
			//서버쪽에서 보내온 메시지 읽기
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			//br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String receiveMsg = br.readLine();
			System.out.println(">>받은메시지: " + receiveMsg);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			pw.close();
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("---- 클라이언트 종료 -----");

	}

}












