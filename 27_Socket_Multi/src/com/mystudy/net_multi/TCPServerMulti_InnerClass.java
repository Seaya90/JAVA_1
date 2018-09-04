package com.mystudy.net_multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerMulti_InnerClass {

	public static void main(String[] args) {
		System.out.println("--- main() 시작 ---");
		new TCPServerMulti_InnerClass();

		System.out.println("--- main() 종료 ---");
		
	}
	
	//생성자
	public TCPServerMulti_InnerClass() {
		ServerSocket server = null;
		try {
			System.out.println(">> 서버소켓 객체 생성");
			server = new ServerSocket(10000);
			
			while (true) {
				System.out.println(">> 서버 대기중....203.236.209.161");
				Socket socket = server.accept();
				
				System.out.println(">> 클라이언트 접속");
				System.out.println(">> 클라이언트 접속 정보: " 
						+ socket.getInetAddress());
				
				//소켓정보를 가진 쓰레드 생성
				SocketThread thr = new SocketThread(socket);
				thr.start();
				System.out.println(">> " + socket.getInetAddress()
						+ " 쓰레드 생성");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//내부클래스 : 소켓을 전달받아 쓰레드 생성을 하는 클래스
	class SocketThread extends Thread {
		Socket socket;
		
		//생성자
		SocketThread(Socket socket) {
			this.socket = socket;
		}
		
		@Override
		public void run() {
			System.out.println("--- 쓰레드 시작  ---");
			InetAddress client = socket.getInetAddress();
			InputStream is = null;
			OutputStream os = null;
			
			InputStreamReader isr = null;
			BufferedReader br = null;
			
			try {
				is = socket.getInputStream();
				os = socket.getOutputStream();
				
				isr = new InputStreamReader(is);
				br = new BufferedReader(isr);
				
				System.out.println(">> 읽기 시작");
				while (true) {
					String msg = br.readLine();
					if (msg == null || msg.equalsIgnoreCase("exit")) {
						break;
					}
					System.out.println(">>> " + msg);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				System.out.println("클라이언트 접속 종료: " 
						+ client.getHostAddress());
				try {
					br.close();
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}










