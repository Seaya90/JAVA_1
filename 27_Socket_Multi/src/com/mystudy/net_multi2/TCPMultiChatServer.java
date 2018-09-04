package com.mystudy.net_multi2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

public class TCPMultiChatServer {
	HashMap<String, DataOutputStream> clients;

	public static void main(String[] args) {
		//Ŭ���� ��ü ���� �� serverStart() �޼ҵ� ȣ��
		new TCPMultiChatServer().serverStart();
	}
	
	TCPMultiChatServer() {
		clients = new HashMap<>();
	}
	
	//�������� �����ϰ� ����ϴٰ�
	//Ŭ���̾�Ʈ�� �����ϸ� �޽����� �ޱ� ���� ������ ����
	private void serverStart() {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			//��Ʈ��ȣ 10000������ ���� ���� ����
			serverSocket = new ServerSocket(10000);
			System.out.println(">> ������ ���۵Ǿ����ϴ�....");
			System.out.println("����IP:��Ʈ - " 
					+ InetAddress.getLocalHost().getHostAddress()
					+ ":" + serverSocket.getLocalPort());
			
			while (true) {
				socket = serverSocket.accept();
				System.out.println("[" + socket.getInetAddress()
						+ ":" + socket.getPort() + "] ����");
				
				//���ӵ� Ŭ���̾�Ʈ�� ���� ó�� : ������ ����
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//ServerReceiver : ���޹��� Socket�� �̿��ؼ� �޽��� �ް�, ��ü���� ����
	//������ �� : clients�� �߰�
	//������ �� : clients���� ����
	class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		String ip;
		String name;
		
		
		ServerReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
				
				ip = socket.getInetAddress().getHostAddress();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			//������ �� : clients�� �߰�
			//������ �� : clients���� ����
			//�޽����� �ް� ���ӵ� ��� ������� �޽��� ����
			
			try {
				name = in.readUTF(); //Ŭ���̾�Ʈ�� �Է��� ù �޽���
				System.out.println("������>> " + name);
				
				//�����ο� ��ü���� ������ ���� �˸�
				sendToAll("#" + name + "���� �����߽��ϴ�.");
				
				//������ ��Ͽ� ���
				clients.put(name, out);
				
//				while(true) {
//					String msg = in.readUTF();
//					sendToAll(msg);
//				}
				
				while (true) {
					String msg = in.readUTF();
					System.out.println(msg); //����ȭ�����
					sendToAll(msg); //�����ڿ��� ����
				}
				
			} catch (IOException e) {
				//e.printStackTrace();
			} finally {
				clients.remove(name); //������ ��Ͽ��� ����
				//�����ڿ��� ���� �޽��� ����
				String outMsg = "<"+ name + ">���� �������ϴ�.";
				sendToAll(outMsg);
				System.out.println(outMsg);
				
				System.out.println("���� ������ ��: " + clients.size());
			}
		}

		private void sendToAll(String msg) {
			//������ ��ü���� �޽��� ����
			Iterator<String> ite = clients.keySet().iterator();
			while (ite.hasNext()) {
				DataOutputStream out = clients.get(ite.next());
				try {
					out.writeUTF(msg);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
	}

}












