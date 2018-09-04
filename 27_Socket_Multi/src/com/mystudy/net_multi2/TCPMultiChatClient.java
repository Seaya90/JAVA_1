package com.mystudy.net_multi2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPMultiChatClient {
	//메시지 작성 전송 독립적으로 동작
	//메시지 수신 독립적 동작
	public static void main(String[] args) {
		System.out.println("--- main() 시작 ---");
		Scanner scan = new Scanner(System.in);
		System.out.print("사용할 이름 입력: ");
		String name = scan.nextLine();
		
		
		Socket socket = null;
		try {
			socket = new Socket("localhost", 10000);
			//메시지 보내기(쓰레드로 동작)
			ClientSender clientSender = new ClientSender(socket, name);
			clientSender.start();
			
			//메시지 받기(쓰레드로 동작)
			ClientReceiver clientReceiver = new ClientReceiver(socket);
			clientReceiver.start();
			
		} catch (UnknownHostException e) {
			System.out.println("[예외발생] " + e.getMessage());
		} catch (IOException e) {
			System.out.println("[예외발생] " + e.getMessage());
		}
		
		System.out.println("---- main() 종료 ---");
	}

	static class ClientSender extends Thread {
		Socket socket;
		String name;
		DataOutputStream out;
		
		ClientSender(Socket socket, String name) {
			this.socket = socket;
			this.name = name;
			try {
				out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				System.out.println("[예외발생] ClientSender 생성자"
						+ " out 객체 생성 실패");
			}
		}
		
		@Override
		public void run() {
			//메시지를 작성하고 작성된 메시지 서버로 전송
			Scanner sc = new Scanner(System.in);
			if (out == null) {
				System.out.println("[예외발생] ClientSender 생성자"
						+ " out 객체가 null입니다.");
				return;
			}
			try {
				out.writeUTF(name); //사용할 이름 전송
				
				while (true) {
					System.out.print("메시지작성> ");
					String msg = sc.nextLine();
					out.writeUTF("[" + name + "] " + msg);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	static class ClientReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		
		ClientReceiver(Socket socket) {
			this.socket = socket;
			
			try {
				in = new DataInputStream(socket.getInputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			//메시지를 받아서 화면에 출력 작업 반복
			while (true) {
				try {
					String msg = in.readUTF();
					System.out.println(msg);
				} catch (IOException e) {
					System.out.println("[예외발생] " + e.getMessage());
					break;
				}
			}
		}
	}
}










