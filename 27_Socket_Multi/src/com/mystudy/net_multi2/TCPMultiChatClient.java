package com.mystudy.net_multi2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPMultiChatClient {
	//�޽��� �ۼ� ���� ���������� ����
	//�޽��� ���� ������ ����
	public static void main(String[] args) {
		System.out.println("--- main() ���� ---");
		Scanner scan = new Scanner(System.in);
		System.out.print("����� �̸� �Է�: ");
		String name = scan.nextLine();
		
		
		Socket socket = null;
		try {
			socket = new Socket("localhost", 10000);
			//�޽��� ������(������� ����)
			ClientSender clientSender = new ClientSender(socket, name);
			clientSender.start();
			
			//�޽��� �ޱ�(������� ����)
			ClientReceiver clientReceiver = new ClientReceiver(socket);
			clientReceiver.start();
			
		} catch (UnknownHostException e) {
			System.out.println("[���ܹ߻�] " + e.getMessage());
		} catch (IOException e) {
			System.out.println("[���ܹ߻�] " + e.getMessage());
		}
		
		System.out.println("---- main() ���� ---");
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
				System.out.println("[���ܹ߻�] ClientSender ������"
						+ " out ��ü ���� ����");
			}
		}
		
		@Override
		public void run() {
			//�޽����� �ۼ��ϰ� �ۼ��� �޽��� ������ ����
			Scanner sc = new Scanner(System.in);
			if (out == null) {
				System.out.println("[���ܹ߻�] ClientSender ������"
						+ " out ��ü�� null�Դϴ�.");
				return;
			}
			try {
				out.writeUTF(name); //����� �̸� ����
				
				while (true) {
					System.out.print("�޽����ۼ�> ");
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
			//�޽����� �޾Ƽ� ȭ�鿡 ��� �۾� �ݺ�
			while (true) {
				try {
					String msg = in.readUTF();
					System.out.println(msg);
				} catch (IOException e) {
					System.out.println("[���ܹ߻�] " + e.getMessage());
					break;
				}
			}
		}
	}
}










