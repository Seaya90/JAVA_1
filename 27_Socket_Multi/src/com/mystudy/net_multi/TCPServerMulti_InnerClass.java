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
		System.out.println("--- main() ���� ---");
		new TCPServerMulti_InnerClass();

		System.out.println("--- main() ���� ---");
		
	}
	
	//������
	public TCPServerMulti_InnerClass() {
		ServerSocket server = null;
		try {
			System.out.println(">> �������� ��ü ����");
			server = new ServerSocket(10000);
			
			while (true) {
				System.out.println(">> ���� �����....203.236.209.161");
				Socket socket = server.accept();
				
				System.out.println(">> Ŭ���̾�Ʈ ����");
				System.out.println(">> Ŭ���̾�Ʈ ���� ����: " 
						+ socket.getInetAddress());
				
				//���������� ���� ������ ����
				SocketThread thr = new SocketThread(socket);
				thr.start();
				System.out.println(">> " + socket.getInetAddress()
						+ " ������ ����");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//����Ŭ���� : ������ ���޹޾� ������ ������ �ϴ� Ŭ����
	class SocketThread extends Thread {
		Socket socket;
		
		//������
		SocketThread(Socket socket) {
			this.socket = socket;
		}
		
		@Override
		public void run() {
			System.out.println("--- ������ ����  ---");
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
				
				System.out.println(">> �б� ����");
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
				System.out.println("Ŭ���̾�Ʈ ���� ����: " 
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










